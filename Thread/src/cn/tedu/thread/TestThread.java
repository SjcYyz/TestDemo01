package cn.tedu.thread;

import java.io.IOException;

/**
 * 1.线程安全与不安全问题？
 * 2.模拟售票业务并发
 * @author Sjc
 *
 */
public class TestThread {
	//1.指的当前对象加锁
	static  class TicketTask implements Runnable{
		int ticket = 10;
		@Override
		public void run() {
			doTicket();

		}

		//1.直接在方法上加锁        相当于去商场购物，直接把商场锁了  synchronized
		private  void doTicket() {
			while(true) {
				synchronized(this) {
					if(ticket<=0)break;	
					String tName = Thread.currentThread().getName(); 
					System.out.println(tName+":"+ticket--);
					sleep();
				}
			}
		}

		public void sleep() {
			try {
				Thread.sleep(100);
			} catch (Exception e) {
			}
		}
	}

	public static void main(String[] args) {
		Runtime  r = Runtime.getRuntime();
		System.out.println("Processorsr="+r.availableProcessors());

		//1.创建售票任务对象
		TicketTask  task = new TicketTask();
		//2.创建多个线程模拟多个售票窗口
		Thread t1 = new Thread(task);
		Thread t2 = new Thread(task);
		Thread t3 = new Thread(task);
		Thread t4 = new Thread(task);
		Thread t5 = new Thread(task);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}
}
