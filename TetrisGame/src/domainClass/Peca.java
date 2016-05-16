package domainClass;

import java.awt.Color;

public abstract class Peca {
	
	private int posicaoX, posicaoY;
	private final Color[] pieceColors = {Color.BLUE,Color.YELLOW, Color.PINK, Color.GREEN
												,Color.RED};
	
	
	/**
	 * @return the posicaoX
	 */
	public int getPosicaoX() {
		return posicaoX;
	}
	
	/**
	 * @return the posicaoY
	 */
	public int getPosicaoY() {
		return posicaoY;
	}


	/**
	 * @param posicaoX the posicaoX to set
	 */
	public void setPosicaoX(int posicaoX) {
		this.posicaoX = posicaoX;
	}
	
	
	/**
	 * @param posicaoY the posicaoY to set
	 */
	public void setPosicaoY(int posicaoY) {
		this.posicaoY = posicaoY;
	}

	public void descerPeca(){
		posicaoY = posicaoY + 1;
	}
	
	
}
