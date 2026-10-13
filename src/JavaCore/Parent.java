package JavaCore;
import org.junit.After;
import org.junit.Before;
import org.junit.Test.*;
public class Parent {

	
	public void Run()
	{
	System.out.println("Hi how are you");
}
 @Before
 public void beforeRun()
 {
	System.out.println("Run me first"); 
 }
	
 @After
 public void afterRun()
 {
	 System.out.println("Run me last");
 }
 
 public void last()
 {
	 System.out.print("Hi how are you");
 }
}