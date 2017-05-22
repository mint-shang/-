
public abstract class AbstractNode implements Node{
	protected String name;//结点名字
	
	protected AbstractNode(String name){
		this.name=name;
	}
	
	public String toString(){
		return(name);//识别各个结点
	}
}
