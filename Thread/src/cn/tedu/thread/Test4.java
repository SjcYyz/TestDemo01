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
//			System.out.println("下雨了！");
//			isSunny = false;
//		}
//        
//		if (isSunny) {
//			System.out.println("谁说下雨了，其实没有下雨的！");
//		}
		
		System.out.println("请输入电话号码：");
		int scan = new Scanner(System.in).nextInt();
		
		String msg = "";
		switch(scan) {
		  
		case 110:
			msg = "我是警察";
			break;
		case 120:
			msg = "我是医生";
			break;
		case 119:
			msg = "我是火警";
			break;
		default :
			msg = "错误电话号码";
		}
		System.out.println(msg);
		
	}
}
