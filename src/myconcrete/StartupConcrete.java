package myconcrete;

/**
 * @author Paul Jung
 */
public class StartupConcrete
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        HourlyEmployee employee1 = new HourlyEmployee();
        
        employee1.setEmployeeFirstName("Steve");
        employee1.setEmployeeLastName("Johnson");
        
        System.out.println(employee1.getEmployeeFirstName());
        System.out.println(employee1.getwage(15.00, 45.50));
        
        SalaryPlusBonusEmployee employee2 = new SalaryPlusBonusEmployee();
        
        employee2.setEmployeeNumber(123);
        employee2.setEmployeeSSN("333-33-3333");
        employee2.setSalary(60000.00);
        employee2.setBonus(400.00);
        System.out.println(employee2.getEmployeeNumber());
        System.out.println(employee2.getEmployeeSSN());
        System.out.println(employee2.getwage());
    }
}
