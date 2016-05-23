package domainClass;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;


/**
 * Cria o grid do Tetris. Esta classe � respons�vel por praticamente
 * todos os recursos necess�rios para rodar o game.
 *
 */
public class Grid extends JPanel{
	
	private JLabel gameName;
	private JLabel Score;
	private JButton newGame;
	private JButton pauseGame;
	
	
	//Defini��o de tamanho do grid e pontua��o do Game.
	private final static int COLUMNS = 12;
	private final static int ROWS = 20;
	private int score = 0;
	
	
	//Lista das pe�as e atributos para controle das pe�as do game.
	private final PieceCollection pushPieces = new PieceCollection();
	private final Piece[] pieceCollection = pushPieces.getList();
	private final Color[] colors = Piece.getPieceColors();
	private int currentPiece;
	private int pieceRotation;
	private Point newPieceOrigin;
	
	
	//Forma��o do Grid.
	private Color gridMap[][];

	
	/**
	 * Construtor da classe Grid.
	 * 
	 */
	public Grid(){
		//inicializa o grid vazio
		gridMap = new Color[COLUMNS][ROWS];
		for (int i = 0; i < COLUMNS; i++) {
			for (int j = 0; j < ROWS; j++) {
				if (i == 0 || i == 11 || j == 19) {
					gridMap[i][j] = Color.DARK_GRAY;
				} else {
					gridMap[i][j] = Color.BLACK;
				}
			}
		}
		putNewPieceOnGrid();
	}
	
	
	/**
	 * Coloca uma pe�a dentro do grid. A pe�a a ser inserida
	 * � feita de forma aleat�ria.
	 * 
	 */
	public void putNewPieceOnGrid() {
			newPieceOrigin = new Point(5, 2);
			pieceRotation = 0;
			Random pieceChoice = new Random();
			int piece = pieceChoice.nextInt(6);
			
			
			currentPiece = piece;
	}
	
	
	// *********** AINDA N�O REALIZA DA FORMA DESEJADA
	/**
	 * Desenha uma pe�a dentro do grid.
	 * 
	 * @param g Recebe um par�metro do tipo Graphics que ser� utilizado
	 * 		  para desenhar a pe�a.
	 */
	public void drawPieceOnGrid(Graphics g) {		
		g.setColor(colors[currentPiece]);
		for (Point[] p : pieceCollection[currentPiece].getPieceCoordinates()) {
			int i = 0;
			g.fillRect((p[i].getPositionX() + newPieceOrigin.getPositionX()) * 26, 
					   (p[i].getPositionY() + newPieceOrigin.getPositionY()) * 26, 
					   25, 25);
			i++;
		}
	}
	
	public void paintComponent(Graphics g)
	{
		// Pinta o grid todo. 
		g.fillRect(0, 0, 26*COLUMNS, 26*ROWS);
		for (int i = 0; i < COLUMNS; i++) {
			for (int j = 0; j < ROWS; j++) {
				g.setColor(gridMap[i][j]);
				g.fillRect(26*i, 26*j, 25, 25);
			}
		}
		
		// Faz a exibi��o do Score.
		g.setColor(Color.BLACK);
		g.drawString("GAME SCORE:    " + score, 19*19, 25);
		
		// Pinta no grid a pe�a atualmente ativa pelo jogador.
		drawPieceOnGrid(g);
		
	}
	
	
	public void putAtGrid(int row, int column, boolean piece[][]){
		// piece eh um bloco 4x4
		//row e column indicam a posicao do canto inferior esquerdo de piece 
	}
	
	public void cleanRow(int row){
		
	}

}
