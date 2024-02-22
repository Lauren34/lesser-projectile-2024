import javax.swing.*;
import java.awt.*;

public class PojectileGraph extends JComponent {

    private Projectile projectile = new Projectile (0,0);

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawLine(0, 0, getWidth(), getHeight());

        g.translate(0, getHeight());
        g.drawString(("100,100"), 100, -100);
        g.setColor(Color.GREEN);
        g.drawLine(0, 0, getWidth(), -getHeight());
        g.drawRect(200, -200, 50, 50);
        g.setColor(Color.MAGENTA);
        g.fillRect(400, -400, 25, 25);
        g.setColor(Color.ORANGE);
        g.drawOval(200, -200, 50, 50);

        g.fillOval(
                (int) projectile.getX(),
                (int) -projectile.getY(),
                10,
                10
        );
    }
        public void setProjectile(Projectile projectile){
            this.projectile = projectile;
            repaint();
    }
}
