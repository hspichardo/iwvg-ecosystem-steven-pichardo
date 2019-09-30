package es.upm.miw.iwvg.ecosystem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PointTest {
    private Point point;

    @BeforeEach
    void before() {
        point = new Point(2, 3,2);
    }

    @Test
    void testPointIntInt() {
        assertEquals(2, point.getX());
        assertEquals(3, point.getY());
        assertEquals(2, point.getZ());
    }

    @Test
    void testPointInt() {
        point = new Point(2);
        assertEquals(2, point.getX());
        assertEquals(2, point.getY());
        assertEquals(2, point.getZ());
    }

    @Test
    void testPoint() {
        point = new Point();
        assertEquals(0, point.getX());
        assertEquals(0, point.getY());
        assertEquals(0, point.getZ());
    }

    @Test
    void testModule() {
        assertEquals(4.1231, point.module(), 10e-5);
    }

    @Test
    void testPhase() {
        assertEquals(0.9828, point.phase(), 10e-5);
    }

    @Test
    void testTranslateOrigin() {
        this.point.translateOrigin(new Point(1, 1,4));
        assertEquals(1, point.getX());
        assertEquals(2, point.getY());
        assertEquals(-2, point.getZ());
    }

}
