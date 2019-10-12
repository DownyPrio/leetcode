//package test.;

import junit.framework.Test; 
import junit.framework.TestSuite; 
import junit.framework.TestCase; 

/** 
* Roma2Int Tester. 
* 
* @author qimutaku
* @since <pre>10/12/2019</pre> 
* @version 1.0 
*/ 
public class Roma2IntTest extends TestCase { 
public Roma2IntTest(String name) { 
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
* Method: roma2int() 
* 
*/ 
public void testRoma2int() throws Exception { 
//TODO: Test goes here...
    String str="MCMXCIV";
    Roma2Int test=new Roma2Int(str);
    assertEquals(1994,test.roma2int());
} 



public static Test suite() { 
return new TestSuite(Roma2IntTest.class); 
} 
} 
