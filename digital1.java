import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
class digital extends Frame implements Runnable
{
int a,b,c,d,e,f;
digital()
{
addWindowListener(new WindowAdapter()
 {
public void windowClosing(WindowEvent e)
{
System.exit(0);
}
});
}
public void run()
{
while(true)
{
String str;
SimpleDateFormat sd=new SimpleDateFormat("HH:mm:ss");
str=sd.format(new Date());
String s[]=str.split(":");
int arr[]=new int[s.length];
for(int i=0;i<arr.length;i++)
arr[i]=Integer.parseInt(s[i]);
a=arr[0]/10;
b=arr[0]%10;
c=arr[1]/10;
d=arr[1]%10;
e=arr[2]/10;
f=arr[2]%10;
repaint();
try
{
Thread.sleep(50);
}
catch(InterruptedException e1)
{
System.out.println(e1);
}
}
}
public void paint(Graphics g)
{
g.fillOval(370,125,10,10);
g.fillOval(370,275,10,10);
g.fillOval(690,125,10,10);
g.fillOval(690,275,10,10);
switch(a)
{
case 0:
zero(100,100,g);
break;
case 1:
one(100,100,g);
break;
case 2:
two(100,100,g);
break;
case 3:
three(100,100,g);
break;
case 4:
four(100,100,g);
break;
case 5:
five(100,100,g);
break;
case 6:
six(100,100,g);
break;
case 7:
seven(100,100,g);
break;
case 8:
eight(100,100,g);
break;
case 9:
nine(100,100,g);
break;
}
switch(b)
{
case 0:
zero(220,100,g);
break;
case 1:
one(220,100,g);
break;
case 2:
two(220,100,g);
break;
case 3:
three(220,100,g);
break;
case 4:
four(220,100,g);
break;
case 5:
five(220,100,g);
break;
case 6:
six(220,100,g);
break;
case 7:
seven(220,100,g);
break;
case 8:
eight(220,100,g);
break;
case 9:
nine(220,100,g);
break;
}
switch(c)
{
case 0:
zero(420,100,g);
break;
case 1:
one(420,100,g);
break;
case 2:
two(420,100,g);
break;
case 3:
three(420,100,g);
break;
case 4:
four(420,100,g);
break;
case 5:
five(420,100,g);
break;
case 6:
six(420,100,g);
break;
case 7:
seven(420,100,g);
break;
case 8:
eight(420,100,g);
break;
case 9:
nine(420,100,g);
break;
}
switch(d)
{
case 0:
zero(540,100,g);
break;
case 1:
one(540,100,g);
break;
case 2:
two(540,100,g);
break;
case 3:
three(540,100,g);
break;
case 4:
four(540,100,g);
break;
case 5:
five(540,100,g);
break;
case 6:
six(540,100,g);
break;
case 7:
seven(540,100,g);
break;
case 8:
eight(540,100,g);
break;
case 9:
nine(540,100,g);
break;
}
switch(e)
{
case 0:
zero(740,100,g);
break;
case 1:
one(740,100,g);
break;
case 2:
two(740,100,g);
break;
case 3:
three(740,100,g);
break;
case 4:
four(740,100,g);
break;
case 5:
five(740,100,g);
break;
case 6:
six(740,100,g);
break;
case 7:
seven(740,100,g);
break;
case 8:
eight(740,100,g);
break;
case 9:
nine(740,100,g);
break;
}
switch(f)
{
case 0:
zero(860,100,g);
break;
case 1:
one(860,100,g);
break;
case 2:
two(860,100,g);
break;
case 3:
three(860,100,g);
break;
case 4:
four(860,100,g);
break;
case 5:
five(860,100,g);
break;
case 6:
six(860,100,g);
break;
case 7:
seven(860,100,g);
break;
case 8:
eight(860,100,g);
break;
case 9:
nine(860,100,g);
break;
}
}
public void zero(int x,int y,Graphics g)
{
g.drawLine(x,y,x+100,y);
g.drawLine(x,y,x,y+200);
g.drawLine(x+100,y,x+100,y+200);
g.drawLine(x,y+200,x+100,y+200);
} 
public void one(int x,int y,Graphics g)
{
g.drawLine(x+100,y,x+100,y+200);
} 
public void two(int x,int y,Graphics g)
{
g.drawLine(x,y,x+100,y);
g.drawLine(x+100,y,x+100,y+100);
g.drawLine(x,y+100,x+100,y+100);
g.drawLine(x,y+100,x,y+200);
g.drawLine(x,y+200,x+100,y+200);
} 
public void three(int x,int y,Graphics g)
{
g.drawLine(x,y,x+100,y);
g.drawLine(x+100,y,x+100,y+100);
g.drawLine(x,y+100,x+100,y+100);
g.drawLine(x+100,y+100,x+100,y+200);
g.drawLine(x,y+200,x+100,y+200);
} 
public void four(int x,int y,Graphics g)
{
g.drawLine(x,y,x,y+100);
g.drawLine(x+100,y,x+100,y+100);
g.drawLine(x,y+100,x+100,y+100);
g.drawLine(x+100,y+100,x+100,y+200);
} 
public void five(int x,int y,Graphics g)
{
g.drawLine(x,y,x+100,y);
g.drawLine(x,y,x,y+100);
g.drawLine(x,y+100,x+100,y+100);
g.drawLine(x+100,y+100,x+100,y+200);
g.drawLine(x,y+200,x+100,y+200);
} 
public void six(int x,int y,Graphics g)
{
g.drawLine(x,y,x+100,y);
g.drawLine(x,y+100,x+100,y+100);
g.drawLine(x+100,y+100,x+100,y+200);
g.drawLine(x,y+200,x+100,y+200);
g.drawLine(x,y,x,y+100);
g.drawLine(x,y+100,x,y+200);
} 
public void seven(int x,int y,Graphics g)
{
g.drawLine(x,y,x+100,y);
g.drawLine(x+100,y,x+100,y+100);
g.drawLine(x+100,y+100,x+100,y+200);
} 
public void eight(int x,int y,Graphics g)
{
g.drawLine(x,y,x+100,y);
g.drawLine(x+100,y,x+100,y+100);
g.drawLine(x,y+100,x+100,y+100);
g.drawLine(x+100,y+100,x+100,y+200);
g.drawLine(x,y+200,x+100,y+200);
g.drawLine(x,y,x,y+100);
g.drawLine(x,y+100,x,y+200);
} 
public void nine(int x,int y,Graphics g)
{
g.drawLine(x,y,x+100,y);
g.drawLine(x+100,y,x+100,y+100);
g.drawLine(x,y+100,x+100,y+100);
g.drawLine(x+100,y+100,x+100,y+200);
g.drawLine(x,y+200,x+100,y+200);
g.drawLine(x,y,x,y+100);
} 
}
class digital1
{
public static void main(String args[])
{
digital d=new digital();
d.setBackground(Color.gray);
d.setSize(1000,500);
d.setVisible(true);
d.setTitle("digital");
Thread t1=new Thread(d);
t1.start();
}
}