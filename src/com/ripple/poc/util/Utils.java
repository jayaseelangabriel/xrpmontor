package com.ripple.poc.util;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Locale;


public class Utils {
	
	 public static float getSecounds(String date1,String date2){
		   
		 float diffInMillies = 0;
		   try {
			   SimpleDateFormat sdf = new SimpleDateFormat("MMM-dd HH:mm:ss.SSS", Locale.ENGLISH);
			   Date firstDate = sdf.parse(date1);
			   Date secondDate = sdf.parse(date2);
			   
			   diffInMillies = Duration.between( firstDate.toInstant(),secondDate.toInstant()).toMillis()/(float)1000;
		   }catch (Exception e) {
			   e.printStackTrace();
		   }
		return diffInMillies;
	 }
	 
	 public static void main(String[] args) {
		System.out.println(getSecounds("Feb-12 23:12:31.067", "Feb-12 23:12:25.078"));
	}
}
