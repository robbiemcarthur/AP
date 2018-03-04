
public class RunnableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nThreads = 2;
		Thread[] threads = new Thread[nThreads];
		for (int i = 0; i<nThreads;i++)
		{
		PointlessPrint p = new PointlessPrint("I am thread " + (i+1), 10);
		threads[i] = new Thread(p);
		threads[i].start();
		}
	}
}
