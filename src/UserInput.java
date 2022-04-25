 // 자바프로그래밍 3분반 SW융합경제경영(정치외교학과) 32181516 문채원 

import java.util.Scanner;

public class UserInput {
	
	static Scanner scan = new Scanner(System.in);
	
	
	//gender 입력
	public static Gender getGender() {
		return Gender.valueOf(scan.nextLine());
	}
    
	//double형 입력
	public static double getDouble() {
		return Double.parseDouble(scan.nextLine());
	}
	
	//int형 입력
	public static int getInt() {
		return Integer.parseInt(scan.nextLine());
	}
	
	//Activity 입력
	public static Activity getActivity() {
		return Activity.valueOf(scan.nextLine());
	}
	
	//종료키
    public static boolean getExitKey(){
        System.out.print("Press q-key to exit or enter key to continue: ");
        String st = scan.nextLine();
        if (st.contentEquals("q")) return false;
        else return true;
    }
	
}
