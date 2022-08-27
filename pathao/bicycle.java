package transport;
public class bicycle extends transport{
	void setpromo(String p) {
		promo=p;
	}
	void getdis(int d) {
		distance=d;
	}
	void getpay(String pay) {
		this.pay=pay;
	}
	void distancefare() {
		dif=distance*10;
	}
	void durationfare() {
		duf=(distance/0.33)*2;
	}
	void totalfare() {
	tf=20+dif+duf;
}
	void promofare() {
		if(promo.equals("flat")) {
			pf=tf-50;
		}
		else if(promo.equals("percent")){
			pf=tf-(tf*.2);
		}
		else if(promo.equals("capped")) {
			i=(tf*.25);
			if(i<60) {
				pf=tf-i;
			}
			else if(i>60) {
				pf=tf-60;
			}
		}
	}
	void onlinediscountfare() {
		odf=pf*.1;
	}
	void grandfare() {
		if(pay.equals("online")) {
		gf=pf-(pf*.1);
		}
		else {
		    gf=pf;
		}
	}
	void print() {
		System.out.println("for car :: ");
		System.out.println("Base fare == 50");
		System.out.println("Distance fare == " +dif);
		System.out.println("Duration fare == "+duf);
		System.out.println("Total fare == "+tf);
		System.out.println("Promo fare == "+pf);
		System.out.println("Online discount fare == "+odf);
		System.out.println("Grand fare == "+gf);
	}
	
}
