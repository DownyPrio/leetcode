public class Int2Roma {
    private int num;
    public Int2Roma(int num){
        this.num=num;
    }
    public String int2roma()
    {
        String res="";
        if(num/1000>0)
        {
            for (int i=0;i<num/1000;i++)
                res+='M';
            num%=1000;
        }
        if(num/900>0)
        {
            res+="CM";
            num-=900;
        }
        if(num/500>0)
        {
            res+="D";
            num-=500;
        }
        if(num/400>0)
        {
            res+="CD";
            num-=400;
        }
        if(num/100>0)
        {for (int i=0;i<num/100;i++)
            res+='C';
        num%=100;
        }
        if(num/90>0)
        {
            res+="XC";
            num-=90;
        }
        if(num/50>0)
        {
            res+="L";
            num-=50;
        }
        if(num/40>0)
        {
            res+="XL";
            num-=40;
        }
        if(num/10>0)
        {
            for (int i=0;i<num/10;i++)
            res+='X';
            num%=10;
        }
        if(num/9>0)
        {
            res+="IX";
            num-=9;
        }
        if(num/5>0)
        {
            res+="V";
            num-=5;
        }
        if(num/4>0)
        {
            res+="IV";
            num-=4;
        }
        while(num>0)
        {
            res+='I';
            num--;
        }
        return res;
    }
}
