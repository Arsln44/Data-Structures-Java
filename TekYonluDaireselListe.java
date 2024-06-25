package NewPkg;
import java.util.Scanner;

public class TekYonluDaireselListe {
	Scanner scanner = new Scanner(System.in);
	
	Node head = null;
	Node tail = null;
	
	void basaEkle(){
		int data;
		System.out.println("Data : ");
		data = scanner.nextInt();
		Node eleman = new Node(data);
		
		if(head==null){
			head = eleman;
			tail = eleman;
			tail.next = head;
		}
		else{
			eleman.next = head;
			head = eleman;
			tail.next = head;
		}
	}
	void sonaEkle(){
		int data;
		System.out.println("Data : ");
		data = scanner.nextInt();
		Node eleman = new Node(data);
		
		if(head==null){
			head = eleman;
			tail = eleman;
			tail.next = head;
		}
		else if(head != null){
			tail.next = eleman;
			tail = eleman;
			tail.next = head;
		}
	}
	void yazdir(){
		if(head==null){
			System.out.print("Listede eleman mevcut değil!");
		}
		else{
			Node tmp = head;
			System.out.print("bas → ");
			System.out.print(tmp.data+" → ");
			while(tmp != tail){
				tmp = tmp.next;
				System.out.print(tmp.data+" → ");
			}
			System.out.println("son");
		}
	}
}







