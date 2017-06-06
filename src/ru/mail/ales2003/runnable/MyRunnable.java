package ru.mail.ales2003.runnable;

public class MyRunnable implements Runnable {
	private String threadName;
	//volatile for guaranteed cheking of 'running' 
	private volatile Boolean running = true;
	
	
	public MyRunnable(String threadName) {
			this.threadName = threadName;
	}

	public void stopThread() {
		running = false;
	}
	@Override
	public void run() {
		while(running){
			System.out.println("Hello " + threadName);
			try { 
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
