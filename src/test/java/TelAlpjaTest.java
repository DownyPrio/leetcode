//package test.;

import junit.framework.Test; 
import junit.framework.TestSuite; 
import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/** 
* TelAlpja Tester. 
* 
* @author qimutaku
* @since <pre>10/15/2019</pre> 
* @version 1.0 
*/ 
public class TelAlpjaTest extends TestCase { 
public TelAlpjaTest(String name) { 
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
* Method: findAlpha(List<String> board, String num) 
* 
*/ 
public void testFindAlpha() throws Exception { 
//TODO: Test goes here...
    String num="23";
    TelAlpja test=new TelAlpja();
    List<String> res= new ArrayList<String>(Arrays.asList("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"));
    assertEquals(res,test.findAlpha(test.board,num));
} 

/** 
* 
* Method: Add(List<String> board, int index, String num, List<String> res, String tmp) 
* 
*/ 
public void testAdd() throws Exception { 
//TODO: Test goes here... 
} 



public static Test suite() { 
return new TestSuite(TelAlpjaTest.class); 
} 
} 
