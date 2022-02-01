package lab18;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InventoryTest {

    Inventory inventory = new Inventory(ItemsEnum.WATER, 2);


        @Test
        public void constructorTest01(){
            String expected = "WATER, price= 2 credits";
            String actual = inventory.toString();

            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void getItemTest(){
            ItemsEnum expected = ItemsEnum.WATER;
            ItemsEnum actual = inventory.getItem();

            Assertions.assertEquals(expected,actual);
        }

    @Test
    public void getPriceTest(){
        Integer expected = 2;
        Integer actual = inventory.getPrice();

        Assertions.assertEquals(expected,actual);
    }
}


