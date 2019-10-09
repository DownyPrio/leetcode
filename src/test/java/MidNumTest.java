

import junit.framework.Test; 
import junit.framework.TestSuite; 
import junit.framework.TestCase; 

/** 
* MidNum Tester. 
* 
* @author qimutaku
* @since 10/09/2019
* @version 1.0 
*/ 
public class MidNumTest extends TestCase { 
public MidNumTest(String name) { 
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
* Method: findMidNum() 
* 
*/ 
public void testFindMidNum() throws Exception { 
//TODO: Test goes here...
    int[] a={1,3,5};
    int[] b={2,4};
    MidNum testMidNum=new MidNum(a,b);
    assertEquals(3,testMidNum.findMidNum());
} 



public static Test suite() { 
return new TestSuite(MidNumTest.class); 
} 
} 
