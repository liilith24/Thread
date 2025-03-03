package MultiThreading;

public class Thread2 implements Runnable  {
	private int a ;
	private int b ;
	private int Result ;
	public Thread2(int a ,int b ) {
		this.a=a;
		this.b=b;
	}
@Override
public void run () {
	Result =a+b ;
	System.out.println("a+b="+ Result);
}
public int getResult() {
	return Result;
}

}
