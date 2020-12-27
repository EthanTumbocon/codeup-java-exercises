package Blackjack;

import com.sun.jdi.Value;

public class Cards {
    public enum value {
         ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING;

         public static Value getValue(int index){
             Value[] value = Value.values();
             return values[index];
         }
         public static int getValueLength(){
             return Value.values().length;
         }
         public enum Suit {
             HEART, DIAMOND, CLUB, SPADE;

             public static Suit getSuit(int index){
                 Suit[] suits = Suit.values();
                 return suits[index];
             }
             public static int getSuitLength(){
                 return Suit.values().length;
             }
         }
         private Suit suit;
         private Value value;
         public Card(Suit suit, Value value){
             this.suit = suit;
             this.value = value;
         }
         public Suit getSuit(){
             return this.suit;
         }
         public Value getValue(){
             return this.value;
         }
         public String toString(){
             return this.suit + "_" = this.value;
         }
    }
}
