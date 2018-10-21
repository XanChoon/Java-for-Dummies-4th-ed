class Balance{
    double bankbalance;
    double bankbankin;
    double withdraw;
    
    double latestbalance(){
        return bankbalance + bankbankin - withdraw;
    }
}

class SimpleBankTransaction{
    public static void main (String [] args){
        Balance mybalance = new Balance();
        double totalbalance;
        
        mybalance.bankbalance = 1000;
        mybalance.bankbankin = 500;
        mybalance.withdraw = 250;

        totalbalance = mybalance.latestbalance();
        System.out.println ("Sir/Madam your latestbalance is RM" + totalbalance);
    }
     
}