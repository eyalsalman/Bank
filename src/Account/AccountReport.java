package Account;

import java.util.ArrayList;

import models.Account;
import models.BankBranch;
import models.Customer;

public class AccountReport 
{

	  private int account_id;
	    private int pin;
	    private double amount;
	    private int account_type; //1 checking //2 saving
	    private int bank_branch_id;
	    
	   	private ArrayList<Customer> customers;
	    private BankBranch bank_branch;
	    private boolean joint_account;

		public void addCustomer(Customer customer){
	    	this.customers.add(customer);
	    }
	    	
	
		public boolean isJoint_account() {
			return joint_account;
		}


		public void setJoint_account(boolean joint_account) {
			this.joint_account = joint_account;
		}
	   
	    public Account (int account_idIn) {
	    	this.account_id = account_idIn;
	    }

	    public int getAccount_id() {
	          return this.account_id;
	    }
	    public void setAccount_id(int account_idIn) {
	          this.account_id = account_idIn;
	    }

	    public int getPin() {
	          return this.pin;
	    }
	    public void setPin(int pinIn) {
	          this.pin = pinIn;
	    }

	    public double getAmount() {
	          return this.amount;
	    }
	    public void setAmount(double f) {
	          this.amount = f;
	    }

	    public int getAccount_type() {
	          return this.account_type;
	    }
	    public void setAccount_type(int account_typeIn) {
	          this.account_type = account_typeIn;
	    }

	    public int getBank_branch_id() {
	          return this.bank_branch_id;
	    }
	    public void setBank_branch_id(int bank_branch_idIn) {
	          this.bank_branch_id = bank_branch_idIn;
	    }

	   
	

}
