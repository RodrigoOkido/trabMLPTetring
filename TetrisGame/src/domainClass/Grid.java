package domainClass;

public class Grid {
	private final static int COLUMNS = 12;
	private final static int ROWS = 18;
	private static boolean gridMap[][] = new boolean[ROWS][COLUMNS];
	
	public Grid(){
		//inicializa o grid vazio
		for (int i = 0; i < ROWS; i++) {
			for (int j = 0; j < COLUMNS; j++) {
				Grid.gridMap[i][j] = false;
			}
		}
		
	}
	
	
	public void putAtGrid(int row, int column, boolean piece[][]){
		// piece eh um bloco 4x4
		//row e column indicam a posicao do canto inferior esquerdo de piece 
	}
	
	public void cleanRow(int row){
		
	}

}
