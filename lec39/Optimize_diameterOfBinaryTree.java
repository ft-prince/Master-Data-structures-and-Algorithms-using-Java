/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
    return diameter(root).dia;
    }

     public diapair diameter(TreeNode root){
         if(root==null){
             return new diapair();
         }

        diapair ld=diameter(root.left);
        diapair rd=diameter(root.right);
        int sd=ld.ht+rd.ht+2;
        diapair sdp=new diapair();
        sdp.dia=Math.max(sd,Math.max(ld.dia,rd.dia));
       sdp.ht=Math.max(ld.ht,rd.ht)+1;
              return sdp;
     }
  class diapair{
     int ht=-1;
     int dia=0;
  } 

 }
