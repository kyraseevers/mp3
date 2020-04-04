package jenkins.model;

import org.junit.Test;
import jenkins.model.IdStrategy.CaseSensitive;
import static org.junit.Assert.*;

public class idFromFilenameTest {

    @Test
    public void testDollarSign() {
    	String keyword = "a";
    	String filenameInput = "$061";
    	CaseSensitive csInstance = new CaseSensitive();
    	String result = csInstance.idFromFilename(filenameInput);
    	assertEquals(result, keyword);
    }
    
    @Test
    public void testNoDollarSign() {
    	String keyword = "HelloWorld";
    	String fileInput = "~hello~world";
    	CaseSensitive csInstance = new CaseSensitive();
    	String result = csInstance.idFromFilename(fileInput);
    	assertEquals(result, keyword);
    	
    }
}
