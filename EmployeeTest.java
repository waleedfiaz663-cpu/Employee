
public class EmployeeTest {
    
    public static void main(String[]args)
    {
        
        try
        {
            Employee emp=new Employee("",-135,-25000);
            
            emp.Displayemployeeid();
            
            try
            {
                
                emp.setsalary(-1000);
                
            }
                
                
            catch(IllegalArgumentException e)
            {
                
                System.out.println("Error:"+e.getMessage());
                
            }
        }

            
        catch(IllegalArgumentException e)
        {
            
            System.out.println("Error creating Employee:"+e.getMessage());
            
        }
    }
    
}
