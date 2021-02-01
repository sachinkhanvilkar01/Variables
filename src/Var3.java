
public class Var3 {
	int a; //instance variable
	static boolean b; //static variable
	
	public static void main(String[] args) {
		
		float c = 10.50f; //local variable
		System.out.println(c);
		
		Var3 obj1 = new Var3();
		System.out.println(obj1.a);
		
		System.out.println(Var3.b);
		

	}

}
