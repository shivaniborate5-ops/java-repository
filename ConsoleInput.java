package Assignment1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleInput {
	public static void main(String[]args) throws NumberFormatException, IOException{
					
		    int rollNumber;
		    String name;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the roll number:");
		rollNumber=Integer.parseInt(br.readLine());
		System.out.println("Enter the name:");
		name=br.readLine();
		System.out.println("Roll Number="+rollNumber);
		System.out.println("name="+name);
		 }
}

		
		
	


