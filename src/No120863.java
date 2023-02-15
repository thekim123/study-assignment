import java.util.StringTokenizer;

public class No120863 {
    public static void main(String[] args) {
        Solution5 s = new Solution5();
        System.out.println(s.solution("3x + 7 + x"));
        System.out.println(s.solution("x + x + x"));
        System.out.println(s.solution("33x + x + x + 99x + 35"));
        System.out.println(s.solution("35"));
        System.out.println(s.solution("x"));
        System.out.println(s.solution("x + 1"));

    }
}

class Solution5 {
    public String solution(String polynomial) {
        StringTokenizer st = new StringTokenizer(polynomial, " + ");
        String[] arr;
        int[] temp = new int[2];
        String line;
        while (st.hasMoreTokens()) {
            line = st.nextToken();
            if (line.contains("x")) {
                if (line.length() == 1) temp[0] += 1;
                else temp[0] += Integer.parseInt(line.split("x")[0]);
            } else {
                temp[1] += Integer.parseInt(line);
            }
        }

        String result = "";
        if (temp[0] == 0) {
            return String.valueOf(temp[1]);
        }
        if (temp[0] == 1) {
            result = "x";
        } else {
            result = temp[0] + "x";
        }

        if (temp[1] != 0) {
            result += " + " + temp[1];
        }

        return result;
    }
}
