import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Marketing", "Nigel Bottomtooth", "N9 7Y7 4R", 40000);
    }

    @Test
    public void managerHasDepartment(){
        assertEquals("Marketing", manager.getDeptName());
    }

    @Test
    public void managerHasName(){
        assertEquals("Nigel Bottomtooth", manager.getName());
    }

    @Test
    public void managerHasNINumber(){
        assertEquals("N9 7Y7 4R", manager.getNINumber());
    }

    @Test
    public void managerHasSalary(){
        assertEquals(40000, manager.getSalary());
    }

    @Test
    public void managersSalaryCanBeRaised(){
        assertEquals(80000, manager.raiseSalary(), 0);
    }

    @Test
    public void managerCanGetBonus(){
        assertEquals(400, manager.payBonus(), 0);
    }
}
