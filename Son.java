package inheritance;

public class Son extends Father {
	
public void mobile() {
	System.out.println("sons mobile");
}
public void bike() {
	System.out.println("sons bike");
}

public static void main(String[] args) {
	Son a=new Son();
	// Sons property
	a.mobile();
	a.bike();
	//fathers property
	a.car();
	a.home();
	a.land();
	// grandfather
	a.elephant();
	a.horse(); 
}
}


