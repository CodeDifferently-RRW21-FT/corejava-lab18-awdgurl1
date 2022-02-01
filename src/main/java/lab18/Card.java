package lab18;

public class Card {
    private static Integer cardNumberIndex = 1;
    private String name;
    private Integer number;
    private Integer balance;

    public Card(String name, Integer balance){
        this.name = name;
        this.number = cardNumberIndex;
        cardNumberIndex++;
        this.balance = balance;
    }

    public String getName(){return name;}
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
        return name + " " + balance;
    }


}