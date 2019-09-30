package es.upm.miw.iwvg.ecosystem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {
    private User user;

    @BeforeEach
    void before() {
        user = new User(1, "Harlyn","Pichardo");
    }

    @Test
    void testFullName(){
        assertEquals("Harlyn Pichardo",user.fullName());
    }

    @Test
    void testInicials(){
        assertEquals("H.",user.initials());
    }

    @Test
    void testGetNumber(){
        assertEquals(1,user.getNumber());
    }

    @Test
    void testGetFamilyName(){
        assertEquals("Pichardo",user.getFamilyName());
    }
}
