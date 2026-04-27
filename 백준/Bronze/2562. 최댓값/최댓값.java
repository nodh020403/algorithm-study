import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Stats {
    int max=0;
    int number=0;
    void update(int x, int num) {
    	if(x>max) {
    		max=x;
    		number=num;
    	}
    }
}

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stats s1 = new Stats();
		for (int i = 0; i < 9; i++) {
            s1.update(Integer.parseInt(br.readLine()),(i+1));
        }
		System.out.println(s1.max);
		System.out.println(s1.number);
		
	}

}
