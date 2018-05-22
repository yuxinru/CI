package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Vector;

@RestController
public class helloController {
  private final static Logger logger = LoggerFactory.getLogger(helloController.class);
  @RequestMapping(value="/article",method=RequestMethod.GET)
  public Vector getArticle( @RequestParam("filename") String filename,@RequestParam("word1") String word1,@RequestParam("word2") String word2 ) {
    Vector ladder = new Vector();
    mywordladder wordladder = new mywordladder();
    ladder = wordladder.find_ladder(filename,word1,word2);
    String output = "输入：[ filename:"+filename+", word1:"+word1+", word2:"+word2+" ]";
    logger.info(output);
    return ladder;
  }
}
