package Assignment1;

import java.io.*;
public class program1{
	public static void main(String[] args)throws IOException {
	  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			  System.out.println("enter number:");
	  int n=Integer.parseInt(br.readLine());
			  System.out.println("multiplication table:");
			  for(int i=1;i<=10;i++) {
				  System.out.println(n+"x"+i+"="+(n*i));
			  }
		
	}

}
	
		
		
		
	