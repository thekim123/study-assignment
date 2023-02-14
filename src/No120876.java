import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class No120876 {
    public static void main(String[] args) {
        Solution4 app = new Solution4();
        int[][] test1 = {{0, 1}, {2, 5}, {3, 9}};
        int[][] test2 = {{-1, 1}, {1, 3}, {3, 9}};
        int[][] test3 = {{0, 5}, {3, 9}, {1, 10}};
        System.out.println(app.solution(test1));
        System.out.println(app.solution(test2));
        System.out.println(app.solution(test3));
    }
}

class Solution4 {
    public static int solution(int[][] lines) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int[] line : lines) {
            int start = Math.min(line[0], line[1]);
            int end = Math.max(line[0], line[1]);
            for (int i = start; i < end; i++) {
                map.merge(i, 1, Integer::sum);
            }
        }

        return (int) map.values().stream().filter(i -> i > 1).count();
    }
}
