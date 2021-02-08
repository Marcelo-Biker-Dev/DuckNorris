import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Crocodile extends Enemy {

    private final Rectangle crocodileHoriz;
    private final Rectangle crocodileVert;
    private int y;
    private int x;

  //  private int y2 = y;
  //  public int flag = 500;

    public Crocodile(int x ,int y) {
        super();
        this.y = y;
        this.x = x;

        crocodileHoriz = new Rectangle(x, y, 150, 50);


        crocodileVert = new Rectangle(x, y, 50, 150);


    }

    public void crokmovev(int moves, int vert, int horiz) {

        for (int index = 0; index < 2; index++) {
            for (int i = 0; i < moves; i++) {

                try {
                    Thread.sleep(150);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                crocodileVert.setColor(Color.GREEN);
                crocodileVert.fill();
                crocodileVert.translate(-vert, -horiz);

            }

            for (int i = 0; i < moves; i++) {

                try {
                    Thread.sleep(150);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                crocodileVert.setColor(Color.GREEN);
                crocodileVert.fill();
                crocodileVert.translate(vert, horiz);

            }
        }
    }

    public void crokmoveh(int moves, int vert, int horiz) {
         
        for (int index = 0; index < 1; index++) {
            for (int i = 0; i < moves; i++) {

                try {
                    Thread.sleep(150);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                crocodileHoriz.setColor(Color.GREEN);
                crocodileHoriz.fill();
                crocodileHoriz.translate(-vert, -horiz);

            }

            for (int i = 0; i < moves; i++) {

                try {
                    Thread.sleep(150);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                crocodileHoriz.setColor(Color.GREEN);
                crocodileHoriz.fill();
                crocodileHoriz.translate(vert, horiz);

            }
        }
    }
      /*  if (y2 < 500 && flag > 0){
            y2 = y2 + 10;
            flag = flag - 10;
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            crocodile.translate(0, y2);
            System.out.println("if 1:=> "+y2);
            System.out.println("flag 1:=> "+flag);
            System.out.println("===============");
        }

        if (y2 > 200) {
           y2 = y2 - 10;
         //   flag = flag + 10;
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            crocodile.translate(0, -y2);
            System.out.println("if 2:=> "+y2);
            System.out.println("flag 2:=> "+flag);
            System.out.println("===============");
        }*/

    }





