package bank.abc;

import java.util.ArrayList;

public class CustomerManager {

	private ArrayList<Customer> customersList = new ArrayList<Customer>();

	// add customer
	public int addCustomer(String name,double balance) {
		Customer customer=new Customer(name,balance);
		customersList.add(customer);
		return customer.getId();
	}

	// displaying customer
	public Customer displayCustomer(int id) {
		for(Customer cust : customersList) {
			if(cust.getId() == id)
			{
				return cust;
			}
		}
		return null;
	}

	// displaying all customerOne
	public ArrayList<Customer> displayAllCustomersOne(){		
		return customersList;
	}

	// displaying all customerTwo
	public ArrayList<Customer> displayAllCustomersTwo(){		
		return customersList;
	}

	// depositing the amount to customer
	public double deposit(int id, double balance, boolean check) {
		for(Customer cust :customersList) {
			// initially boolean check is provided with true which is fixed.
			if(check){
				if(cust.getId()==id){
					return 1;
				}
			}else if(cust.getId()==id){
				cust.setBalance(cust.getBalance()+balance);
				return cust.getBalance();
			}		
		}
		return 0;
	}

	public double withdraw(int id , double withdraw, boolean check){
		for(Customer cust : customersList){
			// here check is provided with true
			if(check){
				if(cust.getId() == id){
					return 1;
				}				
			}
			else if(cust.getId() == id){
				cust.setBalance(cust.getBalance()-withdraw);
				return cust.getBalance();
			}
		}
		return 0;
	}

	public double transfer(int id ,int trid, double transfer, boolean check){
		double balance = 0;
		for(Customer cust :customersList){
			if(check){
				if(cust.getId() == id ){
					for(Customer cust1 : customersList){
						if(cust1.getId() == trid){
							return 1;
						}
					}					
				}
			}
			else{
				balance = withdraw(id, transfer, false);
				deposit(trid, transfer, false);
				return balance;
			}
		}
		return 0;
	}
}







