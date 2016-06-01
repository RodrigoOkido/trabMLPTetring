package tetrisInterface;

import javax.swing.JFrame;
import javax.swing.JPanel;

import domainClass.Grid;

public class TetrisApp{
	
	public TetrisApp(){
			
		Grid gameGrid = new Grid();
		prepareGUI();
	}
	
	public void prepareGUI(){
		JPanel gridPanel = new TetrisPanel();
		
		
		JFrame guiFrame = new JFrame("TETRIS by Tetring");
		guiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		guiFrame.setSize(12*26+180, 26*20+25);//a configurar
		guiFrame.add(gridPanel);
		guiFrame.setResizable(false);
		guiFrame.setLocationRelativeTo(null);//abre a janela no meio da tela (opcional)
		guiFrame.setVisible(true);
		//guiFrame.repaint();
	}
	
	
	public static void main(String[] args) {
	
		TetrisApp gameTetris = new TetrisApp();
		
	
	}

}
