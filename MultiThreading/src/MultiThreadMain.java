public class MultiThreadMain {

	public static void main(String[] args) {

		System.out.println("Start");
		for (int i = 0; i < 25; i++) {
			Runnable T1 = new Dice(3);
			Thread worker = new Thread(T1);
			worker.start();

			Runnable T2 = new Dice(4);
			Thread worker2 = new Thread(T2);
			worker2.start();

			System.out.println(i+1 + "-- ");
		}
		System.out.println("Complete");

	}

}
