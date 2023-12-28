public class DemoInnerClass { //outer class

    private Calculator calculator;
    public void setCalculator(Calculator calculator){
        this.calculator= calculator;
    }

    public class Calculator{ // inner class
        //constructor
        

        //method
        public void setOuterClass(DemoInnerClass demoInnerClass){

        }
    }
    public static void main(String[] args) {
        DemoInnerClass d = new DemoInnerClass();
        DemoInnerClass.Calculator c = d.new Calculator();
        // cannot link between outer and inner
        
        DemoInnerClass.Calculator c2 = new DemoInnerClass().new Calculator(); //object. new object
    
        c=c2;
    }
}
