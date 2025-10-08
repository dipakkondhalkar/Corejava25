
import java.util.Scanner;
class HosPaRec
{
  private int Pid;
  private String Pname;
  private int Page;
  private String Pdisease;
  private double PbillAmt;
  
  void setPid(int id)
  {
   Pid = id;
  }
  int getPid()
  {
    return Pid;
  }
  
  void setPname(String n)
  {
   Pname = n;
  }
  String getPname()
  {
    return Pname;
  }
  
  void setPage(int a)
  {
   Page = a;
  }
  int getPage()
  {
    return Page;
  }
  
  void setPdisease(String d)
  {
   Pdisease = d;
  }
  String getPdisease()
  {
    return Pdisease;
  }  
  
  void setPbillAmt(double amt)
  {
   PbillAmt = amt;
  }
  double getPbillAmt()
  {
    return PbillAmt;
  }
  
}
class Verify
{
  void ShowData(HosPaRec h[])
  { System.out.println("\n Full Data");
    for(int i=0;i<h.length;i++)
	{
     System.out.printf("Patient ID:  %d,  Patient Name: %s,Patient Age:  %d,  Patient Disease:   %s,  Patient Bill Amount:   %.2f\n",h[i].getPid(),h[i].getPname(),h[i].getPage(),h[i].getPdisease(),h[i].getPbillAmt());
  } 
  }
  void ShowSpe(HosPaRec h[])
  { System.out.println("\n With Cancer Dis");
    for(int i=0;i<h.length;i++)
	{
	if(h[i].getPdisease().equalsIgnoreCase("Cancer"))
	{
     System.out.printf("Patient ID:  %d,  Patient Name: %s,Patient Age:  %d,  Patient Disease:   %s,  Patient Bill Amount:   %.2f\n",h[i].getPid(),h[i].getPname(),h[i].getPage(),h[i].getPdisease(),h[i].getPbillAmt());
  }  
  }
  }
  
  void ShowBill(HosPaRec h[])
  {
	 System.out.println("\n Bill More than 50000");
    for(int i=0;i<h.length;i++)
	{
	if(h[i].getPbillAmt() > 50000)
     System.out.printf("Patient ID:  %d,  Patient Name: %s,Patient Age:  %d,  Patient Disease:   %s,  Patient Bill Amount:   %.2f\n",h[i].getPid(),h[i].getPname(),h[i].getPage(),h[i].getPdisease(),h[i].getPbillAmt());
  } 
  }  
  
  void ShowAge(HosPaRec h[])
  { System.out.println("\n Age greater than 60");
    for(int i=0;i<h.length;i++)
	{
	if(h[i].getPage()>=60)
     System.out.printf("Patient ID:  %d,  Patient Name: %s,Patient Age:  %d,  Patient Disease:   %s,  Patient Bill Amount:   %.2f\n",h[i].getPid(),h[i].getPname(),h[i].getPage(),h[i].getPdisease(),h[i].getPbillAmt());
  }
  }

}


public class Hospital
{
 public static void main (String x[])
 {
  HosPaRec h[] = new HosPaRec[3]; // int a[] = new int [size];
  Verify v = new Verify();
  Scanner xyz = new Scanner(System.in);
  
  System.out.println("Enter Patient Details");
  for(int i=0;i<h.length;i++)
  {
    h[i]= new HosPaRec();// object
	
	System.out.println("Enter Patient ID");
	int id = xyz.nextInt();
	xyz.nextLine();
	
    System.out.println("Enter Patient Name");
	String name = xyz.nextLine();
	
    System.out.println("Enter Patient Age");
	int age = xyz.nextInt();
	xyz.nextLine();
	
    System.out.println("Enter Patient Disease");
	String Dis = xyz.nextLine();
	
    System.out.println("Enter Patient Bill Amount");
	double amt = xyz.nextDouble();
	
	h[i].setPid(id);
	h[i].setPname(name);
	h[i].setPage(age);
	h[i].setPdisease(Dis);
	h[i].setPbillAmt(amt);

  }
  v.ShowData(h);
  v.ShowSpe(h);
  v.ShowBill(h);
  v.ShowAge(h);
}
}