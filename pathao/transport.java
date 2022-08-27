package transport;
public abstract class transport{
	String name,promo,pay;
	int bf,distance;
	double time,pf,tf,i,gf,odf,duf,dif;
	abstract void distancefare();
	abstract void durationfare();
	abstract void totalfare();
	abstract void promofare();
	abstract void onlinediscountfare();
	abstract void grandfare();
	void setpromo(String promo) {
		
	}
	void getdis(int distance) {
		
	}
	void getpay(String pay) {
		
	}
	abstract void print();
	
}
