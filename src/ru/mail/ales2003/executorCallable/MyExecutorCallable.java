package ru.mail.ales2003.executorCallable;

import java.util.concurrent.Callable;

public class MyExecutorCallable implements Callable<String> {
	private String threadName;

	public MyExecutorCallable(String threadName) {
		this.threadName = threadName;
	}

	@Override
	public String call() throws Exception {
		Thread.sleep(1000);
		return "Hello " + threadName;

	}

}
