/*
package com.leasecar.car.lease.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leasecar.car.lease.service.domain.User;
import com.leasecar.car.lease.service.service.UserService;

@RestController
@RequestMapping("/api")
public class AppUserController {

  @Autowired
  private UserService userService;

  @GetMapping("/users")
  public ResponseEntity<List<User>> getUsers() {
    return ResponseEntity.ok().body(userService.getAppUsers());
  }

}
*/
