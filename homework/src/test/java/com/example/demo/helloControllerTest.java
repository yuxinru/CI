package com.example.demo;

import org.junit.Assert;
import org.junit.Test;

import java.util.Vector;


public class helloControllerTest {

  @Test
  public void getArticle() {
      helloController hc = new helloController();
      Vector result = hc.getArticle("dictionary.txt","cat","hat");
      Vector tem = new Vector();
      tem.add("hat");
      tem.add("cat");
      Assert.assertTrue("结果正确",result.equals(tem));
  }
}
