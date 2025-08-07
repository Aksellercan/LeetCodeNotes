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

    public int LengthOfLastWord(String s) {
        String[] str = s.split(" ");
        return str[str.length-1].length();
    }
}
