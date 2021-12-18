
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main2 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static ArrayList<Integer> list = new ArrayList<>();

	static void push(int x) {
		list.add(x);
	}

	static void pop() {
		System.out.println(list.isEmpty()? "-1" : list.remove(0));
	}

	static void size() {
		System.out.println( list.size());
	}

	static void empty() {
		System.out.println( list.isEmpty() ? 1 : 0);
	}

	static void front() {
		System.out.println(list.isEmpty() ? -1 : list.get(0));
	}

	static void back() {
		System.out.println(list.isEmpty() ? -1 : list.get(list.size() - 1));
	}

	public static void main(String[] args) throws Exception {
		StringTokenizer st = new StringTokenizer(br.readLine());
		int j = Integer.parseInt(st.nextToken());
		for (int i = 0; i < j; i++) {
			st=new StringTokenizer(br.readLine());
			switch (st.nextToken()) {
			case "push":
				push(Integer.parseInt(st.nextToken()));
				break;
			case "pop":
				pop();
				break;
			case "size":
				size();
				break;
			case "empty":
				empty();
				break;
			case "front":
				front();
				break;
			case "back":
				back();
				break;
			}
		}
	}
}
