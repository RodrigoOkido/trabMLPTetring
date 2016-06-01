package domainClass;

import java.awt.Color;


/**
 * 
 * Nesta classe tera apenas variaveis e metodos relacionados com o gridMap
 *
 */
public class Grid{
	//Defini��o de tamanho do grid
	public final static int COLUMNS = 16;
	public final static int ROWS = 25;
	public final static int blockSize = 20;
		
	
	//Lista das pe�as e atributos para controle das pe�as do game.
	//private final PieceCollection pushPieces = new PieceCollection();
	//private final Piece[] pieceCollection = pushPieces.getList();
	//private final Color[] colors = Piece.getPieceColors();
	//private int currentPiece;
	//private int pieceRotation;
	//private Point newPieceOrigin;
	
	
	//Formacao do Grid.
	public static Color gridMap[][] = new Color[ROWS][COLUMNS];
	
	public Grid(){
		//inicializa o grid vazio
		for (int i = 0; i < ROWS; i++) {
			for (int j = 0; j < COLUMNS; j++) {
				if (j == 0 || j == COLUMNS-1 || i == ROWS-1) {
					gridMap[i][j] = Color.DARK_GRAY;
				} else {
					gridMap[i][j] = Color.BLACK;
				}
			}
		}
	}
	
	public static Color[][] getGridMap() {
		return gridMap;
	}

	/**
	 * Coloca uma peca dentro do grid. 
	 * 
	 */
	public void putPieceOnGrid(int row, int column, Color[][] pieceGrid){
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if(pieceGrid[i][j] != Color.BLACK)gridMap[row+i][column+j] = pieceGrid[i][j];
			}
		}
		
	}
	
	public boolean isFreeSpace(int row,int column){	//checa no grid se point fornecido esta ocupado
		if(gridMap[row][column]==Color.BLACK)
			return true;
		else
			return false;
	}
	
	public void deleteRow(int row){
		for (int i = row; i > 0; i--) {
			for (int j = 1; j < COLUMNS-1; j++) {
				gridMap[i][j] = gridMap[i-1][j];
			}
			
		}
		for (int i = 1; i < COLUMNS-1; i++) {
			gridMap[0][i] = Color.BLACK;
		}
	}
	
	public boolean hasFullRow(){
		/**
		 * verifica se ha linha(s) completa(s) no grid
		 */
		
		
		return false;
	}

}
