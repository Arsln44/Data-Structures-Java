package NewPkg;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		CiftYonluListeYapisi cybl = new CiftYonluListeYapisi();
		Scanner scanner = new Scanner(System.in);
		
		int secim=-1 , sayi, indis;
		
		while(secim != 0){
			System.out.println("1-basa ekle");
			System.out.println("2-sona ekle");
			System.out.println("3-araya ekle");
			System.out.println("4-bastan sil");
			System.out.println("5-sondan sil");
			System.out.println("6-aradan sil");
			System.out.println("7-yazdir");
			System.out.println("0-cıkıs");
			
		
			secim = scanner.nextInt();
		
			if(secim == 1){
				System.out.println("Sayi : ");
				sayi = scanner.nextInt();
				cybl.basaEkle(sayi);
			}
			if(secim == 2){
				System.out.println("Sayi : ");
				sayi = scanner.nextInt();
				cybl.sonaEkle(sayi);
			}
			if(secim == 3){
				System.out.println("İndis : ");
				indis = scanner.nextInt();
				System.out.println("Sayi : ");
				sayi = scanner.nextInt();
				cybl.arayaEkle(indis, sayi);
			}
			if(secim == 4){
				cybl.bastanSil();
			}
			if(secim == 5){
				cybl.sondanSil();
			}
			if(secim == 6){
				System.out.println("İndis : ");
				indis = scanner.nextInt();
				cybl.aradanSil(indis);
			}
			if(secim == 7){
				cybl.yazdir();
			}
			System.out.println();
		}
		scanner.close();
	}
}
