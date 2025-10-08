//4. Create a Patient class with fields patientId, name, and temperature. Create 3 patients. Display the name of patients who have temperature more than 101.0 (fever risk).
//📝 Explanation:
// Use if (temperature > 101.0) and call getName() to display names.

class Patient
{ 

   int id;
   String name;
   double temperature;
   
   public void setid(int id)
   {
      this.id = id;
   }
   public int getid()
   {
      return id;
   }
   public void setname(String name)
   {
      this.name = name;
   }
   public String  getname()
   {
      return name;
   }
   public void settemperature(double temperature)
   {
      this.temperature = temperature;
   }
   public double gettemperature()
   {
     return temperature;
   }
}

public class patientDetails
{
  public static void main(String[]args)
  {
    Patient s1 = new Patient();
	Patient s2 = new Patient();
	Patient s3 = new Patient();
	
	s1.setid(1);
	s1.setname("vijay");
	s1.settemperature(100.0);
	
	s2.setid(2);
   	s2.setname("rohan");
  	s2.settemperature(101.5);

    s3.setid(1);
  	s3.setname("ram");
   	s3.settemperature(101.7);
	
	System.out.println("Patient with fever risk of temperature : ");
	if(s1.gettemperature() > 101.0)
	{
	   System.out.println(s1.getname());
	  
	}
   if(s2.gettemperature() > 101.0)
	{
	   System.out.println(s2.getname());
	  
	}
	if(s3.gettemperature() > 101.0)
	{
	   System.out.println(s3.getname());
	  
	}
	
  }
}
/*
output:
Patient with fever risk of temperature :
rohan
ram  */






