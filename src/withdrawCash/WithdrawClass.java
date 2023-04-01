
package withdrawCash;

import java.util.Scanner;

public class WithdrawClass {
	int withdrawn;
	int actualCode = 1234;
	int EnteredCode;
	int counter=3;
	int balanceAmt=4000;
	boolean isPinCorrect;
	Scanner sc = new Scanner(System.in);
	Scanner cr = new Scanner(System.in);
	void EnterPinCode() {
		for(int counter = 1;counter<=4;counter++)
		{
			System.out.println("ENTER THE CODE");
			EnteredCode = sc.nextInt();
			if(actualCode==EnteredCode  ) {
				System.out.println("Entered code is correct");
				
				break;
			}
			else if(counter ==4 ) { 
			System.out.println("card blocked ");
			}
			else
			{
				//System.out.println("card block");
				System.out.println("entered pin incorrect");
			}
		}
		
		}

	void CashWithdrawn() {


		
	
	if(actualCode==EnteredCode) {
		System.out.println("Enter the withdrawn amount");
		withdrawn = cr .nextInt();
		 if(balanceAmt>=withdrawn) {
			 System.out.println("Cash withdrawn amount="+withdrawn);
		 }
		 else 
		 {
		System.out.println("Insufficient Balance");
		 }
		}
	}
}
		
			
