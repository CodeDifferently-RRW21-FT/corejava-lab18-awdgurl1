package lab18;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CardTest {
    Card card = new Card(1);

    @Test
    public void constructorTest01(){

        String expected = "1 1";
        String actual = card.toString();
        // Then

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getNumberTest(){


        Integer expected = 1;
        Integer actual = card.getNumber();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void getBalanceTest(){


        Integer expected = 1;
        Integer actual = card.getNumber();

        Assertions.assertEquals(expected,actual);
    }
}



