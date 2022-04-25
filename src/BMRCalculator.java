 // 자바프로그래밍 3분반 SW융합경제경영(정치외교학과) 32181516 문채원 
public class BMRCalculator extends HealthCalculator {

	
	int age;
	Gender gender; //cm
	double weight; //kg
	double height; //cm
	
	
	
	//생성자
	public BMRCalculator(int age, Gender gender, double weight, double height) {
		super();
		this.age = age;
		this.gender = gender;
		this.weight = weight;
		this.height = height;
	}


	public BMRCalculator() {
	}


	//getter setter
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	
	//생성자
	@Override
	public String toString() {
		return "BMRCalculator [age=" + age + ", gender=" + gender + ", weight=" + weight + ", height=" + height + ", BMR=" + calculate() + "]";
	}


	@Override
	public double calculate() {
		double BMR;
		
		if(gender == gender.FEMALE)
			BMR = 655.0955 + (9.5634 * weight) + (1.8496 * height) - (4.6756 * age);
		else
			BMR = 66.4730 + (13.7516 * weight) + (5.0033 * height) - (6.7550 * age);
			
		return BMR;
	}

	@Override
	public void getUserInput() {
		
		System.out.println("나이를 입력하세요: ");
		this.age = UserInput.getInt();
		System.out.println("성별을 입력하세요(여자는 FEMALE, 남자는 MALE): ");
		this.gender = UserInput.getGender();
		System.out.println("체중(kg)을 입력하세요: ");
		this.weight = UserInput.getDouble();
		System.out.println("키(cm)를 입력하세요: ");
		this.height = UserInput.getDouble();
		
		
	}

	

}
