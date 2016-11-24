public class Deck {
    private static String[] reset = {"Ac", "2c", "3c", "4c", "5c", "6c", "7c", "8c", "9c", "10c", "Jc", "Qc", "Kc", "Ad", "2d", "3d", "4d", "5d", "6d", "7d", "8d", "9d", "10d", "Jd", "Qd", "Kd", "Ah", "2h", "3h", "4h", "5h", "6h", "7h", "8h", "9h", "10h", "Jh", "Qh", "Kh", "As", "2s", "3s", "4s", "5s", "6s", "7s", "8s", "9s", "10s", "Js", "Qs", "Ks"};
    private String[] cards = {"Ac", "2c", "3c", "4c", "5c", "6c", "7c", "8c", "9c", "10c", "Jc", "Qc", "Kc", "Ad", "2d", "3d", "4d", "5d", "6d", "7d", "8d", "9d", "10d", "Jd", "Qd", "Kd", "Ah", "2h", "3h", "4h", "5h", "6h", "7h", "8h", "9h", "10h", "Jh", "Qh", "Kh", "As", "2s", "3s", "4s", "5s", "6s", "7s", "8s", "9s", "10s", "Js", "Qs", "Ks"};
    //{"Ac", "2c", "3c", "4c", "5c", "6c", "7c", "8c", "9c", "10c", "Jc", "Qc", "Kc", "Ad", "2d", "3d", "4d", "5d", "6d", "7d", "8d", "9d", "10d", "Jd", "Qd", "Kd", "Ah", "2h", "3h", "4h", "5h", "6h", "7h", "8h", "9h", "10h", "Jh", "Qh", "Kh", "As", "2s", "3s", "4s", "5s", "6s", "7s", "8s", "9s", "10s", "Js", "Qs", "Ks"}
    //private String[] tracker = new String[52];
    private int dealt = 0;
    private int limit = 0;
    
    public Deck() { //int size
        /*
         cards = new String[52*size];
         limit = 13*size;
         */
        limit = 15;
        //shuffle();
    }
    
    public void shuffle() {
        int n = cards.length;
        for (int i = 0; i < n; i++) {
            int s = i + (int) (Math.random()*(n-i));
            String temp = cards[i];
            cards[i] = cards[s];
            cards[s] = temp;
        }
    }
    
    public void deal(Player player) { //Player player
        if (dealt+limit >= cards.length) {
            dealt = 0;
            shuffle();
        }
        player.card(cards[dealt]);
        dealt++;
    }
    
    public void print() {
        for (String c: cards) {
            System.out.print(c + "\t");
        }
        System.out.println(dealt);
        System.out.println(limit);
    }
    
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();
        deck.deal();
        //deck.shuffle();
        deck.print();
    }
}