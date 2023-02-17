import java.util.stream.Collectors;

public class No120911 {
}


class Solution7 {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        var stream = my_string.chars().mapToObj(i -> (char) Character.toLowerCase(i));
        stream.sorted().collect(Collectors.toList()).forEach(sb::append);
        return sb.toString();
    }
}