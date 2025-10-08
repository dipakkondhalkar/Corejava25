//Loose Coupling....

class Value{
	int a,b;
	void setValue(int x,int y) {
		this.a=x;
		this.b=y;
	}
	int getResult() {
		return 0;
	}
}
class Add extends Value{
	int getResult() {
		return a+b;
	}
}
class Mul extends Value{
	int getResult() {
		return a*b;
	}
}
class Calc
{
	void performOperation(Add ad) {
		int result=ad.getResult();
		System.out.printf("Addition is %d\n",result);
	}
}
public class CalcApplication {
	public static void main(String[] args) {
	
		  Calc c= new Calc();
		  Add ad = new Add();
		  ad.setValue(5, 4);
		  c.performOperation(ad);
		 
		  // Mul m = new Mul();
		  // m.setValue(10,20);
		  // c.performOperation(m);
	}
}
