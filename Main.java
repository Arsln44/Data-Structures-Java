package NewPkg;

public class Main {

	public static void main(String[] args) {
		
		Node A = new Node(); // dugumleri olusturduk
		Node B = new Node();
		Node C = new Node();
		
		A.sayi = 11; // dugumlere deger atadik
		B.sayi = 22;
		C.sayi = 33;
		
		A.next = B;
		B.next = C;
		C.next = null;
		
		Node tmp = A; // Dongu icinde nesneleri dolasabilmek icin bir gecici degisken tanimladik
		
		while ( tmp != null){ // dugumun nexti null olana kadar dolandık
			System.out.println(tmp.sayi); // tmp hangi dugumdeyse degerini bastirdik
			tmp = tmp.next; // bir sonraki dugume gectik
		}

	}

}
