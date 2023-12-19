package trytrytry;

enum Color {
    RED(1),
    YELLOW(2),
    BLACK(3),
    ;

    static int counter =0;
    int value;

    Color(int i){
        this.value=i;
        // counter++;
    }
    static void addCounter(){
        counter++;
    }
    public static void main(String[] args) {
        addCounter();
        addCounter();
        System.out.println(Color.counter);
    }

}
