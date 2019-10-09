

import junit.framework.Test; 
import junit.framework.TestSuite; 
import junit.framework.TestCase; 

/** 
* Calculate Tester. 
* 
* @author <Authors name> 
* @since <pre>09/26/2019</pre> 
* @version 1.0 
*/ 
public class CalculateTest extends TestCase { 
public CalculateTest(String name) { 
super(name); 
} 

public void setUp() throws Exception { 
super.setUp(); 
} 

public void tearDown() throws Exception { 
super.tearDown(); 
} 

@org.junit.Test
public  void testPp() throws Exception
{
    new Calculate().pp();

}
/** 
* 
* Method: add(int a, int b) 
* 
*/ 
public void testAdd() throws Exception { 
//TODO: Test goes here...
    assertEquals(6,new Calculate().add(4, 2));
} 

/** 
* 
* Method: subtract(int a, int b) 
* 
*/ 
public void testSubtract() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: multiply(int a, int b) 
* 
*/ 
public void testMultiply() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: divide(int a, int b) 
* 
*/ 
public void testDivide() throws Exception { 
//TODO: Test goes here... 
} 



public static Test suite() { 
return new TestSuite(CalculateTest.class); 
} 
} 
