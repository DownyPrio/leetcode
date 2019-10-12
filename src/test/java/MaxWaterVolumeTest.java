//package test.;

import junit.framework.Test; 
import junit.framework.TestSuite; 
import junit.framework.TestCase; 

/** 
* MaxWaterVolume Tester. 
* 
* @author qimutaku
* @since <pre>10/12/2019</pre> 
* @version 1.0 
*/ 
public class MaxWaterVolumeTest extends TestCase { 
public MaxWaterVolumeTest(String name) { 
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
* Method: findMax() 
* 
*/ 
public void testFindMax() throws Exception { 
//TODO: Test goes here...
    int[] waterWall={1,2,3,4,5,4,3,2,2,1};
    MaxWaterVolume test=new MaxWaterVolume(waterWall);
    assertEquals(14,test.findMax());

} 



public static Test suite() { 
return new TestSuite(MaxWaterVolumeTest.class); 
} 
} 
