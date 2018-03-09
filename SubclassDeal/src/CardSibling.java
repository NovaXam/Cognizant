/**
 * Created by student on 3/7/18.
 */
public class CardSibling extends Card {

    private String name;
    private int balance;
    private String type;

    public CardSibling(int balance, String owner, String type) {
        super(balance, owner);
        this.name = name;
        this.balance = balance;
        this.type = "visa";
    };

    public String getType() {
        return this.type;
    };
}
