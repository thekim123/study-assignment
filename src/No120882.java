import java.util.Arrays;

public class No120882 {
    public static void main(String[] args) {
        Solution3 s = new Solution3();
        int[][] test1 = {{80, 70}, {90, 50}, {40, 70}, {50, 80}};
        int[][] test2 = {{80, 70}, {70, 80}, {30, 50}, {90, 100}, {100, 90}, {100, 100}, {10, 30}};

        for (int a : s.solution(test1)) {
            System.out.print(a + " ");
        }

        System.out.println();
        for (int a : s.solution(test2)) {
            System.out.print(a + " ");
        }
    }

}

class Solution3 {
    public static int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        int[] record = new int[score.length];

        for (int i = 0; i < score.length; i++) {
            record[i] = score[i][0] + score[i][1];
        }

        for (int i = 0; i < record.length; i++) {
            int count = 1;
            for (int j = 0; j < record.length; j++) {
                if (record[i] < record[j]) {
                    count++;
                }
            }
            answer[i] = count;
        }
        return answer;
    }
}
