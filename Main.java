package NewPkg;

public class Main {

	public static void main(String[] args) {
		
		BTree bt = new BTree();
		
		bt.root = bt.insert(bt.root, 10);
		bt.root = bt.insert(bt.root, 15);
		bt.root = bt.insert(bt.root, 8);
		bt.root = bt.insert(bt.root, 20);
		bt.root = bt.insert(bt.root, 5);
		bt.root = bt.insert(bt.root, 12);
		bt.root = bt.insert(bt.root, 9);
		System.out.println("Kokun datası : "+bt.root.data);
		System.out.println("Kokun sagindaki data : "+bt.root.right.data);
		System.out.println("Kokun solundaki data : "+bt.root.left.data);
		
		System.out.println("kok basta");
		bt.preOrder(bt.root);
		System.out.println();
		System.out.println("kok ortada");
		bt.inOrder(bt.root);
		System.out.println();
		System.out.println("kok sonda");
		bt.postOrder(bt.root);
		System.out.println("\nAgacin boyutu "+bt.height(bt.root));

	}

}
