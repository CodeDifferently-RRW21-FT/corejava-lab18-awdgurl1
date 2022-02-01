package lab18;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CardTest {
    Card card = new Card("Tariq",10);

    @Test
    public void constructorTest01(){

        String expected = "Tariq 10";
        String actual = card.toString();
        // Then

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getNameTest(){
        Card card = new Card("Tariq",10);

        String expected = "Tariq";
        String actual = card.getName();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void getBalanceTest(){
        Card card = new Card("Tariq",10);

        Integer expected = 10;
        Integer actual = card.getBalance();

        Assertions.assertEquals(expected,actual);
    }
}



