package Threads;

import java.util.jar.Attributes.Name;

public class ThreadsTeste {
	static int i = 0;
	
	public static void main(String[] args) {
		new Thread(t1).start();
		new Thread(t2).start();  //São executados ao mesmo tempo, não há controle.
	};
	private static void contador (String name) {
		i++;
		System.out.println("O valor do contador atual é: "+i+ ", thread "+ name);
	};
	private static Runnable t1 = new Runnable() {
		public void run() {
			try {
				for (int i = 0; i < 5; i++) {
					contador( "t1");
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	};
	private static Runnable t2 = new Runnable() {
		public void run () {
			try {
				for (int i = 0; i < 5; i++) {
					contador( "t2");
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	};
	
}
