//package test.;

import junit.framework.Test; 
import junit.framework.TestSuite; 
import junit.framework.TestCase; 

/** 
* PatternMatch Tester. 
* 
* @author qimutaku
* @since <pre>10/11/2019</pre> 
* @version 1.0 
*/ 
public class PatternMatchTest extends TestCase { 
public PatternMatchTest(String name) { 
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
* Method: isPatternMatch() 
* 
*/ 
public void testIsPatternMatch() throws Exception { 
//TODO: Test goes here...
    String s1="abc*";
    String s2="abcbed";

    PatternMatch test=new PatternMatch(s1,s2);
    assertEquals(false,test.isPatternMatch());

} 

/** 
* 
* Method: PatMatch(String s1, String s2, int i1, int i2) 
* 
*/ 
public void testPatMatch() throws Exception { 
//TODO: Test goes here... 
} 



public static Test suite() { 
return new TestSuite(PatternMatchTest.class); 
} 
} 
