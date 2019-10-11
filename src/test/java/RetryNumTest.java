//package test.;

import junit.framework.Test; 
import junit.framework.TestSuite; 
import junit.framework.TestCase; 

/** 
* RetryNum Tester. 
* 
* @author qimutaku
* @since <pre>10/11/2019</pre> 
* @version 1.0 
*/ 
public class RetryNumTest extends TestCase { 
public RetryNumTest(String name) { 
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
* Method: isRetryNum() 
* 
*/ 
public void testIsRetryNum() throws Exception { 
//TODO: Test goes here...
    int num=121131;
    RetryNum test=new RetryNum(num);
    assertEquals(false,test.isRetryNum());
} 



public static Test suite() { 
return new TestSuite(RetryNumTest.class); 
} 
} 
