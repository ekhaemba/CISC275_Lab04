import static org.junit.Assert.*;

import org.junit.Test;

public class BoardTest {

	@Test
	public void testBoard() {
		Board board = new Board(0);
		assert(board.difficulty == 0);
	}
	
	@Test
	public void testBoard1() {
		Board board = new Board(1);
		assert(board.difficulty == 1);
	}
	@Test
	public void testSetTimer() {
		Board board = new Board(1);
		board.setTimer(0);
		assert(board.timer == 0);
	}

	@Test
	public void testProcessCharLeft() {
		Board board = new Board(0);
		int curX = board.player.getX();
		char left = 'o';
		board.processChar(left);
		assert((curX - 1) == board.player.getX());
		
	}
	
	@Test
	public void testProcessCharRight() {
		Board board = new Board(0);
		int curX = board.player.getX();
		char right = 'p';
		board.processChar(right);
		assert((curX + 1) == board.player.getX());
		
	}

	@Test
	public void testTakeTurn1() {
		Board board = new Board(49);
		int curScore = board.player.getScore();
		char upScore = 'k';
		board.takeTurn(upScore);
		assert(curScore  + 1 == board.player.getScore());
	}

	@Test
	public void testTakeTurn2() {
		Board board = new Board(49);
		int curX = board.player.getX();
		char left = 'o';
		board.takeTurn(left);
		assert((curX - 1) == board.player.getX());
	}

}
