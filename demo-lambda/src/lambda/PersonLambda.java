package lambda;

import java.util.function.Predicate;

public class PersonLambda implements Predicate<Integer> {
    // Wrong example 
    // use Predicate directly
    int age;

    @Override
    public boolean test(Integer adultAge) {
        return this.age>=adultAge;
    }
    
}
