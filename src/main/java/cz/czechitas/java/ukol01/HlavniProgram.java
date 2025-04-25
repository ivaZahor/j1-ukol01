package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.Turtle;

public class HlavniProgram {
    private Turtle zofka;

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

    public void start() {
        zofka = new Turtle();
        ;
        nakresliPrasatko(500, 500);
/*             nakresliOsmiuhelnik(200,700);
          nakresliKolecko(200,900);
 */
        nakresliSlunicko(200, 200);
        nakresliDomecek(200, 500);
        nakresliDomecek(500, 300);
        nakresliDomecek(600, 300);
        nakresliDomecek(700, 300);
        nakresliDomecek(800, 300);
        nakresliDomecek(900, 300);
        napisI(500, 800);
        napisV(600, 800);
        napisA(700, 800);
    }
    public void nakresliPrasatko(double x, double y) {
        zofka.setLocation(x, y);
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
    }
    public void nakresliOsmiuhelnik(double x, double y) {
        zofka.setLocation(x, y);
        zofka.penDown();
        for (int i = 0; i < 8; i++) {
            zofka.move(40);
            zofka.turnRight(45);
        }
    }
    public void nakresliKolecko(double x, double y) {
        zofka.setLocation(x, y);
        zofka.penDown();
        for (int i = 0; i < 12; i++) {
            zofka.move(30);
            zofka.turnRight(30);
        }
    }
    public void nakresliSlunicko(double x, double y) {
        zofka.setLocation(x, y);
        zofka.penDown();
        nakresliKolecko(x, y);
        for (int i = 0; i < 12; i++) {
            zofka.turnLeft(90);
            zofka.move(40);
            zofka.turnRight(180);
            zofka.move(40);
            zofka.turnLeft(90);
            zofka.move(30);
            zofka.turnRight(30);
        }
        zofka.turnRight(90);
    }
    public void nakresliDomecek(double x, double y) {
        zofka.setLocation(x, y);
        zofka.penDown();
        zofka.move(150);
        zofka.turnRight(90);
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
        zofka.turnLeft(150);
    }
    public void napisI(double x, double y) {
        zofka.setLocation(x, y);
        zofka.penDown();
        zofka.move(100);
    }
    public void napisV(double x, double y) {
        zofka.setLocation(x, y);
        zofka.penDown();
        zofka.turnLeft(30);
        zofka.move(102);
        zofka.turnRight(120);
        zofka.penUp();
        zofka.move(104);
        zofka.turnRight(120);
        zofka.penDown();
        zofka.move(102);
        zofka.turnLeft(210);
    }
    public void napisA(double x, double y) {
        zofka.setLocation(x, y);
        zofka.penDown();
        zofka.turnRight(30);
        zofka.move(102);
        zofka.turnRight(120);
        zofka.move(102);
        zofka.turnRight(180);
        zofka.move(45);
        zofka.turnLeft(61);
        zofka.move(59);
    }
}


