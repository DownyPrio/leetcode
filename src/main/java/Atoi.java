
public class Atoi {
    private String strSt;
    public Atoi(String str)
    {
        this.strSt=str;
    }

    public int atoiFunc()
    {
        String str=strSt.trim();
        int flag=1;
        int cur=0;
        for(int index=0;index<str.length();index++)
        {
            char tmpChar=str.charAt(index);
            if(index==0)
            {
                if(tmpChar=='-')
                    flag=-1;
                else if(tmpChar=='+')
                    flag=1;
                else if(tmpChar>='0'&&tmpChar<='9')
                {
                    cur+=tmpChar-'0';
                }
                else
                {
                    return (int)cur;
                }
            }
            else
            {
                if(tmpChar>='0'&&tmpChar<='9')
                {
                    if(flag*cur>Integer.MAX_VALUE/10)
                        return Integer.MAX_VALUE;
                    else if(flag*cur==Integer.MAX_VALUE/10)
                    {
                        if((tmpChar-'0')>Integer.MAX_VALUE%10)
                            return Integer.MAX_VALUE;
                    }
                        
                    else if(flag*cur<Integer.MIN_VALUE/10)
                        return Integer.MIN_VALUE;
                        
                    else if(flag*cur==Integer.MIN_VALUE/10)
                    {
                        //System.out.println(tmpChar-'0');
                        
                        if((tmpChar-'0')>8)
                            return Integer.MIN_VALUE;
                    }
                        
                    cur=cur*10+(tmpChar-'0');
                }
                else
                {
                    return (int)(flag*cur);
                }

            }
        }
        // if(flag*cur>Integer.MAX_VALUE)
        //     return Integer.MAX_VALUE;
        // else if(flag*cur<Integer.MIN_VALUE)
        //     return Integer.MIN_VALUE;
        return (int)(flag*cur);
    }
}
