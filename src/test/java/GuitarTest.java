import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {


    Guitar guitar;

    @Before
    public void before (){ guitar = new Guitar ("StratoCaster", "Fender", 10.00, 12.00);}


    @Test
    public void canGetModel(){

        assertEquals("StratoCaster", guitar.getModel());
    }

    @Test
    public void canGetMake(){

        assertEquals("Fender", guitar.getMake());
    }

    @Test
    public void canGetCost(){


        assertEquals(10.00, guitar.getCost(),0.01);
    }

    @Test
    public void canGetPrice(){


        assertEquals(12.00, guitar.getPrice(),0.01);

    }




}




