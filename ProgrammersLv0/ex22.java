package ProgrammersLv0;

public class ex22 {
    public static void main(String[] args) {
        String my_string = "abcdefg";
        String letter = "f";
        System.out.println(solution(my_string,letter));
    }

    private static String solution(String my_string, String letter) {
        String answer = "";
        answer = my_string.replace(letter, "");
        return answer;
    }
}
