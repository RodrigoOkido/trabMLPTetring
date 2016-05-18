package domainClass;

import java.awt.Color;

public abstract class Piece {
	
	private int positionX, positionY;
	private final Color[] pieceColors = {Color.BLUE,Color.YELLOW, Color.PINK, Color.GREEN
												,Color.RED};
	
	
	/**
	 * @return the PositionX
	 */
	public int getPositionX() {
		return positionX;
	}
	
	/**
	 * @return the positionY
	 */
	public int getPositionY() {
		return positionY;
	}


	/**
	 * @param positionX the positionX to set
	 */
	public void setPositionX(int positionX) {
		this.positionX = positionX;
	}
	
	
	/**
	 * @param positionY the positionY to set
	 */
	public void setPositionY(int positionY) {
		this.positionY = positionY;
	}

	public void descerPeca(){
		positionY = positionY + 1;
	}
	
	
}
