import java.util.HashSet;

public class StringQuestions {
    public String longestCommonPrefix(String[] strs) {
        HashSet<String> set = new HashSet<String>();
        String s = "";

        for (int i = 0; i < strs.length; i++) {
            s = strs[i];
            for (int j = i; j > s.length(); j++) {
                System.out.println(strs[i]);
                if (set.contains(s)) {
                    System.out.println(s + " 2 2");
                    return s;
                }
                System.out.println(s);
                set.add(s);
            }

        }
        System.out.println(set);
        return s;
    }
}
