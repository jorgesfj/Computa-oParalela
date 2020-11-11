import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
	public static void main(String[] args) {
		long  t = System.currentTimeMillis();
		Thread t1 = new Thread(2,100000);
		Thread t2 = new Thread(100001,200000);
		Thread t3 = new Thread(200001,300000);
		Thread t4 = new Thread(300001,400000);
		Thread t5 = new Thread(400001,500000);
		Thread t6 = new Thread(500001,600000);
		Thread t7 = new Thread(600001,700000);
		Thread t8 = new Thread(700001,800000);
		Thread t9 = new Thread(800001,900000);
		Thread t10 = new Thread(900001,1000000);
		
		System.out.println("Começando as Threads");
		ExecutorService threadExecutor = Executors.newFixedThreadPool(10);
		
		threadExecutor.execute(t1);
		threadExecutor.execute(t2);
		threadExecutor.execute(t3);
		threadExecutor.execute(t4);
		threadExecutor.execute(t5);
		threadExecutor.execute(t6);
		threadExecutor.execute(t7);
		threadExecutor.execute(t8);
		threadExecutor.execute(t9);
		threadExecutor.execute(t10);
		
		threadExecutor.shutdown();
		System.out.println("\n    Tempo " + (System.currentTimeMillis() - t) + " ms");
	}
	

}
