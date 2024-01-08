public class Demo {
    public static void main(String[] args) {
        Walkable person = new Walkable() {

            @Override
            public void walk() {
                System.out.println("walking");
            }
            
        };
        person.walk();

        //lambda
        // 1. we dont need to write down method signature for the walk() method. why?
        // because the interface has only one method so compiler knows code block must refer to method
        // 2. () is input param of the walk method
        // 3. as walk method is void return type, you dont have to return anything inside the code block
        // 4. limitation: it can only be used when there is ONLY ONE method in interface (FUNCTIONAL INTERFACE)
        // 5. if there is only one statement inside the code block, no need {} and return
        // 6. param type no need specified
        // implement interface without Override, without creating class

        //()  -- no parameter
        //void
        Walkable person2 =() -> {
            System.out.println("ehllo");
        } ;
        person2.walk();


        // (a,b) refers to param in the interface Calculatee
        Calculatee addition = (salary,bonus) -> salary+bonus;
        // Calculatee addition = (salary,bonus) -> {
        //  return salary+bonus;
        // };

        Calculatee multiply = (price,quantity)-> price*quantity;
        
        System.out.println(multiply.compute(4,7));

        System.out.println(App.haha(2,4,(a,b)->a+b));
    }

}
