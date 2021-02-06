import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Game {


    private static final int PADDING = 10;
    private static final int MAX_WIDTH = 1700;
    private static final int MAX_HEIGHT = 800;
    private static final int CELLSIZE = 50;
    private Rectangle background;
    private Picture pic;
    private DuckKeyboardHandler duckKeyboardHandler;
    private Keyboard keyboard;

    public Game(){

        background = new Rectangle(PADDING, PADDING, MAX_WIDTH, MAX_HEIGHT);
        pic = new Picture(PADDING, PADDING, "resources/duckRight 50x50.png");
        // implement keyboard handler
        duckKeyboardHandler = new DuckKeyboardHandler(pic);
        // instantiate keyboard
        keyboard = new Keyboard(duckKeyboardHandler);
    }

    public void init(){
        background.setColor(Color.BLACK);
        background.fill();

        keyboard.addEventListener(KeyboardEvent.KEY_UP, KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(KeyboardEvent.KEY_DOWN, KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(KeyboardEvent.KEY_LEFT, KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(KeyboardEvent.KEY_RIGHT, KeyboardEventType.KEY_PRESSED);

        pic.draw();
    }


}
