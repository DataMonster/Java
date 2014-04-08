package collection1;

/*
 * Given a binary tree, find its maximum depth.

 The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 */
public class TreeDepth {
	
	 public int maxDepth(TreeNode root) {
		 if(root == null){
			 return 0;
		 }
	        if(root.left!=null && root.right!=null){
	        	return Math.max(maxDepth(root.left),maxDepth(root.right));
	        } else if(root.left!=null){
	        	return 1+maxDepth(root.left);
	        } 
	        else if(root.right!=null){
	        	return 1+maxDepth(root.right);
	        }
	        return 1;
	    }

	public static void main(String[] args) {
		//TreeNode t = 
	}

}

// Definition for binary tree
class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}