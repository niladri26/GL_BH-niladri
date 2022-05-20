package function;
import java.util.Scanner;
public class PrintName {
	
	public static void printMyName(String name){
		System.out.println(name);
		return;
	}
	
	public static void main(String[] args) {
		System.out.println("enter the name to print: ");
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		printMyName(name);
	}

}
