import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;

class Bank
{
	public static void main(String args[])throws IOException
	{
		Scanner sc = new Scanner(System.in);
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
	

			int choice;
			int balance = 0;
			do
			{
			System.out.println("*****************************************************");
			System.out.println("1. Open Account");
			System.out.println("2. Deposite money");
			System.out.println("3. Withdraw Money");
			//System.out.println("4. Display Account");
			System.out.println("****************Please Enter Your Choice*************");
			choice = sc.nextInt();
			
			
			switch (choice)
			{
				case 1:
					
					System.out.println("++++++++++Please fill The Above Information To Open Your New Acccount++++++++++");
					System.out.println("Enter Your name");
					String str = br.readLine();
					System.out.println("Enter your Address");
					String add = br.readLine();
					System.out.println("Enter Account type");
					String typ = br.readLine();
					
					System.out.println("*********************************Account Created Sucessfully***************************************");
					System.out.println("Account Holder Name = "+str);
					System.out.println("Account Holder's Address = " +add);
					System.out.println("Account Type is = "+typ);
					System.out.println("Your Balance is"+balance);
					System.out.println("*********************************Account created Sucessfully***************************************");
					break;
					
				
				case 2:
					System.out.println("Please Enter Amount You Want TO deposite");
					int deposite = sc.nextInt();
					if(deposite > 0)
					{
						balance = balance + deposite;
						System.out.println("Your balance is " +balance);
					}
					else
					{
						System.out.println("You Have Entered Invalid Amount");
					}
				break;
				case 3:
						System.out.println("Please Enter Amount You Want To Withdraw");
						int withdraw = sc.nextInt();
				
					if(withdraw < balance)
					{
					
						balance = balance - withdraw;
						System.out.println("Your current Account balance is "+balance);
					}
					else
					{
						System.out.println("You Have Entered Invalid Amount");
						System.out.println("!!!!!!!Invalid!!!!!!!");
					}
				
				break;
				
			}
			
		}while(choice!=0);
	}
}

