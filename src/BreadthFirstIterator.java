import java.util.*;

public class BreadthFirstIterator implements Iterator<Node>{

	private Queue<Iterator<Node>> queue=new LinkedList<Iterator<Node>>();
	public BreadthFirstIterator(Iterator<Node>iter){
		queue.offer(iter);
	}
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if(queue.isEmpty()){
			return false;
		}else{
			Iterator<Node> iter=queue.peek();
			if(iter.hasNext()){
				return true;
			}else{
				queue.poll();
				return hasNext();
			}
		}
	}

	public Node next() {
		// TODO Auto-generated method stub
		if(hasNext()){
			Iterator<Node> it=queue.peek();
			Node node=it.next();
			if(node instanceof BrachNode){
				queue.offer(node.iterator());
			}
			return node;
		}
		return null;
	}

}
