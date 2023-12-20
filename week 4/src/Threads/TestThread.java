package Threads;

public class TestThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int MAX_PRIORITY=10;
int MIN_PRIORITY=1;

//Getting referance to main thread
Thread t = Thread.currentThread();
//Getting name of main thread
System.out.println("Current thread : "+t.getName());
//Changing the name of main thread
t.setName("EIF Training");
System.out.println("After name change : "+t.getName());
//Getting priopity of main thread 
System.out.println("Main thread priority: "+t.getPriority());
//Setting priority of main thread to MAX (10)
t.setPriority(MAX_PRIORITY);
//print and display the main thread priority
System.out.println("Main thread new priority: "+t.getPriority());
for(int i=0 ;i<5;i++) {
	System.out.println("Main thread ");
}
//main thread creating a child thread 
Thread ct = new Thread() {
	//run() method of a thread
	public void run () {
		for (int i=0;i<5;i++) {
			System.out.println("Child thread");
		}
		
	}
};
System.out.println("Child thread priority : "+ct.getPriority());
//setting priority of main thread to MIN (1)
ct.setPriority(MIN_PRIORITY);
System.out.println("Child thread new priority : "+ct.getPriority());
//starting child thread
ct.start();

	}

}
