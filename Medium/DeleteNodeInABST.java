public class DeleteNodeInABST {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null) {
            return root;
        }
        if(root.val > key) {
            root.left = deleteNode(root.left, key);
        }
        else if(root.val < key) {
            root.right = deleteNode(root.right, key);
        }
        // if the root is the node to be deleted
        else {
            //has one child node or no children
            if(root.left == null) {
                return root.right;
            }
            else if(root.right == null) {
                return root.left;
            }
            //has two children

            root.val = findMin(root.right);
            root.right = deleteNode(root.right, root.val);

        }
        return root;
    }

    public int findMin(TreeNode root) {
        while(root.left != null) {
            root = root.left;
        }
        return root.val;
    }
}
