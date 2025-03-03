package MultiThreading;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		Thread1 One = new Thread1(15,5);
		
		Thread2 thread2  = new Thread2 (1,2);
		Thread Two = new Thread(thread2);
		
		One.start();
		Two.start();
		
		One.join();
		Two.join();
		
		int pro = One.getresult();
		int cro =thread2.getResult();
		
		System.out.println("la resultat finale est : "+pro/cro);

	}

}
