package hanoi;

import java.util.Stack;

public class HanoiStack<Integer> extends Stack {
	
    private String name;
    
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public HanoiStack(String name){
    	this.name = name;
    }
    
    @Override
    public synchronized Object pop() {
    	// TODO Auto-generated method stub
    	//System.out.println("stack "+name+" pop");
    	return super.pop();
    }
    
    public Object push(Object item) {
    	// TODO Auto-generated method stub
    	//System.out.println("stack "+name+" push");
    	return super.push(item);
    }
}
