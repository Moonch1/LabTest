 // 자바프로그래밍 3분반 SW융합경제경영(정치외교학과) 32181516 문채원 
import java.util.Scanner;

public class BMICalculator extends HealthCalculator {

	
	private double weight; //kg
	private double height; //cm
		
	
		
	//생성자
	public BMICalculator() { 
	}
		
	public BMICalculator(double weight, double height) {
	       this.weight = weight;
	       this.height = height;
	   }

		
	//Getter-Setter
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


	//toString
	public String toString() {
		return "BMI = [weight=" + weight + ", height=" + height + ", BMI= " + calculate() + "]";
	}
		


	static Scanner scan = new Scanner(System.in);
	static Scanner scan2 = new Scanner(System.in);
	
	
	@Override
	public void getUserInput() {
		
		System.out.println("체중(kg)을 입력하세요: ");
		weight = scan.nextDouble();
		System.out.println("키(cm)를 입력하세요: ");
		height = scan2.nextDouble();

	}
	
	
	@Override
	public double calculate() {
		
		double BMI = weight/(height*0.01)/(height*0.01);
		
		return BMI;
	}

	

}
