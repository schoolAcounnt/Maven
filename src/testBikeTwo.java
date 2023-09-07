import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class testBikeTwo {
	bike bikeOne = new bike(4,"bike","has two wheels");
	@Before
	public void setUp() throws Exception{} 
	@Test
	void testSetBikeDescription() {
		bikeOne.setDescription("Bike has one wheel");
		assertEquals(bikeOne.getDescription(),"Bike has one wheel");
	}

}
