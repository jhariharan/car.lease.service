package com.leasecar.car.lease.service.VO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Car {

  @JsonIgnore
  private Long carId;
  private String make;
  private String model;
  private String version;
  @JsonIgnore
  private int numberOfDoors;
  @JsonIgnore
  private int co2Emission;
  private Long grossPrice;
  private Long netPrice;
  private Long mileage;
  private Long duration;
  private double leaseRate;
}
