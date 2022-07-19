import processing.core.PApplet;
public class TryProcessing extends PApplet{
    public static final int WIDTH = 648;
    public static final int HEIGHT = 488;
    public static final int DIAMETER = 100;

    int x=0;


    public static void main(String[] args) {
        PApplet.main("TryProcessing",args );
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH , HEIGHT);
    }

    @Override
    public void setup() {
//        System.out.println("print from setup method");
//        ellipse(WIDTH/2,HEIGHT/2,100,100);
    }

    @Override
    public void draw() {
//        System.out.println("from draw method"); // keep printing contimously till we dont close processing gui window
//        ellipse(mouseX,HEIGHT/2,100,100); //creating circle continoulsy from mouse location on x axis, y axis remains fixed
//        ellipse(mouseX,mouseY,100,100); // creating circle continoulsy from mouse location on x axis, on y axis and can move anywhere in plane

        // initially drawing
        // then white bg
        // then drawing getting covered so fast by white bg that u cant see anything
        // then white bg
//        ellipse(mouseX,mouseY,100,100); // creating circle continoulsy from mouse location on x axis, on y axis and can move anywhere in plane
//        background(255); //white bg

        // initial white bg
        // then drawing
        // then bg getting white and ur drawing getting erased
        // then drawing again
//        paintWhite();
        drawCircle();
    }

    private void drawCircle() {
        ellipse(x,HEIGHT/2, DIAMETER, DIAMETER); //start moving circles from 0 on x and middle of screen(y) and move to end of box
        x++;

        //ellipse(x, mouseY, DIAMETER, DIAMETER); //move on y with respect to mouse and forward in x
        //x++
    }

    private void paintWhite() {
        background(255);
    }
}
