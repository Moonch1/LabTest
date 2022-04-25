import java.util.Scanner;

public class LabTest {

	public static void main(String[] args) {
		
		static void calculate(Mode mode, PersonData person) { //뭐 어쩌라
	        
	        for (Mode m : Mode.values()) {
	        	System.out.println(m);
	        }

	       /* for (Person ps : person.data) {
	        	System.out.println(ps);
	        }*/
		}
/*
		do {
			Scanner scan = new Scanner(System.in);
			System.out.println("모드를 선택하세요: "); //모드 선택
			switch(scan.nextInt()) { //MODE에서 정수값으로 구분
			case 1: //BMI(1)
				BMICalculator m = new BMICalculator();
				m.getUserInput();
				m.calculate();
				System.out.println(m);
				break;
			case 2: //BFP(2)
				BFPCalculator f = new BFPCalculator();
				f.getUserInput();
				f.calculate();
				System.out.println(f);
				break;
			case 3: //BMR(3)
				BMRCalculator r = new BMRCalculator();
				r.getUserInput();
				r.calculate();
				System.out.println(r);
				break;
			}
				}while(UserInput.getExitKey()); //q키 입력해 false 반환될 때까지
			
		}*/
		/*
		BMRCalculator ci = new CalorieIntakeCalculator(PersonData.data);
		ci.getUserInput();
		ci.calculate();
		System.out.println(ci);
		*/
	}

}
