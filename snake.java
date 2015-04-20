package project5;

import java.util.Random;

import javafx.scene.layout.Pane;

public class snake {

	Pane yard;
	Random rand;
		
}

// egg class
public class Egg {
	private int x;
	private int y;
	private int width;
	private int height;

	public Egg() {
		x =0;
		y=0;
	}
	
	public Egg(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	public Egg(int x, int y, int width, int height) {
		this.x=x;
		this.y=y;
		this.width = width;
		this.height = height;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
}	


// put an egg in a random location
private void putEgg() {
	yard.getChildren().add(new Circle(egg.getX(), egg.getY(), BLOCK_SIZE, BLOCK_SIZE))


int eggX = 0;
int eggY= 0;
do {
	eggX = rand.nextInt(NUM_COLS);
	eggY = rand.nextInt(NUM_ROWS);
}
while(x == eggX && y == eggY);
// the egg and the head of the snake are not in the same position
}


// touchWalls method that take in String message
// graphic context

// snake object

//egg object


// random object

// putSnake method

// putEgg method
yard.getChilrdren().add(egg);


arraylist rectangle segments


//add yard to group root

//