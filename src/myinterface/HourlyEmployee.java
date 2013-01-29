package myinterface;

/**
 *
 * @author Paul Jung
 */
public class HourlyEmployee implements Employee
{
    private String employeeFirstName;
    private String employeeLastName;
    private int employeeNumber;
    private String employeeSSN;
    private double hourlyRate;
    private double hoursWorked;
    
    @Override
    public void setEmployeeFirstName(String firstName)
    {
        this.employeeFirstName = firstName;
    }

    @Override
    public String getEmployeeFirstName()
    {
        return this.employeeFirstName;
    }

    @Override
    public void setEmployeeLastName(String lastName)
    {
        this.employeeLastName = lastName;
    }

    @Override
    public String getEmployeeLastName()
    {
        return this.employeeLastName;
    }

    @Override
    public void setEmployeeNumber(int employeeNumber)
    {
        this.employeeNumber = employeeNumber;
    }
    
    @Override
    public int getEmployeeNumber()
    {
        return this.employeeNumber;
    }

    @Override
    public void setEmployeeSSN(String employeeSSN)
    {
        this.employeeSSN = employeeSSN;
    }
    
    @Override
    public String getEmployeeSSN()
    {
        return this.employeeSSN;
    }

    @Override
    public double getWage()
    {
        return (hoursWorked * hourlyRate);
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
