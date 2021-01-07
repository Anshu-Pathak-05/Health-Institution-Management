package Hospital;


import java.util.*;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Hospital 
{	
    public static void main(String[] args) 
    {
        
	int i, j, d, s, p, m;
	int o;
        
	int id;
	String name;
	char gender;
	
	float basic;
	String timing;
	String speciality;
	String qualif;
	
	String desig;
	int hrs;
	float hwage;
	
	int age;
	
	String seller;
	String expdate;
	float cost;
	int qty;
	
	int choice;
	int echoice;
	
	Scanner sc = new Scanner(System.in);
        
    	System.out.println("************************************************************");
        System.out.println("                HOSPITAL MANAGEMENT");
    	System.out.println("************************************************************");
        
    	System.out.println("DOCTORS");
    	System.out.print("Enter the number of doctors: ");
    	d=sc.nextInt();
    	Doctor D[] = new Doctor[d+1];
    	for(i=0;i<d;i++)
    	{
    		
    		System.out.print("\nEnter the ID            : ");
    		id=sc.nextInt();
                
                sc.nextLine();
    		System.out.print("Enter the name          : ");
    		name=sc.nextLine();
    		System.out.print("Enter the gender        : ");
    		gender=sc.next().charAt(0);
                
                sc.nextLine();
    		System.out.print("Enter the timings       : ");
    		timing=sc.nextLine();
    		System.out.print("Enter the qualifications: ");
    		qualif=sc.nextLine();
    		System.out.print("Choose speciality    :\n1.General Physician\n2.Cardiologist\n3.Paediatrician\n4.Gynecologist\n5.Surgeon\n6.Dermatologist\n7.Neurologist\n");
    		o=sc.nextInt();
                switch(o)
                {
                    case 1:
                        speciality="General Physician";
                        break;
                    case 2:
                        speciality="Cardiologist";
                        break;
                    case 3:
                        speciality="Paediatrician";
                        break;
                    case 4:
                        speciality="Gynecologist";
                        break;
                    case 5:
                        speciality="Dermatologist";
                        break;
                    default:
                        speciality="Null";
                      
                 }
                
                
    		System.out.print("Enter the basic pay     : ");
    		basic=sc.nextFloat();
                
    		D[i] = new Doctor(id, name, gender, basic, timing, speciality, qualif);
                D[i].calSal();
    		
    	}
    	
    	/*System.out.println("STAFF");
    	System.out.println("Enter the number of staff: ");
    	s=sc.nextInt();
    	Staff S[] = new Staff[s];
    	for(i=0;i<s;i++)
    	{
    		
    		System.out.println("Enter the ID:");
    		id=sc.nextInt();
    		System.out.println("Enter the name: ");
    		name=sc.nextLine();
    		System.out.println("Enter the gender: ");
    		gender=sc.next().charAt(0);
    		System.out.println("Enter the designation: ");
    		desig=sc.nextLine();
    		System.out.println("Enter the hourly wage: ");
    		hwage=sc.nextFloat();
    		S[i] = new Staff(id, name, gender, desig, hwage);
    		
    	}*/
    	System.out.println("************************************************************");
    	
     	System.out.println("\nPATIENTS");
    	System.out.print("Enter the number of patients : ");
    	p=sc.nextInt();
    	Patient P[] = new Patient[p+1];
    	for(j=0;j<p;j++)
    	{
    		
    		System.out.print("\nEnter the ID          : ");
    		id=sc.nextInt();
                
                sc.nextLine();
    		System.out.print("Enter the name        : ");
    		name=sc.nextLine();
    		System.out.print("Enter the gender      : ");
    		gender=sc.next().charAt(0);
    		System.out.print("Enter the age         : ");
    		age=sc.nextInt();
                
                sc.nextLine();
    		System.out.print("Choose symptoms       : ");
    		System.out.println("\n1. Cold, cough, throat infection, fever, etc. \n2. Heart - Cardiovascular issues, breathing difficulties, chest pains \n3. Children (ages 0-15 years) \n4. Women - Pregnancy, etc. \n5. Skin and Hair - Rashes, hairfall, itchiness, dandruff, etc. \n");
                int op;
                op=sc.nextInt();
                Doctor doc=null;
                
                switch(op)
                {
                    case 1:
                        for(i=0;i<d;i++)
                        {
                            if(D[i].getSpeciality().equals("General Physician"))
                            {
                                doc=D[i];
                                //System.out.print(doc.getName());
                            }
                        }
                    break;
                    case 2:
                        for(i=0;i<d;i++)
                        {
                            if(D[i].getSpeciality().equals("Cardiologist"))
                            {
                                doc=D[i];
                            }
                        }
                    break;
                    case 3:
                        for(i=0;i<d;i++)
                        {
                            if(D[i].getSpeciality().equals("Paediatrician"))
                            {
                                doc=D[i];
                            }
                        }
                    break;
                    case 4:
                        for(i=0;i<d;i++)
                        {
                            if(D[i].getSpeciality().equals("Gynecologist"))
                            {
                                doc=D[i];
                            }
                        }
                    break;
                    case 5:
                        for(i=0;i<d;i++)
                        {
                            if(D[i].getSpeciality().equals("Dermatologist"))
                            {
                                doc=D[i];
                            }
                        }
                    break;
                        
                    default:
                        doc=null;
                }
            P[j] = new Patient(id, name, gender, age, doc);
        }
    	System.out.println("************************************************************");
    	
    	while(1==1)
    	{
    	
        	System.out.println("\nWhat would you like to do?");
        	System.out.println("1.View doctor details\n2.View patient details\n3.Generate payslip for an employee\n4.Exit");
    		choice=sc.nextInt();
    		switch(choice)
    		{
    		
    		case 1:
    			
                                System.out.print("\nEnter the ID: ");
    				id=sc.nextInt();
    				for(i=0;i<d;i++)
    				{
    					
    					if(id==D[i].getId())
    					{
    					
                                        System.out.println("************************************************************");
    				        System.out.println("Doctor ID              : "+D[i].getId());
    				        System.out.println("Doctor Name            : "+D[i].getName());
    				        System.out.println("Timings                : "+D[i].getTiming());
    				        System.out.println("Speciality             : "+D[i].getSpeciality());
    				        System.out.println("Salary                 : Rs."+D[i].netsal);
                                        System.out.println("************************************************************");
    					break;	
    					}
                                        
    					else
    					{
    						System.out.print("Doctor not found!");
    					}
                                }
                                break;
    					
    		case 2:
				System.out.println("\nEnter the ID: ");
				id=sc.nextInt();
				for(i=0;i<p;i++)
				{
					
					if(id==P[i].getId())
					{
					
                                        System.out.println("************************************************************");
				        System.out.println("Patient ID                            : "+P[i].getId());
				        System.out.println("Patient Name                          : "+P[i].getName());
				        System.out.println("Patient Age                           : "+P[i].getAge());
				        System.out.println("Patient's Doctor                      : "+P[i].getDoc());
                                        
				        System.out.println("Speciality of Doctor                  : "+P[i].getSpec());
                                        System.out.println("************************************************************");
					break;	
					}
					else
					{
						System.out.print("Patient not found!");
					}
					
				}
    			break;
    			
    		case 3:
    			
    				System.out.println("\nEnter the ID: ");
    				id=sc.nextInt();
    				for(i=0;i<d;i++)
    				{
    					
    					if(id==D[i].getId())
    					{
    						D[i].paySlip();
    					}
    					else
    					{
    						System.out.print("Doctor not found!");
    					}
    					
    				}
    				
                                break;
    			
    		/*case 4:
    			System.out.print("Enter the ID: ");
    			id=sc.nextInt();
    			for(i=0;i<p;i++)
    			{
    				
    				if(id==P[i].id)
    				{
    					
    					P[i].billDisplay();
    					
    				}
    				else
    				{
    					System.out.println("Patient not found!");
    				}
    				
    			}
    			break;*/
    			
            case 4: 
            	System.exit(0);
            	break;

            }
    	}
    }
}

    	
    	    	
    
    


