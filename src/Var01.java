class Vars{
	int num1 = 10, num2 = 20;

	void add()
		{

		Vars v1 = new Vars();

		System.out.println(v1.num1+v1.num2);

	}
	String username="sachin", password="atharva";
	void login(){
		if(username.equals("sachin")&&password.equals("atharva"))
		{
			System.out.println("Login success "+username);
		}else{
			System.out.println("Login fail "+username);
		}
		
		}

		public static void main(String[]args){

			Vars v = new Vars();
			v.add();
			v.login();

		}


}

