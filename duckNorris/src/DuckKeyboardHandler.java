import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class DuckKeyboardHandler implements KeyboardHandler {

    private Picture pic;
    private final int moveUP = 10;
    private final int moveDown = 10;
    private final int moveLeft = 10;
    private final int moveRight = 10;

    public DuckKeyboardHandler(Picture pic){
        this.pic = pic;
    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        switch (keyboardEvent.getKey()){
            case KeyboardEvent.KEY_UP:
                pic.translate(0, -moveUP);
                break;
            case KeyboardEvent.KEY_DOWN:
                pic.translate(0, moveDown);
                break;
            case KeyboardEvent.KEY_LEFT:
                pic.translate(-moveLeft, 0);
                break;
            case KeyboardEvent.KEY_RIGHT:
                pic.translate(moveRight, 0);
                break;
            default:
        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}
