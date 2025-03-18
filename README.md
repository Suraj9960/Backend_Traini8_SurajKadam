# Traini8 Backend - Spring Boot Application

## Project Overview
This is a Spring Boot-based backend application for managing training centers. It provides REST APIs for handling training center-related operations.

## Prerequisites
1. Ensure you have the following installed on your system:
2. Java 20
3. Maven (Latest version recommended)
4. MySQL

## Setup Instructions:
### 1. Database Configuration -
* Create the database with the name traini8 in MySQL.
* Update application.properties or application.yml with the following:
#### 
      **spring.datasource.url=jdbc:mysql://localhost:3306/traini8**
      **spring.datasource.username=your_username**
      **spring.datasource.password=your_password**
      **spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver**
      **spring.jpa.database-platform=org.hibernate.dialect.MySQL8Dialect**
      **spring.jpa.hibernate.ddl-auto=update**

### 2. API Input Format -
* POST API ->
   {
  "centerName": "The Tech Excel",
  "centerCode": "TRAINI8123X7",
  "address": {
    "detailedAddres": "123 First Main Road",
    "city": "Chennai",
    "state": "Tamilnadu",
    "pincode": "600130"
  },
  "studentCapacity": 200,
  "coursesOffered": ["Java", "Spring Boot", "SQL"],
  "contactEmail":"abc@gmail.com",
  "contactPhone":"1234567892"
}


### 3. Check the responsers on Postman or any other tool
* GET API ->
* SEARCH API ->

