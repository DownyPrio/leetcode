//package test.;

import DataStruct.ListNode;
import junit.framework.Test;
import junit.framework.TestSuite; 
import junit.framework.TestCase; 

/** 
* ListNodeNthNum Tester. 
* 
* @author qimutaku
* @since <pre>10/18/2019</pre> 
* @version 1.0 
*/ 
public class ListNodeNthNumTest extends TestCase { 
public ListNodeNthNumTest(String name) { 
super(name); 
} 

public void setUp() throws Exception { 
super.setUp(); 
} 

public void tearDown() throws Exception { 
super.tearDown(); 
} 

/** 
* 
* Method: findRevNthNums(ListNode list, int n) 
* 
*/ 
public void testFindRevNthNums() throws Exception { 
//TODO: Test goes here...
    int[] nums={1,2,3,4,5};
    ListNode newList=ListNode.createList(nums);
    int res=ListNodeNthNum.findRevNthNums(newList,2);
    assertEquals(4,res);
} 



public static Test suite() { 
return new TestSuite(ListNodeNthNumTest.class); 
} 
} 
