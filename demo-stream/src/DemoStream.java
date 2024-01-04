import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoStream {
    public static void main(String[] args) throws Exception {
        List<String> strings = new ArrayList<>(List.of("Aello","Belloo","Cellooo","Dello"));
        List<String> result=new ArrayList<>();
        for (String string : strings) {
            if (string.length()>5) {
                result.add(string);
            }
        }
        System.out.println(result);

        //stream()
        //list object can invoke stream() method
        List<String> result2 = strings.stream() // like for loop
                                .filter(e -> e.length()>5 && e.startsWith("B")) //
                                .collect(Collectors.toList());
        System.out.println(result2);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> evenNumbers = numbers.stream()
                                    .filter(n -> n % 2 == 0)
                                    .collect(Collectors.toList());
        System.out.println(evenNumbers);


        List<CatStream> cats = new ArrayList<>(List.of(new CatStream("Prince",11),new CatStream("Kimberley",10),new CatStream("Princess",1),new CatStream("Dolly",2)));
        
        // filter cat, return list of cat
        List<CatStream> catss=cats.stream()
                                .filter(e->e.getAge()>10 || e.getName().startsWith("D"))
                                .collect(Collectors.toList());
        System.out.println(catss);

        // if want to extract list of info of object
        List<String> catsname=cats.stream()
                                .filter(e->e.getAge()>10 || e.getName().startsWith("D")) // if else filter object
                                .map(e->e.getName()) // take name to map into result
                                .collect(Collectors.toList()); // new an arraylist
        System.out.println(catsname);

        // convert list of cat into lsit of dog
        List<DogStream> dogs = cats.stream()
                                .map(e-> new DogStream(e.getAge()))
                                .collect(Collectors.toList());
        System.out.println(dogs);

        List<DogStream> dogss=new ArrayList<>();
        for (CatStream cat : cats) {
            dogss.add(new DogStream(cat.getAge()));
        }
        System.out.println(dogss);

        Integer inin = cats.stream()
                        // .map(e-> new DogStream(e.getAge()))
                        .filter(e->e.getAge()>10)
                        // .filter(e->{
                        //     return e.getAge()>10;
                        //     })
                        .collect(Collectors.toList()) // terminate operation
                        .size();
        System.out.println(inin);

        List<Staff> staffs = new ArrayList<>(List.of(new Staff("John",3100.3),new Staff("Dohn",3100.2)));
        double sum = 0;
        for (Staff staff : staffs) {
            sum+= staff.getSalary();
        }
        System.out.println(sum);

        double max = 0;
        for (Staff staff : staffs) {
            if (staff.getSalary()>max) {
                max=staff.getSalary();
            }
        }
        System.out.println(max);

        // stream
        double total = staffs.stream()
                        .map(e->e.getSalary())
                        .mapToDouble(d->d)// Double --> double
                        .sum(); //-- terminate operation
        System.out.println(total);

        double total1 = staffs.stream()
                        .map(e->e.getSalary()) // intermediate operation
                        // .mapToDouble(d->d)// Double --> double
                        .count(); // count() -- terminate operation

        double total2 = staffs.stream()
                        .map(e->e.getSalary())
                        .mapToDouble(d->d)// Double --> double
                        .sum(); //-- terminate operation

        //toSet()
        List<CatStream> catsss = new ArrayList<>(List.of(new CatStream("Prince",11),new CatStream("Kimberley",10),new CatStream("Princess",1),new CatStream("Dolly",2),new CatStream("Kimberley",10)));

        Set<CatStream> result4 = catsss.stream()
                                    .collect(Collectors.toSet());
        System.out.println(result4);

        //distinct -> remove duplicated elements
        List<CatStream> result5 =catsss.stream()
                                    .distinct() // to remove duplicated
                                    .filter(e->e.getAge()>3)
                                    .collect(Collectors.toList());
        System.out.println(result5);
        
        List<CustomerStream> custs = new ArrayList<>();
        CustomerStream cus1 = new CustomerStream();
        cus1.addAddress("Town Park Road","Yuen Long");
        cus1.addAddress("Kau Yuk Road", "Yuen Long");
        CustomerStream cus2 = new CustomerStream();
        cus2.addAddress("Lai Chi Kwok Road","Cheung Sha Wan");
        cus2.addAddress("Hing Wah Street", "Cheung Sha Wan");

        custs.add(cus1);
        custs.add(cus2);
        System.out.println(custs);

        //flatMap to get all customers address

        List<CustomerStream.Address> flagAddress= custs.stream()
                                                    .flatMap(c-> c.getAddresses().stream()) // 
                                                    //From Stream(CustomerStream) to Stream(Address)
                                                    .collect(Collectors.toList());
        System.out.println(flagAddress);
        //output: a list of address

        List<List<CustomerStream.Address>> listofadd=custs.stream()
                                                        .map(c->c.getAddresses())
                                                        .collect(Collectors.toList());
        System.out.println(listofadd);
        //output: a list of list of address

        List<List<Integer>> integerList=new ArrayList<>(List.of(new ArrayList<>(List.of(1,3,5)),new ArrayList<>(List.of(2,4,6))));


        //lambda
        Comparator <Integer> comcom = (a1,a2)-> a2>a1?1:-1;
        //List<Integer>
        List<Integer> inte = integerList.stream()
                                .flatMap(e->e.stream())
                                .sorted(comcom) // .sorted()
                                .collect(Collectors.toList());
        System.out.println(inte);

        List<CatStream> catList=new ArrayList<>(List.of(new CatStream("Anne", 4),new CatStream("Bill", 4),new CatStream("Cindy", 11),new CatStream("Danny", 13),new CatStream("Elaine", 14)));

        //Return a list of cat names, with age > 9, order by the age fo cats
        
        // Comparator<CatStream> comAge = (a1,a2)-> a2.getAge()>a1.getAge()?1:-1;
        
        List<String> catName=catList.stream()
                                .filter(e->e.getAge()>9) // to filter age>9
                                // .sorted(comAge) // order by age of cats
                                .sorted((a1,a2)->a2.getAge()>a1.getAge()?1:-1)
                                .map(e->e.getName()) // change state from CatStream to String
                                .collect(Collectors.toList()); // collect it as list
        System.out.println(catName);

        boolean hasAnne = catList.stream()
                            .anyMatch(c->c.getName().equals("Anne"));
        System.out.println(hasAnne);

        Map<Boolean, List<CatStream>> catMap = catList.stream()
                                                .collect(Collectors.partitioningBy(c->c.getAge()>9));
        System.out.println(catMap);

        //for-each
        int x = 100;
        for (CatStream cat : catList) {
            System.out.println(cat);
            x=10;
        }

        // List<CatStream> result11 = catList.forEach(null);

        catList.stream()
            .forEach(e->{
                System.out.println(e.getAge());
                // System.out.println(x); // error, x outside code block, no read operation on the variable outside stream
                //x =10; // error. no write operation on variable outside stream
            });

        Integer inininin = catList.stream()
            // .map(e->e.getAge())
            .mapToInt(i->i.getAge()) // getAge should be output int
            .sum(); // this data type should be int  java.util.stream.IntStream.sum()
        System.out.println(inininin);

        // Stream.of(catList);

        Stream<CatStream> sc = Stream.of(new CatStream("ONON", 45));
        
        List<CatStream> result11 = sc.filter(e->e.getAge()>=10).collect(Collectors.toList());
        System.out.println(result11);

        CatStream cat1=null;

        Stream<CatStream> sc2 = Stream.ofNullable(cat1);// ofNullable, handle null error
        sc2.forEach(e->System.out.println("hello")); // nothing

        // Stream.of(null); // runtime error, java.lang.NullPointerException

        // List<Integer> nums = Stream.iterate(1, n->n+1)
        //                         .limit(10)
        //                         .collect(Collectors.toList());
        // System.out.println(nums);

        // Integer nums = Stream.iterate(1, n->n+1)
        //                         .limit(10)
        //                         .reduce(0,(a,b)->a+b);
        // System.out.println(nums);

        Character[] strArr = new Character[]{'a','c','k','l'};
        Arrays.stream(strArr) // array already to stream()
        .filter(e->(int) e>98).forEach(System.out::println);


       
    }
}
