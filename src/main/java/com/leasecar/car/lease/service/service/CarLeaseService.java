package com.leasecar.car.lease.service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.leasecar.car.lease.service.VO.Car;
import com.leasecar.car.lease.service.VO.Customer;
import com.leasecar.car.lease.service.VO.ResponseTemplateVO;

@Service
public class CarLeaseService {

  @Autowired
  private RestTemplate restTemplate;

  private static double interestRate = 4.5;

  public ResponseTemplateVO getCustomerWithCarDetails(final Long customerId) {
    ResponseTemplateVO responseTemplateVO = new ResponseTemplateVO();
    Customer customer = restTemplate.getForObject("http://localhost:9001/api/v1/customers/" + customerId, Customer.class);
    final Long carId = customer.getCarId();
    final Car car = restTemplate.getForObject("http://localhost:9002/api/v1/cars/" + carId, Car.class);
    final double leaseRate = leaseRateCalculator(car);
    final Car carDetailsWithLeaseRate = new Car();
    carDetailsWithLeaseRate.setLeaseRate(leaseRate);
    carDetailsWithLeaseRate.setMake(car.getMake());
    carDetailsWithLeaseRate.setModel(car.getModel());
    responseTemplateVO.setCar(carDetailsWithLeaseRate);
    responseTemplateVO.setCustomer(customer);
    return responseTemplateVO;
  }

  private double leaseRateCalculator(final Car car) {
    final double mileage = car.getMileage();
    final Long duration = car.getDuration();
    final double netPrice = car.getNetPrice();
    return (((mileage / 12) * duration) / netPrice) + (((interestRate / 100) * netPrice) / 12);
  }
}
