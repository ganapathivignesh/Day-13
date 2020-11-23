package com.test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Fileex {
	  FileWriter fw=null;  //file reader and filewriter//
	  FileReader fr=null;
      String name;  //for accepting file name from user//

      public String readWriteOperation() throws IOException
      {
    	  
      Scanner sc=new Scanner(System.in);  //getting filename from user//
	  System.out.println("enter file name");
	  name=sc.next();      
	  name=name+".txt";
	  
	  
	  try {
		fw=new FileWriter(name+".txt");
		fw.write(name);   //writing name to created file//
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
	  
	  finally
	  {
		  fw.close();  //closing filewriter//
	  }
	  return "done";
  }

      
      public String readOperation() throws IOException
      {                                         //reads from file//
    	  String fname;
    	  fr=new FileReader(name+".txt");
    	  int i;
    	  while ((i=fr.read())!=-1)
    	  {                                     
    		  System.out.println((char)i);
    		  
    	  }
    	  return "done";
      }
      
}

