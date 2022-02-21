# Amazon Search

This project uses TestNG as a testing framework as we can see on the file located on:

	../testng.xml


This project has 4 abstraction layers called:
* Features
* StepDefinitions
* Page Object Model,
     Each layer has a higher detail level than the former to make it easier to give maintain to the code.

# You need
In order to run your tests, you will need:
*	Java 17 (Don't forget to add java to environment variables)
*	Chrome 98.0.4758.102
*   Maven (Don't forget to add MAVEN to environment variables)

# Feature
The feature is located on:

	..src/test/java/features/AmazonSearch.feature

# Running the tests
You should navigate towards the root project directory and run the following command:

	mvn test

that will make the scenarios within the features to run.