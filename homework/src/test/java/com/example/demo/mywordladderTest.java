package com.example.demo;

import org.junit.Test;
import java.util.Vector;
import  org.junit.Assert;

public class mywordladderTest {

  @Test
  public void find_ladder() {
    mywordladder wl = new mywordladder();
    Vector result=wl.find_ladder("dictionary.txt","hat","cat");
    Vector tem = new Vector();
    tem.add("cat");
    tem.add("hat");
    Assert.assertTrue("结果正确",result.equals(tem));
  }

}
