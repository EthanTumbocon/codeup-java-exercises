package Blackjack;

import com.sun.jdi.Value;

public class Card {
    public enum Value {
         ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING;

         public static Value getValue(int index){
             Value[] values = Value.values();
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
         }
         private Suit suit;
         private Value value;
         public void Card(Suit suit, Value value){
             this.suit = suit;
             this.value = value;
         }
         public Suit getSuits(){
             return this.suit;
         }
         public Value getValue(){
             return this.value;
         }
         public String toString(){
             return this.suit + "_" + this.value;
         }
    }

    public static class Suit {
        public static int getSuitLength() {
            return Value.Suit.values().length;
        }


    }
}
