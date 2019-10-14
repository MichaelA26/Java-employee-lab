import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Aragorn", "ME 200 GN", 30000);
    }

    @Test
    public void databaseAdminHasName(){
        assertEquals("Aragorn", databaseAdmin.getName());
    }

    @Test
    public void databaseAdminHasNINumber(){
        assertEquals("ME 200 GN", databaseAdmin.getNINumber());
    }

    @Test
    public void databaseAdminHasSalary(){
        assertEquals(30000, databaseAdmin.getSalary());
    }

    @Test
    public void databaseAdminSalaryCanBeRaised(){
        assertEquals(60000, databaseAdmin.raiseSalary(), 0);
    }

    @Test
    public void databaseAdminCanGetBonus(){
        assertEquals(300, databaseAdmin.payBonus(), 0);
    }
}
