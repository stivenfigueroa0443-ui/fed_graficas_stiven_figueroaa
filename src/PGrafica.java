
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.LinkedList;
import javax.swing.JPanel;

public class PGrafica extends JPanel {

    private LinkedList<Integer> valores;

    public PGrafica() {
        valores = new LinkedList();
//        valores.add(50 * 3);
//        valores.add(10 * 3);
//        valores.add(200);
//        valores.add(120);
//        valores.add(300);
//        valores.add(80);
        
    }

    public void agregarValor(int dato) {
        valores.add(dato);
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(3));
        g2.setColor(Color.black);
        g2.fillRect(0, 0, getWidth(), getHeight());

        g2.setColor(Color.white);

        g2.drawLine(10, 0, 10, getHeight()); //Eje Y
        g2.drawLine(0, getHeight() - 10, getWidth(), getHeight() - 10); //Eje X
        g2.setColor(Color.green);

        for (int k = 0; k < valores.size(); k++) {
            int h = getHeight();
            int vk = valores.get(k);
            int x = 10 + 20 * k;
            int y2 = h - 10 - vk;
            int y1 = h - 10;

            g2.drawLine(x, y1, x, y2);
            g2.fillOval(x - 4, y2 - 4, 8, 8);
        }
    }

}
