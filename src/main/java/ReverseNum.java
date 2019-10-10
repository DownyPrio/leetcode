public class ReverseNum {
    private int num;
    public ReverseNum(int num){
        this.num=num;
    }
    public int Reverse(){
        System.out.println(Integer.MAX_VALUE);
        int flag=num>0? 1:-1;
        int tmpNum=Math.abs(num);
        int curVal=0;
        while(tmpNum>0)
        {
            if(curVal>Integer.MAX_VALUE/10 || (curVal==Integer.MAX_VALUE && tmpNum%10>7))
                return 0;
            curVal=curVal*10+tmpNum%10;
            tmpNum/=10;
        }
        return curVal*flag;
    }
}
