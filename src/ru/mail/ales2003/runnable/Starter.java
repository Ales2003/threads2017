package ru.mail.ales2003.runnable;

import java.util.ArrayList;
import java.util.List;

public class Starter {

	public static void main(String[] args) throws InterruptedException {
		List<MyRunnable> list = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			MyRunnable mt = new MyRunnable("Name " + i);
			// hasn't sense
			Thread t = new Thread(mt);
			t.start();
			list.add(mt);

		}
		System.out.println("Started");

		Thread.sleep(2000);
		// thread of main method
		System.out.println(Thread.currentThread());
		for (MyRunnable mt : list) {
			mt.stopThread();

		}

		// question: why the anonymous thread lives only in method main?
		// answer: because it doesn't have loop while(true)
		anonymousR();
	}

	private static void anonymousR() {
		Runnable r = new Runnable() {

			@Override
			public void run() {
				System.out.println("Anonymous Runnable");

			}
		};

		new Thread(r).start();
		System.out.println("Anonymous " + r.getClass().getCanonicalName());
		System.out.println("ParentClass of Anonymous " + r.getClass().getSuperclass().getCanonicalName());

	}

}
