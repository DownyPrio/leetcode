public class MaxWaterVolume {
    private int[] waterWall;
    public MaxWaterVolume(int[] waterWall)
    {
        this.waterWall=waterWall;
    }

    public int findMax()
    {
        int left=0,right=waterWall.length-1;
        int tmpMax=(right-left)*Math.min(waterWall[left],waterWall[right]);
        int tmpHighLeft=0,tmpHighRight=right;
        while(left<right)
        {
            if(waterWall[left]>waterWall[tmpHighLeft])
            {
                tmpHighLeft=left;
                tmpMax=Math.max(tmpMax,(tmpHighRight-tmpHighLeft)*Math.min(waterWall[tmpHighRight],waterWall[tmpHighLeft]));
                right--;
            }
            else if(waterWall[right]>waterWall[tmpHighRight])
            {
                tmpHighRight=right;
                tmpMax=Math.max(tmpMax,(tmpHighRight-tmpHighLeft)*Math.min(waterWall[tmpHighRight],waterWall[tmpHighLeft]));
                left++;
            }
            else
            {
                left++;
            }

        }
        return tmpMax;
    }
}
