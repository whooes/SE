package testing;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import junit.textui.TestRunner;


public class JunitTestSuite extends TestCase {
	
		
	 public static Test suite() {
	        TestSuite suite = new TestSuite();
	        suite.addTestSuite( ScoreTest.class);  
	        return (Test) suite;
	    }
	
	 
    public static void main(String args[]) {
       TestRunner.run(suite());
    }
}

