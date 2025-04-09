import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.*;
public class MusicPlayerGUI extends JFrame {

   public static final Color FRAME_COLOR = Color.BLACK;
   public static final Color TEXT_COLOR  = Color.WHITE;


         public MusicPlayerGUI(){
            super("Music Player");

            //set height and width
            setSize(400,600);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLocationRelativeTo(null); // Center the window on the screen
            setResizable(false);
            setLayout(null);

            //change frame color
            getContentPane().setBackground(FRAME_COLOR);
            addGuiComponents();
         }   
         
         private void addGuiComponents(){
            //add toolbar
            addToolbar();

            //load record image
            JLabel songImage = new JLabel(loadImage("C:\\Users\\JAHNAVI SAXENA\\OneDrive\\Desktop\\Academic\\SEM 4\\OOPS\\Capstone Project\\M\\mp3\\src\\Assets\\record.png"));
            songImage.setBounds(0,50, getWidth() - 20, 225);
            add(songImage);

            //songtitle
            JLabel songTitle = new JLabel("Song Title");
            songTitle.setBounds(0,285, getWidth()-10, 30);
            songTitle.setFont(new Font("Dialog", Font.BOLD, 24));
            songTitle.setForeground(TEXT_COLOR);
            songTitle.setHorizontalAlignment(SwingConstants.CENTER);
            add(songTitle);

            //songartist
            JLabel songArtist = new JLabel("Artist");
            songArtist.setBounds(0,315,getWidth()-10,30);
            songArtist.setFont(new Font("Dialog",Font.PLAIN,24));
            songArtist.setForeground(TEXT_COLOR);
            songArtist.setHorizontalAlignment(SwingConstants.CENTER);
            add(songArtist);

            //playback slider
            JSlider playbackSlider = new JSlider(JSlider.HORIZONTAL,0,100,0);
            playbackSlider.setBounds(getWidth()/2-300/2,365,300,40) ;
            playbackSlider.setBackground(null);
            add(playbackSlider);

            //playback buttons
            addPLayBackButtons();
        }   
        
         private void addToolbar(){

            JToolBar toolbar = new JToolBar();
            toolbar.setBounds(0,0,getWidth(),20); 
            
            toolbar.setFloatable(false);

            //add drop down menu
            JMenuBar menuBar = new JMenuBar();
            toolbar.add(menuBar); 

            //now we will add a song menu where we will place the loading song option
            JMenu songMenu = new JMenu("Song");
            menuBar.add(songMenu);

            //add the "load song" item in the song menu
            JMenuItem loadsong = new JMenuItem("Load Song");
            songMenu.add(loadsong);
            
            //now add the playlist menu
            JMenu playListMenu = new JMenu("Playlist");
            menuBar.add(playListMenu);

            //add items to the playlist menu
            JMenuItem createPlaylist = new JMenuItem("Create Playlist");
            playListMenu.add(createPlaylist);

            JMenuItem loadPlaylist = new JMenuItem("load Playlist");
            playListMenu.add(loadPlaylist);
            add(toolbar);
        }



        private void addPLayBackButtons(){
         JPanel playbackButtons = new JPanel();
         playbackButtons.setBounds(0,435,getWidth()-10,80);
         playbackButtons.setBackground(null);

         //previous button
         JButton prevButton = new JButton(loadImage("C:\\Users\\JAHNAVI SAXENA\\OneDrive\\Desktop\\Academic\\SEM 4\\OOPS\\Capstone Project\\M\\mp3\\src\\Assets\\previous.png"));
         prevButton.setBorderPainted(false);
         prevButton.setBackground(null);
         playbackButtons.add(prevButton);

         //play button
         JButton playButton = new JButton(loadImage("C:\\Users\\JAHNAVI SAXENA\\OneDrive\\Desktop\\Academic\\SEM 4\\OOPS\\Capstone Project\\M\\mp3\\src\\Assets\\play.png"));
         playButton.setBorderPainted(false);
         playButton.setBackground(null);
         playbackButtons.add(playButton);

         //pause button
         JButton pausebutton = new JButton(loadImage("C:\\Users\\JAHNAVI SAXENA\\OneDrive\\Desktop\\Academic\\SEM 4\\OOPS\\Capstone Project\\M\\mp3\\src\\Assets\\pause.png"));
         pausebutton.setBorderPainted(false);
         pausebutton.setBackground(null);
         pausebutton.setVisible(false);
         playbackButtons.add(pausebutton);

         //next button
         JButton nextButton = new JButton(loadImage("C:\\Users\\JAHNAVI SAXENA\\OneDrive\\Desktop\\Academic\\SEM 4\\OOPS\\Capstone Project\\M\\mp3\\src\\Assets\\next.png"));
         nextButton.setBorderPainted(false);
         nextButton.setBackground(null);
         playbackButtons.add(nextButton);

         add(playbackButtons);
        }
        private ImageIcon loadImage(String path){
         try{
            //read image file from the path
            BufferedImage image  = ImageIO.read(new File(path));

            return new ImageIcon(image);
         }catch(Exception e){
            e.printStackTrace();
         }

         return null;
        }
    }



