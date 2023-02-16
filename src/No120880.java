import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class No120880 {

    public static void main(String[] args) {
        Solution6 s = new Solution6();
        int[] input = {1, 2, 3, 4, 5, 6};
        s.solution(input, 4);
        int[] input1 = {10000, 20, 36, 47, 40, 6, 10, 7000};
        s.solution(input1, 4);

    }
}

class Solution6 {
    public int[] solution(int[] numlist, int n) {
        List<Integer> arrList = Arrays.stream(numlist).boxed().collect(Collectors.toList());
        arrList.sort((o1, o2) -> {
            int o1Abs = Math.abs(o1 - n);
            int o2Abs = Math.abs(o2 - n);

            if (o1Abs == o2Abs) {
                if (o1 > o2) return -1;
                else if (o1 < o2) return 1;
            } else {
                return o1Abs - o2Abs;
            }
            return 0;
        });
        int[] answer = arrList.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}