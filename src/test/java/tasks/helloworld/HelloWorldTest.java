package tasks.helloworld;

import org.junit.Test;
import static org.junit.Assert.*;

public class HelloWorldTest {

    private final HelloWorld objectUnderTest = new HelloWorld();
    
    @Test
    public void testDirtyHackMainInvocation() {
        HelloWorld.main(null);
    }
}
