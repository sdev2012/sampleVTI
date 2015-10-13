package com.VTI.CI_Example;

import java.util.UUID;


/**
 * Hello world!
 *
 */
public class App 
{
	 public static void main(String[] args) 
		
		
		{
			
				App obj = new App();
				System.out.println("Unique ID :" + obj.generteUniqueKey());
				
				
		}
		
		public String generteUniqueKey()
		{
			
			String id = UUID.randomUUID().toString();
			return id;
		}
}
