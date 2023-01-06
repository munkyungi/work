package sample01;

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("hello java");
		
		//주석 -> 컴파일되지X
		/* 
		 * 범위주석문
		 */
		
		System.out.println("start java");
		
		System.out.print("good");
		
		System.out.print("자바");
		
		//기능: escape sequence
		// \n (개행), \b(backspace,커서한칸앞으로), \" , \t (띄어쓰기), \\
		
		System.out.print("World\n");
		System.out.println("Hello\b");
		
		System.out.println("\"Hello World\"");
		
		System.out.println("\tHello");
		System.out.println("\tWorld");
		
		System.out.println("\\World\\");
		
		//Format
		System.out.printf("%s \n", "Hello");

		System.out.println( 1024 );
		
		System.out.println("안녕"+"자바");
	}

}
