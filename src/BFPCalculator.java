 // �ڹ����α׷��� 3�й� SW���հ����濵(��ġ�ܱ��а�) 32181516 ��ä�� 
import java.util.Scanner;

public class BFPCalculator extends HealthCalculator {

	
	private Gender gender; //FEMALE, MALE ������
	private double height; //cm
	private double neck; //cm
	private double waist; //cm
	private double hip; //cm
	
	//������
	public BFPCalculator(Gender female, double height, double neck, double waist, double hip) {
		gender = female;
		this.height = height;
		this.neck = neck;
		this.waist = waist;
		this.hip = hip;
		
	}
	
	//����Ʈ ������
	public BFPCalculator() {
	       this(Gender.FEMALE, 0d, 0d, 0d, 0d);
	   }


	//Getter-Setter
	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getNeck() {
		return neck;
	}

	public void setNeck(double neck) {
		this.neck = neck;
	}

	public double getWaist() {
		return waist;
	}

	public void setWaist(double waist) {
		this.waist = waist;
	}

	public double getHip() {
		return hip;
	}

	public void setHip(double hip) {
		this.hip = hip;
	}

	
	//toString BFP ���
	public String toString() {
		return "BFPCalculator [gender=" + gender + ", height=" + height + ", neck=" + neck + ", waist=" + waist
					+ ", hip=" + hip + ", BFP=" + calculate() + "]";
	}
	
	
	@Override
	public double calculate() {
		
		double BFP;
		
		if(gender == gender.FEMALE)
			BFP = 495 / (1.29579 - .35004 * Math.log10(waist + hip - neck) + 0.22100 * Math.log10(height)) - 450;
		else
			BFP = 495 / (1.29579 - .35004 * Math.log10(waist - neck) + 0.22100 * Math.log10(height)) - 450;
			
		return BFP;
	}

	static Scanner scan = new Scanner(System.in);
	
	@Override
	public void getUserInput() {
		
		System.out.println("������ �Է��ϼ���(���ڴ� FEMALE, ���ڴ� MALE): ");
		this.gender = UserInput.getGender();
		System.out.println("Ű(cm)�� �Է��ϼ���: ");
		this.height = UserInput.getDouble();
		System.out.println("�� �ѷ�(cm)�� �Է��ϼ���: ");
		this.neck = UserInput.getDouble();
		System.out.println("�㸮 �ѷ�(cm)�� �Է��ϼ���: ");
		this.waist = UserInput.getDouble();
		System.out.println("������ �ѷ�(cm)�� �Է��ϼ���: ");
		this.hip = UserInput.getDouble();

		
	}



}
