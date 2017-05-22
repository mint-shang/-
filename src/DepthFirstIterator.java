import java.util.*;

public class DepthFirstIterator implements Iterator<Node>{
	private Stack<Iterator<Node>>stack=new Stack<Iterator<Node>>();
	public DepthFirstIterator(Iterator<Node>it){
		stack.push(it);
	}
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if(stack.isEmpty()){
			return false;
		}else{
			Iterator<Node>it=stack.peek();
			if(it.hasNext()){
				return true;
			}else{
				stack.pop();
				return hasNext();
			}
		}
	}

	public Node next() {
		// TODO Auto-generated method stub
		if(hasNext()){
			Iterator<Node>it=stack.peek();
			Node next=it.next();
			if(next instanceof BrachNode){
				stack.push(next.iterator());
			}
			return next;
		}else{
			return null;
		}
	}
	
	public void remove(){
		throw new UnsupportedOperationException("Can't remove node,yet");
	}
	
}

