package stringPrograms;

import java.text.DecimalFormat;
import java.util.Arrays;

public class StringConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		stringToFloat();
	}


	public static void removeCharacterfromString(String str, char c){
		String replace=	str.replaceAll(Character.toString(c), "");
		replace.toUpperCase();
		System.out.println(replace);

	}

	public static void convertcharToString(){
		char[] c={'p','r','o','g','r','a','m'};
		String s= new String (c);
		String str=String.valueOf(c);
		StringBuilder sb= new StringBuilder();
		for(int i=0;i<c.length;i++)  {
			sb.append(c[i]);
		}
		System.out.println(s);
		System.out.println(str);
		System.out.println(sb.toString());
	}

	public static void convertStringToByte(){
		String str="1";
		Byte b= Byte.valueOf(str);
		Byte b1=Byte.parseByte(str);
		System.out.println(b);
		System.out.println(b1);

		String s="hello";
		byte[] b2=s.getBytes();
		System.out.println(Arrays.toString(b2));
	}

	public static void byteToString(){
		byte[] b="hello world".getBytes();
		String str= new String(b);
		System.out.println(str);
	}
	public static void stringToInteger(){
		String str="123";
		int i=Integer.parseInt(str);
		System.out.println(i);
	}

	public static void integerToString(){
		int i=123;
		String str=String.valueOf(i);
		System.out.println(str);

	}

	public static void stringToFloat(){
		String str="123";
		float f=Float.parseFloat(str);
		double d= Double.parseDouble(str);
		DecimalFormat df=new DecimalFormat("0.00");
		System.out.println(f);
		System.out.println(df.format(d));

	}







}
