import java.util.concurrent.atomic.AtomicInteger;

public class No120956 {
    public static void main(String[] args) {
        Solution s = new Solution();
        String[] input1 = {"aya", "yee", "u", "maa", "wyeoo"};
        System.out.println(s.solution(input1));
        String[] input2 = {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"};
        System.out.println(s.solution(input2));
    }

    private static class Solution {

        public int solution(String[] babbling) {
            AtomicInteger answer = new AtomicInteger();

            for (String b : babbling) {
                if (b.contains("ayaaya") || b.contains("yeye") || b.contains("woowoo") || b.contains("mama")) {
                    continue;
                }

                b = b.replace("aya", " ");
                b = b.replace("ye", " ");
                b = b.replace("woo", " ");
                b = b.replace("ma", " ");
                b = b.replace(" ", "");

                if (b.length() == 0) {
                    answer.getAndIncrement();
                }

            }
            return answer.get();
        }


    }

}
