public class LongestRetryDocSubSeq {
    private String str;
    public LongestRetryDocSubSeq(String str){
        this.str=str;
    }

    public int findLongest(){
        String tmpStr=str;
        tmpStr=tmpStr.replace("","#").trim();
        tmpStr="/"+tmpStr;
        tmpStr=tmpStr+"?";
        System.out.println(tmpStr);
        int[] p=new int[tmpStr.length()];
        //p[0]=1;
        int maxLen=0;
        int curCenter=0;
        int maxIndex=0;
        int maxR=0;
        p[0]=1;
        for(int index=1;index<tmpStr.length()-1;index++)
        {
         if(maxR>index)
         {
             p[index]=p[2*curCenter-index];
             if(p[2*curCenter-index]-1>=maxR-index)
             {
                 while(tmpStr.charAt(index+p[index])==tmpStr.charAt(index-p[index]))
                     p[index]++;
             }
         }
         else
         {
             p[index]=1;
             while(tmpStr.charAt(index+p[index])==tmpStr.charAt(index-p[index]))
                 p[index]++;
         }
         if(maxR<index+p[index]-1)
         {  maxR=index+p[index]-1;
            curCenter=index;}
         if(maxLen<p[index]-1)
         {
             maxLen=p[index]-1;
             maxIndex=index;
         }
        }
//        for(int each:p)
//        {
//            System.out.println(each);
//        }
        return maxLen;
    }
}
