/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase8;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author crist
 */
public class JPanelmage extends JLabel{
    private int x, y;
    private String ruta;

    public JPanelmage(JPanel panel, String ruta) {
        this.ruta = ruta;
        this.x = panel.getWidth();
        this.y = panel.getHeight();
        this.setSize(x, y);
    }
    
    @Override
    public void paint(Graphics g){
        ImageIcon img = new ImageIcon(getClass().getResource(ruta));
        g.drawImage(img.getImage(), 0, 0, x, y, null);
    }
    
}
