import management.Manager;
import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {
    Developer developer;

    @Before
    public void before() {
        developer = new Developer("Jose", 123, 32000);
    }

    @Test
    public void developerHasName() {
        assertEquals("Jose", developer.getName());
    }

    @Test
    public void developerHasSalary() {
        assertEquals(32000, developer.getSalary(), 0.00);
    }

    @Test
    public void developerHasNI() {
        assertEquals(123, developer.getNI());
    }

    @Test
    public void developerHasRaise() {
        developer.raiseSalary(1000);
        assertEquals(33000, developer.getSalary(), 0.00);
    }

    @Test
    public void developerHasBonus() {
        assertEquals(320, developer.payBonus(), 0.00);
    }
}

