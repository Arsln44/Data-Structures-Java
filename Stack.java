package NewPkg;

public class Stack {
	
	int dizi[]; // stack'i olusturacagımız yer icin dizi tanimladik
	int size; // dizinin buyuklugu icin 
	int indis; // dizi icindeki elemanlari kontrol etmek amacli
	
	public Stack(int size) {
		this.size = size;
		dizi = new int[size]; // burda olusturdugumuz size ile stack'in kapasitesini belirledik
		indis = -1; // diziye eleman koyunca 0,1,2..n diye gidecek bundan dolayi -1 ile baslattik
	}
	void push(int data){  //ekle
		indis++; //diziye eleman ekledikce indis degerini arttiriyoruz
		dizi[indis] = data; // bu sekilde dizinin indisinci elemanina data ekledik
		System.out.println("push() : "+dizi[indis]+"");
	}
	int pop(){
		return dizi[indis--]; // diziden eleman cikardik
	}
}
