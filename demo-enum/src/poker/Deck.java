package poker;

import java.util.Arrays;
import java.util.Random;


public class Deck {
    private Card1[] cards;

    public Deck(int noOfCards){
        Card1[] set=new Card1[noOfCards];
        int idx=0;
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                set[idx++]= new Card1(suit, rank);
            }
        }
        this.cards = set;
    }
    public static Deck ofPocker(){
        return new Deck(52);
    }
    public static void main(String[] args) {
        Deck deck=Deck.ofPocker();
        // System.out.println(Arrays.toString(deck.cards));
        // int takeOut = new Random().nextInt(1, 52);
        // int takeNum =52-takeOut;

        // System.out.println(takeOut);
        // System.out.println(takeNum);
        deck.overhead1();
        System.out.println(Arrays.toString(deck.cards));

    }

    public void overHand(){
        int takeOut = new Random().nextInt(1, 52);
        int takeNum =52-takeOut;
        int idx=0;
        Card1[] newArr = new Card1[52];
        for (int i = takeOut; i < 52; i++) {
            newArr[idx++]= this.cards[i];
        }
        for (int i = 0; i < takeOut; i++) {
            newArr[idx++]=this.cards[i];
        }
        this.cards=newArr;
    }

    public void overhead1() {
        
        int a = 3;//new Random().nextInt(100) + 1;
        while (a > 0) {
            Card1[] newArr = new Card1[52];
            int b = new Random().nextInt(52);
            int idx = 0;
            for (int i = b; i < this.cards.length; i++) {
                newArr[idx++] = this.cards[i];
            }
            for (int i = 0; i < b; i++) {
                newArr[idx++] = this.cards[i];
            }

            this.cards = newArr;
            a--;
        }
    }

    public void riffle(){
        
        
    }
   
}
