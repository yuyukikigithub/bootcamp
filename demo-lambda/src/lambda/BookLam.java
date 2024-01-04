package lambda;

public class BookLam {
    private double price;
    public BookLam(){

    }
    public BookLam(double price){
        this.price=price;
    }
    public double getPrice(){
        return this.price;
    }

    @Override
    public String toString(){
        return "BookLam(price:"+this.price+")";
    }
}
