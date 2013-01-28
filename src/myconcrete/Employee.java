package myconcrete;

/**
 *
 * @author Paul Jung
 */
public class Employee
{
    private String employeeFirstName;
    private String employeeLastName;
    //private double employeeWage;
    private int employeeNumber;
    private String employeeSSN;
    
    public void setEmployeeFirstName(String firstName)
    {
        employeeFirstName = firstName;
    } 
    
    public String getEmployeeFirstName()
    {
        return employeeFirstName;
    }
    
    public void setEmployeeLastName(String lastName)
    {
        employeeLastName = lastName;
    } 
    
    public String getEmployeeLastName()
    {
        return employeeLastName;
    }

    public int getEmployeeNumber()
    {
        return employeeNumber;
    }

    public void setEmployeeNumber(int employeeNumber)
    {
        this.employeeNumber = employeeNumber;
    }

    public String getEmployeeSSN()
    {
        return employeeSSN;
    }

    public void setEmployeeSSN(String employeeSSN)
    {
        this.employeeSSN = employeeSSN;
    }
    
}
