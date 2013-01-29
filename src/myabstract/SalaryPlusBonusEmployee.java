package myabstract;

/**
 *
 * @author Paul Jung
 */
public class SalaryPlusBonusEmployee extends Employee
{
    private double salary;
    private double bonus;

    @Override
    public double getWage()
    {
        return (salary + bonus);
    }

    public double getSalary()
    {
        return salary;
    }

    public void setSalary(double salary)
    {
        this.salary = salary;
    }

    public double getBonus()
    {
        return bonus;
    }

    public void setBonus(double bonus)
    {
        this.bonus = bonus;
    }
    
}
