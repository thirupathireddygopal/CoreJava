package bank.abc;

import java.util.ArrayList;
import java.util.Scanner;

public class BankApp {
	
	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager();
		Scanner sc = new Scanner(System.in);
		String name;
		int id,trid,choice;
		double balance,amount,valueExist,withdraw;
		do {
			System.out.println("1. Add Customer");
			System.out.println("2. Display Customer");
			System.out.println("3. Display All Customers in an Array");
			System.out.println("4. Display All Customers information using getvalue() method");
			System.out.println("5. Deposit");
			System.out.println("6. Withdraw");
			System.out.println("7. Transfer");
			System.out.println("8. Exit");
			System.out.println("Enter your choice :");
			choice = sc.nextInt();
			switch(choice) {
			
			case 1: 
					System.out.println("adding customers");				
					System.out.println("Enter your name :");
					name = sc.next();
					System.out.println("Enter balance :");
					balance = sc.nextDouble();
					id = customerManager.addCustomer(name,balance);
					System.out.println("Transaction Success with id :" + id);
					System.out.println("-----------------------");
					break;
			
			case 2 : System.out.println("Enter id to display :");
			      id = sc.nextInt();
			      Customer cust = customerManager.displayCustomer(id);
			      if(cust != null)
			    	  System.out.println(cust);
			      else
			    	  System.out.println("No Record found...");
			      System.out.println("-----------------------");
			      break;
			      
			case 3 :System.out.println("displaying all customers");
					ArrayList<Customer> customers = customerManager.displayAllCustomersOne();
					System.out.println(customers);
					System.out.println("-----------------------");
					break;
					
			case 4 :
				System.out.println("displaying all customers details by get() method");
				ArrayList<Customer> customerList= customerManager.displayAllCustomersTwo();
				if(!customerList.isEmpty()){
					for(Customer x : customerList){
						System.out.println("id is:" + x.getId());
						System.out.println("name is: "+ x.getBalance());
						System.out.println("balance is:" + x.getBalance());
					}
					System.out.println("-----------------------");
					break;
				}
				else{
					System.out.println("Not customers details are found..");
					break;
				}			
			      
			case 5: System.out.println("deposit the amount to your account...");
					System.out.println("enter your id:");
					id = sc.nextInt();
		// here 0 is provided in order to give some value to balance so that method executes
					valueExist = customerManager.deposit(id,0,true);
					if(valueExist == 1){
						System.out.println("enter your balance to deposit");
						balance = sc.nextDouble();
						double totalAmount = customerManager.deposit(id, balance,false);
						System.out.println("your id is " + id +"and the net amount is " + totalAmount);
					}else{
						System.out.println("No Record Found");
					}
					System.out.println("-----------------------");
					break;
					
			case 6:
				System.out.println("withdrawing the amount....");
				System.out.println("enter your id:");
				id = sc.nextInt();
				valueExist = customerManager.withdraw(id,1.0,true);
				if(valueExist == 1){
					System.out.println("enter amount to withdraw: ");
					withdraw = sc.nextDouble();
					amount = customerManager.withdraw(id, withdraw, false);
					System.out.println("your id is " + id + " and the net amount after withdraw is " + amount);
				}else{
					System.out.println("No records found with the id mentioned..");
				}
				System.out.println("-----------------------");
				break;
				
			case 7:
				System.out.println("Transfering amount to other customer");
				System.out.println("enter your id: ");
				id = sc.nextInt();
				System.out.println("enter transfer id: ");
				trid = sc.nextInt();
				valueExist = customerManager.transfer(id,trid,9.99,true); //here boolean check is provided true
				if(valueExist == 1){
					System.out.println("enter amount to transfer: ");
					amount = sc.nextDouble();
					balance = customerManager.transfer(id,trid,amount, false);
					System.out.println("transefered successful remaining balance is " + balance);
				}
				else{
					System.out.println("No records found with the id mentoined..");
				}
			} //end of switch
		}while(choice != 8); //end of do while
		System.out.println("-----------------------");
		sc.close();
	}
}











