package threads2017;

public class Starter {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			MyThread_1 mt = new MyThread_1("Name "+i);
			mt.start();
			System.out.println("Started");
			
			System.out.println("Started");
			
			

		}

	}

}
