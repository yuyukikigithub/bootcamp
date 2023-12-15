package poker;

public class Card1 {
    private Rank rank;
    private Suit suit;
    public Card1(Suit suit, Rank rank){
        this.rank=rank;
        this.suit=suit;
    }

    @Override
    public String toString(){
        return "Card"+this.suit+this.rank;
    }
}
