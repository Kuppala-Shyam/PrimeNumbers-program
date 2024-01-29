package InternPack;

import java.util.Scanner;

public class PrimeNumbersInRange {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in) ;
		System.out.println("Enter the starting number in range:");
		int startingNumber=scan.nextInt();
		System.out.println("Enter the ending number in range:");
		int endingNumber=scan.nextInt();
		for(int i=startingNumber;i<=endingNumber;i++) {
			int count=0;
			if(i==1) {
				System.out.println(i+"is neither a prime nor a an even");
				continue;
			}
			for(int j=2;j<i/2;j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==0) {
				System.out.println("The prime numbers from"+startingNumber+"to"+endingNumber+"are");
				System.out.println(i);
			}
		}
		
			
		

	}

}
