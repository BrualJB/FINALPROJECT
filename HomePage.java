import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class HomePage extends JFrame {
    private JPanel Home;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    HomePage frame = new HomePage();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public HomePage() {
    	setIconImage(Toolkit.getDefaultToolkit().getImage("/Users/icarus/Downloads/BookWhispers.png"));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1026, 645);
        Home = new JPanel();
        Home.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(Home);
        setLocationRelativeTo(null);
        Home.setLayout(null);

        JButton btn_Applicant = new JButton("User Login");
        btn_Applicant.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Open the UserLog frame
            	UserLog userLogFrame = new UserLog();
            	userLogFrame.userLogFrame.setVisible(true);
                dispose(); // Close the current frame
            }
        });
        btn_Applicant.setBounds(26, 370, 194, 68);
        Home.add(btn_Applicant);

        JButton btn_Admin = new JButton("Admin Login");
        btn_Admin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Open the AdminLog frame
                AdminLog adminLogFrame = new AdminLog();
                adminLogFrame.setVisible(true);
                dispose(); // Close the current frame
            }
        });
        btn_Admin.setBounds(26, 464, 194, 68);
        Home.add(btn_Admin);

        JLabel lbl_HomeBG = new JLabel("");
        lbl_HomeBG.setIcon(new ImageIcon("/Users/icarus/Downloads/BookWhispers.png"));
        lbl_HomeBG.setBounds(0, 0, 1020, 617);
        Home.add(lbl_HomeBG);
    }
}
