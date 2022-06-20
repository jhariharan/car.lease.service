package com.leasecar.car.lease.service.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
  private Long customerId;
  private String customerName;
  private String houseNumber;
  private String zipCode;
  private String city;
  private String emailAddress;
  private String mobileNumber;
  private Long carId;
}

