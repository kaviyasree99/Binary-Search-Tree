  
/*
 * Program To Print Binary Search Tree 
 * Declaring MyBinaryTree Class With Extends Comparable 
 * Declaring K as Generic Data Type Parameter
 */
public class MyBinaryTree<k extends Comparable<k>> {
	public MyBinaryNode<k> root;	
	/*
	 * Declaring  add Method 
	 * To Initialize The Root And Key Values
	 */
	public void add(k key) {
		this.root = this.addRecursively(root, key);
	}
private MyBinaryNode<k> addRecursively(MyBinaryNode<k> root , k key) {
	//If condition Is To Store The Root Value
	if (root == null)//here checking if condition if root value is null store the value in root
	{
		root = new MyBinaryNode<k>(key);//Storing root value
	}
	//Here Comparing Key with Root And It Will Store In CompareResult 
	int compareResult = key.compareTo(root.key);//It Gives The Values As -1,0,1
	{
	if(compareResult == 0) //If CompareResult Is Zero Return The Root Value
		return root;
	}
	if(compareResult < 0)//If CompareResult Is LessThan Zero 
	{
		root.left = addRecursively(root.left, key);//It Will Store The Value In Left Node
	}
	else {
		root.right = addRecursively(root.right, key);//If CompareResult Is Greater Than Zero The Value Will Be Store In Right Node	
	}
	return root;//Return Root
}
	/*
	 * Declaring get Size Method
	 * Calling The getSizeRecursive Method
	 */
public int getSize(){
	return this.getSizeRecursive(root);
}
	/*
	 * Here Declaring The Get Size Recursive Method
	 */
private int getSizeRecursive(MyBinaryNode<k> root){
	return root == null ? 0 : 1 + this.getSizeRecursive(root.left) +
        this.getSizeRecursive(root.right);//Here Finding The Size Of Binary Tree By Size Recursively
}


	/*
	 * Declaring The Main Method 
	 * Adding The Nodes To Binary Tree
	 */
	public static void main(String[] args) {
	MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<Integer>();
    myBinaryTree.add(56);//Inserting 56 Value To Binary Tree
    myBinaryTree.add(30);//Inserting 30 Value To Binary Tree
    myBinaryTree.add(70);//Inserting 70 Value To Binary Tree
    myBinaryTree.add(40);//Inserting 40 Value To Binary Tree
    myBinaryTree.add(22);//Inserting 22 Value To Binary Tree
    myBinaryTree.add(60);//Inserting 60 Value To Binary Tree
    myBinaryTree.add(95);//Inserting 95 Value To Binary Tree
    myBinaryTree.add(11);//Inserting 11 Value To Binary Tree
    myBinaryTree.add(65);//Inserting 65 Value To Binary Tree
    myBinaryTree.add(03);//Inserting 03 Value To Binary Tree
    myBinaryTree.add(16);//Inserting 16 Value To Binary Tree
    myBinaryTree.add(63);//Inserting 63 Value To Binary Tree
    myBinaryTree.add(67);//Inserting 67 Value To Binary Tree
    System.out.println("myBinaryTree is : "  +myBinaryTree);//Printing The My bInary Tree
    int size = myBinaryTree.getSize();
    System.out.println("My Binary Tree Size is : "  +size);//Printing The Size My bInary Tree

	}
}

