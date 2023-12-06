public class Cat {

    private String name;

    // if there is no constructor, exlicitly in a class
    // empty constructor is provided by default
    // but it is invalid once contructor has edited in class

    public Cat() { // empty constructor is provided by default
        // but it disappears after constructor edited
    }

    public Cat(String name) {
        this.name = name;
    }


}
