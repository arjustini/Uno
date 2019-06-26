import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class GUI extends JFrame {
    private JPanel panel1;
    private JLabel pile;
    private JButton drawButton;
    private JLabel deck;
    String imagePath;


    public GUI(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600,600);
        setLocationRelativeTo(null);



    }

    public void createView(Game game){

        imagePath = "PNGs/small/" + game.flipCard().imagePath;

        panel1 = new JPanel();
        getContentPane().add(panel1);

        ImageIcon icon = new ImageIcon(imagePath);
        pile = new JLabel(icon);
        panel1.add(pile);

       ImageIcon icon2 = new ImageIcon("PNGs/small/card_back_alt.png");
       deck = new JLabel(icon2);
       panel1.add(deck);
//

        drawButton = new JButton("draw");
        panel1.add(drawButton);
        drawButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                game.getCurrentCard();

                pile.setIcon(new ImageIcon("PNGs/small/" + game.flipCard().imagePath));
                if(game.getDeckPosition() == 108){
                    deck.setIcon(null);
                }
            }
        });


    }





}



