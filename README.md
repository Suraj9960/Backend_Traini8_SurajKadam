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
<br/>
**spring.datasource.username=your_username**
<br/>
**spring.datasource.password=your_password**
<br/>
**spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver**
<br/>
**spring.jpa.database-platform=org.hibernate.dialect.MySQL8Dialect**
<br/>
**spring.jpa.hibernate.ddl-auto=update**
<br/>

### 2. API Input Format -
* **POST API ->**<br>
  {<br>
  "centerName": "The Tech Excel",<br>
  "centerCode": "TRAINI8123X7",<br>
  "address": {<br>
    "detailedAddres": "123 First Main Road",<br>
    "city": "Chennai",<br>
    "state": "Tamilnadu",<br>
    "pincode": "600130"<br>
  },
  "studentCapacity": 200,<br>
  "coursesOffered": ["Java", "Spring Boot", "SQL"],<br>
  "contactEmail":"abc@gmail.com",<br>
  "contactPhone":"1234567892"<br>
}<br>


### 3. Check the responsers on Postman or any other tool
* **POST API ->** localhost:8081/training-center/add-center
* **GET API ->** localhost:8081/training-center/getAll
* **SEARCH API ->** localhost:8081/training-center/search_training_center/{query}

### 4. Set the port ->
* Use **server.port=8081**.

### 5. Final Output (Post API):
 {<br>
  "centerName": "The Tech Excel",<br>
  "centerCode": "TRAINI8123X7",<br>
  "address": {<br>
    "detailedAddres": "123 First Main Road",<br>
    "city": "Chennai",<br>
    "state": "Tamilnadu",<br>
    "pincode": "600130"<br>
  },
  "studentCapacity": 200,<br>
  "coursesOffered": ["Java", "Spring Boot", "SQL"],<br>
  "contactEmail":"abc@gmail.com",<br>
  "contactPhone":"1234567892"<br>
}<br>

