package NewPkg;

public class List {
	
	Node head = null; // liste icin bas referansı olusturduk
	Node tail = null; // liste icin kuyuruk referansı olusturduk
	
	void ekle(int x){
		
		Node eleman = new Node(); // eklenecek olan dugumu olusturduk.
		eleman.data = x; // dugume deger atadik
		eleman.next = null; // dugumun nextini null a bagladik
		
		if (head == null){
			head = eleman;
			tail = eleman;
			System.out.println("Liste olusturuldu ilk eleman eklendi");
		}
		else{
			tail.next = eleman; // son elemanın devamına yeni elemanı ekleledik
			tail = eleman; // son elemanı yeni eleman olarak guncelledik
			System.out.println("Listenin sonuna yeni eleman eklendi");
		}
		
	}
	
	void yazdir(){
		
		if(head==null){
			System.out.println("Liste Yapisi Bos");
		}
		Node tmp = head; // elemanlar uzerinde iterasyon yapabilmek adina gecici bir degisken tanimladik
		System.out.print("\nbas → ");
		while(tmp!=null){
			System.out.print(tmp.data+" → ");
			tmp = tmp.next;
		}
		System.out.print(" son");
	}
}
