//import java.util.ArrayList;

public class Player {
    //private String name = new String();
    private int chips = 0; //long?
    private int cardn = 0;
    private String[] cards = new String[2];
    public Player() {
        chips = 2500;
    }
    public Player(int c) {
        chips = c;
    }
    public void card(String c) {
        cards[cardn] = c;
        cardn++;
    }
}