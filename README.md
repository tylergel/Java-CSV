# Summary

This repository is a java application that allows a user to upload a CSV file which is then parsed, with valid data being inserted into an sqlite database and invalid data being written to a CSV.

# To Install

Here are the steps to install the app (For windows)

https://howtodoinjava.com/maven/how-to-install-maven-on-windows/

* Clone/Download the repository
* Ensure that you have Java downloaded http://www.oracle.com/technetwork/java/javase/downloads/index.html
* Add correct JAVA_HOME paths: https://howtodoinjava.com/maven/how-to-install-maven-on-windows/
* Download Maven: https://maven.apache.org/download.cgi
* Add Maven Paths: https://howtodoinjava.com/maven/how-to-install-maven-on-windows/
* Finally, open the command prompt and in the Java-CSV-master folder run the command "mvn spring-boot:run" (First run takes a minute to download everything)

This will start the application. Go to localhost:8080 to see the app running. It will give you a page to let you upload a file.

# Overview

I decided to use Spring Boot so that I could gain some more experience with it. I enjoyed using it and it is pretty easy to add dependencies and seperate files within the framework. I used MVC design principles to aid me in the project. I use thymeleaf to serve the html files, where the user will go to upload the file. When a file is uploaded, it calls the /upload function in the controller, which will then process the data, parse the CSV and insert it into sqlite. I have the CsvInfo entity, which is used to describe the object data. I ran into some trouble getting Sqlite to work with Spring Boot, but I ended up working through those issues. I use OpenCSV to write data to the CSV file.
The ms3Interview.log file and ms3Interview-bad.csv file are located in the root folder. The log file displays the totals at the end of the file. The page returned after submitting the file displays the data in the uploaded CSV that was saved to the database.
