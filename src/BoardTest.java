import static org.junit.Assert.*;

import org.junit.Test;

public class BoardTest {

	@Test
	public void testBoard() {
		Board board = new Board(0);
		assert(board.difficulty == 0);
	}

	public void testBoard1() {
		Board board = new Board(1);
		assert(board.difficulty == 1);
	}
	@Test
	public void testSetTimer() {
		fail("Not yet implemented");
	}

	@Test
	public void testProcessChar() {
		fail("Not yet implemented");
	}

	@Test
	public void testTakeTurn() {
		fail("Not yet implemented");
	}

	@Test
	public void testScoring() {
		fail("Not yet implemented");
	}

}
