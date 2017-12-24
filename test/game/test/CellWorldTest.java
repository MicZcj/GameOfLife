package game.test;

import static org.junit.Assert.*;

import java.awt.Color;

import org.junit.Test;

import game.demo.CellWorld;

public class CellWorldTest {

	@Test
	public void cellsSizeShouldPlusTwo() throws InterruptedException {
		int size = 10;
		int cellNum = 30;
		assertEquals(size + 2, new CellWorld(size, cellNum).cells.length);
	}

	@Test
	public void cellsNumShouldEqualsInput() throws InterruptedException {
		int cellNum = 30;
		int size = 10;
		int cells[][];
		CellWorld cw = new CellWorld(size, cellNum);
		int count = 0;
		for (int i = 1; i < cw.size - 1; i++) {
			for (int j = 1; j < cw.size - 1; j++) {
				if (cw.cells[i][j] == 0) {
				} else {
					count += 1;
				}
			}
		}
		assertEquals(count, cellNum);
	}
}
