public class No120907 {
    public static void main(String[] args) {

        String[] quiz1 = {"3 - 4 = -3", "5 + 6 = 11"};
        String[] quiz2 = {"19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"};

        Solution2 s = new Solution2();
        for (String ans : s.solution(quiz1)) {
            System.out.print(ans);
        }
        System.out.println();

        for (String ans : s.solution(quiz2)) {
            System.out.print(ans);
        }
    }

}

class Solution2 {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for (int i = 0; i < quiz.length; i++) {
            String[] arr = quiz[i].split(" ");
            if (arr[1].equals("-"))
                answer[i] = Integer.parseInt(arr[0]) - Integer.parseInt(arr[2]) == Integer.parseInt(arr[4]) ? "O" : "X";
            else
                answer[i] = (Integer.parseInt(arr[0]) + Integer.parseInt(arr[2]) == Integer.parseInt(arr[4])) ? "O" : "X";
        }
        return answer;
    }
}
