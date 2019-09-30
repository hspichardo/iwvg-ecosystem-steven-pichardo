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
}
