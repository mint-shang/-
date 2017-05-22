import java.util.*;

public class LeafNode extends AbstractNode{
	//叶子结点不能有子结点
	public LeafNode(String name){
		super(name);
	}
	
	public void addNode(Node node) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Can't add a node to leaf.");
	}

	public Iterator<Node> iterator() {
		// TODO Auto-generated method stub
		return new NullIterator<Node>();
	}

}
