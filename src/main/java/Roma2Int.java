import java.util.HashMap;
import java.util.Map;

public class Roma2Int {
    private String str;
    public Roma2Int(String str)
    {
        this.str=str;
    }
    public int roma2int()
    {
        Map<Character,Integer> dict=new HashMap<Character,Integer>();
        dict.put('I',1);
        dict.put('V',5);
        dict.put('X',10);
        dict.put('L',50);
        dict.put('C',100);
        dict.put('D',500);
        dict.put('M',1000);
        int tmp=0;
        int index=0;
        while(index<str.length())
        {
            if(str.charAt(index)=='I')
            {
                if(index<str.length()-1&&str.charAt(index+1)=='V')
                {
                    tmp+=4;
                    index+=2;
                }
                else if(index<str.length()-1&&str.charAt(index+1)=='X')
                {
                    tmp+=9;
                    index+=2;
                }
                else
                {tmp+=1;
                index++;}
            }

            else if(str.charAt(index)=='C')
            {
                if(index<str.length()-1&&str.charAt(index+1)=='D')
                {
                    tmp+=400;
                    index+=2;
                }
                if(index<str.length()-1&&str.charAt(index+1)=='M')
                {
                    tmp+=900;
                    index+=2;
                }
                else
                {tmp+=100;
                    index++;}
            }
            else if(str.charAt(index)=='X')
            {
                if(index<str.length()-1&&str.charAt(index+1)=='L')
                {
                    tmp+=40;
                    index+=2;
                }
                else if(index<str.length()-1&&str.charAt(index+1)=='C')
                {
                    tmp+=90;
                    index+=2;
                }
                else
                {tmp+=10;
                    index++;}
            }
            else if(str.charAt(index)=='V'||str.charAt(index)=='L'||str.charAt(index)=='D'||str.charAt(index)=='M')
            {
                tmp+=dict.get(str.charAt(index));
                index++;
            }
        }
        return tmp;

    }
}
