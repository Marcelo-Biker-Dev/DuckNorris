import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class BackgroundObstacles {

    private Cell[][] obstacles;
    private final int numOfXCell = 30;
    private final int numOfYCell = 18;

    public BackgroundObstacles(){




        obstacles[2][1] = new Cell(2, 1);
        obstacles[2][2] = new Cell(2, 2);
        obstacles[2][3] = new Cell(2, 3);
        obstacles[2][4] = new Cell(2, 4);
        obstacles[2][5] = new Cell(2, 5);
        obstacles[2][6] = new Cell(2, 6);
        obstacles[2][7] = new Cell(2, 7);
        obstacles[3][1] = new Cell(3, 1);
        obstacles[3][7] = new Cell(3, 7);
        obstacles[4][1] = new Cell(4, 1);
        obstacles[4][7] = new Cell(4, 7);
        obstacles[5][0] = new Cell(5, 0);
        obstacles[5][1] = new Cell(5, 1);
        obstacles[5][2] = new Cell(5, 2);
        obstacles[5][3] = new Cell(5, 3);
        obstacles[5][4] = new Cell(5, 4);
        obstacles[5][5] = new Cell(5, 5);
        obstacles[5][7] = new Cell(5, 7);
        obstacles[6][5] = new Cell(6, 5);
        obstacles[7][4] = new Cell(7, 4);
        obstacles[7][5] = new Cell(7, 5);
        obstacles[7][6] = new Cell(7, 6);
        obstacles[7][7] = new Cell(7, 7);
        obstacles[8][1] = new Cell(8, 1);
        obstacles[8][4] = new Cell(8, 4);
        obstacles[8][7] = new Cell(8, 7);
        obstacles[9][1] = new Cell(9, 1);
        obstacles[9][4] = new Cell(9, 4);
        obstacles[9][7] = new Cell(9, 7);
        obstacles[10][1] = new Cell(10, 1);
        obstacles[10][2] = new Cell(10, 2);
        obstacles[10][3] = new Cell(10, 3);
        obstacles[10][4] = new Cell(10, 4);
        obstacles[10][5] = new Cell(10, 5);
        obstacles[10][7] = new Cell(10, 7);
        obstacles[13][1] = new Cell(13, 1);
        obstacles[13][2] = new Cell(13, 2);
        obstacles[13][3] = new Cell(13, 3);
        obstacles[13][4] = new Cell(13, 4);
        obstacles[13][5] = new Cell(13, 5);
        obstacles[13][6] = new Cell(13, 6);
        obstacles[13][7] = new Cell(13, 7);



        obstacles[14][1] = new Cell(14, 1);
        obstacles[14][7] = new Cell(14, 7);
        obstacles[15][1] = new Cell(15, 1);
        obstacles[15][7] = new Cell(15, 7);
        obstacles[16][1] = new Cell(16, 1);
        obstacles[16][2] = new Cell(16, 2);
        obstacles[16][3] = new Cell(16, 3);
        obstacles[16][7] = new Cell(16, 7);
        obstacles[18][1] = new Cell(18, 1);
        obstacles[18][2] = new Cell(18, 2);
        obstacles[18][3] = new Cell(18, 3);
        obstacles[18][4] = new Cell(18, 4);
        obstacles[18][5] = new Cell(18, 5);
        obstacles[18][6] = new Cell(18, 6);
        obstacles[18][7] = new Cell(18, 7);
        obstacles[19][4] = new Cell(19, 4);
        obstacles[20][4] = new Cell(20, 4);
        obstacles[21][1] = new Cell(21, 1);
        obstacles[21][2] = new Cell(21, 2);
        obstacles[21][3] = new Cell(21, 3);
        obstacles[21][4] = new Cell(21, 4);
        obstacles[21][5] = new Cell(21, 5);
        obstacles[21][6] = new Cell(21, 6);
        obstacles[21][7] = new Cell(21, 7);

        obstacles[24][1] = new Cell(24, 1);
        obstacles[24][2] = new Cell(24, 2);
        obstacles[24][3] = new Cell(24, 3);
        obstacles[24][4] = new Cell(24, 4);
        obstacles[24][5] = new Cell(24, 5);
        obstacles[24][6] = new Cell(24, 6);
        obstacles[24][7] = new Cell(24, 7);
        obstacles[25][1] = new Cell(25, 1);
        obstacles[25][4] = new Cell(25, 4);
        obstacles[25][7] = new Cell(25, 7);
        obstacles[26][1] = new Cell(26, 1);
        obstacles[26][4] = new Cell(26, 4);
        obstacles[26][7] = new Cell(26, 7);
        obstacles[27][1] = new Cell(27, 1);
        obstacles[27][7] = new Cell(27, 7);
        obstacles[15][4] = new Cell(15, 4);
        obstacles[15][5] = new Cell(15, 5);
        obstacles[15][6] = new Cell(15, 6);
        obstacles[27][0] = new Cell(27, 0);
        obstacles[28][0] = new Cell(28, 0);
        obstacles[29][0] = new Cell(29, 0);
        obstacles[27][5] = new Cell(27, 5);
        obstacles[28][5] = new Cell(28, 5);
        obstacles[29][5] = new Cell(29, 5);

        obstacles[5][8] = new Cell(5, 8);
        obstacles[6][8] = new Cell(6, 8);
        obstacles[7][8] = new Cell(7, 8);
        obstacles[3][15] = new Cell(3, 15);
        obstacles[4][15] = new Cell(4, 15);
        obstacles[5][15] = new Cell(5, 15);
        obstacles[11][13] = new Cell(11, 13);
        obstacles[11][14] = new Cell(11, 14);
        obstacles[11][15] = new Cell(11, 15);
        obstacles[17][16] = new Cell(17, 16);
        obstacles[18][16] = new Cell(18, 16);
        obstacles[19][16] = new Cell(19, 16);
        obstacles[27][10] = new Cell(27, 10);
        obstacles[28][10] = new Cell(28, 10);
        obstacles[29][10] = new Cell(29, 10);
        obstacles[1][13] = new Cell(1, 13);




        //:::::::::::::::::::::::::::
        obstacles[1][14] = new Cell(1, 14);
        obstacles[1][15] = new Cell(1, 15);
        obstacles[1][16] = new Cell(1, 16);
        obstacles[2][13] = new Cell(2, 13);
        obstacles[2][16] = new Cell(2, 16);
        obstacles[3][10] = new Cell(3, 10);
        obstacles[3][11] = new Cell(3, 11);
        obstacles[3][12] = new Cell(3, 12);
        obstacles[3][13] = new Cell(3, 13);
        obstacles[3][16] = new Cell(3, 16);
        obstacles[4][10] = new Cell(4, 10);
        obstacles[4][16] = new Cell(4, 16);
        obstacles[5][10] = new Cell(5, 10);
        obstacles[6][10] = new Cell(6, 10);
        obstacles[6][11] = new Cell(6, 11);
        obstacles[6][12] = new Cell(6, 12);
        obstacles[6][13] = new Cell(6, 13);
        obstacles[6][14] = new Cell(6, 14);
        obstacles[6][15] = new Cell(6, 15);
        obstacles[6][16] = new Cell(6, 16);
        obstacles[6][17] = new Cell(6, 17);
        obstacles[8][8] = new Cell(8, 8);
        obstacles[8][9] = new Cell(8, 9);
        obstacles[8][10] = new Cell(8, 10);
        obstacles[8][11] = new Cell(8, 11);
        obstacles[8][12] = new Cell(8, 12);
        obstacles[8][13] = new Cell(8, 13);
        obstacles[8][15] = new Cell(8, 15);
        obstacles[8][16] = new Cell(8, 16);
        obstacles[9][11] = new Cell(9, 11);
        obstacles[10][11] = new Cell(10, 11);
        obstacles[10][16] = new Cell(10, 16);
        obstacles[11][16] = new Cell(11, 16);
        obstacles[12][9] = new Cell(12, 9);
        obstacles[12][10] = new Cell(12, 10);
        obstacles[12][11] = new Cell(12, 11);
        obstacles[12][12] = new Cell(12, 12);
        obstacles[12][13] = new Cell(12, 13);
        obstacles[13][9] = new Cell(13, 9);
        obstacles[13][14] = new Cell(13, 14);
        obstacles[14][9] = new Cell(14, 9);
        obstacles[14][14] = new Cell(14, 14);
        obstacles[15][8] = new Cell(15, 8);
        obstacles[15][9] = new Cell(15, 9);
        obstacles[15][14] = new Cell(15, 14);
        obstacles[15][15] = new Cell(15, 15);
        obstacles[15][16] = new Cell(15, 16);
        obstacles[15][17] = new Cell(15, 17);
        obstacles[16][19] = new Cell(16, 19);
        obstacles[17][9] = new Cell(17, 9);
        obstacles[17][10] = new Cell(17, 10);
        obstacles[17][11] = new Cell(17, 11);
        obstacles[17][12] = new Cell(17, 12);
        obstacles[17][13] = new Cell(17, 13);
        obstacles[17][14] = new Cell(17, 14);
        obstacles[17][15] = new Cell(17, 15);
        obstacles[18][9] = new Cell(18, 9);
        obstacles[19][9] = new Cell(19, 9);
        obstacles[20][8] = new Cell(20, 8);
        obstacles[20][9] = new Cell(20, 9);
        obstacles[20][11] = new Cell(20, 8);
        obstacles[20][12] = new Cell(20, 9);
        obstacles[20][13] = new Cell(20, 8);
        obstacles[20][14] = new Cell(20, 9);
        obstacles[20][15] = new Cell(20, 8);
        obstacles[20][16] = new Cell(20, 9);
        obstacles[21][11] = new Cell(21, 11);
        obstacles[22][11] = new Cell(22, 11);
        obstacles[23][11] = new Cell(23, 11);
        obstacles[24][11] = new Cell(24, 11);
        obstacles[24][17] = new Cell(24, 17);
        obstacles[25][17] = new Cell(25, 17);
        obstacles[26][12] = new Cell(26, 12);

        obstacles[26][13] = new Cell(26, 13);
        obstacles[26][14] = new Cell(26, 14);
        obstacles[26][17] = new Cell(26, 17);
        obstacles[27][12] = new Cell(27, 12);
        obstacles[27][14] = new Cell(27, 14);
        obstacles[27][17] = new Cell(27, 17);
        obstacles[28][12] = new Cell(28, 12);
        obstacles[28][14] = new Cell(28, 14);
        obstacles[28][15] = new Cell(28, 15);
        obstacles[28][16] = new Cell(28, 16);
        obstacles[28][17] = new Cell(28, 17);
















    }


    public void start(){
/*
        coordinates[2][0].setObstacle(true);
        coordinates[2][0].getRectangle().setColor(Color.YELLOW);
        coordinates[2][0].getRectangle().fill();

        coordinates[2][1].setObstacle(true);
        coordinates[2][1].getRectangle().setColor(Color.YELLOW);
        coordinates[2][1].getRectangle().fill();

        coordinates[2][2].setObstacle(true);
        coordinates[2][2].getRectangle().setColor(Color.YELLOW);
        coordinates[2][2].getRectangle().fill();

        coordinates[2][3].setObstacle(true);
        coordinates[2][3].getRectangle().setColor(Color.YELLOW);
        coordinates[2][3].getRectangle().fill();

        coordinates[2][4].setObstacle(true);
        coordinates[2][4].getRectangle().setColor(Color.YELLOW);
        coordinates[2][4].getRectangle().fill();

        coordinates[2][5].setObstacle(true);
        coordinates[2][5].getRectangle().setColor(Color.YELLOW);
        coordinates[2][5].getRectangle().fill();

        coordinates[2][6].setObstacle(true);
        coordinates[2][6].getRectangle().setColor(Color.YELLOW);
        coordinates[2][6].getRectangle().fill();

        coordinates[2][7].setObstacle(true);
        coordinates[2][7].getRectangle().setColor(Color.YELLOW);
        coordinates[2][7].getRectangle().fill();
*/
    }

}
