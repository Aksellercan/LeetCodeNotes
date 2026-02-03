public class StringQuestions {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder result = new StringBuilder();
        if (strs.length == 0) return "";
        if (strs.length == 1) return strs[0];
        if (strs.length == 2) { if((strs[0].equals("")) || (strs[1].equals(""))) { return ""; } if (strs[0].equals(strs[1])) return strs[0]; }
        for (int i = 0; i < strs.length; i++){
            if (strs.length == i+1) {
                break;
            }
            if (strs[i].equals("")) {
                return "";
            }
            result.setLength(0);
            int shortestLength;
            if (strs[i].length() > strs[i+1].length()) { shortestLength = strs[i+1].length(); } else { shortestLength = strs[i].length(); }
            for (int j = 0; j < shortestLength; j++){
                if (strs.length == i+1) { break; }
                if (strs[i].charAt(j) == strs[i+1].charAt(j)){
                    result.append(strs[i+1].charAt(j));
                } else {
                    System.out.println("values " + strs[i].charAt(0) + " and " + strs[i+1].charAt(0));
                    if (strs[i].charAt(0) != strs[i+1].charAt(0)){ return ""; }
                    //return result.toString();\
                    break;
                }
            }
        }
        return result.toString();
    }

    public String longestCommonPrefixV2(String[] strs) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strs.length; i++) {
            if (i+1 == strs.length) break;
            StringBuilder stringBuilder = new StringBuilder();
            for (int j = 0; j < strs[i].length(); j++) {
                if (j + 1 > strs[i+1].length()) break;
                System.out.println("j is " + j + " i is " + i);
                System.out.printf("1st string %s 2nd string %s", strs[i], strs[i+1]);
                System.out.printf(" 1st string char %c 2nd string char %c\n", strs[i].charAt(j), strs[i+1].charAt(j));
                if (strs[i].charAt(j) == strs[i+1].charAt(j)) {
                    sb.append(strs[i].charAt(j));
                    stringBuilder.append(strs[i].charAt(j));
                } else {
                    sb = stringBuilder;
                    break;
                }
            }
            if (sb.isEmpty()) break;
        }
        return sb.toString();
    }

    public String longestCommonPrefixV3(String[] strs) {
        StringBuilder sb = new StringBuilder();
        int charIndex = 0;
        for (int i = 0; i < strs.length; i++) {

        }
        return sb.toString();
    }


    public int LengthOfLastWord(String s) {
        String[] str = s.split(" ");
        return str[str.length-1].length();
    }
}
