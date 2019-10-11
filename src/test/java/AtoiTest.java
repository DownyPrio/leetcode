//package test.;

import junit.framework.Test; 
import junit.framework.TestSuite; 
import junit.framework.TestCase; 

/** 
* Atoi Tester. 
* 
* @author qimutaku
* @since <pre>10/11/2019</pre> 
* @version 1.0 
*/ 
public class AtoiTest extends TestCase { 
public AtoiTest(String name) { 
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
* Method: atoiFunc() 
* 
*/ 
public void testAtoiFunc() throws Exception { 
//TODO: Test goes here...
String strTest="  -321 ont";
Atoi test=new Atoi(strTest);
assertEquals(-321,test.atoiFunc());

} 



public static Test suite() { 
return new TestSuite(AtoiTest.class); 
} 
} 
