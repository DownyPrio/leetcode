public class MidNum {
    int[] first;
    int[] second;
    public MidNum(int[] a,int[] b){
        first=a;
        second=b;
    }
    int findMidNum(){
        boolean odd=true;
        int firstPoint=0;
        int secondPoint=0;
        int des_1=0;
        int sizeAll=first.length+second.length;
        if(sizeAll%2==0)
            odd=false;
        int tmp=0;
        for(int index=0;index<=sizeAll/2;index++)
        {

            if(firstPoint<first.length&&secondPoint<second.length){
            if(first[firstPoint]<=second[secondPoint])
            {
                tmp=first[firstPoint];
                firstPoint++;
            }
            else {
                tmp=second[secondPoint];
                secondPoint++;
            }
            }
            else if(firstPoint<first.length)
            {
                tmp=first[firstPoint];
                firstPoint++;
            }
            else
            {
                tmp=second[secondPoint];
                secondPoint++;
            }

            if(index==sizeAll/2-1)
            {
                des_1=tmp;
            }
        }
        if(odd)
            return tmp;
        else
            return (tmp+des_1)/2;
    }
}
