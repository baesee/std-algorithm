import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort_2750 {
    public static void main(String[] args) {

        /**
         * 문제를 잘 읽자...
         * '첫째 줄에 수의 개수가 주어진다..','수는 중복되지 않는다'
         * 제대로 안 읽어서 개수 입력, 중복처리..
         */
        //Integer[] inputArray = {5, 5, 2, 3, 4, 1};
        int[] inputArray2 = {5, 5, 2, 3, 4, 1};
        int intputCount = 0;
        int tempValue = 0;
        int tempIndex = 0;
        int min = 0;

        /*
        // 중복제거 ( Set 이용 )
        // LinkedHashSet를 이용하여 중복 데이터를 제거 시킨다.
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>(Arrays.asList(inputArray));
        // 그 이후 다시 배열을 재생성
        Integer[] dupArray = lhs.toArray(new Integer[] {});

        for(int i = 0 ;i < dupArray.length ; i++){
            System.out.println(dupArray[i]);
        }
        */

        Scanner sc = new Scanner(System.in);
        intputCount = sc.nextInt(); // 배열 개수가 된다.

        int[] input = new int[intputCount];
        for(int i = 0 ; i < intputCount ; i++){
            input[i] = sc.nextInt();
        }

        // 중복제거 Strem.distinct() 사용
        int[] dupArray2 = Arrays.stream(input).distinct().toArray();

        /*
        int[] dupArray2 = Arrays.stream(input).distinct().sorted().toArray();
        */

        for(int i = 0 ;i < dupArray2.length ; i++){
            min = 9999;
            for (int j = i ; j < dupArray2.length ; j++){
                if( min > dupArray2[j]){
                    tempIndex = j;
                    min = dupArray2[j];
                }
            }
            tempValue = dupArray2[i];
            dupArray2[i] = dupArray2[tempIndex];
            dupArray2[tempIndex] = tempValue;
        }

        for(int x : dupArray2) {
            System.out.println(x);
        }
    }
}
