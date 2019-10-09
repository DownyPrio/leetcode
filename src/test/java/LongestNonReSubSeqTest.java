//package test.;

import junit.framework.Test; 
import junit.framework.TestSuite; 
import junit.framework.TestCase; 

/** 
* LongestNonReSubSeq Tester. 
* 
* @author qimutaku
* @since <pre>10/09/2019</pre> 
* @version 1.0 
*/ 
public class LongestNonReSubSeqTest extends TestCase { 
public LongestNonReSubSeqTest(String name) { 
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
* Method: findLengthOfSubSeq() 
* 
*/ 
public void testFindLengthOfSubSeq() throws Exception { 
//TODO: Test goes here...
    String testStr="qqqqqqwe";
    LongestNonReSubSeq testSeqClass= new LongestNonReSubSeq(testStr);
    assertEquals(3,testSeqClass.findLengthOfSubSeq());
} 



public static Test suite() { 
return new TestSuite(LongestNonReSubSeqTest.class); 
} 
} 
