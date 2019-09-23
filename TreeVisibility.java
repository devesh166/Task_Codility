
class Node 
{ 
    int key; 
    Node left, right; 
  
    public Node(int item) 
    { 
        key = item; 
        left = right = null; 
    } 
} 
  
public class TreeVisibility {
	 Node root; 
	 int count=0;
	 int rootElememt=0;
	  
	 TreeVisibility() 
	    { 
	        root = null; 
	    } 
	 void solutions(Node node) 
	    { 
	        if (node == null) 
	            return; 
	  
	        
	        
	        solutions(node.left); 
	  
	      
	        solutions(node.right); 
	  
	       
	       if(node.key >= rootElememt) {
	    	   count++;
	       }
	    }
	 int checkVisibility() {
		 rootElememt=root.key;
		solutions(root);
		return count;
	}
	

	
	public static void main(String[] args) {
		TreeVisibility tree = new TreeVisibility(); 
	        tree.root = new Node(5); 
	        tree.root.left = new Node(3); 
	        tree.root.right = new Node(10); 
	        tree.root.left.left = new Node(20); 
	        tree.root.left.right = new Node(21); 
	        tree.root.right.left = new Node(1);
	  
	       System.out.println(tree.checkVisibility()); 
	        
	}

}
