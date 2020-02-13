package com.ripple.poc.main;

/**
* The URLWatcher program implements an application that Call the rippled server info JSON RPC and log the related information to Log file for further data analysis
*
* @author  Jayaseelan Gabriel
* @version 1.0
* @since   2007 
*/

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import org.apache.commons.io.FileUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ripple.poc.response.objectmapper.Response;
import com.ripple.poc.util.PropertyManager;
import com.ripple.poc.util.Utils;


public class URLWatcher extends TimerTask {
	
	public static int previous_seq = 0;
	public static int current_seq = 0;
	public static int numberofrun = 0;
	
	public static String previous_time = "";
	public static String current_time = "";
	
	public static int totalrun = 0;
	public static int runindex = 0;
	public static int runinterval = 0;

    @Override
    public void run() {
        
        runindex++;
        System.out.println("Run Index:"+runindex);
        createreceipt();
        
        if(totalrun==runindex) {
        	 System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~URL fetch Task Finished~~~~~~~~~~~~~~~~~~~~~~~~");	
        	 System.exit(0);
        }
        
    }
    
  
    /*
     * This function is used to call the rippled URL and Creates the log file 
     *  
     * 
     */ 
    private void createreceipt() {
        try {
           
        	/*File file = new File("resources\\test.json");
    		String string = FileUtils.readFileToString(file,StandardCharsets.UTF_8);*/
    		
    		StringEntity requestEntity = new StringEntity("{\"method\":\"server_info\",\"params\":[{}]}", ContentType.APPLICATION_JSON);
	 		CloseableHttpClient httpClient = HttpClients.createDefault();
 			HttpPost postMethod = new HttpPost(PropertyManager.getValue("ripple.serverinfo.url"));
 			postMethod.setEntity(requestEntity);
 			HttpResponse rawResponse = httpClient.execute(postMethod);
 			String responseString = new BasicResponseHandler().handleResponse(rawResponse);
	 			
 			System.out.println(responseString);
 			// Opject Mapper used to Convert the JSON to JAXB
    		ObjectMapper mapper = new ObjectMapper();
    		Response rippleResponse  = mapper.readValue(responseString, Response.class); 
    		
    		
    		System.out.println(rippleResponse.getResult().getInfo().getValidatedLedger().getSeq());
            System.out.println("Ripple:"+rippleResponse.getResult().getInfo().getTime().substring(5,24));
            System.out.println("System:"+new Date());
    		
    		if (numberofrun != 0) 
    			{
    				previous_seq = current_seq;
    				previous_time=current_time;
    				current_seq =(int)rippleResponse.getResult().getInfo().getValidatedLedger().getSeq();
    				current_time = rippleResponse.getResult().getInfo().getTime().substring(5,24);
    				File sourceFile = new File( PropertyManager.getValue("ripple.output.folder"), PropertyManager.getValue("ripple.output.filename") );
    				List <String> list = new ArrayList<String>();
    				int seqdifference = current_seq - previous_seq;
    				float perSequence=0;
    				if(seqdifference!=0) {
    					perSequence = Utils.getSecounds(previous_time, current_time)/(float)seqdifference;
    				}
    				
    				// File Pattern [DATE,SEQUENCE#,SEQUENCE DIFFERENCE, SECOND DIFFERENCE BETWEEN CURRENT AND PREVIOUS RUN, PER SEQ AVG COMPLETE TIME
    				String line = rippleResponse.getResult().getInfo().getTime().substring(5,24) +","+current_seq+","+seqdifference+","+Utils.getSecounds(previous_time, current_time)+","+Math.round(perSequence * 100.0) / 100.0;;
    				list.add(line);
    				FileUtils.writeLines(sourceFile, list, true);
    			}else {
	    			current_seq =(int)rippleResponse.getResult().getInfo().getValidatedLedger().getSeq();
	    			current_time = rippleResponse.getResult().getInfo().getTime().substring(5,24);
    				File sourceFile = new File( PropertyManager.getValue("ripple.output.folder"), PropertyManager.getValue("ripple.output.filename") );
    				List <String> list = new ArrayList<String>();
    				FileUtils.writeLines(sourceFile, list, false);
    				numberofrun++;
    			}
           
        	} catch (Exception e) {
        		e.printStackTrace();
        }
    }
    
   	public static void main(String[] args)
        {
   			
   			totalrun = Integer.parseInt(PropertyManager.getValue("ripple.total.run"));
   			runinterval = Integer.parseInt(PropertyManager.getValue("ripple.run.interval"));		
   			//Schedule the Job
            Timer timer = new Timer();
            TimerTask task = new URLWatcher();
            timer.schedule(task, 3600,runinterval);
        }

}
