public class Demo {
    public static void main(String[] args) {
        DemoStaticNestedClass d = new DemoStaticNestedClass();
        DemoStaticNestedClass.Calculator c = new DemoStaticNestedClass.Calculator(100);
        c.add(5);
        System.out.println(c.getX());
        Calculator cal=new Calculator();
    }
}
