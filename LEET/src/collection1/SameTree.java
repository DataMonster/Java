package collection1;

/*
 * Given two binary trees, write a function to check if they are equal or not.

 Two binary trees are considered equal if they are structurally identical and the nodes have the same value.
 */
public class SameTree {

	public boolean isSameTree(TreeNode p, TreeNode q) {
		if(p==null) {
			if(q==null){
				return true;
			}
			return false;
		}
		if(p.val == q.val){
			if(p.left == null && q.left == null){
				return isSameTree(p.right,q.right);
			}
			if(p.left !=null&&q.left!=null){
				return isSameTree(p.left,p.left);
			}
		} 
		return false;
	}

	public static void main(String[] args) {

	}

}

