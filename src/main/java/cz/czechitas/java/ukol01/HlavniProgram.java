package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.Turtle;

public class HlavniProgram {
    private Turtle zofka;

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

    public void start() {
        zofka = new Turtle();
        zofka.setLocation(500, 500);
        nakresliPrasatko();
/*        zofka.setLocation(200, 700);
       nakresliOsmiuhelnik();
        zofka.setLocation(200, 900);
        nakresliKolecko();
 */     zofka.setLocation(200, 200);
        nakresliSlunicko();
        zofka.setLocation(200,500);
        nakresliDomecek();
        zofka.setLocation(500, 300);
        nakresliDomecek();
        zofka.setLocation(600, 300);
        nakresliDomecek();
        zofka.setLocation(700,300);
        nakresliDomecek();
        zofka.setLocation(800,300);
        nakresliDomecek();
        zofka.setLocation(900,300);
        nakresliDomecek();
        zofka.setLocation(500,800);
        napisI();
        zofka.setLocation(600, 800);
        napisV();
        zofka.setLocation(700, 800);
        napisA();
    }
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
    }
    public void nakresliOsmiuhelnik() {
        zofka.penDown();
        for (int i = 0; i < 8; i++) {
            zofka.move(40);
            zofka.turnRight(45);
        }
    }
    public void nakresliKolecko() {
        zofka.penDown();
        for (int i = 0; i < 12; i++) {
            zofka.move(30);
            zofka.turnRight(30);
        }
    }
    public void nakresliSlunicko() {
        zofka.penDown();
           nakresliKolecko();
           for (int i = 0; i < 12; i++) {
            zofka.turnLeft(90);
            zofka.move(40);
            zofka.turnRight(180);
            zofka.move(40);
            zofka.turnLeft(90);
            zofka.move(30);
            zofka.turnRight(30);}
           zofka.turnRight(90);
        }
    public void nakresliDomecek () {
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
    public void napisI (){
        zofka.penDown();
        zofka.move(100);
    }
    public void napisV (){
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
    public void napisA(){
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


