package ru.mail.ales2003.runnable;

public class NewStarter {
	public static void main(String[] args) {
		new Thread(new MyRunnable("short start")).start();
		
		// how can I start this example:
		/*
		 * new Thread(new Runnable() {
		 * 
		 * @Override run() {
		 * 
		 * } }).start();
		 */
	}
}
