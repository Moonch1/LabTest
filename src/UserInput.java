 // �ڹ����α׷��� 3�й� SW���հ����濵(��ġ�ܱ��а�) 32181516 ��ä�� 

import java.util.Scanner;

public class UserInput {
	
	static Scanner scan = new Scanner(System.in);
	
	
	//gender �Է�
	public static Gender getGender() {
		return Gender.valueOf(scan.nextLine());
	}
    
	//double�� �Է�
	public static double getDouble() {
		return Double.parseDouble(scan.nextLine());
	}
	
	//int�� �Է�
	public static int getInt() {
		return Integer.parseInt(scan.nextLine());
	}
	
	//Activity �Է�
	public static Activity getActivity() {
		return Activity.valueOf(scan.nextLine());
	}
	
	//����Ű
    public static boolean getExitKey(){
        System.out.print("Press q-key to exit or enter key to continue: ");
        String st = scan.nextLine();
        if (st.contentEquals("q")) return false;
        else return true;
    }
	
}
