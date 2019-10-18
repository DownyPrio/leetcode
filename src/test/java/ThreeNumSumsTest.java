//package test.;

import junit.framework.Test; 
import junit.framework.TestSuite; 
import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.List;

/** 
* ThreeNumSums Tester. 
* 
* @author qimutaku
* @since <pre>10/15/2019</pre> 
* @version 1.0 
*/ 
public class ThreeNumSumsTest extends TestCase { 
public ThreeNumSumsTest(String name) { 
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
* Method: findThreeNum(List<Integer> numList, int target) 
* 
*/ 
public void testFindThreeNum() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: findRes(int index, int target, List<Integer> numList, List<List<Integer>> res, List<Integer> tmp) 
* 
*/ 
public void testFindRes() throws Exception { 
//TODO: Test goes here...
    int[] test={-1, 0, 1,1, 2, -1, -4};
    ThreeNumSums testClass=new ThreeNumSums();
    List<Integer> res_1=new ArrayList<Integer>();
    List<Integer> res_2=new ArrayList<Integer>();
    res_1.add(-1);
    res_1.add(0);
    res_1.add(1);
    res_2.add(-1);
    res_2.add(2);
    res_2.add(-1);
//    res_1.add(1);
//    res_1.add(1);
//    res_1.add(2);
    List res=new ArrayList();
    res.add(res_1);
    res.add(res_2);


    assertEquals(res,testClass.findThreeNum(test,0));
} 



public static Test suite() { 
return new TestSuite(ThreeNumSumsTest.class); 
} 
} 
