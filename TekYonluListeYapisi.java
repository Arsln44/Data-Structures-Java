package NewPkg;

public class TekYonluListeYapisi {
	
	Node head = null;
	Node tail = null;
	
	void basaekle(int x){
		
		Node eleman = new Node();
		eleman.data = x;
		
		if(head == null){
			eleman.next = null;
			head = eleman;
			tail = eleman;
			System.out.println("Liste yapısı oluşturuldu, ilk eleman eklendi");
		}
		else{
			eleman.next = head;
			head = eleman;
			System.out.println("Başa eleman eklendi");
		}
		
	}
	
	void sonaEkle(int x){
		
		Node eleman = new Node();
		eleman.data = x;
		
		if(head == null){
			eleman.next = null;
			head = eleman;
			tail = eleman;
			System.out.println("Liste yapısı oluşturuldu, ilk eleman eklendi");
		}
		else{
			eleman.next = null;
			tail.next = eleman;
			tail = eleman;
			System.out.println("Sona eleman eklendi");
		}
	}
	
	void yazdir(){
		if(head == null){
			System.out.println("Liste yapisi bos");
		}
		else{
			Node tmp = head;
			while(tmp!=null){
				System.out.print(" "+tmp.data+" ");
				tmp = tmp.next;
			}
		}
	}
	void arayaEkle(int indis,int x){
		Node eleman = new Node();
		eleman.data = x;
		
		if(head==null && indis>0){
			System.out.println("Listede henüz eleman yok");
		}
		
		else if(head==null && indis==0){
			eleman.next = null;
			head = eleman;
			tail = eleman;
			System.out.println("Liste yapısı oluşturuldu, ilk eleman eklendi");
		}
		else if(head!=null && indis==0){
			eleman.next = head;
			head = eleman;
			System.out.println(indis+". sıraya yeni eleman eklendi");
		}
		else{
			int n = 0;
			Node tmp = head;
			Node tmp2 = head;
			
			while(tmp.next!=null){
				n++;
				tmp2 = tmp;
				tmp = tmp.next;
			}
			if(n==indis){
				tmp2.next = eleman;
				eleman.next = tmp;
				System.out.println("Eleman eklendi");
			}
			else{
				tmp = head;
				tmp2 = head;
				int i = 0;
				
				while(i!=indis){
					tmp2 = tmp;
					tmp = tmp.next;
					i++;
				}
				tmp2.next = eleman;
				eleman.next = tmp;
				System.out.println(indis+". sıraya yeni eleman eklendi");
			}
		}
		
	}
	void bastanSil(){
		if(head==null){
			System.out.println("Listede silinecek eleman yok");
		}
		else if(head.next==null){
			head = null;
			tail = null;
			System.out.println("Listede kalan son elemanda silindi");
		}
		else{
			head = head.next; // head'i referanssız bırakarak silinmesini
			System.out.println("Bastaki eleman silindi");
		}
	}
	void sondanSil(){
		if(head==null){
			System.out.println("Listede silinecek eleman yok");
		}
		else if(head.next==null){
			head = null;
			tail = null;
			System.out.println("Listede kalan son elemanda silindi");
		}
		else{
			Node tmp = head;
			Node tmp2 = head;
			while(tmp.next!=null){
				tmp2 = tmp;
				tmp = tmp.next;
			}
			tail=tmp2;
			tmp2.next = null;
			System.out.println("Sondaki eleman silindi");
		}
	}
	void aradanSil(int indis){
		if (head==null){
			System.out.println("Listede silinecek eleman yok");
		}
		else if(head.next==null && indis==0){
			head = null;
			tail = null;
			System.out.println("Listedeki son elemanda silindi");
		}
		else if(head.next!=null && indis == 0){
			head = head.next;
			System.out.println("Baştaki eleman silindi");
		}
		else{
			
			int i = 0;
			Node tmp = head;
			Node tmp2 = head;
			
			while(tmp!=null){
				i++;
				tmp2 = tmp;
				tmp = tmp.next;
			}
			if(i==indis){
				tmp2.next = null;
				tail = tmp2;
				System.out.println("Listede son sıradaki eleman silindi");
			}
			else{
				
				tmp = head;
				tmp2 = head;
				
				int j=0;
				while(j!=indis){
					
					tmp2 = tmp;
					tmp = tmp.next;
					j++;
				}
				tmp2.next = tmp.next; // burda tmp yi doğrudan ortadan kaldırmıs olduk
				System.out.println(indis+". eleman silindi");
			}
		}
	}
}
