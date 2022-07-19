import processing.core.PApplet;
public class TryProcessing extends PApplet{
    public static final int WIDTH = 648;
    public static final int HEIGHT = 488;

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
        System.out.println("print from setup method");
        ellipse(WIDTH/2,HEIGHT/2,100,100);
    }

    @Override
    public void draw() {
        System.out.println("from draw method"); // keep printing contimously till we dont close processing gui window
    }
}
