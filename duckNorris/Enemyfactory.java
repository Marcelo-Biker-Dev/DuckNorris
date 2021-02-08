public class Enemyfactory {

    private int move;
    private int vert;
    private int horiz;

    public static void getNewEnemy() {

        Crocodile crok1 = new Crocodile(760, 210);
        Crocodile crok2 = new Crocodile(560, 660);
        Crocodile crok3 = new Crocodile(260, 410);
        Crocodile crok4 = new Crocodile(160, 760);
        Crocodile crok5 = new Crocodile(860, 810);
        Crocodile crok6 = new Crocodile(1360, 10);
        Crocodile crok7 = new Crocodile(1360, 260);
        Crocodile crok8 = new Crocodile(1360, 510);


        while (true) {

            int whoGonnaMove = (int) (Math.ceil(Math.random() * 8));
            //System.out.println(whoGonnaMove);

            switch (whoGonnaMove) {

                case 1:
                    crok1.crokmovev(2, 0, 50 );
                    break;
                case 2:
                    crok2.crokmovev(13, 0, 50);
                    break;
                case 3:
                    crok3.crokmoveh(5, 50, 0);
                    break;
                case 4:
                    crok4.crokmoveh(1, 50, 0);
                    break;
                case 5:
                    crok5.crokmoveh(1, 50, 0);
                    break;
                case 6:
                    crok6.crokmoveh(21, 50, 0);
                    break;
                case 7:
                    crok7.crokmoveh(2, 50, 0);
                    break;
                case 8:
                    crok8.crokmoveh(9, 50, 0);
                    break;
            }
        }

    }
}

