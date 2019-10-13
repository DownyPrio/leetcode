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
        // System.out.println(tmpStr);
        int[] p=new int[tmpStr.length()];
        // System.out.println(tmpStr);
        //p[0]=1;
        p[0]=1;
        p[1]=1;
        int maxStart=1;
        int maxR=1;
        int maxLen=1;
        int curCenter=1;
        for(int index=2;index<p.length-1;index++)
        {
            p[index]=1;
            if(index<maxR)
            {
                
                
                
                if(p[2*curCenter-index]>=maxR-index+1)
                {
                    p[index]=maxR-index+1;
                    while(tmpStr.charAt(index+p[index])==tmpStr.charAt(index-p[index]))
                        p[index]++;
                //     System.out.println("index:"+index);
                // System.out.println("p:"+p[index]);
                    
                }
                else
                {p[index]=p[2*curCenter-index];}
                if(index+p[index]-1>maxR)
                {maxR=index+p[index]-1;
                curCenter=index;}
                    
                
            }
            else
            {
                
                while(tmpStr.charAt(index+p[index])==tmpStr.charAt(index-p[index]))
                        p[index]++;
                maxR=index+p[index]-1;
                curCenter=index;
                // System.out.println("index:"+index);
                // System.out.println("p:"+p[index]);
            }
            
        }
        
        for(int index=1;index<p.length;index++)
        {
            maxStart=p[index]>maxLen? index:maxStart;
            maxLen=p[index]>maxLen? p[index]:maxLen;
            
            
        }
        // for(int rach:p)
        //     System.out.print(rach);
        // System.out.println();
        // System.out.println(maxIndex);
        // System.out.println(maxLen);
        // System.out.println(maxStart);
        // int R=maxLen;
        maxLen=maxLen-1;
        maxStart=(maxStart-maxLen-1)/2;
        return s.substring(maxStart,maxStart+maxLen);
    }
}
