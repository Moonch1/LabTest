 // 자바프로그래밍 3분반 SW융합경제경영(정치외교학과) 32181516 문채원 
import java.util.Scanner;

public class BFPCalculator extends HealthCalculator {

	
	private Gender gender; //FEMALE, MALE 열거형
	private double height; //cm
	private double neck; //cm
	private double waist; //cm
	private double hip; //cm
	
	//생성자
	public BFPCalculator(Gender female, double height, double neck, double waist, double hip) {
		gender = female;
		this.height = height;
		this.neck = neck;
		this.waist = waist;
		this.hip = hip;
		
	}
	
	//디폴트 생성자
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

	
	//toString BFP 출력
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
		
		System.out.println("성별을 입력하세요(여자는 FEMALE, 남자는 MALE): ");
		this.gender = UserInput.getGender();
		System.out.println("키(cm)를 입력하세요: ");
		this.height = UserInput.getDouble();
		System.out.println("목 둘레(cm)를 입력하세요: ");
		this.neck = UserInput.getDouble();
		System.out.println("허리 둘레(cm)를 입력하세요: ");
		this.waist = UserInput.getDouble();
		System.out.println("엉덩이 둘레(cm)를 입력하세요: ");
		this.hip = UserInput.getDouble();

		
	}



}
