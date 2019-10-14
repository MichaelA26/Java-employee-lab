package management;

import staff.Employee;

public class Director extends Employee {

    private int budget;

    public Director(int budget, String name, String NINumber, int salary){
        super(name, NINumber, salary);
        this.budget = budget;
    }

    public int getBudget(){
        return budget;
    }

}
