package management;

import staff.Employee;

public class Manager extends Employee {

    private String deptName;

    public Manager(String deptName, String name, String NINumber, int salary){
        super(name, NINumber, salary);
        this.deptName = deptName;
    }

    public String getDeptName(){
        return deptName;
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
