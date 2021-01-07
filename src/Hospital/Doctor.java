package Hospital;

public class Doctor extends Employee
{
    
    private float bp;
    private String timing;
    private String speciality;
    private String qualif;
    float pf=0,ins=0,da=0,hra=0,gsal,netsal;
    
    
    public Doctor(int id,String name,char gender,float basic,String timing,String speciality,String qualif)
    {
        
    	super(id,name,gender);
        this.bp=basic;
        this.timing=timing;
        this.qualif=qualif;
        this.speciality=speciality;
    
    }        
    
    public float getBasic()
    {
        return bp;
    }
    
    public String getTiming()
    {
        return timing;
    }
    
    public String getSpeciality()
    {
        return speciality;
    }
    
    public String getQualif()
    {
        return qualif;
    }
    
    public void calSal()
    {
        
        if(speciality.equals("General Physician"))
        {
            
            da=(float)0.05*bp;
            hra=(float)0.05*bp;
            ins=(float)0.09*bp;
            pf=(float)0.09*bp;
        
        }
        
        else if(speciality.equals("Cardiologist"))
        {
            
        	da=(float)0.35*bp;
            hra=(float)0.35*bp;
            ins=(float)0.04*bp;
            pf=(float)0.04*bp;
        
        }
        
        else if(speciality.equals("Paediatrician"))
        {
            
        	da=(float)0.1*bp;
            hra=(float)0.1*bp;
            ins=(float)0.08*bp;
            pf=(float)0.08*bp;
        
        }
        
        else if(speciality.equals("Gynecologist"))
        {
            
        	da=(float)0.2*bp;
            hra=(float)0.2*bp;
            ins=(float)0.07*bp;
            pf=(float)0.07*bp;
        
        }
        
        else if(speciality.equals("Surgeon"))
        {
            
        	da=(float)0.4*bp;
            hra=(float)0.4*bp;
            ins=(float)0.03*bp;
            pf=(float)0.03*bp;
        
        }
        
        else if(speciality.equals("Dermatologist"))
        {
            
        	da=(float)0.3*bp;
            hra=(float)0.3*bp;
            ins=(float)0.05*bp;
            pf=(float)0.05*bp;
        
        }
        
        else if(speciality.equals("Neurologist"))
        {
            
        	da=(float)0.25*bp;
            hra=(float)0.25*bp;
            ins=(float)0.06*bp;
            pf=(float)0.06*bp;
        
        }
        
        gsal=da+hra-ins-pf;
        netsal=bp-gsal;
        
        
    }
    public void paySlip()
    {
        
    	System.out.println("************************************************************");
        System.out.println("ID         : "+getId());
        System.out.println("Name       : "+getName());
        System.out.println("Speciality : "+getSpeciality());
        System.out.println("Basic Pay  : "+getBasic());
        System.out.println("Insurance  : "+ins);
        System.out.println("PF         : "+pf);
        System.out.println("----------------------------");
        System.out.println("Net Salary :   "+netsal);
        System.out.println("----------------------------");
    	System.out.println("************************************************************");

    }
}
