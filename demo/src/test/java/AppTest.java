

import static org.junit.Assert.assertTrue;


import org.junit.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
/**
 * Unit test for simple App.
 */
public class AppTest 
{
    private static final Logger logger = LogManager.getLogger();
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
        logger.info("gfg from logger");
        System.out.println("gfjg");
    }
}
