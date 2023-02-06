import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);   
		System.out.println("enter the n value");
		int n =sc.nextInt();
		
        
        if(n>0) 
        {
        	System.out.println("the number is positive");
        }
        else if(n<0) {
        	System.out.println("the number is negative");
        }
        else {
        	System.out.println("the number is zero");
        }
	}

}































