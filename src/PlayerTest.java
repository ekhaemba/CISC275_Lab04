import static org.junit.Assert.*;
import java.util.concurrent.TimeUnit;
import org.junit.Test;

public class PlayerTest {

	@Test
	public void testPlayer1() {
		Player plyr = new Player(3,4);
		assert(plyr.getScore() == 0);
	}

	@Test
	public void testPlayer2() {
		Player plyr = new Player(3,4);
		assert(plyr.getY() == 3);
	}
	@Test
	public void testGetX1() {
		Player plyr = new Player(3,4);
		assert(plyr.getX() == 2);
	}

	@Test
	public void testGetX2() {
		Player plyr = new Player(3,2*4);
		assert(plyr.getX() == 4);
	}
	@Test
	public void testGetY1() {
		Player plyr = new Player(3,4);
		assert(plyr.getY() == 3);
	}

	@Test
	public void testGetY2() {
		Player plyr = new Player(2*3,4);
		assert(plyr.getY() == 6);
	}

	@Test
	public void testGetTime() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetScore1() {
		Player plyr = new Player(3,4);
		assert(plyr.getScore() == 0);
	}

	@Test
	public void testGetScore2() {
		Player plyr = new Player(3,4);
		plyr.upScore();
		assert(plyr.getScore() == 1);
	}
	
	@Test
	public void testSetXcoord() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetYcoord() {
		fail("Not yet implemented");
	}

	@Test
	public void testMoveLeft1() {
		Player plyr = new Player(3,4);
		plyr.moveLeft();
		assert(plyr.getX() == 1);
	}

	@Test
	public void testMoveLeft2() {
		Player plyr = new Player(3,6);
		plyr.moveLeft();
		assert(plyr.getX() == 2);
	}
	@Test
	public void testMoveRight1() {
		Player plyr = new Player(3,4);
		plyr.moveRight();
		assert(plyr.getX() == 3);
	}

	@Test
	public void testMoveRight2() {
		Player plyr = new Player(3,6);
		plyr.moveRight();
		assert(plyr.getX() == 4);
	}

	@Test
	public void testToString() {
		Player plyr = new Player(0,0);
		assert(plyr.toString() == "X");
	}

	@Test
	public void testUpScore1() {
		Player plyr = new Player(0,0);
		plyr.upScore();
		assert((0 + 1) == plyr.getScore());
	}
	
	@Test
	public void testUpScore2() {
		Player plyr = new Player(0,0);
		plyr.upScore();
		plyr.upScore();
		assert((0 + 2) == plyr.getScore());
	}

}
