package tetrisInterface;

import javax.swing.JFrame;
import javax.swing.JPanel;

import domainClass.Grid;
import domainClass.PieceI;

public class TetrisApp{
	
	public void startGame(){
		Grid gameGrid = new Grid();
		prepareGUI();
		
		PieceI pieceA = new PieceI();
		gameGrid.putPieceOnGrid(pieceA.getPieceLocation().getPositionY()+4, 
				pieceA.getPieceLocation().getPositionX(), pieceA.pieceGrid);
		
	}
	
	public void prepareGUI(){
		JPanel gridPanel = new TetrisPanel();
		
		
		JFrame guiFrame = new JFrame("TETRIS by Tetring Group");
		guiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		guiFrame.setSize(Grid.COLUMNS*Grid.blockSize, Grid.ROWS*Grid.blockSize);//a configurar
		guiFrame.add(gridPanel);
		guiFrame.setResizable(false);
		guiFrame.setLocationRelativeTo(null);//abre a janela no meio da tela (opcional)
		guiFrame.setVisible(true);
		//guiFrame.repaint();
	}
	
	
	public static void main(String[] args) {
	
		TetrisApp gameTetris = new TetrisApp();
		gameTetris.startGame();
	
	}

}
