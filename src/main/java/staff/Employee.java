package staff;

public abstract class Employee {

    public String name;
    private String NINumber;
    private int salary;

    public Employee(String name, String NINumber, int salary){
        this.name = name;
        this.NINumber = NINumber;
        this.salary = salary;
    }

    public String getName(){
        return name;
    }

    public String getNINumber(){
        return NINumber;
    }

    public int getSalary(){
        return salary;
    }

    public double raiseSalary(){
        return salary*2;
    }

    public int payBonus(){
        return salary/100;
    }

}
