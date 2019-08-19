package cn.tedu.thread;

public class Student extends Thread{

	@Override
	public void run() {
		for(int a = 0;a<10;a++) {

			System.out.println(currentThread().getName()+":"+a);
			try {
				sleep(100);
			}catch(InterruptedException e){
				throw  new RuntimeException(e);
			}
		}
	}
	public static void main(String[] args) {
		Student   stu = new Student();
		Student   stu1 = new Student();
		stu.start();
		stu1.start();
		stu.run();
	}

}
