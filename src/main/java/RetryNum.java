public class RetryNum {
    private int num;
    public RetryNum(int num)
    {
        this.num=num;
    }

    public boolean isRetryNum()
    {
        if(num<0)
            return false;
        int byNum=1;
        int initT=1;
//        System.out.println(byNum);
        while((num/initT)>=10)
        {
            initT*=10;
            byNum+=1;
            //System.out.println(byNum);
        }
//        System.out.println(initT);
//        System.out.println(byNum);
        int tmpNum=num;
        for(int index=0;index<byNum/2;index++)
        {
            System.out.println(tmpNum%10);
            System.out.println(tmpNum/initT);
            if(tmpNum%10!=tmpNum/initT)
                return false;
            else
            {
                tmpNum%=initT;
                tmpNum/=10;
                initT/=100;
            }
        }
        return true;
    }
}
