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
        long cur=0;
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
                    cur=cur*10+(tmpChar-'0');
                }
                else
                {
                    return (int)(flag*cur);
                }

            }
        }
        return (int)(flag*cur);
    }
}
