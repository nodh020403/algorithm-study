import java.util.Scanner;

class Number implements Comparable<Number>{
    int value;

    Number(int value){
        this.value=value;
    }

    @Override
    public int compareTo(Number other){
        return this.value-other.value;
    }
}

public class Main {

    public static <T extends Comparable<T>> void sort(T[] arr){
         for (int i = 0; i < arr.length; i++) {
            for (int j=0; j<i; j++){
                if ((arr[i].compareTo(arr[j]))<0){
                    T temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();      // N개의 수
        Number[] arr = new Number[N];

        for (int i = 0; i < N; i++) {
            arr[i] = new Number(sc.nextInt());
        }
        sort(arr);

        for (int i = 0; i < N; i++) {
            System.out.println(arr[i].value); 
        }
    }
}