public class PatternMatch {
    private String str_template,str_test;
    public PatternMatch(String str_1,String str_2){
        this.str_template=str_1;
        this.str_test=str_2;
    }

    public boolean isPatternMatch()
    {
        int temp=0;
        int test=0;
        return PatMatch(str_test,str_template,temp,test);

    }
    public boolean PatMatch(String s1,String s2,int i1,int i2)
    {
//        System.out.println("i1:");
//        System.out.println(i1);
//        System.out.println("i2:");
//        System.out.println(i2);
        if(i1==s1.length()&&i2==s2.length())
        {
            //System.out.println("1");
            return true;}
        else if(i1==s1.length()||i2==s2.length())
        {
            //System.out.println("2");
            return false;}
        if((s1.charAt(i1)!=s2.charAt(i2))&&(s2.charAt(i2)!='.'))
        {
            //System.out.println(s1.charAt(i1));
            //System.out.println(s2.charAt(i2));
            if(i2==s2.length()-1||s2.charAt(i2+1)!='*')
            {
                //System.out.println("3");
                return false;}
            else
            {
                //System.out.println("4");
                return PatMatch(s1,s2,i1,i2+2);
            }
        }
        else
        {
            if(i2!=s2.length()-1&&s2.charAt(i2+1)=='*')
            {
               // System.out.println("5");
                return PatMatch(s1,s2,i1,i2+2)||PatMatch(s1,s2,i1+1,i2)||PatMatch(s1,s2,i1+1,i2+2);
            }
            else
            {
                //System.out.println("6");
                return PatMatch(s1,s2,i1+1,i2+1);
            }
        }

    }
}
