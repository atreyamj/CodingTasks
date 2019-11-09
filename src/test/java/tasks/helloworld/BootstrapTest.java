package tasks.helloworld;

import org.junit.Test;
import static org.junit.Assert.*;

public class BootstrapTest {

    private final Bootstrap objectUnderTest = new Bootstrap();
    
    @Test
    public void testDirtyHackMainInvocation() {
        Bootstrap.main(null);
    }
}
