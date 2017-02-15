/* Hidden stub code will pass a root argument to the function below. Complete the function to solve the challenge. Hint: you may want to write one or more helper functions.  

The Node class is defined as follows:
    class Node {
        int data;
        Node left;
        Node right;
     }
*/
    boolean checkBST(Node root) {
        return check(root);
    }

    boolean check(Node root) {
        if(root == null) {
            return true;
        }
        if(root.left != null && maxVal(root.left) >= root.data) {
            return false;
        }
        if(root.right != null && minVal(root.right) <= root.data) {
            return false;
        }
        if(!check(root.left) || !check(root.right)) {
            return false;
        }
        
        return true;
    }

    int minVal(Node node) {
        if(node == null) {
            return 99999999;
        }
        
        int leftmin = minVal(node.left);
        int rightmin = minVal(node.right);
        
        int submin = Math.min(leftmin, rightmin);
        return Math.min(node.data, submin);
    }
    
    int maxVal(Node node) {
        if(node == null) {
            return -99999999;
        }
        
        int leftmax = maxVal(node.left);
        int rightmax = maxVal(node.right);
        
        int submax = Math.max(leftmax, rightmax);
        return Math.max(node.data, submax);
    }
