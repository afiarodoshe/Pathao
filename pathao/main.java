package transport;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		String name;
		String promo;
		String pay;
		int distance;
		Scanner s1=new Scanner(System.in);
		transport t=new car();
		transport t1=new motorbike();
		transport t2=new bicycle();
		
		System.out.println("car/motorbike/bicycle");
		name=s1.nextLine();
		System.out.println("ENter your Distence:");
		distance=s1.nextInt();
	   
		System.out.println("Enter the promo code:");
		System.out.println("flat/percent/capped");
		promo=s1.next();
		
		System.out.println("Enter pay method:");
		System.out.println("online/cash");
		pay=s1.next();
				if(name.equals("car")) {
			t.getdis(distance);
			t.setpromo(promo);
			t.getpay(pay);
			t.distancefare();
			t.durationfare();
			t.totalfare();
			t.promofare();
			t.onlinediscountfare();
			t.grandfare();
			t.print();
			
		}
		
				else if(name.equals("motorbike")) {
			t1.getdis(distance);
			t1.setpromo(promo);
			t1.getpay(pay);
			t1.distancefare();
			t1.durationfare();
			t1.totalfare();
			t1.promofare();
			t1.onlinediscountfare();
			t1.grandfare();
			t1.print();
		}
		
				else if(name.equals("bicycle")) {
			t2.getdis(distance);
			t2.setpromo(promo);
			t2.getpay(pay);
			t2.distancefare();
			t2.durationfare();
			t2.totalfare();
			t2.promofare();
			t2.onlinediscountfare();
			t2.grandfare();
			t2.print();
		}
	}

}
