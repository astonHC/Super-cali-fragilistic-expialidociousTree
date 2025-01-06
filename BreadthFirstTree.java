// COPYRIGHT (C) HARRY CLARK 2025

// CS2_DSA TREE CASE STUDY

import java.util.Queue;
import java.util.LinkedList;

public class BreadthFirstTree 
{
    private static Queue<TreeNode> TREE_QUEUE;
    
    static
    {
        TREE_QUEUE = new LinkedList<>();
    }

    public static final void LEVEL_ORDER(TreeNode ROOT)
    {
        TREE_QUEUE.add(ROOT);

        while(!TREE_QUEUE.isEmpty())
        {
            TreeNode NODE = TREE_QUEUE.poll();
            System.out.println(NODE.DATA);

            if(NODE.LEFT != null) TREE_QUEUE.add(NODE.LEFT);
            if(NODE.RIGHT != null) TREE_QUEUE.add(NODE.RIGHT);
        }
    }
}
