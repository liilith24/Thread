package MultiThreading;

public class Thread1 extends Thread  {
private int c  ;
private int d ; 
private int result ; 
public Thread1 (int c ,int d) {
	this.c=c;
	this.d=d;
}
@Override 
public void run() {
	result=c*d;
	System.out.println("c*d = " + result );
}
public int getresult() {
	return result;
}

}
