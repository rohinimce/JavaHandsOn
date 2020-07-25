package wrapperClassDemo;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner se=new Scanner(System.in);
		System.out.println("Enter your rollno");
        int rollno=se.nextInt();
        System.out.println("Enter your name");
        String name=se.next();
        System.out.println("Enter your fee");
        double fee=se.nextDouble();
        System.out.println("Rollno:"+rollno+"name:"+name+"fee:"+fee);
        se.close();//release the resource

	}

}
