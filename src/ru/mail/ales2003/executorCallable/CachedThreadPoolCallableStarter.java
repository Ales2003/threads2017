package ru.mail.ales2003.executorCallable;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CachedThreadPoolCallableStarter {

	public static void main(String[] args) throws InterruptedException {

		ExecutorService executorResultService = Executors.newCachedThreadPool();
		ArrayList<Future<String>> names = new ArrayList<Future<String>>();

		for (int i = 0; i < 5; i++) {
			names.add(executorResultService.submit(new MyExecutorCallable("I'm Callable from CachedThreadPool " + i)));

		}

		for (Future<String> future : names) {
			try {
				System.out.println(future.get());
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		executorResultService.shutdown();

	}

}
