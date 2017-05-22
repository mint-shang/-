import java.util.*;

public class NullIterator<T> implements Iterator<T>{

	public boolean hasNext() {
		// TODO Auto-generated method stub
		//永远没有下一个结点
		return false;
	}

	public T next() {
		// TODO Auto-generated method stub
		//永远为空
		return null;
	}
	
	public void remove(){
		//没有移除方法
	}
}
