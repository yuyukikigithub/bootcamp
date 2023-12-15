public enum Status {

    // How enum being initialized
    // Step1: normal class
    // Step2: someone new this class object and place it into memory

    ORDERED('O'), 
    SHIPPED('S'), 
    COMPLETED('C'),
    ;

    private char val;

    // Constructor
    private Status(char val){// Status('O')-> Status.ORDERED('O')
        this.val=val;
    }
    public char getVal(){
        return this.val;
    }
}
