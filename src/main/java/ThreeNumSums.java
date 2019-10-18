import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeNumSums {
    Set<List<Integer>> findThreeNum(int[] numList, int target)
    {
        Set<List<Integer>> res=new HashSet<List<Integer>>();
        List<Integer> tmp=new ArrayList<Integer>();
        //System.out.println(res);
        findRes(0,3,target,numList,res,tmp);
        //System.out.println(res);
        return res;
    }
    void findRes(int index,int rev,int target,int[] numList,Set<List<Integer>> res,List<Integer> tmp)
    {
        //System.out.println(res);

        if(index==numList.length||(rev==1&&numList[index]!=target))
        {
            return;
        }
        tmp.add(numList[index]);
        if(rev==1&&numList[index]==target)
        {
            ArrayList tmpRes=new ArrayList();
            tmpRes.addAll(tmp);
            //System.out.print(tmp);
            res.add(tmpRes);
            //System.out.println(res);
        }
        findRes(index+1,rev-1,target-numList[index],numList,res,tmp);
        tmp.remove(tmp.size()-1);
        findRes(index+1,rev,target,numList,res,tmp);
    }
}
