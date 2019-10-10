public class zShapeString {
    private String str;
    private int num;
    public zShapeString(String str,int num){
        this.str=str;
        this.num=num;
    }
    public String testZStr() {
        String res = "";
        for (int i = 0; i < num; i++) {
            String tmpStr = "";
            if (i == 0) {
                int k = 0;
                while (k * (2 * num - 2) < str.length()) {
                    tmpStr += str.charAt(k * (2 * num - 2));
                    k++;
                }
            } else if (i == num - 1) {
                int k = 0;
                while (k * (2 * num-2 )+num-1 < str.length()) {
                    tmpStr += str.charAt(k * (2 * num-2 )+num-1);
                    k++;
                }
            } else {
                int k = 0;
                while ((k+1) * (2 * num - 2 )- i < str.length() || k * (2 * num - 2)  + i< str.length()) {
                    tmpStr += str.charAt(k * (2 * num - 2 )+ i);
                    if ((k+1) * (2 * num - 2 )- i  < str.length()) {
                        tmpStr += str.charAt((k+1) * (2 * num - 2 )- i );
                    }
                    k++;
                }
            }
            //System.out.println(tmpStr);
            res+=tmpStr;
        }
        return res;
    }
}
