import javax.swing.*;
public class MusicPlayerGUI extends JFrame {
         public MusicPlayerGUI(){
            super("Music Player");

            //set height and width
            setSize(400,600);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLocationRelativeTo(null); // Center the window on the screen
            setResizable(false);
            setLayout(null);

            addGuiComponents();
         }   
         
         private void addGuiComponents(){
            //add toolbar
            addToolbar();

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
    }

