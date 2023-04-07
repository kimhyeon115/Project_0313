package Package_1;

import java.util.Scanner;

//class Key {
//	static void sumInfo(int x, int y) {
//		int sum = 0;
//		sum = x + y; 
//		System.out.println("두수의 합은:"+sum);
//	}	
//	static void mulInfo(int x, int y) {
//		int mul = 0;
//		mul = x * y;
//		System.out.println("두수의 곱은:"+mul);
//	}
//}
class Key {
	int x,y;
	int add(int x, int y) {
		return (x + y);
	}
	int mul(int x, int y) {
		return (x * y);
	}
	void showInfo() {
		System.out.println("두수의 합은:"+add(x,y));
		System.out.println("두수의 곱은:"+mul(x,y));
	}
}
class Input extends Key {
	
	static void inputInfo() {
	Scanner scn = new Scanner(System.in);
	Key key = new Key();
	System.out.println("첫번째 입력");
	key.x = scn.nextInt();
	System.out.println("두번째 입력");
	key.y = scn.nextInt();
//	sumInfo(x,y);
//	mulInfo(x,y);
	key.showInfo();
	}
}

public class Keybord {

	public static void main(String[] args) {
		Input.inputInfo();
	}
}
