package Assignment1;
import java.util.Scanner;
import java.util.Arrays;

public class setA3 {

	public static void main(String[] args) {
		        Scanner sc=new Scanner(System.in);
		        System.out.print("Enter number of elements: ");
		        int n=sc.nextInt();
		        int a[]=new int[n];
		        int sum=0;
		        System.out.println("Enter elements:");
		        for(int i=0;i<n;i++) {
		            a[i]=sc.nextInt();
		            sum=sum+a[i];
		        }

		        Arrays.sort(a);
		        System.out.println("Sum="+sum);
		        System.out.println("Ascending order:");
		        for(int i=0; i<n;i++) {
		            System.out.print(a[i] + " ");
		        }
		    }
		

	}


