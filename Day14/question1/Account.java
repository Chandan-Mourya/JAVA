package com.question1;

class InsufficientFundException extends Exception{
	public InsufficientFundException(String errorMessage) {
		super(errorMessage); //super nhi likha maine fir bhi O/P aaya
	}
}

public class Account {
	String AccountNumber;
	double Balance;
	
	void Deposit(double amount) {
		Balance+=amount;
		System.out.println("Amount in Your Account is: "+Balance);
	}
	
	double withdraw(double amount) throws InsufficientFundException {
		if(amount <= Balance) {
			System.out.println("Withdraw Amount is: "+amount);
			Balance-=amount;
			System.out.println("Remaining Amount is: "+Balance);
		}else {
			System.out.println("Withdraw Amount is: "+amount);
			InsufficientFundException e=new InsufficientFundException("InsufficientFund");
			throw e;
		}
		return 0;
		
	}
	Account(String AccountNumber){
		super();
		this.AccountNumber=AccountNumber;
	}
	
	
}

class AccountDemo{
	public static void main(String[] args) {
		Account a=new Account("1234567989");
		a.Deposit(100);
		
		try {
			a.withdraw(800);
		} catch (InsufficientFundException e) {
			// TODO Auto-generated catch block
		//	e.printStackTrace();
			System.out.println("InsufficientFundException");
		}
		System.out.println("Normal Termination of main");
	}
}