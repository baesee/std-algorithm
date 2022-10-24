public class SelectionSort {
    public static void main(String[] args){
        /**
         * 선택정렬은 효율이 좋지 못하다.
         * 가장 기본적인 알고리즘이라 진행
         */
        int[] target = {14, 12, 33, 6, 8, 1, 64, 87, 42, 17, 54, 22};

        // 스와핑 할 데이터를 담고 있을 임시 변수
        int temp = 0;
        // 타켓의 값들보다는 무조건 큰수여야 한다.
        int min = 0;
        // 스와핑 할 데이터의 인덱스 번호
        int index = 0;

        for (int i = 0 ; i < target.length ; i++){
            min = 99999;
            for (int j = i ; j < target.length; j++){
                if( min > target[j]){ // 담긴 값(Min)보다 작을 경우
                    min = target[j]; // 최소값에 해당 값을 넣는다.
                    index = j; // 해당 인덱스 값을 세팅
                    // i = 0 , j = 0,1,2... 반복적으로 루프를 돌면서 최소값이 정해진다.
                }
            }
            // j가 배열 길이만큼 다돌고 나면 최소값이 정해져있을테니 현재 i번째에 담긴 값을 임시 값에 저장
            temp = target[i];
            // i번째 위치(순차적으로 증가)에 j에서 루프돌면서 정해진 값을 넣는다.
            target[i] = target[index];
            // i번째에 원래 담겨있던 값을 최소값이 담겨있던 j인덱스로 넣는다.(스와핑)
            target[index] = temp;
        }

        for (int i = 0 ; i < target.length ; i++){
            System.out.println(target[i]);
        }
    }
}
