package iso2;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class BlackBoxTrianguloTest {

    @Test
    public void testEQ() {
        Triangulo t = new Triangulo();
        t.setI(2);
        t.setJ(2);
        t.setK(2);
        assertEquals(0, t.getTipo());   // EQ
    }

    @Test
    public void testIS() {
        Triangulo t = new Triangulo();
        t.setI(2);
        t.setJ(2);
        t.setK(3);
        assertEquals(1, t.getTipo());   // IS
    }

    @Test
    public void testES() {
        Triangulo t = new Triangulo();
        t.setI(2);
        t.setJ(3);
        t.setK(4);
        assertEquals(2, t.getTipo());   // ES
    }

    @Test
    public void testNT() {
        Triangulo t = new Triangulo();
        t.setI(2);
        t.setJ(2);
        t.setK(4);
        assertEquals(3, t.getTipo());   // NT
    }
}
