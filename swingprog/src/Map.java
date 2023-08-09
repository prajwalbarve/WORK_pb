
import java.awt.*;
//The Map of the game
public class Map {
    public int[][] map;// 2D array for map
    public int brickWidth; // bricks
    public  int brickHeight;

    //creating blocks of size 3x7
    public Map(int row, int col){
        map=new int[row][col];
        for(int i=0; i< map.length;i++){
            for(int j=0; j<map[0].length;j++){
                map[i][j]=1;
            }
        }
        brickHeight=150/row;
        brickWidth=540/col;
    }
    //this draws the bricks
    public void draw(Graphics2D g){
        for(int i=0; i<map.length;i++){
            for(int j=0;j<map[0].length;j++){
                if (map[i][j] > 0) {
                    g.setColor(new Color(225,255,255));//brick color
                    g.fillRect(j*brickWidth+80,i*brickHeight+50,brickWidth,brickHeight);

                    g.setStroke(new BasicStroke(4));
                    g.setColor(Color.BLACK);
                    g.drawRect(j*brickWidth+80,i*brickHeight+50,brickWidth,brickHeight);
                }
            }
        }
    }
    //this sets the value of brick to 0 if it is hit by the ball
    public void setBrickValue(int value, int row , int col){
        map[row][col]=value;
    }

}
