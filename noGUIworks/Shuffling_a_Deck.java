public class Shuffling_a_Deck {
  // program for shuffling a deck of cards
  public static void main(String[] args) {
    String [] rank = {
      "2", "3", "4", "5", "6", "7", "8", "9", "10",
      "Jack", "Queen", "King", "Ace"
    };

    String [] suit = {
      "Clubs", "Jack", "Queen", "King", "Ace"
    };

    final int SUITS = suit.length;
    final int RANKS = rank.length;
    final int N = SUITS * RANKS;

    String[] deck = new String[RANKS];

    for (int l = 0; l < RANKS; l++) {
      for (int p = 0; p < SUITS; p++) {
        deck[4*l + p] = rank[l] + " of " + suit[p];
      }
    }

    for (int q = 0; q < N; q++) {
      int r = q + (int) (Math.random() * (N-q));
      String t = deck[r];
      deck[r] = deck[q];
      deck[q] = t;
    }

    for (int k = 0; k < 52; k++) {
      System.out.println(deck[k]);
    }
  }

}
