package myabstract;

/**
 *
 * @author Paul Jung
 */
public class HourlyEmployee extends Employee
{
    private double hourlyRate;
    private double hoursWorked;
    
    @Override
    public double getWage()
    {
        return (hourlyRate * hoursWorked);
    }

    public double getHourlyRate()
    {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate)
    {
        this.hourlyRate = hourlyRate;
    }

    public double getHoursWorked()
    {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked)
    {
        this.hoursWorked = hoursWorked;
    }
    
}
