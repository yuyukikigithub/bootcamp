public class DemoStaticNestedClass { //outter class, 和 nested class 同生共si


    public static class Calculator{ // nested class //static unrelated to outter class // tool of outer
        // dont want to share with other class
        //attribute
        private int x;
        
        //constructor
        public Calculator(int x){
            this.x=x;
        }
        //instance method
        public void add( int y){
            this. x+=y;
        }
        public int getX(){
            return this.x;
        }
        // object is not related to DemoStaticNestedClass
    }
    public static void main(String[] args) {
        
    }
}
