import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalDouble;

public class DemoOptional {
    public static void main(String[] args) {
        // Cat: age, name;
        // Cat.class , Cat is the name of a class only. you can name it anything, such as Box
        //or you can simply treat it as AgeAndNumberHolder.class

        // assume there should not be null , then object.method
        // Optional 
        Account account = DemoOptional.setup(1,1.0);
        account.credit(10.6);
        Account account2 = DemoOptional.setup(0, 63.0); //NullPointerException
        // account2.credit(123.60);

        // as a caller, we can generally handle null value in this way

        // approach 1 to handle optional return value
        setup2(4, 0.0).ifPresent(acct->{ // ifPresent check inside if exist, if yes do, if no skip
            acct.credit(100.03);
            System.out.println(acct.getBalance());
        });

        //Approach 2 to handle Optional return value
        Optional<Account> oa = setup2(4, 0.0);
        if (oa.isPresent()) { // to ensure there is no nullpointer
            oa.get().credit(1000.6); // if get() return null, 爆
            System.out.println(oa.get().getBalance());
        }else {
            System.out.println(" not to handle when account object is null");
        }

        List<Account> accounts = new ArrayList<>(List.of(new Account(0,30.6),new Account(2,30.4),new Account(3,30.5)));
        Optional<Account> optaccount=accounts.stream()
                    .filter(e->e.getBalance()>30.0d)
                    .findFirst();


        Optional<Account> optaccount1=accounts.stream()
                    .filter(e->e.getBalance()>30.0d)
                    .findAny();
        optaccount.ifPresent(e->{
                                    e.getBalance();
                                    System.out.println("hhheeelllooo");
                            });
        Optional.ofNullable(optaccount).ifPresent(e->e.get().getBalance());
       
        // System.out.println(optaccount.isPresent(acct-> System.out.println(acct.getBalance())));
        Optional<Account> neo = Optional.ofNullable(null);
        Account acct1 =neo.orElse(new Account(100, 0.1));
        Account acct2 =neo.orElseGet(()->new Account(100, 0.2));
        // Account acct3 =neo.orElseThrow(()->new NoSuchElementException());
        // System.out.println(acct3);

        Optional<String> optionalValue = Optional.ofNullable(null);
        System.out.println(optionalValue);
        
        OptionalDouble maxBalance=accounts.stream() 
                                    .mapToDouble(e->e.getBalance())
                                    .max();
        double max=0;
        if (maxBalance.isPresent()) {
            max=maxBalance.getAsDouble();
        }
        System.out.println(max=maxBalance.orElse(-1.0));;
        
    }
    public static Optional<Account> isReturn(Optional<Account> opt){
        if (opt == null) {
            return Optional.empty();
        }
        return (opt);
    }

    public static Account setup(int accountNo, double balance) {
        if (accountNo <= 0 || balance < 0) {
            return null;
        }
        return new Account(accountNo, balance);
    }

    public static Optional<Account> setup2(int accountNo, double balance) {
        if (accountNo <= 0 || balance < 0) {
            return Optional.empty();
        }
        return Optional.of(new Account(accountNo, balance));
    }
    // important note: we never use Optional as input param
    // inside method, we still need to perform null check on Optional

    // public static Optional<Account> setup3( Optional<Integer> accountNo,
    // Optional<Double> balance){
    // // if Optional<Integer> accountNo Optional<Double> balance is null
    // // input parameter null pointer, so ifPresent
    // if (accountNo.isPresent()) { // input parameter null pointer, so ifPresent
    // cannot be executed 爆 exception

    // }
    // return Optional.of(null);
    // }
}
