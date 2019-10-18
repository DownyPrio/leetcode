import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TelAlpja {
    List<String> board=new ArrayList<String>(Arrays.asList("abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"));
    List<String> findAlpha(List<String> board,String num)
    {
        int index=0;
        String tmp="";
        List<String> res=new ArrayList<String>();
        Add(board,index,num,res,tmp);
        return res;
    }
    void Add(List<String> board,int index,String num,List<String> res,String tmp)
    {
        if(index==num.length())
        {res.add(tmp);
        return;}
        for (int i=0;i<board.get(num.charAt(index)-'0'-2).length();i++)
        {
            Add(board,index+1,num,res,tmp+board.get(num.charAt(index)-'0'-2).charAt(i));
        }
    }
}
