package com.ripple.poc.main;

/**
* The LightRESTServer program read the log file data and expose service as JSON API 
* Access this REST server by using http://localhost:9090
* @author  Jayaseelan Gabriel
* @version 1.0
* @since   2007 
*/

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ripple.poc.util.PropertyManager;

import fi.iki.elonen.NanoHTTPD;
import fi.iki.elonen.NanoHTTPD.Response.Status;

public class LightRESTServer extends NanoHTTPD {
    public LightRESTServer() throws IOException {
        super(9090);
        start(NanoHTTPD.SOCKET_READ_TIMEOUT, false);
    }
 
    public static void main(String[] args ) throws IOException {
        new LightRESTServer();
    }
 
    @Override
    public Response serve(IHTTPSession session) {
    	
    	
    	Response response;
    	String json = "";
    	Map<String, Object> jsonMap = new HashMap<String, Object>();
    	
    	List<String> timelist = new ArrayList<String>();
    	List<Integer> currentsequenseList = new ArrayList<Integer>();
    	List<Integer> squencedifferenceList = new ArrayList<Integer>();
    	
    	List<Float> persequenceList = new ArrayList<Float>();
    	
    	
    	
    	try (
                Reader reader = Files.newBufferedReader(Paths.get(PropertyManager.getValue("ripple.output.folder")+"/"+PropertyManager.getValue("ripple.output.filename")));
                CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT);
            ) {
    		
    			int i=0;
    			float sum=0;
    			
                for (CSVRecord csvRecord : csvParser) {
                    
                	if(i==0) {
                		 jsonMap.put("starttime", csvRecord.get(0));
                		 jsonMap.put("interval", PropertyManager.getValue("ripple.run.interval"));
                		 jsonMap.put("totalrun", PropertyManager.getValue("ripple.total.run"));
                	}
                	
                    String time = csvRecord.get(0).substring(7);
                    String currentsequense = csvRecord.get(1);
                    String squencedifference = csvRecord.get(2);
                    String persequence = csvRecord.get(4);
                    
                    timelist.add(time);
                    squencedifferenceList.add(Integer.parseInt(squencedifference));
                    currentsequenseList.add(Integer.parseInt(currentsequense));
                    persequenceList.add(Float.parseFloat(persequence));
                    
                    sum+=Float.parseFloat(persequence);
                    i++;
                 }
                
                jsonMap.put("data", squencedifferenceList);
                jsonMap.put("time", timelist);
                jsonMap.put("sequence", currentsequenseList);
                jsonMap.put("persequence", persequenceList);
                
                jsonMap.put("min", Collections.min(persequenceList));
                jsonMap.put("max", Collections.max(persequenceList));
                jsonMap.put("avg", Math.round(sum/(float)i * 100.0) / 100.0);
                
                
    	}catch (Exception e) {
			// TODO: handle exception
		}
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            json = objectMapper.writeValueAsString(jsonMap);
            System.out.println("json = " + json);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    	
         
        response = newFixedLengthResponse(Status.OK, "application/json",json);
        response.addHeader("Access-Control-Allow-Origin", "*");		
        return response;		
    }
}