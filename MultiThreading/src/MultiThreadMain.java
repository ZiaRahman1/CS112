
public class MultiThreadMain {

	public static void main(String[] args) {

		Dice d1 = new Dice(3);
		d1.Throw();
		
		System.out.println(d1.diceValue());

		System.out.println("Start");
		for (int i = 0; i < 25; i++) {
		      Runnable T1 = new Dice(3);
		      Thread worker = new Thread(T1);
		      // We can set the name of the thread
		      worker.setName(String.valueOf(100));
		      // Start the thread, never call method run() direct
		      worker.start();
	      
		     Runnable T2 = new Dice(4);
		      Thread worker2 = new Thread(T2);
		      // We can set the name of the thread
		      worker2.setName(String.valueOf(100));
		      // Start the thread, never call method run() direct
		      worker2.start();
		      
		      System.out.println();
		}
	      System.out.println("Complete");

	}

}
