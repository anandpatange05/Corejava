class Hi extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Hi");
			try {Thread.sleep(200);}catch(Exception e) {}
}}}
class Hello extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Hello");
			try {Thread.sleep(200);}catch(Exception e) {}
}}}
public class ThreadDemo {
public static void main(String[] args)throws Exception {
	Hi obj1=new Hi();
	Hello obj2=new Hello();
	
	obj1.start();
	try {Thread.sleep(100);}catch(Exception e) {}
	obj2.start();
	
	System.out.println(obj1.isAlive());
	
	obj1.join();
	obj2.join();
	System.out.println("Join to start another method");//.join will complete obj1 and obj2 then Joining another method
	
	System.out.println(obj1.isAlive());
}
}

