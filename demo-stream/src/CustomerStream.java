import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CustomerStream {
    List<Address> addresses;

    public CustomerStream(){
        addresses = new ArrayList<>();
    }

    public void addAddress(String addressLine1,String addressLine2){
        addresses.add(new Address(addressLine1,addressLine2));
    }

    public List<Address> getAddresses(){
        return this.addresses;
    }
    public class Address{
        private String line1;
        private String line2;

        private Address(String line1,String line2){
            this.line1 = line1;
            this.line2 = line2;
        }

        public String toString(){
            return "Address: ("+line1+", "+line2+")";
        }
        
        public void print(){
            System.out.println(addresses);
        }
    }

    @Override
    public String toString(){
        return "Customer( "+this.addresses+")";
    }

    public static void main(String[] args) {
        CustomerStream cust = new CustomerStream();
        cust.addAddress("abc","Hong Kong");


        


    }
}
