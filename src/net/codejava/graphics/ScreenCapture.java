package net.codejava.graphics;
 
import java.awt.AWTException;
import java.awt.Component;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.awt.Dimension;
import java.awt.event.InputEvent;
 
import javax.imageio.ImageIO;
 
import java.awt.MouseInfo;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import javax.swing.*;


/**
 * This program demonstrates how to capture a screenshot (full screen)
 * as an image which will be saved into a file.
 * @author www.codejava.net
 *
 */
public class ScreenCapture {
	
	static int west = 445;		//434
	static int north = 400; 	//438
	static int east = 800;		//800
	static int south = 565;	//612
	static int aax = 891;		//965
	static int aay = 627;		//700
	static int nextx = aax;	//965
	static int nexty = aay;	//700
	static int endx = aax;		//965
	static int endy = aay;		//700
 
    public static void main(String[] args)  throws Exception  {
  

    	
       // TimeUnit.MINUTES.sleep(7);
    	//  moveMouse (775,650);
      //	  clickMouse();
    	//getCursor();
    	
    	TimeUnit.SECONDS.sleep(15);

    //takePictureFull();
    //takePicturePartial();
  
   // moveMouse (100,470);   //850 200
    
    ///  noyt....... Display.getCurrent().getCursorLocation();
    
    	while(true) {
    	    	
    	
    	   //moveMouseWithClickMAIN();
    	   moveMouseWithClickTEMP();
    	COR();
    	}
    } 	
    
    
  public static void COR() throws Exception {
   
    int west = 1;

   
   NW();
    autoAttack();
    
   NW();
    autoAttack();
   
   NE();  //treasure
   
   NE();
    autoAttack();
    
   NE();
    autoAttack();
     
   NE();  //intersection
  
   NE();  //boss
   	TimeUnit.SECONDS.sleep(10);
   	autoAttack();
 
   NE();  //treasure 
 
   NW();
    autoAttack();
   	
   NW(); //   treasure
   	
   NW();
    autoAttack();
   	
   SW();
    autoAttack();
   	
   SW();
    autoAttack();
   	
   SW();  //treasure
   	
   SW();
    autoAttack();
   	
   NW();
    autoAttack();
   	
   NW();  //treasure
   
   SW();
    autoAttack();
   	
   SW();  //intersection
   
   SE();  //boss
    TimeUnit.SECONDS.sleep(10);
    autoAttack();
   	
   SE(); // treasure
   	
   SE();
    autoAttack();	
    
   SW();  //treasure
    
   NW();
    autoAttack();
    
   NW();  //treasure
    
   NW();
    autoAttack();   	
     
   NW();
    autoAttack();   	
     
   NW();  //treasure
    
   NW();
    autoAttack();   	
     
   NE();
    autoAttack();
    
   NE();  //BigBoss
    TimeUnit.SECONDS.sleep(15);
    autoAttack();
    
   NW();  //treasure
       
   NW();  //portal
   
   //autoAttack();   //clicking NEXT

   
   
   end();    //clicking thru treasure
   end();
   end();
   end();
   end();
   end();
   end();
   end();
   end();
   end();
   end();
   end();
   
   TimeUnit.SECONDS.sleep(14);
   
  }
  
      
    
    public static void NW() throws Exception {
    
    	  moveMouse (west, north);
    	  clickMouse();
    	  TimeUnit.SECONDS.sleep(7);
   
    }
    
    public static void NE() throws Exception {
        
  	  moveMouse (east, north);
  	  clickMouse();
  	  TimeUnit.SECONDS.sleep(7);
    }
    
    public static void SW() throws Exception {
        
  	  moveMouse (west, south);
  	  clickMouse();
  	  TimeUnit.SECONDS.sleep(7);
  	  
    }
    
    public static void SE() throws Exception {
        
  	  moveMouse (east, south);
  	  clickMouse();
  	  TimeUnit.SECONDS.sleep(7);
  	  
    }
    
    public static void autoAttack() throws Exception {
    	
    	TimeUnit.SECONDS.sleep(2);
    	moveMouse (aax, aay);
  	   	clickMouse();
  	   	TimeUnit.SECONDS.sleep(25);
 
  }
    
    public static void next() throws Exception {
    	
    	TimeUnit.SECONDS.sleep(1);
    	moveMouse (nextx, nexty);
  	   	clickMouse();
 
  }
    
    public static void end() throws Exception {
    	
    	TimeUnit.MILLISECONDS.sleep(200);
    	moveMouse (endx, endy);
    	//moveMouse (780,660);
  	   	clickMouse();
 
  }
    
    
    public static void moveMouse (int x, int y) throws Exception {
    // SET THE MOUSE X Y POSITION
      
    	try {
    		Robot robot = new Robot();
        
    		robot.mouseMove(x, y);
         
    		System.out.println("mouse moved to");
    	} catch (AWTException ex) {
    		System.err.println(ex);
    	}
    
    }
    
