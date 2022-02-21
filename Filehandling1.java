package com.filehandling;
import java.io.File;
import java.io.FileWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class Filehandling1{
	public static List<String> readFile(String fileName)
	{
		List<String> list=Collections.emptyList();
		try {
			list=Files.readAllLines(Paths.get(fileName),StandardCharsets.UTF_8);
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		return list;
	}
	
	
	public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
		
		String choice;
		
		System.out.println("File handling operations");
		System.out.println("1.write,2.append,3.read");
		System.out.println("enter your choice");
		choice = sc.nextLine();
		
		if(choice.equals("1"))
		{
			try{
				FileWriter fw = new FileWriter("C:\\mphasis\\data.txt");
				fw.write("file successly written");
				fw.close();
				System.out.println("file successfully writeen");
			}
			catch(Exception e)
			{
				System.out.println(" Write exception occured");
				
			}
		}
		else if(choice.equals("2"))
		{
			try {
				String data="file has to be append";
				File file= new File("C:\\mphasis\\data.txt");
				if(file.exists()) {
					file.createNewFile();
				}
				FileWriter filewriter =new FileWriter(file.getName(),true);
				BufferedWriter fw1=new BufferedWriter(filewriter);
				fw1.write(data);
				fw1.close();
				System.out.println("file has appended");
				} catch(Exception e)
			{
					System.out.println("Append exception occured");
			}
		}
	   else if(choice.equals("3"))
	   {
		   List<String> result=readFile("C:\\mphasis\\data.txt");
		  
		  Iterator<String> it= result.iterator();
		  while(it.hasNext())
		  {
			  System.out.println(it.next());
			  
		  }
	   }
		   		   
			   
			   
		   
		   
		         
			   
		   }
			
		
	}