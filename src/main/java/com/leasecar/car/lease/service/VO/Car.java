package com.leasecar.car.lease.service.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car {

  private Long carId;
  private String make;
  private String model;
  private String version;
  private int numberOfDoors;
  private int co2Emission;
  private Long grossPrice;
  private Long netPrice;

}
