
public class Var2 {

	static int a =15;
	static int b =20;
	
	public static void main(String[] args) {
		
		System.out.println(Var2.a + Var2.b);
		
		Var2 obj = new Var2();
		obj.add();

	}
	void add(){
		
		System.out.println(Var2.a + Var2.b);
	}

}
