package Hospital;

class Patient extends Person
{
	
    private int age;
    private int i, medicines;
    Doctor doc;
    
    public Patient(int id, String name, char gender, int age, Doctor doc)
    {
        super(id,name,gender);
        this.age=age;
        this.doc=doc;
    }
    
    public int getAge()
    {
        return age;
    }
    
    public String getDoc()
    {
        return doc.getName();
    }
    
    public String getSpec()
    {
        return doc.getSpeciality();
    }
    
    /*public void prescription()
    {
    	Medicine drugs[] = new Medicine[medicine];
    	int validity;
    	System.out.println("Enter the number of medicines prescribed: ");
    	for(i=0;i<medicines;i++)
    	{
    		
    		System.out.println("Enter the name: ");
    		name=sc.nextLine();
    		System.out.println("Enter the supplier: ");
    		seller=sc.nextLine();
    		System.out.println("Enter the expiry date: ");
    		expdate=sc.nextLine();
    		validity=checkExp(expdate);
    		if(validity==1)
    		{
    			System.out.println("Medicine in stock!");
    		}
    		else if(validity==-1)
    		{
    			System.out.println("Medicine expired, need to restock!");
    			break;
    		}
    		else if(validity==0)
    		{
    			System.out.println("Medicine expires today, need to restock!");
    			break;
    		}
    		System.out.println("Enter the cost: ");
    		cost=sc.nextFloat();
    		System.out.println("Enter the quantity: ");
    		qty=sc.nextInt();
    		drugs[i] = new Medicine(String name, String seller, String expdate, Float cost, int qty);
    	
    	}
    	
    }*/
    
}
