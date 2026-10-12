package JavaCore;

import org.junit.Test;

public class Child1 extends Parent {

	
      @Test
      public void testrun()
      {
    	  Child2 c = new Child2(3);
    	  int a=3;
    	  System.out.println(c.increment());
    	  System.out.println(c.decrement());
    	 // System.out.println(c.multipleoftwo());
    	  System.out.println(c.multipleofthree());
    	 
    	  Run();
      }
	}
