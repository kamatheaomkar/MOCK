package home2;

public class This2 {
	String d="this is java";// global variable

	public void test1() {
		String d="automation is going on"; //local variable
		System.out.println(d);//access of local variable
		System.out.println(this.d);// access of global variable
	}
	public static void main(String[] args) {
		This2 k=new This2();
		k.test1();
	}
	}


