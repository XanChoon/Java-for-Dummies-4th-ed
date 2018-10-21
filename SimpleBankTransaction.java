class SavingAccount{
    
    private double balance;
    
    public SavingAccount(){
		balance = 0;	
	}
    
    public SavingAccount(double initialBalance){
		balance = initialBalance;
	}

	public void bankbankin(double amount){
		balance = balance + amount;
	}
    
    public void withdraw(double amount){
		balance = balance - amount;
	}
    
    public double totalbalance(){
		return balance;
	}
}

class SimpleBankTransaction{
    public static void main (String [] args){

        SavingAccount mybalance = new SavingAccount(1000);
        mybalance.bankbankin(500);
        mybalance.withdraw(123);
        System.out.println ("Sir/Madam your latestbalance is RM" + mybalance.totalbalance());
    }
}
