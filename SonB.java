package inheritance;

public class SonB  extends Father {
	public void cat() {
		int a=15;
		int b=65;
		int add=a+b;
		System.out.println(add);
		
	}
	public void dog() {
		System.out.println("son b s dog");
	}
	public static void main(String[] args) {
		SonB b=new SonB();
		//Son B property
		b.cat();
		b.dog();
		//fathers acquired property
		b.car();
		b.home();
		b.land();
	}
	}


