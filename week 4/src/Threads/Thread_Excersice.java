package Threads;

public abstract class Thread_Excersice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1=new Thread(){
			
		public void run() {
			for(int i=0 ;i<100;i++) 
				if(i%2==0) {
					System.out.println("Even No "+i);
				}
			}
		};
		Runnable r2=new Runnable () {
			public void run() {
				for (int i=0 ;i<100;i++) 
					if(i%2==1) {
						System.out.println("Odd No "+i);
					}
				
			}
		};
		
Thread t2 = new Thread (r2);
Runnable r3=()->{
	for(int i=0;i<100;i++)
		if (i%17==1) {
			System.out.println
			("Divisible by 17 "+i);
		}
	
};
	Thread t3 = new Thread (r3);
	t1.start();
	t2.start();
	t3.start();

}}
