public class Account {
    private AccountHolder accountHolder;
    
    public Account(){
        
    }
    public Account(AccountHolder accountHolder){
        this.accountHolder=accountHolder;
    }
    public void setAccountHolder(AccountHolder accountHolder){
        this.accountHolder=accountHolder; 
    }
    public class AccountHolder{
        private String name;
        public AccountHolder(String name){
            this.name=name;
        }
    }
    public static void main(String[] args) {
        Account account1 = new Account();
        AccountHolder accountHolder = account1.new AccountHolder("john");
        account1.setAccountHolder(accountHolder);

    }
}
