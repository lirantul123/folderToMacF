import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import java.io.*;
import java.net.URI;

import javax.swing.filechooser.*;

public class Note extends JFrame implements ActionListener {
    static JMenu Writing; static JMenuItem letters; static JMenuItem words; static JMenuItem click_;
    private JTextArea area;
    private JScrollPane scpane;
    String text = "";
    public Note() {
        super("MyNoteped");
        setSize(1120, 550);
        
        setLayout(new BorderLayout());

        JMenuBar menuBar = new JMenuBar(); //menubar
        

        JMenu file = new JMenu("File"); //file menu
        
        JMenuItem newdoc = new JMenuItem("New");
        newdoc.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));
        newdoc.addActionListener(this);
        
        JMenuItem open = new JMenuItem("Open");
        open.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.CTRL_MASK));
        open.addActionListener(this);
        
        JMenuItem save = new JMenuItem("Save");
        save.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));
        save.addActionListener(this);
        
        JMenuItem print = new JMenuItem("Print");
        print.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.CTRL_MASK));
        print.addActionListener(this);
        
        
        JMenu edit = new JMenu("Edit");
        
        JMenuItem copy = new JMenuItem("Copy");
        copy.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.CTRL_MASK));
        copy.addActionListener(this);
        
        JMenuItem paste = new JMenuItem("Paste");
        paste.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, ActionEvent.CTRL_MASK));
        paste.addActionListener(this);
        
        JMenuItem cut = new JMenuItem("Cut");
        cut.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.CTRL_MASK));
        cut.addActionListener(this);
        
        JMenuItem selectall = new JMenuItem("Select All");
        selectall.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, ActionEvent.CTRL_MASK));
        selectall.addActionListener(this);
        
        
        JMenu about = new JMenu("Help");
        
        JMenuItem notepad = new JMenuItem("Gmail: Lira.tulchin@gmail.com");
        notepad.addActionListener(this);

        area = new JTextArea();
        area.setFont(new Font("SAN_SERIF", Font.PLAIN, 20));
        area.setLineWrap(true);
        area.setWrapStyleWord(true);
        
        scpane = new JScrollPane(area); 
        scpane.setBorder(BorderFactory.createEmptyBorder());

        JMenu Exit = new JMenu("     EXIT"); //file menu
        JMenuItem exit = new JMenuItem("Exit");
        exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0));
        exit.addActionListener(this);

        Writing = new JMenu("   Writing");
        click_ = new JMenuItem("click- ");
        click_.addActionListener(this);

        letters = new JMenuItem("Letters: ");
        letters.addActionListener(this);

        words = new JMenuItem("Words: ");
        words.addActionListener(this);

        setJMenuBar(menuBar);
        menuBar.add(file);
        menuBar.add(edit);
        menuBar.add(about);
        menuBar.add(Exit);
        menuBar.add(Writing);

        file.add(newdoc);
        file.add(open);
        file.add(save);
        file.add(print);
        Writing.add(click_);
        Exit.add(exit);
        Writing.add(letters);
        Writing.add(words); 
        edit.add(copy);
        edit.add(paste);
        edit.add(cut);
        edit.add(selectall);
        
        about.add(notepad);

        add(scpane, BorderLayout.CENTER);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getActionCommand().equals("New")) {
            area.setText("");
            System.out.println("You opened New file.");
        
        } 
        else if (ae.getActionCommand().equals("Open")) {
            JFileChooser chooser = new JFileChooser("D:/Java");
            chooser.setAcceptAllFileFilterUsed(false); 
            FileNameExtensionFilter restrict = new FileNameExtensionFilter("Only .txt files", "txt"); 
            chooser.addChoosableFileFilter(restrict);
    	
            int result = chooser.showOpenDialog(this);
            if(result == JFileChooser.APPROVE_OPTION) {
                File file = chooser.getSelectedFile();
				
                try{
                    System.out.println("You Opened.");
                    FileReader reader = new FileReader(file);
                    BufferedReader br = new BufferedReader(reader);
                    area.read( br, null );
                    br.close();
                    area.requestFocus();
                }catch(Exception e){
                    System.out.print(e);
                }
            }
        } else if(ae.getActionCommand().equals("Save")){
            final JFileChooser SaveAs = new JFileChooser();
            SaveAs.setApproveButtonText("Save");
            int actionDialog = SaveAs.showOpenDialog(this);
            if (actionDialog != JFileChooser.APPROVE_OPTION) {
                return;
            }

            File fileName = new File(SaveAs.getSelectedFile() + ".txt");
            BufferedWriter outFile = null;
            System.out.println("You Saved.");

            try {
                outFile = new BufferedWriter(new FileWriter(fileName));
                area.write(outFile);
            } catch (IOException e) {
                e.printStackTrace();
            }
            
        }else if (ae.getActionCommand().equals("Gmail: Lira.tulchin@gmail.com")) {
            try {
                Desktop.getDesktop().mail(new URI("mailto:Lira.tulchin@gmail.com"));
            } catch (Exception e) {
                e.printStackTrace();
            }
            // closing cmd:) just example for me how to continue program not to work as while my program works(prevent antiangine, etc)
            String os = System.getProperty("os.name").toLowerCase();
            if (os.contains("win")) {
                try {
                    Runtime.getRuntime().exec("taskkill /F /IM cmd.exe");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }

        else if(ae.getActionCommand().equals("Print")){
            try{
                area.print();
            }catch(Exception e){}

        }else if (ae.getActionCommand().equals("Exit")) {
            int choice = JOptionPane.showConfirmDialog(this, "Closing this note(data will not be saved- unless you saved thise note). Are you sure you want leave?", "Confirmation", JOptionPane.YES_NO_OPTION);
            if (choice == JOptionPane.YES_OPTION) {
                System.out.println("You LEFT.");
                System.exit(0);
            }

        } else if (ae.getSource() == click_) {
            int lettersLen = area.getText().length();
            System.out.println("Letters: " + lettersLen);
            letters.setText("Letters: " + lettersLen);

            String[] wordsArray = area.getText().trim().split("\\s+");
            int wordsLen = wordsArray.length;
            System.out.println("Words: " + wordsLen);
            words.setText("Words: " + wordsLen);
        
        }else if (ae.getActionCommand().equals("Copy")) {
            text = area.getSelectedText();
            System.out.println("You Copied.");

        }else if (ae.getActionCommand().equals("Paste")) {
            area.insert(text, area.getCaretPosition());
            System.out.println("You Pasted.");

        }else if (ae.getActionCommand().equals("Cut")) {
            text = area.getSelectedText();
            System.out.println("You Cut.");

            area.replaceRange("", area.getSelectionStart(), area.getSelectionEnd());
        }else if (ae.getActionCommand().equals("Select All")) {
            area.selectAll();
            System.out.println("You Select All.");

            
        }
    }

    public static void main(String[] args) {
        new Note();
    }
}
