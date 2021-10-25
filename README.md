### Hi there! 👋
### This project contains automation tests of Wikipedia Mobile App


The following technologies are used:

![java](https://github.com/AnnRidel/Data_examples/blob/master/resources/logo/Java.png?raw=true "Java")
![Selenoid](https://github.com/AnnRidel/Data_examples/blob/master/resources/logo/Selenoid.png?raw=true "Selenoid")
![gradle](https://github.com/AnnRidel/Data_examples/blob/master/resources/logo/Gradle.png?raw=true "Gradle")
![jUnit5](https://github.com/AnnRidel/Data_examples/blob/master/resources/logo/JUnit5.png?raw=true "JUnit5")
![jenkins](https://github.com/AnnRidel/Data_examples/blob/master/resources/logo/Jenkins.png?raw=true "Jenkins")
![allure-logo](https://github.com/AnnRidel/Data_examples/blob/master/resources/logo/Allure_Report.png?raw=true "Allure_Report")
![telegram-logo](https://github.com/AnnRidel/Data_examples/blob/master/resources/logo/Telegram.png?raw=true "Telegram")


* :white_check_mark: **Java**  - OOP language, that was used for the automation tests development
* :white_check_mark: **Selenoid** - cross browser Selenium solution
* :white_check_mark: **Gradle** - build automation tool for managing dependencies modules, setting tasks configuration, etc.
* :white_check_mark: **JUnit5** - serves as a foundation for launching testing frameworks on the JVM
* :white_check_mark: **Jenkins** - automation server, used to execution of tests from GutHub repository on Selenoid
* :white_check_mark: **Allure Reports** - reporting tool for analysis of test execution results
* :white_check_mark: **Allure TestOps** - test management system for keeping test cases and graphs/metrics investigation
* :white_check_mark: **Telegram** - messenger, in which notifications about test execution results are sent!  

### To run tests using Appium (default):
```
gradle clean test -Ddevice.name=appium
```

### To run tests using Selenoid:
```
gradle clean test -Ddevice.host=selenoid
```

### To run tests using BrowserStack:
```
gradle clean test -Ddevice.host=browser_stack
```

### Serve Allure report:
```
allure serve build/allure-results
```

### :gear: Running build in [Jenkins](https://jenkins.autotests.cloud/job/07-annrid-mobile/) with parameters:
![image](https://github.com/AnnRidel/Data_examples/blob/master/resources/images/jenkins_mobile.png)

### :chart_with_upwards_trend: Generated [Allure Report](https://jenkins.autotests.cloud/job/07-annrid-mobile/16/allure/) with tests execution results:
![image](https://github.com/AnnRidel/Data_examples/blob/master/resources/images/allure_mobile.png)

### :bookmark_tabs: [Detailed Allure report](https://jenkins.autotests.cloud/job/07-annrid-mobile/16/allure/#suites/9c4ad43dd16f189770706ba4eb417cc1/e0757b19e9eeee9a/) with test steps:
![image](https://github.com/AnnRidel/Data_examples/blob/master/resources/images/allure_mobile_steps.png)

### :bar_chart: Dashboards in [Allure TestOps](https://allure.autotests.cloud/project/563/dashboards):
![image](https://github.com/AnnRidel/Data_examples/blob/master/resources/images/testops_mobile.png)

### :clipboard: Test Cases in [Allure TestOps](https://allure.autotests.cloud/project/563/test-cases/5389?treeId=0):
![image](https://github.com/AnnRidel/Data_examples/blob/master/resources/images/testops_mobile_steps.png)

### :bookmark_tabs: [Jira](https://jira.autotests.cloud/browse/HOMEWORK-261) integration:
![image](https://github.com/AnnRidel/Data_examples/blob/master/resources/images/jira_mobile.png)

### :envelope_with_arrow: Notification about tests execution results in Telegram:
![image](https://github.com/AnnRidel/Data_examples/blob/master/resources/images/telegram_mobile.jpg)

