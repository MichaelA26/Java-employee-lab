import management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director(1000000, "The Big Cheese", "B0 55M AN", 60000);
    }

    @Test
    public void directorHasBudget(){
        assertEquals(1000000, director.getBudget());
    }

    @Test
    public void directorHasName(){
        assertEquals("The Big Cheese", director.getName());
    }

    @Test
    public void directorHasNINumber(){
        assertEquals("B0 55M AN", director.getNINumber());
    }

    @Test
    public void directorHasSalary(){
        assertEquals(60000, director.getSalary());
    }

    @Test
    public void directorsSalaryCanBeRaised(){
        assertEquals(120000, director.raiseSalary(), 0);
    }

    @Test
    public void directorCanGetBonus(){
        assertEquals(600, director.payBonus(), 0);
    }
}
