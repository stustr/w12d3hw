import management.Director;
import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {
    Director director;

    @Before
    public void before() {
        director = new Director("Jose", 123, 32000,
                "Cucumber", 1000000);
    }

    @Test
    public void directorHasName() {
        assertEquals("Jose", director.getName());
    }

    @Test
    public void directorHasSalary() {
        assertEquals(32000, director.getSalary(), 0.00);
    }

    @Test
    public void directorHasNI() {
        assertEquals(123, director.getNI());
    }

    @Test
    public void directorHasRaise() {
        director.raiseSalary(1000);
        assertEquals(33000, director.getSalary(), 0.00);
    }
    @Test
    public void directorHasNotRaise() {
        director.raiseSalary(-1000);
        assertEquals(32000, director.getSalary(), 0.00);
    }

    @Test
    public void directorHasBonus() {
        assertEquals(640, director.payBonus(), 0.00);
    }

    @Test
    public void directorHasBudget(){
        assertEquals(1000000, director.getBudget(), 0.00);
    }

    @Test
    public void directorNameUpdate(){
        director.setName("Jenna");
        assertEquals("Jenna", director.getName());
    }

    @Test
    public void directorNameUpdateFail(){
        director.setName(null);
        assertEquals("Jose", director.getName());
    }


}