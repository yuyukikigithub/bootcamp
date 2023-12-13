public class Account {
    private int balance; // can be omitted after transaction
    private String type;
    private AccountHolder accountHolder;
    private Transaction[] transaction;

    public Account(AccountHolder accountHolder){
        this.accountHolder=accountHolder;
        this.balance=0;
    }

    public int balance(){
        return 0;
    }

    public void credit(int amount){ // add
        this.balance+=amount;
    }
    public boolean debit(int amount){ // deduct
        if (amount<balance) {
            this.balance-=amount;
            return true;    
        }
        return false;
    }

}
