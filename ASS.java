import javax.swing;
import java.awt;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PetSelector  {
    JRadioButton birdButton, catButton, dogButton, rabbitButton, pigButton;
    JButton showButton;
    ButtonGroup group;

    public PetSelector() {
        setTitle("RadioButtonDemo");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
setLayout(new FlowLayout());

        // Create radio buttons
        birdButton = new JRadioButton("Bird");
        catButton = new JRadioButton("Cat");
        dogButton = new JRadioButton("Dog");
        rabbitButton = new JRadioButton("Rabbit");
pigButton = new JRadioButton("Pig");

        // Group buttons
        group = new ButtonGroup();
        group.add(birdButton);
        group.add(catButton);
        group.add(dogButton);
        group.add(rabbitButton);
group.add(pigButton);

        // Add buttons to frame
        add(birdButton);
        add(catButton);
        add(dogButton);
        add(rabbitButton);
        add(pigButton);

// Create and add Show button
        showButton = new JButton("Show Selection");
        showButton.addActionListener(this);
        add(showButton);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
if (birdButton.isSelected()) {
            JOptionPane.showMessageDialog(this, "You selected: Bird");
        } else if (catButton.isSelected()) {
            JOptionPane.showMessageDialog(this, "You selected: Cat");
        } else if (dogButton.isSelected())
JOptionPane.showMessageDialog(this, "You selected: Dog");
        } else if (rabbitButton.isSelected()) {
            JOptionPane.showMessageDialog(this, "You selected: Rabbit");
        } else if (pigButton.isSelected())
JOptionPane.showMessageDialog(this, "You selected: Pig");
        } else {
            JOptionPane.showMessageDialog(this, "Please select a pet.");
        }
    }

    public static void main(String[] args) {
new PetSelector();
    }
}
