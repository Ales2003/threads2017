package threads2017;

import java.util.ArrayList;
import java.util.List;

public class Starter {

	public static void main(String[] args) throws InterruptedException {
		List<MyThread_1> list = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			MyThread_1 mt = new MyThread_1("Name " + i);
			// hasn't sense
			mt.setPriority(Thread.MIN_PRIORITY + i);
			// thread will be out after main();
			// mt.setDaemon(true);
			mt.start();
			list.add(mt);

		}
		System.out.println("Started");
		Thread.sleep(5000);
		for (MyThread_1 mt : list) {
			mt.stopThread();
		}
	}

}
