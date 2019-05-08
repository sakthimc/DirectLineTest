# DirectLineQA
This project consists of a simple test for checking whether a vehicle exists in dealer portal.
# About this project
I have implemented this project using seleium-cucumber-pageobjects framework. Its pretty light weight so should be easy to set up. 
The build tool I have used is "Maven". 
 - feature files can be found under /src/test/resources/features
 - stepdefinitions can be found under /src/test/java/stepDefinitions
 - runner class is in /src/test/java/runner
 - cucumber reports can be found in /target
 - it also has cucumber.json report which is built for CI tool
 
# Project setup on local
1. Git clone this repo onto your local machine
2. Open the project using your favourite IDE - I used intelliJ Community Edition
3. Make sure you have chrome browser installed

# Running the project on local machine
There are two ways you run run this locally 
1. Right-click on test runner class and run
2. or you can use mvn clean test

