package ohtu;

import static org.junit.Assert.*;
import org.junit.Test;

public class MultiplierTest {

    @Test
    public void kertominenToimii() {
        Multiplier viisi = new Multiplier(5);
        assertEquals(5, viisi.multipliedBy(1));
        //THIS FAILS, SO THE TESTS WORK: assertEquals(5, viisi.multipliedBy(2));
        assertEquals(35, viisi.multipliedBy(7));
    }

}
