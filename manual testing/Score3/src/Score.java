import java.io.*;
import java.util.Scanner;



public class Score {

	public static void main(String[] args)throws IOException {
        Grade grade = new Grade();
		Scanner sc = new Scanner(System.in); 
		System.out.print("請輸入成績(0~100)數字: "); 
		int number = sc.nextInt(); 
		System.out.println("您輸入的分數: " + number ); 
		System.out.println("grade:" +  Grade.letterGrade(number));
		} 
	
	}


