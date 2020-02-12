package com.ripple.poc.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;


public class Utils {
	
	 public static long getSecounds(String date1,String date2){
		   
		   long diffInMillies = 0;
		   try {
			   SimpleDateFormat sdf = new SimpleDateFormat("MMM-dd HH:mm:ss", Locale.ENGLISH);
			   Date firstDate = sdf.parse(date1);
			   Date secondDate = sdf.parse(date2);
			   diffInMillies = Math.abs(secondDate.getTime() - firstDate.getTime())/1000;
		   }catch (Exception e) {
			   e.printStackTrace();
		   }
		return diffInMillies;
	 }
}
