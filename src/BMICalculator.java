 // �ڹ����α׷��� 3�й� SW���հ����濵(��ġ�ܱ��а�) 32181516 ��ä�� 
import java.util.Scanner;

public class BMICalculator extends HealthCalculator {

	
	private double weight; //kg
	private double height; //cm
		
	
		
	//������
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
		
		System.out.println("ü��(kg)�� �Է��ϼ���: ");
		weight = scan.nextDouble();
		System.out.println("Ű(cm)�� �Է��ϼ���: ");
		height = scan2.nextDouble();

	}
	
	
	@Override
	public double calculate() {
		
		double BMI = weight/(height*0.01)/(height*0.01);
		
		return BMI;
	}

	

}
