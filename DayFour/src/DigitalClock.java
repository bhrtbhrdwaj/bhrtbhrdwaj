    import java.applet.*;  
    import java.awt.*;  
    import java.util.*;  
    import java.text.*;  
      
    public class DigitalClock extends Applet implements Runnable {  
      
		private static final long serialVersionUID = 1L;
	
		Thread t = null;  
       int hours=0, minutes=0, seconds=0;  
       String timeString = "";  
      
       public void init() {  
       //   setBackground( Color.green);  
       }  
      
       public void start() {  
            t = new Thread( this );  
            t.start();  
       }  
      
        
       public void run() {  
          try {  
             while (true) {  
      
                Calendar cal = Calendar.getInstance();    
      
                SimpleDateFormat formatter = new SimpleDateFormat("hh:mm:ss");  
                Date date = cal.getTime();  
                timeString = formatter.format( date );  
      
                repaint();  
                Thread.sleep( 1000 );  // interval given in milliseconds  
             }  
          }  
          catch (Exception e) { }  
       }  
      
        
      public void paint( Graphics g ) {  
          g.setColor( Color.blue );  
          g.drawString( timeString, 50, 50 );  
       }  
    }  
