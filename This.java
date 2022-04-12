package home2;

public class This {
	String k="hello friends";//global variable	
	int h=15; //global variable

	public void test1() {
		String h="good night";// local variable
		System.out.println(h);
		System.out.println(this.h);
	}
	public static void main(String[] args) {
		This j=new This();
		j.test1();
	}
	}