    public static void moveMouse (int x, int y, int time) throws Exception {
    // SET THE MOUSE X Y POSITION
      
    	try {
    		Robot robot = new Robot();
        
    		robot.mouseMove(x, y);
    		TimeUnit.SECONDS.sleep(time);
         
    		System.out.println("mouse moved to");
    	} catch (AWTException ex) {
    		System.err.println(ex);
    	}
    
    }
    
    
    public static void clickMouse() throws Exception {
    	
    	try {
        Robot robot = new Robot();

        // LEFT CLICK
        robot.mousePress(InputEvent.BUTTON1_MASK);
        TimeUnit.MILLISECONDS.sleep(100);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        TimeUnit.MILLISECONDS.sleep(200);

        /*
        // RIGHT CLICK
        robot.mousePress(InputEvent.BUTTON3_MASK);
        robot.mouseRelease(InputEvent.BUTTON3_MASK);
        // MIDDLE WHEEL CLICK
        robot.mousePress(InputEvent.BUTTON3_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
        // SCROLL THE MOUSE WHEEL
        robot.mouseWheel(-100);
        */
    	
        System.out.println("(" + MouseInfo.getPointerInfo().getLocation().x + 
                ", " + 
                MouseInfo.getPointerInfo().getLocation().y + ")");
        
    	//System.out.println("mouse left clicked");
        
    	} catch (AWTException ex) {
    		System.err.println(ex);
    	}

    }
    
   public static void clickMouse(int time)throws Exception {
    	
    	try {
        Robot robot = new Robot();

        // LEFT CLICK
        robot.mousePress(InputEvent.BUTTON1_MASK);
        TimeUnit.MILLISECONDS.sleep(100);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
    	TimeUnit.SECONDS.sleep(time);

        /*
        // RIGHT CLICK
        robot.mousePress(InputEvent.BUTTON3_MASK);
        robot.mouseRelease(InputEvent.BUTTON3_MASK);
        // MIDDLE WHEEL CLICK
        robot.mousePress(InputEvent.BUTTON3_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
        // SCROLL THE MOUSE WHEEL
        robot.mouseWheel(-100);
        */
        
    	
        System.out.println("(" + MouseInfo.getPointerInfo().getLocation().x + 
                ", " + 
                MouseInfo.getPointerInfo().getLocation().y + ")");
        
    	
        //System.out.println("mouse right clicked");
    	
    	} catch (AWTException ex) {
    		System.err.println(ex);
    	}
		
    }
    
    
    
    public static void takePictureFull () {
    	  try {
              Robot robot = new Robot();
              String format = "jpg";
              String fileName = "FullScreenshot." + format;
               
              Rectangle screenRect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
              BufferedImage screenFullImage = robot.createScreenCapture(screenRect);
              ImageIO.write(screenFullImage, format, new File(fileName));
               
              System.out.println("A full screenshot saved!");
          } catch (AWTException | IOException ex) {
              System.err.println(ex);
          }
    }
    public static void takePicturePartial() {
        try {
            Robot robot = new Robot();
            String format = "jpg";
            String fileName = "PartialScreenshot." + format;
             
            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            Rectangle captureRect = new Rectangle(0, 0, screenSize.width / 2, screenSize.height / 2);
            BufferedImage screenFullImage = robot.createScreenCapture(captureRect);
            ImageIO.write(screenFullImage, format, new File(fileName));
             
            System.out.println("A partial screenshot saved!");
        } catch (AWTException | IOException ex) {
            System.err.println(ex);
        }
    }
    
    //
    //NOT TESTED  
    //
    //http://www.codejava.net/java-se/graphics/how-to-capture-screenshot-programmatically-in-java
    //
  
