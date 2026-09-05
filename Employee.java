public class Employee {
    
    private String name;
    private int employeeid;
    private double salary;
    
    
    public Employee(String name,int employeeid,double salary)
    {
        
        if(name == null || name.trim().isEmpty())
        {
            
            throw new IllegalArgumentException("Name cannot be null or blank");
            
        }
        
        
        if(employeeid<=0)
        {
            
            throw new IllegalArgumentException("EmployeeId must be positive");
            
        }

        
        if(salary<=0)
        {
            
            throw new IllegalArgumentException("salary cannot be negative");
            
        }

        
        this.name=name.trim();
        
        this.employeeid=employeeid;
        
        this.salary=salary;
        
    }

    
    public void setsalary(double salary)
    {
        if(salary<0)
        {
            
            throw new IllegalArgumentException("salary cannot be negative");
            
        }
        
        this.salary=salary;
        
    }

    
    public void Displayemployeeid()
    {
        
        System.out.println("name : "+name);
        
        System.out.println("employee id : "+employeeid);
        
        System.out.println("salary : "+salary);
        
    }
}
