package myabstract;

/**
 *
 * @author Paul Jung
 */
public class SalariedEmployee extends Employee
{
    private double salary;

    @Override
    public double getWage()
    {
        return salary;
    }

    public double getSalary()
    {
        return salary;
    }

    public void setSalary(double salary)
    {
        this.salary = salary;
    }
    
    
}
