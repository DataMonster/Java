public class test {

	public static Node select(Node root, int i) {

//		if(root == null){
//			return root;
//		}
		if (i > root.count||i<0) {
			System.out.println("Number larger than tree size");
			return null;
		}
		
		if(i==1&&root.count==1){
			return root;
		}
		
	    else if (i == root.left.count+1) {
	    	System.out.println(root.data);
			return root;
		}

		else if (i > root.left.count+1) {
			System.out.println("!"+root.data);
			return select(root.right, i-root.left.count-1);
		}

		else if (i < root.left.count+1) {
			System.out.println("?"+root.data);
			return select(root.left, i);
		}
		return null;
	}

	public static void main(String[] args) {
		Node n1 = new Node(5);
		n1.count = 6;
		n1.left = new Node(3);
		n1.left.count = 2;
		n1.left.right = new Node(4);
		n1.left.right.count =1;
		n1.right = new Node(7);
		n1.right.count = 3;
		n1.right.left = new Node(6);
		n1.right.left.count = 1;
		n1.right.right = new Node(9);
		n1.right.right.count = 1;
		
		System.out.println(select(n1,1).data);
	}

}

class Node {

	Node left ;

	Node right ;

	int data;

	int count;
	
	Node(int i){
		this.data = i;
		this.left = null;
		this.right = null;
	}
}
