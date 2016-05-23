package tetrisInterface;

import java.awt.GridLayout;

import javax.swing.*;

import domainClass.Grid;

public class TetrisApp extends JFrame{

	private JButton newGame;
	private JButton pauseGame;
	
	public TetrisApp(){
	
		newGame = new JButton("New Game");
		pauseGame = new JButton("Pause Game");
		
		final Grid game = new Grid();
		//JPanel right_panel = new JPanel(new GridLayout(3, 1));
		//JPanel control_panel = new JPanel();
		//control_panel.add(newGame);
		//control_panel.add(pauseGame);
		//right_panel.add(control_panel);
		//this.setLayout(new GridLayout(1,2));
		//sideMenu.add(Score);
		//sideMenu.add(newGame);
		//sideMenu.add(pauseGame);
		this.add(game);
		//this.add(right_panel);
		this.setTitle("Tetris");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(12*26+180, 26*20+25);
		this.setResizable(false);
	}
	
	
	public static void main(String[] args) {
	
		TetrisApp gameTetris = new TetrisApp();
		gameTetris.setVisible(true);
		
	
	}

}
