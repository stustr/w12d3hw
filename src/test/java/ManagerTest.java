import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {
    Manager manager;

    @Before
    public void before() {
        manager = new Manager("Jose", 123, 32000,
                "Cucumber");
    }

    @Test
    public void managerHasName() {
        assertEquals("Jose", manager.getName());
    }

    @Test
    public void managerHasSalary() {
        assertEquals(32000, manager.getSalary(), 0.00);
    }

    @Test
    public void managerHasNI() {
        assertEquals(123, manager.getNI());
    }

    @Test
    public void managerHasRaise() {
        manager.raiseSalary(1000);
        assertEquals(33000, manager.getSalary(), 0.00);
    }

    @Test
    public void managerHasBonus() {
        assertEquals(320, manager.payBonus(), 0.00);
    }
}
