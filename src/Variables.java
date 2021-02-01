
public class Variables {
	int num1 = 10;
	int num2 = 20;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Variables v = new Variables();

		System.out.println(v.num1+v.num2);
		
		v.add();
		

	}
	
	void add() {
		
		System.out.println(num1+num2);
		
		
	}

}
