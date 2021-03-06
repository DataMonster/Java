package edu.java.chap4;

import java.util.LinkedList;

/*
 * Design an algorithm and write code to find the first common ancestor of two nodes in
 *  a binary tree. Avoid storing additional nodes in a data structure. Note: this is
 *  not necessarily a binary search tree.
 */

public class FirstAncester {
		
	public static TreeNode first(TreeNode root, TreeNode node1, TreeNode node2){
		LinkedList<TreeNode> list1 = getRoute(root, node1);
		LinkedList<TreeNode> list2 = getRoute(root, node2);
		int i = list1.size()-1;
		int j = list2.size()-1;
		TreeNode result = null;
		while(i>0&&j>0){
			if(list1.get(i).data==list2.get(j).data){
				result = list1.get(i);
			}
			else{
				break;
			}
			i--;
			j--;
		}
		
		return result;
	}
	
	public static LinkedList<TreeNode> getRoute(TreeNode root, TreeNode node){
		LinkedList<TreeNode> list = new LinkedList<TreeNode> ();
		getNode(list,root,root,node);
		list.add(root);
		//for(int i = 0;i<list.size();i++){
			//System.out.print(list.get(i).data+" ");
		//}
		return list;
	}

	public static void getNode(LinkedList<TreeNode> list,TreeNode head, TreeNode root, TreeNode node){
		if(root.left == node){
			list.add(node);
			getNode(list,head,head,root);
		} else if(root.right == node) {
			list.add(node);
			getNode(list,head,head,root);
		}
		if(root.left!=null&&root.right!=null){
			//list.add(root.left);
			getNode(list,head,root.left,node);
			//list.remove(root.left);
			//list.add(root.right);
			getNode(list,head,root.right,node);
			//list.remove(root.right);
		}
		return;
	}
	public static void main(String[] args) {
		TreeNode tn = new TreeNode(5);
		tn.left = new TreeNode(3);
		tn.left.left = new TreeNode(2);
		tn.left.right = new TreeNode(4);
		tn.left.left.left = new TreeNode(1);
		tn.right = new TreeNode(8);
		tn.right.left = new TreeNode(6);
		tn.right.right = new TreeNode(9);
		tn.right.right.right = new TreeNode(11);
		
		getRoute(tn,tn.right.right);
		TreeNode result = first(tn,tn.left.left.left,tn.left.right);
		System.out.println(result.data);
	}
	
}
