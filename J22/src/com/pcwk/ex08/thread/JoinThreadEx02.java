package com.pcwk.ex08.thread;

import java.util.ArrayList;

public class JoinThreadEx02 extends Thread {
	int seq;

	public JoinThreadEx02(int seq) {
		this.seq = seq;
	}

	@Override
	public void run() {
		System.out.println(this.seq + " thread start.");

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(this.seq + " thread stop.");
	}
	
	//join미사용
	//다른 스레드가 끝나기 전에 main() 종료
	public static void main(String[] args) {
		ArrayList<Thread> threads= new ArrayList<>();
		
		for (int i = 0; i < 10; i++) {
			Thread thread = new JoinThreadEx02(i);
			thread.start();
			
			threads.add(thread);
		}
		
		//ArrayList<Thread> 스레드 join
		//join() 메서드는 특정한 스레드가 작업을 먼저 수행할 때 사용합니다.
		for(int i=0;i<threads.size();i++) {
			Thread t = threads.get(i);
			try {
				t.join();
			}catch (InterruptedException e) {
				
			}
		}
		
		System.out.println("main end.");// main 종료

	}

}
//0 thread start.
//4 thread start.
//3 thread start.
//8 thread start.
//2 thread start.
//1 thread start.
//9 thread start.
//6 thread start.
//7 thread start.
//5 thread start.
//5 thread stop.
//3 thread stop.
//9 thread stop.
//8 thread stop.
//2 thread stop.
//4 thread stop.
//1 thread stop.
//6 thread stop.
//7 thread stop.
//0 thread stop.
//main end.