package hanoi;

public class HanoiClass {
	
	public HanoiClass(){
		
	}
	
	public void init(Integer n,HanoiStack<Integer> x_stack){
		for (int i = n; i >=1 ; i--) {
			x_stack.push(i);
		}
	}
	
	public void hanoi(Integer n,HanoiStack<Integer> x_stack,HanoiStack<Integer> y_stack,HanoiStack<Integer> z_stack){
		if(n==1){
			move(x_stack,z_stack);
		}
		else{
			hanoi(n-1,x_stack,z_stack,y_stack);
			
			move(x_stack,z_stack);
			
			hanoi(n-1,y_stack,x_stack,z_stack);
		}
	}
	//the number of movements is 2^n-1,n is the number of disk
	public void move(HanoiStack<Integer> a_stack,HanoiStack<Integer> b_stack){
		Integer value = (Integer) a_stack.pop();
		b_stack.push(value);
		System.out.println(a_stack.getName()+"--->"+b_stack.getName()+","+value);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //System.out.println("test");
		try{
		    HanoiStack<Integer> x_stack = new HanoiStack<Integer>("X");
		    HanoiStack<Integer> y_stack = new HanoiStack<Integer>("Y");
		    HanoiStack<Integer> z_stack = new HanoiStack<Integer>("Z");
		    int size = 25;
		
		    HanoiClass hc = new HanoiClass();
		    hc.init(size,x_stack);
		    hc.hanoi(size,x_stack,y_stack,z_stack);
		
		    System.out.println("z size:"+z_stack.size());
		    //for loop output stack not complete
		    while(!z_stack.isEmpty()){
		    	System.out.println(z_stack.pop());
		    }
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
