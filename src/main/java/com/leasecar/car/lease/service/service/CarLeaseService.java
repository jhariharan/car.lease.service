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


  public ResponseTemplateVO getCustomerWithCarDetails(final Long customerId) {
    ResponseTemplateVO responseTemplateVO = new ResponseTemplateVO();
    Customer customer = restTemplate.getForObject("http://localhost:9001/api/v1/customers/" + customerId, Customer.class);
    final Long carId = customer.getCarId();
    Car car = restTemplate.getForObject("http://localhost:9002/api/v1/cars/" + carId, Car.class);
    responseTemplateVO.setCar(car);
    responseTemplateVO.setCustomer(customer);
    return responseTemplateVO;
  }
}
