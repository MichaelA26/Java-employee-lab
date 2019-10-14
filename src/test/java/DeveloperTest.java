import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Randy Marsh", "RM 3SP U8", 25000);
    }

    @Test
    public void developerHasName(){
        assertEquals("Randy Marsh", developer.getName());
    }

    @Test
    public void developerHasNINumber(){
        assertEquals("RM 3SP U8", developer.getNINumber());
    }

    @Test
    public void developerHasSalary(){
        assertEquals(25000, developer.getSalary());
    }

    @Test
    public void developersSalaryCanBeRaised(){
        assertEquals(50000, developer.raiseSalary(), 0);
    }

    @Test
    public void developerCanGetBonus(){
        assertEquals(250, developer.payBonus(), 0);
    }
}
