//package test.;

import junit.framework.Test; 
import junit.framework.TestSuite; 
import junit.framework.TestCase; 

/** 
* Int2Roma Tester. 
* 
* @author qimutaku
* @since <pre>10/12/2019</pre> 
* @version 1.0 
*/ 
public class Int2RomaTest extends TestCase { 
public Int2RomaTest(String name) { 
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
* Method: int2roma() 
* 
*/ 
public void testInt2roma() throws Exception { 
//TODO: Test goes here...
    int num=4;
    Int2Roma test=new Int2Roma(num);
    //System.out.println(7*"a");
    assertEquals("IV",test.int2roma());
} 



public static Test suite() { 
return new TestSuite(Int2RomaTest.class); 
} 
} 
