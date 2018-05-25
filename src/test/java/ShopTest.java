import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;


public class ShopTest {

    private ISell guitar;
    ArrayList<ISell> stock;
    Shop shop;

    @Before
    public void before(){

        this.guitar = new Guitar ("Hackenbacker", "Bass",  10.00, 40.00);
        this.shop = new Shop();
    }


    @Test
    public void canAddStockItem(){

        shop.addItem(guitar);

        assertEquals(1, shop.countItems());

    }

    @Test
    public void canRemoveStockItem(){

        shop.removeItem(guitar);

        assertEquals(0, shop.countItems());
    }
}