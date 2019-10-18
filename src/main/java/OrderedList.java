import DataStruct.ListNode;

public class OrderedList {
    static ListNode order2oneList(ListNode l1,ListNode l2){
        ListNode resList=null;
        if(l1==null&&l2==null)
            return resList;
        if(l1==null)
            return l2;
        if(l2==null)
            return l1;
        ListNode cur1=l1;
        ListNode cur2=l2;
        ListNode cur=null;
        while(cur1!=null&&cur2!=null)
        {
            if(resList==null)
            {
                if(cur1.val>cur2.val)
                {resList=new ListNode(cur2.val);
                    cur2=cur2.next;}
                else
                {resList=new ListNode(cur1.val);
                    cur1=cur1.next;}
                cur=resList;
            }
            else
            {
                if(cur1.val>cur2.val)
                {
                    cur.next=new ListNode(cur2.val);
                    cur=cur.next;
                    cur2=cur2.next;
                }
                else
                {
                    cur.next=new ListNode(cur1.val);
                    cur=cur.next;
                    cur1=cur1.next;
                }
            }
        }
        if(cur1!=null)
        {
            cur.next=cur1;
        }
        else
        {
            cur.next=cur2;
        }
        return resList;

    }

    static public void main(String[] args){
        int[] nums1={1,3,5,7,8};
        int[] nums2={0,1,4,11,13};
        ListNode l1=ListNode.createList(nums1);
        ListNode l2=ListNode.createList(nums2);
        ListNode res=OrderedList.order2oneList(l1,l2);
        ListNode.printeach(res);
    }
}
