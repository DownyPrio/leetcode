package DataStruct;

public class ListNode {
    public int val;
    public ListNode next;
    public ListNode(int val){this.val=val;}
    static public ListNode createList(int[] nums){
        ListNode newList=null;
        ListNode curList=newList;
        for(int each:nums)
        {

            ListNode tmp=new ListNode(each);
            if(newList==null)
            {
                newList=tmp;
                curList=tmp;
            }
            else
            {
                curList.next=tmp;
                curList=tmp;
            }
        }
        return newList;
    }
    static public void printeach(ListNode newList){
        ListNode p=newList;
        while(p!=null)
        {
            System.out.println(p.val);
            p=p.next;
        }
    }
    static public void main(String[] args){
        int[] nums={1,2,3,4,5};
        ListNode test=ListNode.createList(nums);
        ListNode.printeach(test);

    }
}

