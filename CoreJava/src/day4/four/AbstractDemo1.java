package day4.four;

import java.util.Scanner;

abstract class Book{
	
	String title;
	
	// abstract method-[Non-Static Method]
	abstract void setTitle(String s);
	
	//concrete method
	String getTitle() {
		return title;
	}	
}

class MyBook extends Book{

	@Override
	void setTitle(String s) {
		// TODO Auto-generated method stub
		title = s;
	}
	
}

public class AbstractDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the title of the book");
		String title = sc.nextLine();
		MyBook myBook = new MyBook();
		myBook.setTitle(title);
		String result = myBook.getTitle();
		System.out.println("the title of the book-->" + result);
		sc.close();
	}

}
