package techStaff;

import staff.Employee;

public class DatabaseAdmin extends Employee {

    public DatabaseAdmin(String name, String NINumber, int salary){
        super(name, NINumber, salary);
    }

    @Override
    public double raiseSalary() {
        return super.raiseSalary();
    }

    @Override
    public int payBonus() {
        return super.payBonus();
    }
}
