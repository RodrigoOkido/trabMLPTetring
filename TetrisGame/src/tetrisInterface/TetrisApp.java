package tetrisInterface;

import java.util.concurrent.TimeUnit;

import javax.swing.JFrame;
import javax.swing.JPanel;

import domainClass.Grid;
import domainClass.PieceI;

public class TetrisApp{
	
	public void startGame(){
		
		Grid gameGrid = new Grid();
		PieceI pieceA = new PieceI();
		prepareGUI();
		//area em teste/////////////////////////////
		gameGrid.putPieceOnGrid(pieceA.getPieceLocation().getPositionY(), 
				pieceA.getPieceLocation().getPositionX(), pieceA.pieceGrid);//coloca uma peca no grid
		
		gameGrid.deleteRow(15); //deleta uma linha qualquer
		gameGrid.putPieceOnGrid(1, 8, pieceA.pieceGrid); //coloca mais uma peca aleatoriamente
		
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
