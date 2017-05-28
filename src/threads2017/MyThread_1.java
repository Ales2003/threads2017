package threads2017;

public class MyThread_1 extends Thread {

	private String threadName;
	
	public String getThreadName() {
		return threadName;
	}

	public void setThreadName(String threadName) {
		this.threadName = threadName;
	}

	public MyThread_1(String threadName) {
			this.threadName = threadName;
	}


	@Override
	public void run() {
		while(true){
			System.out.println("Hello " + this.getId()+ " " + this.threadName);
			try { 
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
