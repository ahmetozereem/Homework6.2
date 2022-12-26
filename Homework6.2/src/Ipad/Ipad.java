package Ipad;

public class Ipad {
	
	public int fiyat;
	public String model;
	public double ekranBoyutu;
	
	public Ipad() {
		super();
	}
	
	public Ipad(int fiyat) {
		super();
		this.fiyat = fiyat;
		this.model = "iPad Air 5";
		this.ekranBoyutu = 10.9;
	}
	
	public Ipad(String model) {
		super();
		this.model = model;
		this.fiyat = 400;
		this.ekranBoyutu = 8.3;
		
	}
	
	public Ipad(double ekranBoyutu) {
		super();
		this.ekranBoyutu = ekranBoyutu;
		this.fiyat = 899;
		this.model = "iPad Pro";
	}

	public Ipad(int fiyat, String model, double ekranBoyutu) {
		super();
		this.fiyat = fiyat;
		this.model = model;
		this.ekranBoyutu = ekranBoyutu;
	}
}
