/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java;

/**
 *
 * @author Rachmat Gunawan
 */
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Color;

public class Kartu extends java.applet.Applet{

    public void paint (Graphics g) {

        g.setColor(Color.BLUE);
        g.fillRect (30,70,450,350);



        Font b=new Font("Arial",Font.BOLD, 25);
        g.setColor(Color.white);
        g.setFont(b);
        g.drawString("New", 50, 120);

        Font c=new Font("Arial",Font.BOLD, 25);
        g.setColor(Color.white);
        g.setFont(c);
        g.drawString("Super HotRod", 50, 140);

        Font d=new Font("Arial",Font.PLAIN, 10);
        g.setColor(Color.white);
        g.setFont(d);
        g.drawString("Aktifkan Paket Super HotRod", 50, 200);

        Font e=new Font("Arial",Font.BOLD, 17);
        g.setColor(Color.white);
        g.setFont(e);
        g.drawString("Rp99rb   4 GB (2G/3G", 50, 230);


        g.setColor(Color.white);

        g.drawLine(50, 240, 220, 240);
        g.drawLine(115, 220, 115, 240);

        int q[]={420, 480, 480, 472, 468, 462, 456, 450, 438};
        int r[]={70,  70,  130, 112, 100, 94,  88,  82,  76};
        int s=q.length;
        g.drawPolygon(q,r,s);
        g.setColor(Color.white);
        g.fillPolygon(q,r,s);




        Font f=new Font("Arial",Font.BOLD, 17);
        g.setColor(Color.white);
        g.setFont(f);
        g.drawString("BONUS 4 GB (2G/3G)", 50, 260);

        Font l=new Font("Arial",Font.PLAIN, 9);
        g.setColor(Color.white);
        g.setFont(l);
        g.drawString("Senilai Rp99Rb selama masa promosi", 50, 280);

        Font m=new Font("Arial",Font.PLAIN, 10);
        g.setColor(Color.white);
        g.setFont(m);
        g.drawString("Harga Rp 5rb", 50, 330);


        int u[]={380,400,360,330,300,260,300,260,300,330,350,352,353,354,390,390,450,425,380};
        int v[]={270,310,310,260,310,310,230,150,150,210,190,170,150,130,120,230,230,270,270};
        int w=u.length;
        g.drawPolygon(u, v, w);
        g.setColor(Color.green);
        g.fillPolygon(u, v, w);

        int x[]={380,400,360,330,300,260,300,260,300,330,350,353,356,359,362,365,368,371,374,377,380};
        int y[]={270,310,310,260,310,310,230,150,150,210,190,198,206,214,222,230,238,246,254,262,270};
        int z=x.length;
        g.drawPolygon(x,y,z);
        g.setColor(Color.yellow);
        g.fillPolygon(x,y,z);

        g.drawRect(30,70,450,350);
        g.setColor(Color.black);
    }

}