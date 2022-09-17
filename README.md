# Task

For the task, we ask that you create a simple account/transactions model with a
RESTful API. This should allow for updating the balances of accounts and handling
the following endpoint:
API endpoint GET /v1/accounts which shows a list of accounts
API endpoint GET /v1/payments which shows a list of payments
API POST /v1/payments that creates a new payment with given from_account ,
amount , to_account

------------------------------------------------------------------------------------------------------

# Tech Stack

This application was developed using Spring boot, Maven and Java as main technologies.

# Followed Approach

In this particular project we are trying to create REST API's in spring boot which can help us fetch all accounts, all payments and create a payment as well.
Here we are diving the project structure into multiple packages. the packages are as follows.

- Controller package -  we are calling our api's
- Model package -   we have defined our models
- Entity package -  we have created entities like AccountEntity, PaymentEntity.
- Repository package - we have defined repositories which are helful for storing data in DB.
- Service Package - Entire Business Logic is written in Services only.

# Code highlights

Based on the problem statement, I built different services to provide the required functionality to transfer money between accounts.

In Account Service, we have method getAllAccounts which gives us all the accounts from the DB.
In Payment Service , we have two methods
**getAllPayments** - which gives All the payments
**createPayment** - which helps you the execute a new transaction, and also while making transaction it will update the account balances accordingly.

Included Sample Unit test cases by using Junit.

# How to run Application:

1. Clone this github repo with the ```https://github.com/sharukahmed321/JarAssignment.git```
2. Import this project in any of your favorite IDE (Eclipse ot IntelliJ)
3. open src/main/java , in that open the package com.backend.jar.assignment and click on AssignmentApplication.java which is the root file of our project.
4. click run and you will see that project up and Running.
5. Go to https://localhost:8000 to see the project up and running and you can hit the apis specified in the project. 
6. If you want to see the swagger api documentation in this project - open this link ```http://localhost:8080/swagger-ui.html```
