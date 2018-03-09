/**
 * Created by student on 3/7/18.
 */
public class Card {
    private int balance;
    private String owner;

    public Card(int balance, String owner) {
        this.balance = balance;
        this.owner = owner;
    };

    public int getBalanace() {
        return balance;
    };

    public String getOwner() {
        return this.owner;
    }

    private void deposit(int amount) {
        this.balance += amount;
    };

    private void withdraw(int amount) {
        this.balance -= amount;
    };

    public void makeTransaction(String tName, int amount) {
        switch (tName) {
            case "withdraw":
                withdraw(amount);
                System.out.println("Transaction successfuly complited");
            break;

            case "deposit":
                deposit(amount);
                System.out.println("Transaction successfuly complited");
            break;

            default: System.out.println(getBalanace());
        };
    };
}
