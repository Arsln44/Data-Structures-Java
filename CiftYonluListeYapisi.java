package NewPkg;

public class CiftYonluListeYapisi {
	
	Node head = null;
	Node tail = null;
	
	void basaEkle(int data){
		Node eleman = new Node(data);
		
		if(head == null){
			head = eleman;
			tail = eleman;
		}
		else{
			eleman.next = head;
			head.prev = eleman;
			head = eleman;
		}
	}
	void arayaEkle(int indis,int data){
		Node eleman = new Node(data);
		
		if(head == null){
			head = eleman;
			tail = eleman;
		}
		else if(head != null && indis == 0){
			eleman.next = head;
			head.prev = eleman;
			head = eleman;
		}
		else{ // Listede kaç adet dugum oldugunu hesapladik
			int n = 0;
			Node tmp = head;
			while(tmp != null){
				tmp = tmp.next;
				n++;
			}
			tmp = head; // tmp'i tekrar head'e gucelledik
			
			if(indis > n){ // girilen indis degeri dugum sayisina esit veya buyuk ise elemani tail'e bagliyoruz
				tail.next = eleman;
				eleman.prev = tail;
				tail = eleman;
			}
			else{ // tek bir kosul kaldi o da girilen indis degeri arada biyerde elemani araya ekleyecegiz
				int i = 0;
				while(i != indis){ // girilen indis degerine gore elemani ekleyecegimiz noktayi ariyoruz
					tmp = tmp.next;
					i ++;
				}
				tmp.prev.next = eleman; // tmp degiskeninin bulundugu dugumun bir onceki dugumunun nextine elemani atadik
				eleman.prev = tmp.prev; // elemanin oncesine tmp degiskeninin oncesini baglad
				tmp.prev = eleman; // tmp nin oncesine de elemani bagladik
				eleman.next = tmp;  // elemanin nextine de tmp degiskeninin bulundugu dugumu bagladik
			}
		}
	}
	void sonaEkle(int data){
		Node eleman = new Node(data);
		
		if(head==null){
			head = eleman;
			tail = eleman;
		}
		else{
			tail.next = eleman;
			eleman.prev = tail;
			tail = eleman;
		}
	}
	
	void bastanSil(){
		if(head != null){
			if(head.next == null){
				head = null;
				tail = null;
			}
			else{
				head = head.next;
				head.prev = null;
			}
		}
		else{
			System.out.println("Liste yapisinda silinecek eleman mevcut değil!");
		}
	}
	
	void sondanSil(){
		if(head != null){
			if(head.next == null){
				head = null;
				tail = null;
			}
			else{
				tail = tail.prev;
				tail.next = null;
			}
		}
		else{
			System.out.println("Liste yapisinda silinecek eleman mevcut değil!");
		}
	}
	void aradanSil(int indis){
		if(head == null){
			System.out.println("Liste yapisinda silinecek eleman mevcut değil!");
		}
		else if(head!=null && indis == 0){
			head = head.next;
			head.prev = null;
		}
		else{ // kac adet dugum oldugunu hesapladik
			int n=0;
			Node tmp = head;
			while(tmp!=null){
				tmp = tmp.next;
				n++;
			}
			tmp = head; 
			if(indis>n){ // sondan silme islemi uygulandi
				tail = tail.prev;
				tail.next = null;
			}
			else{
				int i = 0;
				while(i != indis){
					tmp = tmp.next;
					i++;
				}
				tmp.prev.next = tmp.next;
				tmp.next.prev =tmp.prev;
			}
		}
	}
	void yazdir(){
		Node tmp = head;
		System.out.print("Bas ->");
		while(tmp!=null){
			System.out.print(tmp.data + " -> ");
			tmp = tmp.next;
		}
		System.out.print("son");
	}
}












