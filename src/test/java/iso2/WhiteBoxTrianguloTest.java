package iso2;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class WhiteBoxTrianguloTest {

    // NT – valores inválidos (i <= 0)
    @Test
    public void testNT_ValoresInvalidos_i() {
        Triangulo t = new Triangulo();
        t.setI(0);
        t.setJ(3);
        t.setK(3);
        assertEquals(3, t.getTipo());
    }

    // NT – valores inválidos (j <= 0)
    @Test
    public void testNT_ValoresInvalidos_j() {
        Triangulo t = new Triangulo();
        t.setI(3);
        t.setJ(0);
        t.setK(3);
        assertEquals(3, t.getTipo());
    }

    // NT – valores inválidos (k <= 0)
    @Test
    public void testNT_ValoresInvalidos_k() {
        Triangulo t = new Triangulo();
        t.setI(3);
        t.setJ(3);
        t.setK(0);
        assertEquals(3, t.getTipo());
    }

    // NT – desigualdad triangular (i + j <= k)
    @Test
    public void testNT_Desigualdad_i_j_le_k() {
        Triangulo t = new Triangulo();
        t.setI(1);
        t.setJ(2);
        t.setK(3);
        assertEquals(3, t.getTipo());
    }

    // NT – desigualdad triangular (i + k <= j)
    @Test
    public void testNT_Desigualdad_i_k_le_j() {
        Triangulo t = new Triangulo();
        t.setI(2);
        t.setJ(10);
        t.setK(2);   // 2+2 <= 10
        assertEquals(3, t.getTipo());
    }

    // NT – desigualdad triangular (j + k <= i)
    @Test
    public void testNT_Desigualdad_j_k_le_i() {
        Triangulo t = new Triangulo();
        t.setI(10);
        t.setJ(2);
        t.setK(2);   // 2+2 <= 10
        assertEquals(3, t.getTipo());
    }

    // EQ (Equilátero)
    @Test
    public void testEQ() {
        Triangulo t = new Triangulo();
        t.setI(5);
        t.setJ(5);
        t.setK(5);
        assertEquals(0, t.getTipo());
    }

    // IS – i == j
    @Test
    public void testIS_i_igual_j() {
        Triangulo t = new Triangulo();
        t.setI(4);
        t.setJ(4);
        t.setK(2);
        assertEquals(1, t.getTipo());
    }

    // IS – i == k
    @Test
    public void testIS_i_igual_k() {
        Triangulo t = new Triangulo();
        t.setI(3);
        t.setJ(2);
        t.setK(3);
        assertEquals(1, t.getTipo());
    }

    // IS – j == k
    @Test
    public void testIS_j_igual_k() {
        Triangulo t = new Triangulo();
        t.setI(1);
        t.setJ(5);
        t.setK(5);
        assertEquals(1, t.getTipo());
    }

    // ES (Escaleno)
    @Test
    public void testES() {
        Triangulo t = new Triangulo();
        t.setI(3);
        t.setJ(4);
        t.setK(5);
        assertEquals(2, t.getTipo());
    }
}
