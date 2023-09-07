import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class testBikeOne {
	bike bikeOne = new bike(4,"bike","has two wheels");
	@Before
	public void setUp() throws Exception{} 
	@Test
	void testSetBikeWheight() {
		bikeOne.setBikeWheight(10);
		assertEquals(bikeOne.getBikeWheight(),10);
	}
	@Test
	void testSetBikeType() {
		bikeOne.setBikeType("New bike type");
		assertEquals(bikeOne.getBikeType(),"New bike type");
	}

}
