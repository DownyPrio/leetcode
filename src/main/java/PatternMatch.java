public class PatternMatch {
    private String str_template,str_test;
    public PatternMatch(String str_1,String str_2){
        this.str_test=str_1;
		this.str_template=str_2;
        
    }

    public boolean isPatternMatch()
    {
		int test=0;
        int temp=0;
        
        return PatMatch(str_test,str_template,test,test);
        
    }
    public boolean PatMatch(String s1,String s2,int i1,int i2)
    {
        if(i1==s1.length()&&i2==s2.length())
            return true;
        
        
        else if (i2==s2.length())
            return false;
        else
        {
            if(i1==s1.length())
            {
             if(i2<s2.length()-1&&s2.charAt(i2+1)=='*')
                 return PatMatch(s1,s2,i1,i2+2);
            else
                return false;
            }
            if(s1.charAt(i1)!=s2.charAt(i2)&&s2.charAt(i2)!='.')
            {
                if(i2<s2.length()-1&&s2.charAt(i2+1)=='*')
                {
                    return PatMatch(s1,s2,i1,i2+2);
                }
                return false;
            }
            else
            {
                if(i2<s2.length()-1&&s2.charAt(i2+1)=='*')
                {
                    return PatMatch(s1,s2,i1+1,i2)||PatMatch(s1,s2,i1,i2+2)||PatMatch(s1,s2,i1+1,i2+2);
                }
                else
                    return PatMatch(s1,s2,i1+1,i2+1);
            }
            
            
        }
        
    }
}
