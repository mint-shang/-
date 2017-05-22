import java.util.*;

public class BrachNode extends AbstractNode{
	
	public BrachNode(String name){
		super(name);
	}
	
	private Collection<Node> childs=new ArrayList<Node>();
	
	public void addNode(Node node) {
		// TODO Auto-generated method stub
		childs.add(node);
	}

	public Iterator<Node> iterator() {
		// TODO Auto-generated method stub
		return childs.iterator();
	}
}
