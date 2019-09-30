package es.upm.miw.iwvg.ecosystem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FractionTest {
    private Fraction fraction;
    @BeforeEach
    void before(){
        fraction = new Fraction(1,2);
    }


    @Test
    void testDecimal(){
        assertEquals(0.5,fraction.decimal());
    }
    @Test
    void testGetNumerador(){
        assertEquals(1,fraction.getNumerator());
    }

    @Test
    void testGetDenominador(){
        assertEquals(2,fraction.getDenominator());
    }

    @Test
    void testIsPropia(){
        assertEquals(false,fraction.isPropia());
    }
    @Test
    void testIsImPropia(){
        assertEquals(true,fraction.isImpropia());
    }
    @Test
    void testIsEquivalente(){
        Fraction f2 = new Fraction(2,1);
        assertEquals(false,this.fraction.isEquivalente(f2));
    }

    @Test
    void testIsMayor(){
        Fraction f2 = new Fraction(4,1);
        assertEquals(false, this.fraction.isMayor(f2));
    }
}
