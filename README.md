# xrpmonitor - XRP Monitoring APP

## Quick Start 

This program is periodically calls rippled’s server_info command (JSON-RPC) and records the sequence number of the latest validated ledger along with the current time stamp & records those data in a flat file ( CSV format). The HTML **index.html** page is used to visualizes how frequently the ledger sequence is incremented over time using Graphical notation **(Bar & Line charts)**

## Dependencies 

Following 3rd Party Jars are used for implemenation of Java module.

For Response Handling ( JSON to JAVA Object )
 * com.fasterxml.jackson.databind.jar
 * jackson-core-2.2.3.jar
 * jackson-annotations-2.0.1.jar
 * commons-csv-1.8.jar
 * commons-io-2.6.jar

For Client Application  
 * commons-codec-1.11.jar
 * commons-logging-1.2.jar
 * httpclient-4.5.10.jar
 * httpcore-4.4.12.jar

For Light weight Webserver ( Server Application)
* nanohttpd-2.3.1.jar

Following technologises used for ploting the Graph  ( Visualization) 

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
* Program will automatically terminates once it reaches the total number of run  
* After program completes, Data are recorded in *ripple.output.folder*
* Open a command prompt and run the **xrpmonitor_client.jar** file using below command
  * `java -jar xrpmonitor_server.jar` Server will be started in 9090 port
* Open **index.html** file in Chrome web browser and view the graph  

## Screen shorts 

1. Default Config File

![default_config](https://user-images.githubusercontent.com/1702024/74331663-8d170b00-4dad-11ea-93f4-4076320c5ecb.PNG)

2. Copy the jar files to folder along with resource folder

![file_copy](https://user-images.githubusercontent.com/1702024/74364703-15190700-4de6-11ea-9fdf-b200553236e9.png)

3. Run the Client jar & wait for number of run to completes

![client_run](https://user-images.githubusercontent.com/1702024/74365015-af794a80-4de6-11ea-949d-2fc4732bd05c.png)

4. Run the Server jar & REST server will be listen in 9090 Port

![server_run](https://user-images.githubusercontent.com/1702024/74365179-f6674000-4de6-11ea-919d-1c4589a7dba8.png)

5. Open the index.html file into Chrome web browser & view the data

![Result_view](https://user-images.githubusercontent.com/1702024/74365311-41815300-4de7-11ea-98ef-3dacd7e473b5.png)





