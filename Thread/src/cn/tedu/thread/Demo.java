package cn.tedu.thread;

public class Demo {

	//	static String content;
	//	public static void main(String[] args)throws Exception{
	//		Thread   t = new Thread() {
	//			@Override
	//			public void run() {
	//				content = "��ã�hello";//����״̬
	//			}
	//		};
	//		t.start();
	//		//Thread.sleep(1000);  //����1��
	//		while(content == null);//����״̬
	//		Thread.yield();        //���԰�CPU�����������߳�
	//		System.out.println(content.toUpperCase());
	//
	//	}
	
	private int a;//ʵ������
	public int method() {
		int b = 0;  //�ֲ�����
		a++;
		b=a;
		return b;
		
	}
   
	
	public static void main(String[] args) {
		Demo s = null;     //�ֲ�����
		int  a = 0;        //�ֲ�����
		s = new Demo();
		a = s.method();
		System.out.println(a);
	}
}
