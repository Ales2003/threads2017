package ru.mail.ales2003.executorRunnable;

public class MyExecutorRunnable implements Runnable {
	private String threadName;

	public MyExecutorRunnable(String threadName) {
		this.threadName = threadName;
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Hello " + threadName + " loop #" + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
