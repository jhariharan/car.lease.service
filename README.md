This is a main REST API (Car leasing service) which integrates all available services needed for the car lease
management of a customer.Currently this end point is protected by Basic authentication

Technologies used 
Spring Boot
Spring
Maven
Java
Hibernate
HikariCP
H2 in-memory database
Junit

Existing operation 
   
Find an car lease details of based on a customer id
GET : /api/v1/carLeaseDetails{id}    

Future enhancements
Add Oauth/jwt token based authentication
Add roles for this rest end point

