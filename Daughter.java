package inheritance;

public class Daughter extends Son {
	public void pencil() {
		System.out.println("Daughters pencil");
	}	
		public void bag() {
			System.out.println("Daughters bag");
		}
		public static void main(String[] args) {
		Daughter d=new Daughter();
		// Sons property
		d.bike();
		d.mobile();
		
		// fathers property
		d.car();
		d.home();
		d.land();
		
		//GrandFathers property
		d.elephant();
		d.horse();
		
		// daughters property
		d.bag();
		d.pencil();
		
		
		}
	}




