
import java.util.*;
class Voter
{   private int id;
	private String name;
	private int age;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
class VotingMachine{
	void verifyVoter(Voter a[]) {
	  for(int i=0;i<a.length;i++) {
		  if(a[i].getAge()>18) {
			 System.out.println(a[i].getName()+"\t"+a[i].getId()+"\t"+a[i].getAge());
		  }
	  }
	}
}
public class VotingApplication {
	public static void main(String[] args) {
		 VotingMachine vm= new VotingMachine();
		 Voter  a [] =new Voter[5];
		 Scanner xyz =new Scanner(System.in);
		 for(int i=0; i<a.length;i++) {
			 a[i]=new Voter();
			 System.out.println("Enter name id and age of voter");
			 String name=xyz.nextLine();
			 int id=xyz.nextInt();
			 int age=xyz.nextInt();
			 xyz.nextLine();
			 a[i].setName(name);
			 a[i].setId(id);
			 a[i].setAge(age);
		 }
		 vm.verifyVoter(a);
	}
}
