
public enum Mode {
	BMI(1), BFR(2), BMR(3), CI(4);
	
	private final int type;
	
	Mode(int type) {
		this.type = type;
	}
	
	public int getType() {
		return type;
	}

	public static Mode typeOf(int value) {
		switch (value) { // switch
		case 1:
			return BMI;
		case 2:
			return BFR;
		case 3: 
			return BMR;
		case 4: 
			return CI;
		}
		return null;
	}

}
