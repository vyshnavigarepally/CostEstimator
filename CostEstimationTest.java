package costestimate;


import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

public class CostEstimationTest {

	@Test
	public void testCostEstimation()
	{
		CostEstimation c;
		c=new CostEstimation(0,300,false);
		assertEquals(360000.0,c.findCost());
		
		c=new CostEstimation(1,96.25,false);
		assertEquals(144375.0,c.findCost());
		
		c=new CostEstimation(2,5,true);
		assertEquals(12500.0,c.findCost());
	}

}
