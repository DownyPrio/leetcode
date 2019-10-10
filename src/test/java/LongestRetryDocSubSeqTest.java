//package test.;

import junit.framework.Test; 
import junit.framework.TestSuite; 
import junit.framework.TestCase; 

/** 
* LongestRetryDocSubSeq Tester. 
* 
* @author qimutaku
* @since <pre>10/10/2019</pre> 
* @version 1.0 
*/ 
public class LongestRetryDocSubSeqTest extends TestCase { 
public LongestRetryDocSubSeqTest(String name) { 
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
* Method: findLongest() 
* 
*/ 
public void testFindLongest() throws Exception { 
//TODO: Test goes here...
    String str="abaaba";
    LongestRetryDocSubSeq test=new LongestRetryDocSubSeq(str);
    assertEquals(6,test.findLongest());
} 



public static Test suite() { 
return new TestSuite(LongestRetryDocSubSeqTest.class); 
} 
} 
