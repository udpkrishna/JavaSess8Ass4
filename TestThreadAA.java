package Session8;

public class TestThreadAA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreadAA ta=new ThreadAA();
		ta.setPriority(Thread.MAX_PRIORITY);
		ta.start();
		while(ta.isAlive()){
			System.out.println("Main thread will be alive till the child thread is live");
		}
		
		System.out.println("My thread run is over");
		System.out.println("Main thread's run is over");
	}
}
