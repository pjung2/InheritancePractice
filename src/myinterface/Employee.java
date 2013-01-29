package myinterface;

/**
 *
 * @author Paul Jung
 */
public interface Employee
{
    public abstract void setEmployeeFirstName(String firstName);
    
    public abstract String getEmployeeFirstName();
    
    public abstract void setEmployeeLastName(String lastName);
    
    public abstract String getEmployeeLastName();

    public abstract int getEmployeeNumber();

    public abstract void setEmployeeNumber(int employeeNumber);

    public abstract String getEmployeeSSN();

    public abstract void setEmployeeSSN(String employeeSSN);
    
    public abstract double getWage();

}
