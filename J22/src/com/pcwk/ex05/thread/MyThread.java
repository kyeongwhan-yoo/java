package com.pcwk.ex05.thread;

public class MyThread implements Runnable {

	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("<"+Thread.currentThread().getName()+">");//현재 수행되고 있는 스레드의 이름
		}
		
		//시간 지연
		for(int i=0;i<100_000_000;i++) {
			for(int j=0;j<100_000_000;j++) {
				
			}
		}
		
	}

}
