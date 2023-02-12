package org.tnsif.stringdemo;
//program to demonstrate on StringBuffer
public class StringBufferDemo {

	public static void main(String[] args) {
		// length vs capacity
		StringBuffer sb=new StringBuffer("Sakshi");
		System.out.println(sb);
		//16 + length of the string i.e 6 = 22
		System.out.println(sb.capacity());
		System.out.println(sb.length());

		
		String str;
		int a=34;
		sb=new StringBuffer(40);
		str=sb.append(a).toString();
		System.out.println(str);
		System.out.println(sb);    //34
		System.out.println(sb.reverse()); // 43
		
	}

}
