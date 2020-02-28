package pong;

import java.awt.Color;
import java.awt.Graphics;

public class Player {

	public int x;
	public int y;
	public int width;
	public int height;
	public boolean right;
	public boolean left;

	public Player(int x, int y) {
		this.x = x;
		this.y = y;
		this.width = 40;
		this.height = 5;
	}

	public void tick() {
		if (right) {
			x++;
		} else if (left) {
			x--;
		}

		if (x + width > Game.WIDTH) {
			x = Game.WIDTH - width;
		} else if (x < 0) {
			x = 0;
		}
	}

	public void render(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillRect(x, y, width, height);
	}
}
