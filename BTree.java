package NewPkg;

public class BTree {
	Node root;
	
	public BTree(){
		root = null;
	}
	
	Node newNode(int data){
		root = new Node(data);
		System.out.println(data+" Agaca eklendi");
		return root;
	}
	
	Node insert(Node root,int data){
		if(root!=null){
			if(data<root.data){
				root.left = insert(root.left,data);
			}
			else{
				root.right = insert(root.right,data);
			}
		}
		else{
			root = newNode(data);
		}
		return root;
	}
	
	void preOrder(Node root){
		if(root!=null){
			System.out.println(root.data+" ");
			preOrder(root.left);
			preOrder(root.right);
		}
	}
	
	void inOrder(Node root){
		if(root!=null){
			preOrder(root.left);
			System.out.print(root.data+" ");
			preOrder(root.right);
		}
	}
	
	void postOrder(Node root){
		if(root!=null){
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.data+" ");
		}
	}
	
	int height(Node root){
		if(root==null){
			return 0;
		}
		else{
			int sag = 0 , sol = 0;
			sag = height(root.right);
			sol = height(root.left);
			if(sol>sag){
				return sol+1;
			}
			else{
				return sag+1;
			}
		}
	}
	
	Node delete(Node root, int x){
		Node t1,t2;
		if(root==null){
			return null;
		}
		if(root.data == x){
			if(root.left == root.right){
				root = null;
				return null;
			}
			else if(root)
		}
	}

	
}




