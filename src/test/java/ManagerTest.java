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
    public void managersSalaryCanBeRaised(){
        assertEquals(80000, manager.raiseSalary(), 0);
    }

    @Test
    public void managerCanRecieveBonus(){
        assertEquals(400, manager.payBonus(), 0);
    }
}
