
package other;


import org.apache.log4j.Logger;

public class Player {
	
	public static Logger logger = Logger.getLogger(Player.class);
	
	private String name;
	private int won;
	private int lost;
	private int draw;
	
	
	public Player() {
		super();
	}


	public Player(String name) {
		super();
		this.name = name;
	}


	public Player(String name, int won, int lost, int draw) {
		super();
		this.name = name;
		this.won = won;
		this.lost = lost;
		this.draw = draw;
		logger.debug("New player"+ name +"has been created");
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getWon() {
		return won;
	}


	public void setWon(int won) {
		this.won = won;
	}


	public int getLost() {
		return lost;
	}


	public void setLost(int lost) {
		this.lost = lost;
	}


	public int getDraw() {
		return draw;
	}


	public void setDraw(int draw) {
		this.draw = draw;
	}
	
	
}
