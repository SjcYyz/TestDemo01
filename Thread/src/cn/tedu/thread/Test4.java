package cn.tedu.thread;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		//	 int count = 0;
		//	 System.out.println(count++);//0
		//	 System.out.println(++count);//2
		//	 System.out.println(count--);//2
		//	 System.out.println(count);//1

//		boolean isRainy = true;
//		boolean isSunny = true;
//		if (isRainy) {
//			System.out.println("�����ˣ�");
//			isSunny = false;
//		}
//        
//		if (isSunny) {
//			System.out.println("˭˵�����ˣ���ʵû������ģ�");
//		}
		
		System.out.println("������绰���룺");
		int scan = new Scanner(System.in).nextInt();
		
		String msg = "";
		switch(scan) {
		  
		case 110:
			msg = "���Ǿ���";
			break;
		case 120:
			msg = "����ҽ��";
			break;
		case 119:
			msg = "���ǻ�";
			break;
		default :
			msg = "����绰����";
		}
		System.out.println(msg);
		
	}
}
