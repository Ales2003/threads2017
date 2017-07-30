package ru.mail.ales2003.executorRunnable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPoolStarter {

	public static void main(String[] args) throws InterruptedException {

		ExecutorService executorService = Executors.newCachedThreadPool();
		for (int i = 0; i < 5; i++) {
			executorService.execute(new MyExecutorRunnable("I'm Runnable from CachedThreadPool " + i));
		}
		executorService.shutdown();

	}

}
