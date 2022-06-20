package com.leasecar.car.lease.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leasecar.car.lease.service.VO.ResponseTemplateVO;
import com.leasecar.car.lease.service.service.CarLeaseService;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/api/v1/carLeaseDetails")
public class CarLeaseController {

  @Autowired
  private CarLeaseService carLeaseService;

  @GetMapping("/{id}")
  public ResponseTemplateVO findCustomerDetailsById(@PathVariable("id") Long customerId) {
    log.info("Inside findCustomerDetailsById method of CarLeaseController");
    return carLeaseService.getCustomerWithCarDetails(customerId);
  }
}
