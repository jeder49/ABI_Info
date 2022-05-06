import java.awt.Canvas;
import java.awt.image.BufferedImage;

public class Duck {
    private int xPos, yPos;
    //picture
    private BufferedImage pic;
    boolean pen;

    public Duck(int xPos, int yPos){
        this.xPos = xPos;
        this.yPos = yPos;
        //load pic
        this.pic.
        this.pen = true;
    }

    //getter
    public int getxPos() {
        return xPos;
    }
    public int getyPos() {
        return yPos;
    }

    //setter
    public void setxPos(int xPos) {
        this.xPos = xPos;
    }
    public void setyPos(int yPos) {
        this.yPos = yPos;
    }

    //
    public void goTo(){

    }
    public void penDown(){
        pen = true;
    }
    public void penUp(){
        pen = false;
    }
    public void turnRight(int angle){

    }
    public void turnLeft(int angle){

    }
    public void moveForward(int distance){

    }
    public void moveBackward(int distance){

    }
    private void drawLine(int x1, int y1, int x2, int y2){

    }
}
