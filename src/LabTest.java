import java.util.Scanner;

public class LabTest {

	public static void main(String[] args) {
		
		static void calculate(Mode mode, PersonData person) { //�� ��¼��
	        
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
			System.out.println("��带 �����ϼ���: "); //��� ����
			switch(scan.nextInt()) { //MODE���� ���������� ����
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
				}while(UserInput.getExitKey()); //qŰ �Է��� false ��ȯ�� ������
			
		}*/
		/*
		BMRCalculator ci = new CalorieIntakeCalculator(PersonData.data);
		ci.getUserInput();
		ci.calculate();
		System.out.println(ci);
		*/
	}

}
