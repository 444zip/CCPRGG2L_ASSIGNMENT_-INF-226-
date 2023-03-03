import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class TryAgain extends JFrame {
    TryAgain(){

        JButton tryAgainButton = new JButton();
        tryAgainButton.setText("TRY AGAIN");
        tryAgainButton.setFont(new Font("Arial", Font.BOLD, 25));
         // 
         TryAgainEventHandler tryHandler = new TryAgainEventHandler();
        tryAgainButton.addActionListener(tryHandler);


        

        JButton exitButton = new JButton();
        exitButton.setText("EXIT");
        exitButton.setFont(new Font("Arial", Font.BOLD, 25));
        
        ExitEventHandler exitHandler = new ExitEventHandler();
        exitButton.addActionListener(exitHandler);

       

        this.add(tryAgainButton);
        this.add(exitButton);

        this.setLayout(new FlowLayout());
        this.setTitle("Snake Game");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        // set background
        this.getContentPane().setBackground(Color.MAGENTA);
        // lock frame
        this.setResizable(false);
    }

    private class TryAgainEventHandler implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            App myApp = new App();
            myApp.main(null);
            dispose();
        }
    }

    private class ExitEventHandler implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            dispose();
        }
    
    }
}
