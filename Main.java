package NewPkg;

public class Main {

	public static void main(String[] args) {
		
		TekYonluListeYapisi TekYonList = new TekYonluListeYapisi();
		
		TekYonList.basaekle(15);
		TekYonList.basaekle(21);
		TekYonList.sonaEkle(7);
		TekYonList.sonaEkle(5);
		TekYonList.basaekle(11);
		TekYonList.arayaEkle(2, 7);
		TekYonList.arayaEkle(0, 30);
		TekYonList.arayaEkle(7, 4);
		TekYonList.yazdir();
		TekYonList.bastanSil();
		TekYonList.yazdir();
		TekYonList.sondanSil();
		TekYonList.yazdir();
		TekYonList.aradanSil(3);
		TekYonList.yazdir();
	}
}
