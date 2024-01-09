
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

interface clclass {
    int cal(int a, int b);

    default int com(int q) {
        return q * q;
    }
}
@FunctionalInterface
interface EmployeeEmpty {
    Employee get();
}
@FunctionalInterface
interface EmployeeWithName {
    Employee get(String name);
}

class Try{
    public static void main(String[] args) {
        List<Integer> str = new ArrayList<>();
        str.add(1);
        str.add(2);
        str.add(3);
        str.stream().map(e->{
            System.out.print(e);
            return e+1;
        }).forEach(System.out::print);

    }
}
class Employee {
    private String name;

    Employee() {
        System.out.println("Empty employee is created.");
    }

    Employee(String name) {
        System.out.println("Employee with name is created.");
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee("+this.name+")";
    }
}

class App {

    public static int haha(int a, int b, clclass cl) {
        return cl.cal(a, b);
    }

    public static void main(String[] args) throws Exception {
        clclass answer = new clclass() {
            @Override
            public int cal(int a, int b) {
                return a * b;
            }
        };
        System.out.println(answer.cal(5, 4));
        System.out.println(answer.com(4));
        System.out.println(haha(2, 4, (a, b) -> a + b));
        clclass mul = (a, b) -> a * b;
        System.out.println(haha(3, 4, mul));

        clclass question = (a, r) -> a + r;
        System.out.println(question.com(10));

        EmployeeEmpty emem = Employee::new;
        System.out.println(emem.get());

        EmployeeWithName emname=Employee::new;
        System.out.println(emname.get("peter"));

        Stream<Integer> lilistst=Stream.iterate(1,n->n+2).limit(5);
        lilistst.forEach(System.out::println);

        List<String> abc=Arrays.asList("Aeron","Belle","Cindy","Delon","Alice");
        // abc.stream().filter(e->e.contains("A")).forEach(System.out::println);

        Stream<String> efg=Stream.of("Aeron","Bell","Cindy","Delon","Alice");
        Map<String, Integer> fin = abc.stream().collect(Collectors.toMap(s->s, String::length));
        System.out.println(fin);

        Map<Integer,List<String>> pai=efg.collect(Collectors.groupingBy(String::length));
        System.out.println(pai);

        // Map<Boolean,List<String>> sai=efg.collect(Collectors.partitioningBy(e->e.length()==5));
        // System.out.println(sai);

        Optional<String> strr=Optional.ofNullable(null);
        String stgr=strr.orElseGet(()->"null la");
        System.out.println(stgr);


    }
}
