package ProgrammersLv0;

import java.util.Arrays;

public class ex21 {
    public static void main(String[] args) {
        int[] num_list ={1,2,3,4,5};
        System.out.println(Arrays.toString(solution(num_list)));
    }


    public static int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];

        int a = 0;
        for(int i = num_list.length-1; i>=0; i--){
            answer[a++] = num_list[i];
        }
        return answer;
    }
}
