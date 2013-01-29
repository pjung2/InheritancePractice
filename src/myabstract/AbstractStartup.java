package myabstract;

/**
 * @author Paul Jung
 */
public class AbstractStartup
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        HourlyEmployee employee1 = new HourlyEmployee();
        
        employee1.setEmployeeFirstName("Steve");
        employee1.setEmployeeLastName("Johnson");
        employee1.setHourlyRate(25.00);
        employee1.setHoursWorked(40.00);
        System.out.println(employee1.getEmployeeFirstName());
        System.out.println(employee1.getEmployeeLastName());
        System.out.println(employee1.getWage());
        
        SalariedEmployee employee2 = new SalariedEmployee();
        
        employee2.setEmployeeFirstName("John");
        employee2.setEmployeeLastName("Smith");
        employee2.setEmployeeNumber(123);
        employee2.setEmployeeSSN("222-22-2222");
        employee2.setSalary(60000.00);
        System.out.println(employee2.getEmployeeFirstName());
        System.out.println(employee2.getEmployeeLastName());
        System.out.println(employee2.getEmployeeNumber());
        System.out.println(employee2.getEmployeeSSN());
        System.out.println(employee2.getWage());
        
        SalaryPlusBonusEmployee employee3 = new SalaryPlusBonusEmployee();
        
        employee3.setEmployeeFirstName("John");
        employee3.setEmployeeLastName("Doe");
        employee3.setEmployeeNumber(456);
        employee3.setEmployeeSSN("333-33-3333");
        employee3.setSalary(6500.00);
        employee3.setBonus(500.00);
        System.out.println(employee3.getEmployeeFirstName());
        System.out.println(employee3.getEmployeeLastName());
        System.out.println(employee3.getEmployeeNumber());
        System.out.println(employee3.getEmployeeSSN());
        System.out.println(employee3.getWage());
    }
}
