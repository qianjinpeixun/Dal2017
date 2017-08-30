/*Assignment3, Question 1 CSCI 1101
   Card.java is for keep the attributes of card.
   July 23, 2017
   Ang Li B00751990 
   This is entirely my word */

public class Card {
   private String suit;
   private int rank;
   public Card(){
   }
   public Card(String suit, int rank) {//card has two attributes suit and rank
      this.suit = suit;
      this.rank = rank;
   }
    
   public String getSuit() {//get suit and rank
      return this.suit;
   }

   public int getRank() {
      return this.rank;
   }

   public boolean valid() {//valid method is make the card not repeat when it already have one
      if(suit.equals("Hearts")||suit.equals("Diamonds")||suit.equals("Clubs")||suit.equals("Spades)")){
         if (rank>0&&rank<14){
            return true;
         }else{
            return false;
         }   
      }else
         return false;
   }

   public boolean compare(Card c) {//compare method is compare the biggest card
      if (rank > c.getRank()&&rank!=1&&c.getRank()!=1){
         return true;
      }else if(rank==1&&c.getRank()!=1){//Ace is biggest so when rank is 1 return true
         return true;
      }else{
         return false;
      }   
   }
    
   public String toString() {//gives a reasonable representation for the Card 
      String a=" Jack";
      String b=" Queen";
      String c=" King";
      String d=" Ace";
      if(rank == 11){
         return suit+a;
      }else if (rank == 12) {//that is what card is like
         return suit+b;
      }else if (rank == 13) {
         return suit+c;
      }else if (rank == 1) {
         return suit+d;
      }
      return suit + " " + rank;
   }
}