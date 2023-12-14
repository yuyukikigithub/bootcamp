package bank;
import java.util.Arrays;

public class Account implements Transferable{
    // private int balance; // can be omitted after transaction
    private String type;
    private AccountHolder accountHolder;
    private Transaction[] transactions;

    public Account(AccountHolder accountHolder){
        this.accountHolder=accountHolder;
        // this.balance=0;
        this.transactions=new Transaction[0];
    }
    public Account(String name, int age){
        AccountHolder accountHolder = new AccountHolder(name, age);
        this.accountHolder=accountHolder;
        // this.balance=0;
        this.transactions=new Transaction[0];
    }

    private boolean addTransaction (Transaction transaction){
        Transaction[] newArr = Arrays.copyOf(this.transactions, this.transactions.length+1);
        newArr[newArr.length-1]=transaction;
        this.transactions=newArr;
        return true;
    }

    public int balance(){
        int result=0;
        for (Transaction transaction : this.transactions) {
            if (transaction.isCredit()) {
                result+=transaction.getAmount();
            } else{
                result-=transaction.getAmount();
            }
            
        }
        return result;
    }
    @Override
    public boolean transfer( Transferable to, int amount){
        // if ( amount<=0 || !to.credit(amount) || !this.debit(amount)) {
        //     return false;
        // }
        if (amount <= 0)
            return false; // throw
        if (this.balance()<amount) 
            return false;
        // if (!this.debit(amount)) // vs this.balance()<amount // 
        // //1. inside this.debit(amount), this.balance()<amount->false, addTransaction()
        // //2. (!this.debit(amount)) ->false, skip
        //     return false;
        Account target = (Account) to;
        if (!target.credit(amount))//1. inside to.credit(amount), to.addTransaction()
        //2. (!target.credit(amount)) -> false, skip
            return false;
        return addTransaction(Transaction.now(false, amount));
    }

    public boolean credit(int amount){ // add
        // this.balance()+=amount;
        return addTransaction(Transaction.now(true, amount));
    }
    public boolean debit(int amount){ // deduct
        if (amount>this.balance()) return false;
        return addTransaction(Transaction.now(false, amount));    
        
    }

    @Override
    public String toString(){
        return "Account Holder: "+this.accountHolder+" having transactions:"+Arrays.toString(transactions);
    }
    public static void main(String[] args) {
        Account johnAccount = new Account("John",30);
        System.out.println(johnAccount.credit(1000));//true
        System.out.println(johnAccount.balance());//

        Account peterAccount=new Account("Peter", 25);
        System.out.println(peterAccount.credit(30)); //true

        System.out.println(johnAccount.transfer(peterAccount, 100)); //true
        System.out.println(johnAccount.balance()); //
        System.out.println(peterAccount.balance()); //

        //maryTransferable.compareTo -> compile error
        //because type of the reference "Object" / "Transferable" cannot reach compareTo()
        Transferable maryTransferable = new Account("Mary",90);
        System.out.println(maryTransferable.transfer(peterAccount, 10));
        // System.out.println(maryTransferable.compareTo(johnAccount));

        Object tomTransferable = new Account("Tom",90);
        // System.out.println(tomTransferable.compareTo(maryTransferable));

    }
    
}
