import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Cell {

    private int col;
    private int row;
    private boolean isObstacle;
    private boolean isEdge;
    private String type;
    private Rectangle rectangle;

    public Cell(){
        this.isObstacle = false;
        this.isEdge = false;
        this.rectangle = new Rectangle();
    }


    public Cell(int col, int row){
        this.col = col;
        this.row = row;
        this.isObstacle = false;
        this.isEdge = false;
        this.rectangle = new Rectangle();
    }


    public boolean equals(Cell cell){
        return col == cell.getCol() && row == cell.getRow();
    }


    public void setRow(int row) {
        this.row = row;
    }

    public int getRow() {
        return row;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public int getCol() {
        return col;
    }

    public String getType() {
        return type;
    }

    public void setObstacle(boolean obstacle) {
        isObstacle = obstacle;
    }

    public boolean isObstacle() {
        return isObstacle;
    }

    public void setEdge(boolean edge) {
        isEdge = edge;
    }

    public boolean isEdge() {
        return isEdge;
    }

    public Rectangle getRectangle() {
        return rectangle;
    }

    public void setRectangle(Rectangle rectangle) {
        this.rectangle = rectangle;
    }
}
