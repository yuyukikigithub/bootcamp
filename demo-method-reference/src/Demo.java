import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>(List.of("abcde","edef","3ghi"));
        //Instance method
        List<Integer> strLengths = strings.stream()
                                    .map(e->e.length())
                                    .collect(Collectors.toList());
        System.out.println(strLengths);

        strLengths = strings.stream()
                            .map(String::length)
                            .collect(Collectors.toList());
        System.out.println(strLengths);

        List<String> sortedStrings = strings.stream()
                                        .sorted((s1,s2)->s1.compareTo(s2))
                                        .collect(Collectors.toList());
        sortedStrings = strings.stream()
                                .sorted(String::compareTo)
                                .collect(Collectors.toList());
        System.out.println(sortedStrings);

        //Static method

        strings.stream().forEach(e->System.out.println(e));
        //method reference: alternative as lambda expression
        strings.stream().forEach(System.out::println); 
        // when there is single input and there is only one input parameter of method
    }
}
