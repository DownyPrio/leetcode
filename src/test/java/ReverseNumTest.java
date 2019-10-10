//package test.;

import junit.framework.Test; 
import junit.framework.TestSuite; 
import junit.framework.TestCase; 

/** 
* ReverseNum Tester. 
* 
* @author qimutaku
* @since <pre>10/10/2019</pre> 
* @version 1.0 
*/ 
public class ReverseNumTest extends TestCase { 
public ReverseNumTest(String name) { 
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
* Method: Reverse() 
* 
*/ 
public void testReverse() throws Exception { 
//TODO: Test goes here...
  ReverseNum testReverseNum=new ReverseNum(2147483647);
  assertEquals(0,testReverseNum.Reverse());
} 



public static Test suite() { 
return new TestSuite(ReverseNumTest.class); 
} 
} 
