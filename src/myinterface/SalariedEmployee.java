package myinterface;

/**
 *
 * @author Paul Jung
 */
public class SalariedEmployee implements Employee
{
    private String employeeFirstName;
    private String employeeLastName;
    private int employeeNumber;
    private String employeeSSN;
    private double employeeSalary;
    
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
        return (employeeSalary);
    }

    public double getEmployeeSalary()
    {
        return employeeSalary;
    }

    public void setEmployeeSalary(double employeeSalary)
    {
        this.employeeSalary = employeeSalary;
    }
    
}
