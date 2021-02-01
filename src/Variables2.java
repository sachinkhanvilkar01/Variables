
public class Variables2 {
	int a = 100;
	int b = 200;
	void add() {
		
		System.out.println(a+b);
	}
	
	void mul() {
		
		System.out.println(a*b);
		
	}
	public static void main(String[] args) {
		
		Variables2  v2 = new Variables2();
		
		v2.add();
		v2.mul();

	}

}
