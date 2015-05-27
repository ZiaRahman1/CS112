import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;



public class MultiThreadMain {

	public static void main(String[] args) {

		
		
		Dice d1 = new Dice(3);
		Dice d2 = new Dice(6);
		Dice d3 = new Dice(9);
		
		System.out.println("Executor Start\n");
		
		ExecutorService threadExecutor = Executors.newCachedThreadPool();
		
		threadExecutor.execute(d1);
		threadExecutor.execute(d2);
		threadExecutor.execute(d3);
		
		threadExecutor.shutdown();
		System.out.println("Thread started, main ends\n");
		
	}

}
