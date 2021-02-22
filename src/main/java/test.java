
public class test {
	public static void main(String[] args) {
		int[][] intArray = new int[4][3];
		int num = 1;
		//입력부
		for(int i=0; i<intArray .length; i++) {
			if(i%2==0) {
			for(int j=0; j<intArray[i].length; j++) {
				intArray[i][j] = num++;
			  }			
			} else {
				for(int j=intArray[i].length-1; j>=0; j--) {
					intArray[i][j] = num++;
				}
			}
		}
		//출력부
		for(int i=0; i<intArray .length; i++) {
			for(int j=0; j<intArray[i].length; j++) {
				System.out.print(intArray[i][j]+"\t");
			  }System.out.println();		
		}
	}
}

class test2 {
	public static void main(String[] args) {
		int[] intArray = new int[5];
		int num = 1;
		for(int i=0; i<intArray.length; i++) {
			intArray[i] = num++;
			System.out.print(intArray[i]+"\t");
		}
	}
}

class test3 {
	public static void main(String[] args) {
		int[] intArray = new int[5];
		int num = 1;
		for(int i=intArray.length-1; i>=0; i--) {
			intArray[i] = num++;
		}
		for(int i=0; i<intArray.length; i++) {
			System.out.print(intArray[i]+"\t");
		}
	}
}

class car {
	String company = "현대자동차";
	String model = "그랜저";
	String color = "검정";
	int maxSpeed = 350;
	int speed;
}

/*
 * class CarExample { public static void main(String[] args) { Car myCar = new
 * Car(); System.out.println(myCar.company); System.out.println(myCar.model);
 * System.out.println(myCar.color); System.out.println(myCar.maxSpeed);
 * System.out.println(myCar.speed);
 * 
 * myCar.speed = 60; System.out.println(myCar.speed); } }
 */