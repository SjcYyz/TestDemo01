package cn.tedu.thread;

import java.io.IOException;

/**
 * 1.�̰߳�ȫ�벻��ȫ���⣿
 * 2.ģ����Ʊҵ�񲢷�
 * @author Sjc
 *
 */
public class TestThread {
	//1.ָ�ĵ�ǰ�������
	static  class TicketTask implements Runnable{
		int ticket = 10;
		@Override
		public void run() {
			doTicket();

		}

		//1.ֱ���ڷ����ϼ���        �൱��ȥ�̳����ֱ�Ӱ��̳�����  synchronized
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

		//1.������Ʊ�������
		TicketTask  task = new TicketTask();
		//2.��������߳�ģ������Ʊ����
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
