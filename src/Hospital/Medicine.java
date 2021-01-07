package Hospital;

class Medicine implements Drugs
{
    
    private String name;
    private String seller;
    private String expdate;
    private float cost;
    private int qty;
    
    public Medicine(String name, String seller, String expdate, float cost, int qty)
    {
        
    	this.name=name;
        this.seller=seller;
        this.expdate=expdate;
        this.cost=cost;
        this.qty=qty;
    
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getSeller()
    {
        return seller;
    }
    
    public String getExpdate()
    {
        return expdate;
    }
    
    public float getCost()
    {
        return cost;
    }
    
    public int getQty()
    {
        return qty;
    }
    
        
   /* public int checkExp()
    {
    	SimpleDateFormat sdf = new SimpleDateFormat("DD/MM/YYYY");
    	Date today = sdf.parse(java.time.LocalDate.now());
    	Date exp = sdf.parse(getExpdate());
    	
    	if (today.compareTo(exp) > 0) 
    	{
    	      return -1;      
    	} 
    	else if (today.compareTo(exp) < 0) 
    	{
    	      return 1;
        } 
    	else if (today.compareTo(exp) == 0) 
    	{
    		  return 0;
    	}
    	
    } */
    
    public float getTotalCost(int qty, float cost)
    {
    	return qty*cost;
    }
    
    public void checkStock()
    {
        if(qty<=0)
            System.out.println("Out of stock");
        else if(qty<10)
            System.out.println("Running out of stock!\nQuantity: "+qty);
        else
            System.out.println("Available: "+qty);
    }
    
    /*public void billDisplay()
    {
    
    	int i;
    	float total=0;
    	System.out.println("***************************************");
        System.out.println("ID                : "+getId());
        System.out.println("Name              : "+getName());
        System.out.println("Diagnosis         : "+getDisease());
        System.out.println("Consulting Doctor : "+getName());    
        System.out.println("---------------------------------------");
        System.out.println("PRESCRIPTION");
        System.out.println("Name:			Qty:		Cost:		Total Cost:			   ");
        for(i=0;i<drugs.length;i++)
        {
        	
        	System.out.println(getName()+"		"+getQty()+"		"+getCost()+"		"+getTotalCost(drugs[i].getQty(),drugs[i].getCost()));
        	total=total+getTotalCost(drugs[i].getQty(),drugs[i].getCost());
        	
        }
        System.out.println("													TOTAL: Rs. "+total);
        System.out.println("---------------------------------------");
        System.out.println("***************************************");
    }*/
    
}


