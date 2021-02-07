import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Duck {

    private String name;
    private Cell position;
    private Picture pic;

    public Duck(String name){
        this.name = name;
        setPic(new Picture(Grid.PADDING, Grid.PADDING, "resources/duckRight 50x50.png"));
        this.position = new Cell();
    }

    public void init(){
        // initialize position
        position.setCol(0);
        position.setRow(0);
        pic.draw();
    }

    public void setPosition(Cell position) {
        this.position = position;
    }

    public Cell getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }

    public void setPic(Picture pic) {
        this.pic = pic;
    }

    public Picture getPic() {
        return pic;
    }

}
