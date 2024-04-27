import java.util.Scanner;
import java.util.*;
public class mains{
	
	public static void pass(){
		System.out.println("you passed!!");
	}
	public static void fail(){
		System.out.println("you failed try again");
	}
	public static void excellent(){
		System.out.println("you scored above 95!! and you are the topper of the class ");

	}
	public static void zero(){
		System.out.println("you got a 0 ");
	}

	public static void main(String[] args){
		Scanner grades=new Scanner(System.in);
		System.out.println("please enter your marks in the test ");
		String marks;
		marks = grades.nextLine();
		int acmarks = Integer.parseInt(marks);
		if(acmarks==40){
			pass();
		if(acmarks<40){
			fail();
		}
		if(acmarks>=95){
			excellent();	
		}
		if(acmarks==0){
			zero();
		}
		}
	}


}
