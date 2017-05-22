import java.util.Iterator;

public class Test {
	static Node createTree(){
		Node root=new BrachNode("R");
		Node a=new BrachNode("A");
		Node b=new LeafNode("B");
		Node c=new BrachNode("C");
		Node d=new BrachNode("D");
		Node e=new LeafNode("E");
		Node f=new LeafNode("F");
		
		a.addNode(d);
		d.addNode(e);
		c.addNode(f);
		root.addNode(a);
		root.addNode(b);
		root.addNode(c);
		return root;
	}
	
	static void DepthFirstIterator(Node tree){
		System.out.println("深度优先迭代器：");
		doSomething(tree);
		for(Iterator<Node>it=new DepthFirstIterator(tree.iterator());it.hasNext();){
			doSomething(it.next());
		}
		System.out.println();
	}
	static void BreadthFirstIterator(Node tree){
		System.out.println("广度优先迭代器：");
		doSomething(tree);
		for(Iterator<Node>it=new DepthFirstIterator(tree.iterator());it.hasNext();){
			doSomething(it.next());
		}
		System.out.println();
	}
	
	static void doSomething(Node node){
		System.out.print(node);
	}
	
	public static void main(String[] args){
		Node tree=createTree();
		DepthFirstIterator(tree);
		BreadthFirstIterator(tree);
	}
}
