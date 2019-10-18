import DataStruct.ListNode;

public class ListNodeNthNum {
    int[] nums={1,2,3,4,5};
    ListNode newList=ListNode.createList(nums);
    static int findRevNthNums(ListNode list,int n)
    {
        ListNode cur=list;
        int count=1;
        while(count<n)
        {
            cur=cur.next;
            count++;
        }
        ListNode start=list;
        while(cur.next!=null)
        {
            start=start.next;
            cur=cur.next;
        }
        return start.val;
    }


}
