// COPYRIGHT (C) HARRY CLARK 2025

// CS2_DSA TREE CASE STUDY

public class TreeNode 
{
    public int DATA;
    public TreeNode LEFT;
    public TreeNode RIGHT;

    public TreeNode() {}

    public TreeNode(int KEY)
    {
        DATA = KEY;
        LEFT = null;
        RIGHT = null;
    }

    public static TreeNode ADD_NODES()
    {
        TreeNode ROOT = new TreeNode(10);

        ROOT.LEFT = new TreeNode(1);
        ROOT.RIGHT = new TreeNode(3);

        ROOT.LEFT.LEFT = new TreeNode(5);
        ROOT.RIGHT.RIGHT = new TreeNode(20);

        ROOT.LEFT.RIGHT = new TreeNode(100);
        ROOT.RIGHT.LEFT = new TreeNode(200);

        return ROOT;
    }

    public static void IN_ORDER(TreeNode TN, String POS)
    {
        if(TN != null) 
        { 
            IN_ORDER(TN.LEFT, POS + ".LEFT"); 
            PRINT_NODE_VALUE(TN, POS);
            IN_ORDER(TN.RIGHT, POS + ".RIGHT");
        }
    }

    public static void POST_ORDER(TreeNode TN, String POS)
    {
        if(TN != null)
        {
            POST_ORDER(TN.RIGHT, POS + ".RIGHT");
            PRINT_NODE_VALUE(TN, POS);
            POST_ORDER(TN.LEFT, POS + ".LEFT");
        }
    }

    public static void PRINT_NODE_VALUE(TreeNode NODE, String POS) 
    {
        if (NODE != null) 
        {
            System.out.println(String.format("Node: %s, Value: %d", POS, NODE.DATA));
        }
    }
}
