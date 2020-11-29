package pong360;

// Ami kell, ami nem - jöhet!
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.WindowConstants;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;


public class Pong360 extends JComponent implements ActionListener, MouseMotionListener, KeyListener {

    // A szükséges változók megadása
    private int labdax = 150;
    private int labday = 30;
    private int labdax1 = 100;
    private int labday1 = 10;
    private int utox = 0;
    private int labdaSebessege = 7;
    private int labdaxSebessege = 5;
    private int labday1Sebessege = 14;
    private int labdax1Sebessege = 10;
    public int pont = 0;
    public int pont1 = 0;
    private int pontveg;
    public int pontlegjobb;
    public int pontlegjobb1;
    public boolean jatekVege, started;

    // Main - Maine az nem Main, ha olvasnád Kristóf ;) - metódus
    public static void main(String[] args) {

        JFrame wind = new JFrame("Pong360");
        Pong360 g = new Pong360();
        wind.add(g);
        wind.pack();
        wind.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        wind.setLocationRelativeTo(null);
        wind.setVisible(true);
        wind.addMouseMotionListener(g);

        Timer tt = new Timer(17, g);
        tt.start();

    }

    public void ujlabda(int labdax, int labday, int labdaxSebessege, int labdaySebessege) {

        labdax = 150;
        labday = 30;
        labdaxSebessege = 5;
        labdaySebessege = 7;
        JOptionPane.showMessageDialog(null, "új labda !");

        return;
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(800, 640);
    }

    @Override
    protected void paintComponent(Graphics g) {

        // Játéktér megrajzolása
        g.setColor(Color.lightGray);
        g.fillRect(0, 0, 800, 640);

        g.setColor(Color.darkGray);
        g.fillRect(0, 540, 800, 640);

        // Ütő megrajzolása
        g.setColor(Color.black);
        g.fillRect(utox, 500, 120, 24);

        // Piros labda megrajzolása
        g.setColor(Color.RED);
        g.fillOval(labdax, labday, 32, 32);

        // Fekete labda megrajzolása
        if (pont >= 5) {
            g.setColor(Color.BLACK);
            g.fillOval(labdax1, labday1, 32, 32);

        }
        // Pontok
        if (pont >= 5) {
            g.setColor(Color.red);
            g.setFont(new Font("Algerian", 8, 36));
            g.drawString(String.valueOf(pont + pont1), 30 / 1 - 15, 50);
        } else {
            g.setColor(Color.white);
            g.setFont(new Font("Algerian", 8, 36));
            g.drawString(String.valueOf(pont), 30 / 1 - 15, 50);
        }
        // Indulás és Játék Vége
        g.setColor(Color.white);
        g.setFont(new Font("Algerian", 8, 36));

        if (jatekVege) {
            g.drawString(String.valueOf("           Legmagasabb pontszám : " + pontveg), 50 / 1 - 15, 600);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        labdax = labdax + labdaxSebessege;
        labday = labday + labdaSebessege;

        // Játékablak lent
        if (labdax >= utox && labdax <= utox + 100 && labday >= 475) {
            labdaSebessege = -7;
            pont++;
        }

        if (labday >= 700 ) {
            pont = 0;
            labday = 30;
            jatekVege = true;
        }

        // Játékablak fent
        if (labday <= 0) {
            labdaSebessege = 7;
        }

        // Jétékablak jobboldalt
        if (labdax >= 775) {
            labdaxSebessege = -5;
        }

        // Játékablak baloldalt
        if (labdax <= 0) {
            labdaxSebessege = 5;
        }

        //**********************************************************************
        labdax1 = labdax1 + labdax1Sebessege;
        labday1 = labday1 + labday1Sebessege;

        // Játékablak lent
        if (labdax1 >= utox && labdax1 <= utox + 100 && labday1 >= 475) {
            labday1Sebessege = -10;
            pont1++;
        }

        if (labday1 >= 700) {
            pont1 = 0;
            labday1 = 7;
        }

        // Játékablak fent
        if (labday1 <= 0) {
            labday1Sebessege = 10;
        }

        // Jétékablak jobboldalt
        if (labdax1 >= 775) {
            labdax1Sebessege = -7;
        }

        // Játékablak baloldalt
        if (labdax1 <= 0) {
            labdax1Sebessege = 7;
        }

        // Átkozott If/else-ördögök!
        pontlegjobb = pont;
        pontlegjobb1 = pont1;

        if (pontveg > pontlegjobb) {
            pontveg = pontveg;
        } else {
            pontveg = pontlegjobb1;
            pontveg = pont + pont1;
        }

        if (pontveg > pontlegjobb) {
            pontveg = pontveg;
        } else {
            pontveg = pontlegjobb;
            pontveg = pont + pont1;
        }
        repaint();
    }

    @Override
    public void mouseMoved(MouseEvent e) {

        utox = e.getX() - 50;
        repaint();
    }

    @Override
    public void mouseDragged(MouseEvent e) {
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

}

