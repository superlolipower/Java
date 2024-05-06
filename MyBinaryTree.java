class Node {
int key;
Node left, right;

public Node(int item) {
key = item;
left = right = null;
}
}

class MyBinaryTree {
Node root;

public MyBinaryTree() {
root = null;
}

// Метод для вставки нового узла в дерево
void insert(int key) {
root = insertRec(root, key);
}

Node insertRec(Node root, int key) {
if (root == null) {
root = new Node(key);
return root;
}

if (key < root.key) {
root.left = insertRec(root.left, key);
} else if (key > root.key) {
root.right = insertRec(root.right, key);
}

return root;
}

// Пример обхода дерева в порядке inorder (левое поддерево, корень, правое поддерево)
void inorderTraversal(Node node) {
if (node != null) {
inorderTraversal(node.left);
System.out.print(node.key + " ");
inorderTraversal(node.right);
}
}

public static void main(String[] args) {
MyBinaryTree tree = new MyBinaryTree();

// Вставляем узлы в дерево
tree.insert(50);
tree.insert(30);
tree.insert(20);
tree.insert(40);
tree.insert(70);
tree.insert(60);
tree.insert(80);

// Выводим узлы дерева в порядке inorder
System.out.println("Узлы дерева в порядке inorder:");
tree.inorderTraversal(tree.root);
}
}