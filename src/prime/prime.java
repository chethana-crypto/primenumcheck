package prime;
import java.util.*;
public class prime {
	public static void main(String args[]) {
		
		System.out.print("Enter the  number to check for prime or not: ");
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		boolean flag=false;
		
		if (n==0 || n==1) {
			System.out.println("Then number entered is not prime ");
			
		}
		
		else{
			
			for (int m=2;m<=n/2;m++) {
				if (n%m == 0) {
					System.out.println("Then number entered is not prime");
					flag = true;
					break;
					
				}
				else {
					flag= false;
				}
				
			}
			
			if(flag ==false) {
				System.out.println("Then number entered is  PRIME");
				
			}
		}
		
	}

}
