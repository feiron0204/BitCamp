import java.util.Scanner;

public class change {
	static int UNIT;
	static int NUM;
	static int SW;
	static Scanner scanner;
	static {
		UNIT = 10000;
		scanner = new Scanner(System.in);
	}

	public static void main(String[] args) {
		int money = scanner.nextInt();
		while (true) {
			NUM = money / UNIT;
			System.out.println(UNIT + " " + NUM + "개");
			if (UNIT > 1) {
				money = money - UNIT * NUM;
				if (SW == 0) {
					UNIT=UNIT/2;
					SW=1;
				} else {
					UNIT=UNIT/5;
					SW=0;	
				}
			} else {
				break;
			}
		}
		scanner.close();
	}
}
