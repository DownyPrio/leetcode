import java.util.HashSet;
import java.util.Set;

public class LongestNonReSubSeq {
    private String str;

    public LongestNonReSubSeq(String str) {
        this.str = str;
    }

    public int findLengthOfSubSeq() {
		if(str.length()==0)
			return 0;
        if (str.length() == 1)
            return 1;
        int indexFirst = 0;
        int indexSecond = 1;
        int maxlen = 1;
        char first = str.charAt(0);
        while (indexSecond < str.length()) {
            String subStr = str.substring(indexFirst, indexSecond);
            if (subStr.indexOf(str.charAt(indexSecond)) >= 0) {
                maxlen = indexSecond - indexFirst > maxlen ? indexSecond - indexFirst : maxlen;
                indexFirst = indexFirst + subStr.indexOf(str.charAt(indexSecond)) + 1;
                indexSecond++;
            }
            else {
                maxlen = indexSecond - indexFirst+1 > maxlen ? indexSecond - indexFirst+1: maxlen;
                indexSecond++;
            }
        }
        return maxlen;
    }
}
