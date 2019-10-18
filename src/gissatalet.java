import javax.swing.*;
import java.util.Random;

public class gissatalet {
    public static void main(String[] args) {

        int tal= 0;
        int gissningar = 0;
        int gissning = 0;
        Random random = new Random();
        tal = random.nextInt(100);
        gissning = Integer.parseInt(JOptionPane.showInputDialog(null,"Gissa talet mellan 0 och 100"));

        while (gissning != tal) {

            if (gissning < tal) {
                JOptionPane.showMessageDialog(null, "För Lågt");
                gissning = Integer.parseInt(JOptionPane.showInputDialog(null, "Gissa Högre!"));
            } else if (gissning > tal)
                JOptionPane.showMessageDialog(null, "För Högt");
            gissning = Integer.parseInt(JOptionPane.showInputDialog(null, "Gissa Lägre!"));
        }
            if (gissning == tal) {
                JOptionPane.showMessageDialog(null, "Rätt Tal!");
            }

            System.out.println(random);
        }
    }
