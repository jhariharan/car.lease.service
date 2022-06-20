/*
package com.leasecar.car.lease.service.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leasecar.car.lease.service.domain.User;
import com.leasecar.car.lease.service.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserService {

  @Autowired
  private UserRepository userRepository;
 */
/* @Autowired
  private RoleRepository roleRepository;*//*



  public User saveUser(User user) {
    log.info("saving new user to the database");
    return userRepository.save(user);
  }

*/
/*  public Role saveRole(Role role) {
    log.info("saving new role : '{}', to the database", role.getName());
    return roleRepository.save(role);
  }*//*


*/
/*  void addRoleToUser(String username, String roleName) {
    User appUser = userRepository.findByUsername(username);
    Role role = roleRepository.findByName(roleName);
    log.info("adding new role : '{}', to the user : '{}'", role.getName(), username);
    appUser.getRoles().add(role);
  }*//*


  public User getAppUser(String username) {
    log.info("getting username from the database");
    return userRepository.findByUsername(username);
  }

  public List<User> getAppUsers() {
    log.info("getting all existing users from the database");
    return userRepository.findAll();
  }
}
*/
