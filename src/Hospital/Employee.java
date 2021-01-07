package Hospital;


abstract class Employee extends Person
{
    
    public Employee(int id,String name,char gender)
    {
        super(id,name,gender);
    }
    
    abstract public void calSal();
    
    abstract public void paySlip();
    
}
