import static org.junit.Assert.*;

import org.junit.Test;

public class testcase {
  
  @Test
  public void test1() {
    
    test t=new test();
    int actual+t.sum(10,20);
    int expected=30;
    assertEquals(expected, actual);
  }
}
    
