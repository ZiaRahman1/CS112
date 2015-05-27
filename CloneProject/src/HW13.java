public class HW13 {

	public static void main(String[] args) throws CloneNotSupportedException {

		ThreeDice test = new ThreeDice();
		test.roll();
		System.out.println("test: " + test.getDiceValue());
		ThreeDice testCopy = (ThreeDice) test.clone();
		System.out.println("testCopy: " + testCopy.getDiceValue());
		if (testCopy.equals(test))
			System.out.println("Equals");
		else
			System.out.println("Not Equals");
	}
}