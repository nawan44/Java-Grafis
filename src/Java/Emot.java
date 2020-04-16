
/*
 * Rachmat Gunawan.
 * Universitas Mercubuana
 * 41513310067.
 */
package Java;

import java.awt.Graphics;
import java.awt.Color;
public class Emot extends java.applet.Applet {

    public void paint (Graphics g){

        /*santai*/
        g.setColor(Color.yellow);
        g.drawOval(60, 510, 80, 80);
        g.fillOval(60, 10, 80, 80);
        g.setColor(Color.black);
        g.drawLine(90,100,90,140);
        g.setColor(Color.black);
        g.drawArc(75, 30, 50, 20, 0, 55);
        g.setColor(Color.black);
        g.drawArc(75, 30, 50, 20, 110, 90);
        g.setColor(Color.black);
        g.drawArc(75, 40, 20, 10, 180, 180);
        g.setColor(Color.black);
        g.drawArc(105, 40, 20, 10, 180, 180);
        g.setColor(Color.black);
        g.drawArc(75, 40, 50, 30, 180, 180);


        /*Menyeringai*/
        g.setColor(Color.yellow);
        g.fillOval(150, 15, 80, 80);
        g.setColor(Color.black);
        g.drawOval(165, 40, 15, 15);
        g.setColor(Color.white);g.fillOval(165, 40, 15, 15);
        g.setColor(Color.black);
        g.drawOval(195, 40, 15, 15);
        g.setColor(Color.white);g.fillOval(195, 40, 15, 15);
        g.drawOval(170, 60, 40, 15);
        g.setColor(Color.white); g.fillOval(170, 60, 40, 15);
        g.setColor(Color.BLACK); g.drawOval(170, 60, 40, 15);
        g.setColor(Color.black);
        g.drawLine(170, 68, 210, 68);
        g.setColor(Color.black);
        g.drawLine(195, 60, 195, 75);
        g.setColor(Color.black);
        g.drawLine(190, 60, 190, 75);
        g.setColor(Color.black);
        g.drawLine(185, 60, 185, 75);
        g.setColor(Color.black);
        g.drawLine(180, 60, 180, 75);
        g.setColor(Color.black);
        g.drawLine(200, 60, 200, 75);

        /*Tanpa ekspresi*/
        g.setColor(Color.yellow);
        g.fillOval(260, 15, 80, 80);

        g.setColor(Color.black);
        g.drawLine(280, 40, 295, 40);

        g.setColor(Color.black);
        g.drawLine(305, 40, 320, 40);

        g.setColor(Color.black);
        g.drawLine(280, 70, 320, 70);

        /*Kaget*/
        g.setColor(Color.yellow);
        g.fillOval(360, 15, 80, 80);
        g.setColor(Color.black);

        g.drawLine(380, 30, 395, 50);
        g.drawLine(395, 30, 380, 50);

        g.drawLine(405, 30, 420, 50);
        g.drawLine(420, 30, 405, 50);
        g.setColor(Color.white);
        g.drawOval(390, 55, 20, 20);
        g.fillOval(390, 55, 20, 20);
        g.setColor(Color.black); g.drawOval(390, 55, 20, 20);




        /*marah*/
        g.setColor(Color.red);
        g.fillOval(60, 100, 80, 80);
        g.setColor(Color.BLACK);
        g.fillOval (105, 125, 10, 15);
        g.fillOval (82, 125, 10, 15);
        g.drawArc(83, 150, 30, 30, 20, 150);
        g.drawLine(85,112,96,119);
        g.drawLine(108,119,116,113);


        /*terkejut*/
        g.setColor(Color.yellow);
        g.fillOval(150, 105, 80, 80);
        g.setColor(Color.white);
        g.fillOval (175, 125, 15, 15);
        g.fillOval (195, 125, 15, 15);
        g.setColor(Color.BLACK);
        g.fillOval (178, 129, 10, 10);
        g.fillOval (198, 129, 10, 10);
        g.drawOval(180, 150, 20,20);

        /*bingung*/
        g.setColor(Color.yellow);
        g.fillOval(260, 105, 80, 80);
        g.setColor(Color.white);
        g.fillOval (279, 130, 10, 15);
        g.fillOval (310, 130, 10, 15);
        g.setColor(Color.BLACK);
        g.fillOval (279, 130, 10, 8);
        g.fillOval (310, 130, 10, 8);
        g.setColor(Color.BLACK);
        g.drawLine (286, 160, 310, 160);

        /*heran*/
        g.setColor(Color.yellow);
        g.fillOval(360, 105, 80, 80);
        g.setColor(Color.white);
        g.fillOval (375, 120, 15, 25);
        g.fillOval (408, 120, 15, 25);


    }
}