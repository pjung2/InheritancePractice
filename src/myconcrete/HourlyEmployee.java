package myconcrete;

/**
 *
 * @author Paul Jung
 */
public class HourlyEmployee extends Employee
{    
    public double getwage(double hourlyRate, double hoursWorked)
    {
        return hourlyRate * hoursWorked;
    }
}
