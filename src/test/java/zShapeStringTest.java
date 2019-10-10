//package test.;

import junit.framework.Test; 
import junit.framework.TestSuite; 
import junit.framework.TestCase; 

/** 
* zShapeString Tester. 
* 
* @author qimutaku
* @since <pre>10/10/2019</pre> 
* @version 1.0 
*/ 
public class zShapeStringTest extends TestCase { 
public zShapeStringTest(String name) { 
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
* Method: testZStr() 
* 
*/ 
public void testTestZStr() throws Exception { 
//TODO: Test goes here...
    int num=4;
    String str="c";
    zShapeString test=new zShapeString(str,num);
    assertEquals("c",test.testZStr());

} 



public static Test suite() { 
return new TestSuite(zShapeStringTest.class); 
} 
} 
