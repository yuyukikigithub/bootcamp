public class AccountHolder {
    private String name;
    private Account account;
    
    public AccountHolder(){
        
    }
    public AccountHolder(Account account){
        this.account=account;
    }
    public void setAccount(Account account){
        this.account=account; 
    }
    public Account createAccount(String accountNo){
        return new Account(accountNo);
    }
    public class Account{
        private String accountNo;
        public Account(String accountNo){
            this.accountNo=accountNo;
        }

        public void printHolderName(){
            System.out.println(name);
        }
    }
    
    public static void main(String[] args) {

        AccountHolder john = new AccountHolder();
        Account johnAccount = john.createAccount("123456");
        johnAccount.printHolderName();// inner class method can access to outer class variable
    }
}

