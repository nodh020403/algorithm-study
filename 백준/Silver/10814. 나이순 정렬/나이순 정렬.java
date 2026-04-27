import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		List<Member> members= new ArrayList<>();
		for(int i=0;i<N;i++) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			int age=Integer.parseInt(st.nextToken());
			String name=st.nextToken();
			members.add(new Member(i, age, name));
		}
		Collections.sort(members,(a,b)->{
			return Integer.compare(a.age, b.age);
		});
		
		StringBuilder sb = new StringBuilder();
		for(Member m:members) {
			sb.append(m.age).append(" ").append(m.name).append("\n");
		}
		System.out.println(sb);
	}
}

class Member{
	int id;
	int age;
	String name;
	public Member(int id, int age, String name) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
	}
}
