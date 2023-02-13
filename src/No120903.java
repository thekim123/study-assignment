import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class No120903 {

    public static void main(String[] args) throws IOException {
        Solution1 s = new Solution1();
        String[] s1 = {"a", "b", "c"};
        String[] s2 = {"com", "b", "d", "p", "c"};
        System.out.println(s.solution(s1, s2));

        String[] s3 = {"n", "omg"};
        String[] s4 = {"m", "dot"};
        System.out.println(s.solution(s3, s4));

    }

}

class Solution1 {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        List<Set> arr = new ArrayList<>();
        Set<String> set = new HashSet<>();
        for (String s : s1) {
            set.add(s);
        }
        for (String s : s2) {
            if (set.contains(s)) {
                answer++;
            }
        }
        return answer;
    }
}


