
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static ArrayList<Integer> list = new ArrayList<>();

	static void push(int x) {
		list.add(x);
	}

	static int pop() {
		return list.isEmpty()? -1 : list.remove(list.size()-1);
	}

	static void sum() {
		int sum=0;
		for(int i=0; i<list.size();i++) {
			sum+=list.get(i);
		}
		System.out.println(sum);
	}
	

	public static void main(String[] args) throws Exception {
		StringTokenizer st = new StringTokenizer(br.readLine());
		int j = Integer.parseInt(st.nextToken());
		for (int i = 0; i < j; i++) {
			st=new StringTokenizer(br.readLine());
			int num=Integer.parseInt(st.nextToken());
			if(num==0) {
				pop();
			}else {
				push(num);
			}	
		}
		sum();
	}
}
