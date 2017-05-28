package threads2017;

public class MyThread_1 extends Thread {

	private String threadName;
	//volatile for guaranteed cheking of 'running' 
	private volatile Boolean running = true;
	
	public String getThreadName() {
		return threadName;
	}

	public void setThreadName(String threadName) {
		this.threadName = threadName;
	}

	public MyThread_1(String threadName) {
			this.threadName = threadName;
	}

	public void stopThread() {
		running = false;
	}
	@Override
	public void run() {
		while(running){
			System.out.println("Hello " + this.getId()+ " " + this.threadName+ " " + this.isDaemon());
			try { 
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
