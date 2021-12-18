import java.util.Scanner;

public class Ex07_String_Total_Quiz {
	static boolean check(String num) {
		//14자리 인지만 확인하는 코드
		//return num.length() == 14;

		// 정규표현식으로 기능 1,2 한번에 해결
		return num.matches("^[0-9]{6}-[1-4][0-9]{6}$");
		
	}

//	static boolean backNum(String num) {
//		return num.charAt(7) >= '1' && num.charAt(7) <= '4';
//	}

	static void gender(String num) {
		switch (num.charAt(7)) {
		case '1':
		case '3':
			System.out.println("남자");
			break;
		case '2':
		case '4':
			System.out.println("여자");
			break;
		default:
			break;
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("주민번호 13자리를 입력하세요.");
		String num=scanner.nextLine();
		while(!check(num)) {
			System.out.println("양식이 잘못되었습니다. 다시입력해주세요");
			num=scanner.nextLine();
		}
		gender(num);
		scanner.close();
	}
}
