 // 자바프로그래밍 3분반 SW융합경제경영(정치외교학과) 32181516 문채원 
import java.util.Scanner;

public class CalorieIntakeCalculator extends BMRCalculator {

	Activity activity; //Activity 새로운 멤버변수 추가
	protected double BMR;

	//생성자
	
	public CalorieIntakeCalculator(int age, Gender gender, double weight, double height, Activity activity) {
		//super(age, gender, weight, height);
		this.age = age;
		this.gender = gender;
		this.weight = weight;
		this.height = height;
		this.activity = activity;
	}
	
	//디폴트 생성자
	public CalorieIntakeCalculator() {
	}

	
	//getter setter
	public Activity getActivity() {
		return activity;
	}

	public void setActivity(Activity activity) {
		this.activity = activity;
	}
	
	
	
	@Override
	public String toString() {
		return "CI [activity=" + activity + ", age=" + age + ", gender=" + gender
				+ ", weight=" + weight + ", height=" + height + ", BMR=" + calculate() + "]";
	}



	Scanner scan = new Scanner(System.in);
	
	@Override
	public double calculate() {
		
		if(gender == gender.FEMALE) //여성이면
			BMR = 655.0955 + (9.5634 * weight) + (1.8496 * height) - (4.6756 * age);
		else
			BMR = 66.4730 + (13.7516 * weight) + (5.0033 * height) - (6.7550 * age);
	
		switch (activity) { //enum 입력에 따라
		case SEDENTARY: return BMR*1.2;
		case LIGHTLY_ACTIVE: return BMR*1.375;
		case MODERATELY_ACTIVE: return BMR*1.55;
		case VERY_ACTIVE: return BMR*1.725;
		case EXTRA_ACTIVE: return BMR*1.9;
		default: return BMR;
		}
		
	}
	
	@Override
	public void getUserInput() {
		
		System.out.println("활동 수준을 입력하세요 (1)SEDENTARY (2)LIGHTLY_ACTIVE (3)MODERATELY_ACTIVE (4)VERY_ACTIVE (5)EXTRA_ACTIVE : ");
		this.activity = UserInput.getActivity();
		
		
	}
	
	
}
