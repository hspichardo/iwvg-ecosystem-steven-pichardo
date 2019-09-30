package es.upm.miw.iwvg.ecosystem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {
    private User user;

    @BeforeEach
    void before() {
        user = new User(1, "Harlyn","Steven", "Pichardo");
    }

    @Test
    void testFullName(){
        assertEquals("Harlyn Steven Pichardo",user.fullName());
    }

    @Test
    void testInicials(){
        assertEquals("H.S.",user.initials());
    }

    @Test
    void testGetNumber(){
        assertEquals(1,user.getNumber());
    }

    @Test
    void testGetMiddleName(){
        assertEquals("Steven",user.getMidlename());
    }

    @Test
    void testGetFamilyName(){
        assertEquals("Pichardo",user.getFamilyName());
    }

    @Test
    void testShowOnlyNames(){
        assertEquals("Harlyn Steven",user.showOnlyNames());
    }

    @Test
    void testShowFirstNameAndFamilyName(){
        assertEquals("Harlyn Pichardo",user.showOnlyFirstNameAndLastName());
    }

}
