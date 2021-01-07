package Hospital;

class Person
{
   
    private int id;
    private String name;
    private char gender;
    
    public Person(int id,String name,char gender)
    {
        
    	this.id=id;
        this.name=name;
        this.gender=gender;
    
    }
    
    int getId()
    {
        return id;
    }
    
    String getName()
    {
        return name;
    }
    
    char getGender()
    {
        return gender;
    }
    
}