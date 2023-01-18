import management.Manager;
import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {
    DatabaseAdmin databaseAdmin;

    @Before
    public void before() {
        databaseAdmin = new DatabaseAdmin("Jose", 123, 32000);
    }

    @Test
    public void databaseAdminHasName() {
        assertEquals("Jose", databaseAdmin.getName());
    }

    @Test
    public void databaseAdminHasSalary() {
        assertEquals(32000, databaseAdmin.getSalary(), 0.00);
    }

    @Test
    public void databaseAdminHasNI() {
        assertEquals(123, databaseAdmin.getNI());
    }

    @Test
    public void databaseAdminHasRaise() {
        databaseAdmin.raiseSalary(1000);
        assertEquals(33000, databaseAdmin.getSalary(), 0.00);
    }

    @Test
    public void databaseAdminHasBonus() {
        assertEquals(320, databaseAdmin.payBonus(), 0.00);
    }
}
