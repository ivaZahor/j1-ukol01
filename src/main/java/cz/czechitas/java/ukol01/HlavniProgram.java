package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.Turtle;

public class HlavniProgram {
    private Turtle zofka;

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

    public void start() {
        zofka = new Turtle();}


        public void nakresliPrasatko() {
            zofka.penDown();
            zofka.move(100);
            zofka.turnRight(90);
            zofka.move(150);
            zofka.turnRight(90);
            zofka.move(100);
            zofka.turnRight(90);
            zofka.move(150);
            zofka.turnRight(30);
            zofka.move(100);
            zofka.turnRight(120);
            zofka.move(100);
            zofka.penUp();
            zofka.turnRight(120);
            zofka.move(100);
            zofka.penDown();
            zofka.turnRight(45);
            zofka.move(50);
            zofka.turnLeft(135);
            zofka.penUp();
            zofka.move(70.7);
            zofka.turnLeft(135);
            zofka.penDown();
            zofka.move(50);
            zofka.turnRight(135);
            zofka.move(150);
            zofka.turnRight(135);
            zofka.move(50);
            zofka.turnLeft(135);
            zofka.penUp();
            zofka.move(70.7);
            zofka.turnLeft(135);
            zofka.penDown();
            zofka.move(50);
            zofka.turnLeft(45);
            zofka.penUp();

nakresliPrasatko();

        zofka.move(500);
        zofka.turnRight(90);
        zofka.move(200);
        zofka.penDown();

        for (int i = 0; i < 10; i++) {
            zofka.move(25);
            zofka.turnRight(36);

        }
      zofka.penUp();
        zofka.turnLeft(180);
        zofka.move(200);
        zofka.turnLeft(90);
        zofka.penDown();
        nakresliDomecek();

        zofka.penUp();
        zofka.turnRight(120);
        zofka.move(240);
        zofka.turnRight(180);
        zofka.penDown();
        nakresliDomecek();

        zofka.penUp();
        zofka.turnLeft(60);
        zofka.move(700);
        zofka.penDown();
        nakresliDomecek();

        zofka.penUp();
        zofka.turnLeft(60);
        zofka.move(50);
        zofka.penDown();
        nakresliDomecek();

        zofka.penUp();
        zofka.turnRight(30);
        zofka.move(200);
        zofka.turnRight(90);
        zofka.move(550);

        zofka.turnRight(90);
        zofka.penDown();
        zofka.move(100);
        zofka.turnRight(90);
        zofka.penUp();
        zofka.move(20);

        zofka.penDown();
        zofka.turnRight(70);
        zofka.move(102);
        zofka.turnLeft(140);
        zofka.move(102);
        zofka.penUp();

        zofka.turnRight(70);
        zofka.move(20);
        zofka.turnRight(90);
        zofka.move(100);
        zofka.penDown();

        zofka.turnLeft(160);
        zofka.move(102);
        zofka.turnRight(140);
        zofka.move(102);
        zofka.turnRight(180);
        zofka.move(50);
        zofka.turnLeft(70);
        zofka.move(35);
    }

    public void nakresliDomecek() {

        zofka.move(80);
        zofka.turnRight(90);
        zofka.move(150);
        zofka.turnRight(90);
        zofka.move(80);
        zofka.turnRight(90);
        zofka.move(150);
        zofka.turnRight(30);
        zofka.move(80);
        zofka.turnRight(120);
       zofka.move(80);
    }


}


