import junit.framework.*;
import org.junit.Test;

public class AverageTest extends TestCase {
	@Test
	public void testTrue() throws Exception {
		assertEquals(true, true);
	}

	@Test
	public void testMoyenne() throws Exception {
		int[] notes = new int[]{12, 10, 8, 16};
		assertEquals(11.5f, Average.average(notes));
	}
}