package NewPkg;

public class Main {

	public static void main(String[] args) {
		
		List listeyapisi = new List(); // List sinifindaki fonksiyonlari kullanbilmek icin nesnesini olusturduk.
		listeyapisi.ekle(12);
		listeyapisi.ekle(31);
		listeyapisi.ekle(61);
		listeyapisi.ekle(88);
		System.out.println();
		listeyapisi.yazdir();
	}
}
