package tetrisInterface;

import java.awt.Graphics;

import javax.swing.JPanel;

import domainClass.Grid;

@SuppressWarnings("serial")
public class TetrisPanel extends JPanel{
	

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		for (int i = 0; i < Grid.ROWS; i++) {
			for (int j = 0; j < Grid.COLUMNS; j++) {
				g.setColor(Grid.gridMap[i][j]);
				g.fillRect(j*Grid.blockSize, i*Grid.blockSize, Grid.blockSize, Grid.blockSize);
			}
		}
	}
	
}
