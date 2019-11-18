package pack1;

class Hi implements Runnable{
	
	public void run(){
		
		for(int i=0; i<5; i++){
			
			System.out.println("Hi");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
	}
}

class Hello implements Runnable{
	
public void run(){
		
		for(int i=0; i<5; i++){
			
			System.out.println("Hello");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
	}
}



public class MultiThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hi obj1 = new Hi();
		Hello obj2 = new Hello();
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		t1.start();
		t2.start();
				
		

	}

}
