package ru.mail.ales2003.thread;

import java.util.ArrayList;
import java.util.List;

public class Starter {

	public static void main(String[] args) throws InterruptedException {
		// I need List for I can keep the link to thread to tell something to anyone thread  
		List<MyThread> list = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			MyThread mt = new MyThread("Name " + i);
			// priority setting hasn't sense, it depend of JVM only
			mt.setPriority(Thread.MIN_PRIORITY + i);
			// thread will be out after main();
			// mt.setDaemon(true);
			mt.start();
			list.add(mt);
			

		}
		System.out.println("Started");

		Thread.sleep(2000);
		// thread of main method
		System.out.println(Thread.currentThread());
		for (MyThread mt : list) {
			mt.stopThread();

		}

		// question: why the anonymous thread lives only in method main?
		// answer: because it doesn't have loop while(true)
		anonymousT();
	}

	private static void anonymousT() {
		Thread t = new Thread() {

			@Override
			public void run() {
				//while (true) {
					System.out.println("Anonymous Thread");
				//}
			}
		};
		t.start();
		//anonymous class has't anyone name 
		System.out.println("Anonymous " + t.getClass().getCanonicalName());
		System.out.println("ParentClass of Anonymous " + t.getClass().getSuperclass().getCanonicalName());
		System.out.println(t.isDaemon());
	}

}
