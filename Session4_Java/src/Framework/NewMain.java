package Framework;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class NewMain {
	
	void UserInput() throws IOException
	{
		System.out.println("Enter Students or Staff for inforamtion.");
		Scanner scan1 = new Scanner(System.in);
		String preference=scan1.nextLine();
		if(preference.equals("Students"))
		{
			Students();
		}
		else if(preference.equals("Staff"))
		{
			Staff();
		}
		else{
			System.out.println("Select appropriate choice, Students or Staff");
			UserInput();}
	}
	
	public void Students() throws IOException
	{
		System.out.println("Enter ID");
		Scanner scan = new Scanner(System.in);
		int ID = scan.nextInt();
		FileReader fr=new FileReader(System.getProperty("user.home")+"/Desktop/Session4_Java/src/Framework/Students.txt"); 
		
          BufferedReader br=new BufferedReader(fr);      
          int i;    
          while((i=br.read())!=-1){  	         	 
        	  switch(ID)
        	  {
        	  case 1991:
        		  String line2 = Files.readAllLines(Paths.get(System.getProperty("user.home")+"/Desktop/Session4_Java/src/Framework/Students.txt")).get(2);
        		  System.out.println(line2);
        		  break;
        	  case 1992:
        		  String line3 = Files.readAllLines(Paths.get(System.getProperty("user.home")+"/Desktop/Session4_Java/src/Framework/Students.txt")).get(3);
        		  System.out.println(line3);
        		  break;
        	  case 1993:
        		  String line4 = Files.readAllLines(Paths.get(System.getProperty("user.home")+"/Desktop/Session4_Java/src/Framework/Students.txt")).get(4);
        		  System.out.println(line4);
        		  break;
        	  case 1994:
        		  String line5 = Files.readAllLines(Paths.get(System.getProperty("user.home")+"/Desktop/Session4_Java/src/Framework/Students.txt")).get(5);
        		  System.out.println(line5);
        		  break;
        	  case 1995:
        		  String line6 = Files.readAllLines(Paths.get(System.getProperty("user.home")+"/Desktop/Session4_Java/src/Framework/Students.txt")).get(6);
        		  System.out.println(line6);
        		  break;        		  
        	  }
          }  
          br.close();    
          fr.close();    
	}
	
	public void Staff() throws IOException
	{
		System.out.println("Enter ID");
		Scanner scan = new Scanner(System.in);
		int ID = scan.nextInt();
		FileReader fr=new FileReader(System.getProperty("user.home")+"/Desktop/Session4_Java/src/Framework/Staff.txt");    
          BufferedReader br=new BufferedReader(fr);      
          int i;    
          while((i=br.read())!=-1){  
        	  switch(ID)
        	  {
        	  case 1221:
        		  String line2 = Files.readAllLines(Paths.get(System.getProperty("user.home")+"/Desktop/Session4_Java/src/Framework/Staff.txt")).get(2);
        		  System.out.println(line2);
        		  break;
        	  case 1222:
        		  String line3 = Files.readAllLines(Paths.get(System.getProperty("user.home")+"/Desktop/Session4_Java/src/Framework/Staff.txt")).get(3);
        		  System.out.println(line3);
        		  break;
        	  case 1223:
        		  String line4 = Files.readAllLines(Paths.get(System.getProperty("user.home")+"/Desktop/Session4_Java/src/Framework/Staff.txt")).get(4);
        		  System.out.println(line4);
        		  break;
        	  case 1224:
        		  String line5 = Files.readAllLines(Paths.get(System.getProperty("user.home")+"/Desktop/Session4_Java/src/Framework/Staff.txt")).get(5);
        		  System.out.println(line5);
        		  break;
        	  case 1225:
        		  String line6 = Files.readAllLines(Paths.get(System.getProperty("user.home")+"/Desktop/Session4_Java/src/Framework/Staff.txt")).get(6);
        		  System.out.println(line6);
        		  break;        		  
        	  }  
          }  
          br.close();    
          fr.close();
	}

	public static void main(String[] args) throws IOException {
		NewMain nm = new NewMain();
		nm.UserInput();

	}

}
