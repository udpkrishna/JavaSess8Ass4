package Session8;

public class ThreadAA extends Thread{
@Override
public void run() {
	// TODO Auto-generated method stub
	for(int i=0;i<10;i++){
		System.out.println("Printing the count "+i);
	}
}
}
