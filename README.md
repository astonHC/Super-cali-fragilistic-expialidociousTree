# Super-cali-fragilistic-expialidociousTree
An implementation of a Tree Data Structure, with demonstrations of Order Traversals (CS2_DSA)

# Motive: 

What it says on the tin really, an impl. of a Tree Data Structure, with the addition of a Breadth First Search impl. that access the Data types in order of addition (O(V + E)) 

Add Nodes accordingly
```java
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
```
