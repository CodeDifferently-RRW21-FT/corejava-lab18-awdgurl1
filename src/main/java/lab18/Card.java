package lab18;

public class Card {
    private static Integer cardNumberIndex = 1;
    private Integer number;
    private Integer balance;

    public Card(Integer balance){
        this.number = cardNumberIndex;
        cardNumberIndex++;
        this.balance = balance;
    }

    public Integer getNumber() {
        return number;
    }

    public Integer getBalance() {
        return balance;
    }
    public void setBalance(Integer balance){
        this.balance = balance;
    }

    @Override
    public String toString() {
        return number + " " + balance;
    }


}