package cn.tedu.thread;

public class Test {
          public static void main(String[] args) {
			String  s = "abcddddef";
			System.out.println(s.indexOf("d"));//3
			System.out.println(s.lastIndexOf("d"));//6
			int c = 120;
			byte d = (byte)c ;
			byte a = 120;
			int b = a;
		}
}
//1.Java.lang提供java语言程序设计的基础类
//  (基础数据类型的封装类、Class、math、线程类)。lang包中的类的应用不需要手动import。

//2.1.相同点：Java.util和Java.awt都是Java的标准库包  
//    不同点：Java.util通常包含的是一些工具类，如集合类中的List,Map,HashMap,Set， 
//    日期类Date，日历类Calender, 而java.awt则封装的是和图形绘制相关的类，如Point,Line等。


//3.Java Swing GUI 图形界面窗口开发基础教程，本教程将系统性地详细介绍 Java Swing 开发中常用的一些组件、
//   布局管理器等相关知识技术，并且每章节都将通过代码实例展示实际应用。
