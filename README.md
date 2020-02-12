# xrpmonitor - XRP Monitoring APP

## Quick Start 


## Dependencies 

Following 3rd Party Jars are used for implemenation of Java module.

For Object Mapper
 * com.fasterxml.jackson.databind.jar
 * jackson-core-2.2.3.jar
 * jackson-annotations-2.0.1.jar

For HTTP Client 
 * commons-codec-1.11.jar
 * commons-csv-1.8.jar
 * commons-io-2.6.jar
 * commons-logging-1.2.jar
 * httpclient-4.5.10.jar
 * httpcore-4.4.12.jar

For Light weight Webserver
* nanohttpd-2.3.1.jar

Following technologises used for ploting the Graph 

* Bootstrap 4
* ChartJS
* JQuery


## How to Run 

* This Application is tested with Java 1.8 & Windows 10  & Chrome Browser
* Copy the **xrpmonitor_server.jar**  & **xrpmonitor_client.jar** and **index.html** jar file from build folder and place it in your work station 
* copy the resource folder to where **xrpmonitor_client.jar** jar file is copied
* Open **config.properties** file & make the require changes 
* Open a command prompt and run the **xrpmonitor_client.jar** file using below command
  * `java -jar xrpmonitor_client.jar`
* After program completes, Data are recorded in *ripple.output.folder*
* Open a command prompt and run the **xrpmonitor_client.jar** file using below command
  * `java -jar xrpmonitor_server.jar` Server will be started in 9090 port
* Open **index.html** file in Chrome web browser and view the graph  

## Screen shorts 

1. Default Config File

![default_config](https://user-images.githubusercontent.com/1702024/74331663-8d170b00-4dad-11ea-93f4-4076320c5ecb.PNG)


