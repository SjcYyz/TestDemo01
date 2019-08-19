package cn.tedu.thread;

import java.util.HashMap;

/**
 * 1.在栈中创建str1的引用
 *   常量：final修饰
 * 2.去常量池中查看是否有相同Unicode编码的字符串常量。
 *   如果有将str1指向该常量，如果没有则创建一个内容为”str1”的字符串常量，
 *   将str1的引用指向该常量。
 * 3.String str1 = “str1”; String str2 = “str1”;
 *   str2的引用指向常量池中已经存在的内容为“str1”的常量，不会重新创建新的常量，
 *   str1和str2的引用指向同一个常量。
 * 
 *
 */
public class Test2 {
	public static void main(String[] args) {

		String str1 = "str1";
		String str2 = "str1";
		String str3 = new String("str1");
		String str4 = new String("str1");
		System.out.println(str1==str2);//true地址一样
		System.out.println(str3==str4);//false地址不一样
		System.out.println(str3.equals(str4));//true,值一样
		System.out.println(str2.equals(str3));//true,值一样
		System.out.println((str1+"a")==(str2+"a"));//false;进行了+连接地址不一样
		System.out.println((str1+"a").equals((str2+"a")));//true;进行了+连接值一样
	}

}

class A{
	public static void main(String[] args) {
      HashMap  map = new HashMap();
      map.put("name", null);
      map.put("name", "xiyangyang");
      System.out.println(map.get("name"));	  
	}


}

