public class Dog {

    private String name;

    public Dog(String name){
        this.name=name;
    }

    public String barking(){
        return "I am dog "+this.name+"!";
    }

    public static String meal (String food){
        return "I am eating "+food;
    }

    public static int sum(int... integers){
        int sum=0;
        for (int i : integers) {
            sum+=i;    
        }
        return sum;
    }

    public static int sum2(int[] integers){
        int sum=0;
        for (int i : integers) {
            sum+=i;    
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(1,3,4,5));
        int[] arr=new int[] {1,2,3};
        System.out.println(sum2(arr));

        Dog doggie=new Dog("rocky");
        System.out.println(doggie.barking());
        System.out.println(Dog.meal("can"));

       

    }
}
