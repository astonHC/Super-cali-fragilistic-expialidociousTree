// COPYRIGHT (C) HARRY CLARK 2025

// CS2_DSA TREE CASE STUDY

public class Main
{
    public static void main(String[] args)
    { 
        // PRE-ORDER (IN ORDER) ENCOMPASSES THE LEFT-MOST NODE

        TreeNode ROOT = TreeNode.ADD_NODES();
        System.out.println("In-Order Traversal:");
        TreeNode.IN_ORDER(ROOT, "ROOT");

        System.out.println("=======================================");

        // VICE VERSA

        System.out.println("Post-Order Traversal:");
        TreeNode.POST_ORDER(ROOT, "ROOT");

        System.out.println("=======================================");

        // ORDER OF ELEMENTS ADDED IN ACCORDANCE WITH THE CREATION OF THE NODES
        // THIS WAS MADE POSSIBLE DUE TO CONCATENATING IT TO A LINKEDLIST

        System.out.println("Level Order:");
        BreadthFirstTree.LEVEL_ORDER(ROOT);

    }
}