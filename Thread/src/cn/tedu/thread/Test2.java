package cn.tedu.thread;

import java.util.HashMap;

/**
 * 1.��ջ�д���str1������
 *   ������final����
 * 2.ȥ�������в鿴�Ƿ�����ͬUnicode������ַ���������
 *   ����н�str1ָ��ó��������û���򴴽�һ������Ϊ��str1�����ַ���������
 *   ��str1������ָ��ó�����
 * 3.String str1 = ��str1��; String str2 = ��str1��;
 *   str2������ָ���������Ѿ����ڵ�����Ϊ��str1���ĳ������������´����µĳ�����
 *   str1��str2������ָ��ͬһ��������
 * 
 *
 */
public class Test2 {
	public static void main(String[] args) {

		String str1 = "str1";
		String str2 = "str1";
		String str3 = new String("str1");
		String str4 = new String("str1");
		System.out.println(str1==str2);//true��ַһ��
		System.out.println(str3==str4);//false��ַ��һ��
		System.out.println(str3.equals(str4));//true,ֵһ��
		System.out.println(str2.equals(str3));//true,ֵһ��
		System.out.println((str1+"a")==(str2+"a"));//false;������+���ӵ�ַ��һ��
		System.out.println((str1+"a").equals((str2+"a")));//true;������+����ֵһ��
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

