import java.awt.*;
import java.awt.event.*;
import java.util.Calendar;
public class Line  extends Frame implements Runnable
{
    static int x=0;
Line()
{
   addWindowListener(new WindowAdapter()
         {
             public void windowClosing(WindowEvent e)
             {
                 System.exit(0);
             }
         });
  
         setLayout(null);
}
public void paint(Graphics gd)
{
      Graphics2D g = (Graphics2D) gd;    
     paintComponent(g);

    g.setStroke(new BasicStroke(7F));

     Calendar c=Calendar.getInstance();
           int m=c.get(Calendar.MINUTE);
           int h=c.get(Calendar.HOUR);
           int s=c.get(Calendar.SECOND);
               g.setColor(Color.red);
            
           t(g,m/10,200);
           t(g,m%10,280);
           t(g,s/10,360);
           t(g,s%10,440);
           t(g,h/10,40);
            t(g,h%10,120);
}
public void paintComponent(Graphics2D g)
{
    x=1;
g.fillOval(175, 50, 7, 7);
g.fillOval(175, 100, 7, 7);
  
g.fillOval(335, 50, 7, 7);
g.fillOval(335, 100, 7, 7);
    g.drawOval(175, 50, 7, 7);
  
     g.drawOval(175, 100, 7, 7);
     g.drawOval(335, 50, 7, 7);
     g.drawOval(335, 100, 7, 7);
}
public void run()
{
    while(true)
    {
        try{
        Thread.currentThread().sleep(1000);}catch(Exception e){}
        repaint();
      
    }
}  
public void one(Graphics g,int x,int y)
{
    if(x==360||x==40){
        g.drawLine(x+40,y,x+40,y+80);
  
    }
    else if(x==40||x==200)
    {
        g.drawLine(x+40,y,x+40,y+80);
    }
    else
    {
         g.drawLine(x,y,x,y+80);
    }
}
public void two(Graphics g,int x,int y)
{
    g.drawLine(x,y,x+40,y);
     g.drawLine(x+40,y,x+40,y+40);
     g.drawLine(x+40,y+40,x,y+40);
     g.drawLine(x,y+40,x,y+80);
      g.drawLine(x+40,y+80,x,y+80);
}
public void three(Graphics g,int x,int y)
{
     g.drawLine(x,y,x+40,y);
     g.drawLine(x+40,y,x+40,y+80);
      g.drawLine(x+40,y+40,x,y+40);
      g.drawLine(x+40,y+80,x,y+80);
    
}
public void four(Graphics g,int x,int y)
{
    g.drawLine(x,y,x,y+40);
     g.drawLine(x+40,y+40,x,y+40);
      g.drawLine(x+40,y,x+40,y+80);
    
}
public void five(Graphics g,int x,int y)
{
     g.drawLine(x,y,x+40,y);
     g.drawLine(x+40,y+40,x,y+40);
      g.drawLine(x+40,y+80,x,y+80);
       g.drawLine(x,y+40,x,y);
        g.drawLine(x+40,y+40,x+40,y+80);
}
public void six(Graphics g,int x,int y)
{
    g.drawLine(x,y,x+40,y);
     g.drawLine(x+40,y+40,x,y+40);
      g.drawLine(x+40,y+80,x,y+80);
       g.drawLine(x,y+80,x,y);
        g.drawLine(x+40,y+40,x+40,y+80);
      
}
public void seven(Graphics g,int x,int y)
{
    g.drawLine(x,y,x+40,y);
    g.drawLine(x+40,y,x+40,y+80);
}
public void eight(Graphics g,int x,int y)
{
     g.drawLine(x,y,x+40,y);
     g.drawLine(x+40,y+40,x,y+40);
      g.drawLine(x+40,y+80,x,y+80);
       g.drawLine(x,y+80,x,y);
        g.drawLine(x+40,y,x+40,y+80);
      
}
public void nine(Graphics g,int x,int y)
{
    g.drawLine(x,y,x+40,y);
     g.drawLine(x+40,y+40,x,y+40);
      g.drawLine(x,y+40,x,y);
      g.drawLine(x+40,y,x+40,y+80);
      g.drawLine(x+40,y+80,x,y+80);
}
public void zero(Graphics g,int x,int y)
{
     g.drawLine(x,y,x+40,y);
       g.drawLine(x,y,x,y+80);
      g.drawLine(x+40,y+80,x,y+80);
        g.drawLine(x+40,y,x+40,y+80);
}
public void t(Graphics g,int i,int x)
{
   switch(i)
   {
       case 1:
           one(g,x,40);
           break;
       case 2:
           two(g,x,40);
           break;
            case 6:
           six(g,x,40);
           break;
       case 3:
           three(g,x,40);
           break;
            case 4:
          four(g,x,40);
           break;
       case 5:
           five(g,x,40);
           break;
         case 7:
           seven(g,x,40);
           break;
            case 8:
           eight(g,x,40);
           break;
            case 9:
           nine(g,x,40);
           break;
            case 0:
           zero(g,x,40);
           break;
   }
}
    public static void main(String[] args) {
  Line l=new Line();
  Thread t=new Thread(l);
  l.setSize(600,600);
   l.setVisible(true);
  t.start();

}
}
