import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Greedy_2839_2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int count = 0;

        while(true) {
            if(N%5==0) {
                count += N / 5;
                System.out.println(count);
                break;
            }
            else {
                N -= 3;
                count++;
            }

            if(N<0) {
                System.out.println("-1");
                break;
            }
        }
    }
}