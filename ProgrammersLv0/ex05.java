package ProgrammersLv0;

public class ex05 {
    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 3;
        System.out.println(solution(num1,num2));
    }

    private static int solution(int num1, int num2) {
        if(num1 == num2){
            return 1;
        }
        else{
            return -1;
        }
    }
}
