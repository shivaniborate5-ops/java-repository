package Assignment1;
import java.util.Scanner;
public class Number {
	int x;
       public static void main(String[]args) {
    	   Scanner sc=new Scanner(System.in);
    	   Number n=new Number();
       System.out.println("enter number:");
       n.x=sc.nextInt();
       System.out.println("Number="+n.x);
       sc.close();
       
       }
}
