package Day19;

/**
 * @author lemon
 * @date 2022/2/6 12:24
 * @blog www.lemonws.top
 */
public class LC2109 {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < spaces.length; i++) {
            sb.insert(spaces[i] + i, ' ');
        }
        return sb.toString();
    }
}
