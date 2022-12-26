package Ipad;

public class Main {

	public static void main(String[] args) {
		
		Ipad iPad1 =new Ipad (700);
		
		System.out.println("" );
		System.out.println("iPad1: "+"Fiyat: "+iPad1.fiyat+" Euro" +"; "+"Model: "+iPad1.model+"; "+"Ekran Boyutu: "+iPad1.ekranBoyutu+" inch" );
		System.out.println("" );
		
		Ipad iPad2 =new Ipad ("iPad Mini 6");
		
		System.out.println("iPad2: "+"Fiyat: "+iPad2.fiyat+" Euro" +"; "+"Model: "+iPad2.model+"; "+"Ekran Boyutu: "+iPad2.ekranBoyutu+" inch" );
		System.out.println("" );
		
		Ipad iPad3 =new Ipad (12.9);
		
		System.out.println("iPad3: "+"Fiyat: "+iPad3.fiyat+" Euro" +"; "+"Model: "+iPad3.model+"; "+"Ekran Boyutu: "+iPad3.ekranBoyutu+" inch" );
		System.out.println("" );
		
		Ipad iPad4 =new Ipad (769, "iPad Air", 10.9);
		
		System.out.println("iPad4: "+"Fiyat: "+iPad4.fiyat+" Euro" +"; "+"Model: "+iPad4.model+"; "+"Ekran Boyutu: "+iPad4.ekranBoyutu+" inch" );
		System.out.println("" );
		
		Ipad iPad5 =new Ipad (649, "iPad Mini", 8.1);
		
		System.out.println("iPad5: "+"Fiyat: "+iPad5.fiyat+" Euro" +"; "+"Model: "+iPad5.model+"; "+"Ekran Boyutu: "+iPad5.ekranBoyutu+" inch" );
		System.out.println("" );
	}

}