    void captureComponent(Component component) {                Rectangle rect = component.getBounds();
     
        try {
            String format = "png";
            String fileName = component.getName() + "." + format;
            BufferedImage captureImage =
                    new BufferedImage(rect.width, rect.height,
                                        BufferedImage.TYPE_INT_ARGB);
            component.paint(captureImage.getGraphics());
     
            ImageIO.write(captureImage, format, new File(fileName));
     
            System.out.printf("The screenshot of %s was saved!", component.getName());
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }
 
    
    public static void moveMouseWithClickMAIN () throws Exception {
    // move mouse, press and hold mouse button, move mouse, and release button
      
    	try {
    		Robot robot = new Robot();
        
    		robot.mouseMove(883, 594);		//Gobline Tribe
    		clickMouse();
    	     TimeUnit.SECONDS.sleep(3);
    		robot.mouseMove(522, 480);
    		clickMouse();
    		TimeUnit.SECONDS.sleep(3);
    		
    		robot.mouseMove(842, 455);		//All Hail King Ballow
    		clickMouse();
    		TimeUnit.SECONDS.sleep(3);
    		robot.mouseMove(629, 305);
    		clickMouse();
    		TimeUnit.SECONDS.sleep(3);
    		
      		robot.mouseMove(816, 535);    	//Cataclysm
      		clickMouse();
    		TimeUnit.SECONDS.sleep(3);
    		robot.mouseMove(500, 350);
    		clickMouse();
    		TimeUnit.SECONDS.sleep(3);
    		
      		robot.mouseMove(960, 670);		//Reign of Silence
      		clickMouse();
    		TimeUnit.SECONDS.sleep(3);
    		robot.mouseMove(370, 636);
    		clickMouse();
    		TimeUnit.SECONDS.sleep(3);
    		
    		
    				
    		robot.mouseMove(751, 679);		//COR
    		clickMouse();
    		TimeUnit.SECONDS.sleep(3);
    		robot.mouseMove(526, 345);
    		clickMouse();
    		TimeUnit.SECONDS.sleep(3);
    		robot.mouseMove(609, 613);
    		clickMouse();
       		TimeUnit.SECONDS.sleep(25);	
    		
    		
    		
    		/*
    		TimeUnit.MILLISECONDS.sleep(500);
            robot.mousePress(InputEvent.BUTTON1_MASK);
            TimeUnit.MILLISECONDS.sleep(500);
            robot.mouseMove(790, 378);
            TimeUnit.MILLISECONDS.sleep(500);
            robot.mouseMove(700, 376);
            robot.mouseRelease(InputEvent.BUTTON1_MASK);
            */
           
         
    		
    		
    		

    	} catch (AWTException ex) {
    		System.err.println(ex);
    	}   
    }
    
    public static void getCursor() throws InterruptedException{
        while(true){
          //Thread.sleep(100);
          System.out.println("(" + MouseInfo.getPointerInfo().getLocation().x + 
                  ", " + 
                  MouseInfo.getPointerInfo().getLocation().y + ")");
        }
      }

    
    public static void moveMouseWithClickTEMP () throws Exception {
        // move mouse, press and hold mouse button, move mouse, and release button
          
        	try {
        		Robot robot = new Robot();
            
        		//getCursor();
        		  TimeUnit.SECONDS.sleep(3);
        		/*
        		robot.mouseMove(966, 453);
        		clickMouse();
        	     TimeUnit.SECONDS.sleep(3);
        		robot.mouseMove(242, 454);
        		clickMouse();
        		TimeUnit.SECONDS.sleep(3);
        	*/
        		/*  
          		robot.mouseMove(858, 536);  //Mon afternoon
          		clickMouse();
          	     TimeUnit.SECONDS.sleep(3);
          		robot.mouseMove(516, 332);
          		clickMouse();
          		TimeUnit.SECONDS.sleep(3);
        		robot.mouseMove(918, 597);
        		clickMouse();
        	    TimeUnit.SECONDS.sleep(3);
        		robot.mouseMove(409, 572);
        		clickMouse();
        		TimeUnit.SECONDS.sleep(3);
        		  */
        		  
            		robot.mouseMove(913, 416);  //Trial of the Gods w/ COR
              		clickMouse();
              	     TimeUnit.SECONDS.sleep(3);
              		robot.mouseMove(290, 407);
              		clickMouse();
              		TimeUnit.SECONDS.sleep(3);
            		robot.mouseMove(901, 446);
            		clickMouse();
            	    TimeUnit.SECONDS.sleep(3);
            		robot.mouseMove(543, 331);
            		clickMouse();
            		TimeUnit.SECONDS.sleep(3);
            		TimeUnit.SECONDS.sleep(3);
            		robot.mouseMove(601, 553);
            		clickMouse();
               		TimeUnit.SECONDS.sleep(20);
        		  
        		  
        		  
        		  
        		  
          	/*
        		
        		TimeUnit.SECONDS.sleep(3);
        		robot.mouseMove(729, 609);
        		clickMouse();
        		TimeUnit.SECONDS.sleep(3);
        		robot.mouseMove(539, 331);
        		clickMouse();
        		TimeUnit.SECONDS.sleep(3);
        		robot.mouseMove(601, 553);
        		clickMouse();
           		TimeUnit.SECONDS.sleep(20);	
           		*/
        		
        	} catch (AWTException ex) {
        		System.err.println(ex);
        	}   
        }
    
    
    
}