package cn.tedu.thread;

public class Demo {

	//	static String content;
	//	public static void main(String[] args)throws Exception{
	//		Thread   t = new Thread() {
	//			@Override
	//			public void run() {
	//				content = "你好，hello";//运行状态
	//			}
	//		};
	//		t.start();
	//		//Thread.sleep(1000);  //休眠1秒
	//		while(content == null);//就绪状态
	//		Thread.yield();        //可以把CPU给到工作现线程
	//		System.out.println(content.toUpperCase());
	//
	//	}
	
	private int a;//实例变量
	public int method() {
		int b = 0;  //局部变量
		a++;
		b=a;
		return b;
		
	}
   
	
	public static void main(String[] args) {
		Demo s = null;     //局部变量
		int  a = 0;        //局部变量
		s = new Demo();
		a = s.method();
		System.out.println(a);
	}
}
