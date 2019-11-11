package main;
import java.applet.AudioClip;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import static main.dagan.*;
public class methods extends JFrame {
    int score, range;
    String command ;
    public void collision(String k){
        if(player1.getBounds().intersects(wall1.getBounds())||player1.getBounds().intersects(wall.getBounds())||
            player1.getBounds().intersects(wall2.getBounds())||player1.getBounds().intersects(wall3.getBounds())||
            player1.getBounds().intersects(wall4.getBounds())||player1.getBounds().intersects(wall5.getBounds())||
            player1.getBounds().intersects(wall6.getBounds())||player1.getBounds().intersects(wall7.getBounds())||
            player1.getBounds().intersects(wall8.getBounds())||player1.getBounds().intersects(wall9.getBounds())||
            player1.getBounds().intersects(wall11.getBounds())||player1.getBounds().intersects(wall12.getBounds())||
            player1.getBounds().intersects(wall13.getBounds())||player1.getBounds().intersects(wallni.getBounds())||
            player1.getBounds().intersects(wallni1.getBounds())||player1.getBounds().intersects(wallni2.getBounds())||
            player1.getBounds().intersects(wallni3.getBounds())||player1.getBounds().intersects(wallni4.getBounds())||
            player1.getBounds().intersects(wallni8.getBounds())||player1.getBounds().intersects(walla.getBounds())||
            player1.getBounds().intersects(walla1.getBounds())||player1.getBounds().intersects(walla2.getBounds())||
            player1.getBounds().intersects(walla3.getBounds())||player1.getBounds().intersects(walla4.getBounds())||
            player1.getBounds().intersects(walla6.getBounds())){
                if(k.equals("up")){
                    player1.setLocation(player1.getX(),player1.getY()+20);
                }else if(k.equals("down")){
                    player1.setLocation(player1.getX(),player1.getY()-20);
                }else if(k.equals("right")){
                    player1.setLocation(player1.getX()-20,player1.getY());
                }else if(k.equals("left")){
                    player1.setLocation(player1.getX()+20,player1.getY());
               }
        }
    }
    public void frame(JPanel k){
        main.removeAll();
        main.add(k);  
        main.repaint();
        main.revalidate();
    }
    public void one(AudioClip game) {
        range++;
        enemy4.setLocation(enemy4.getX(),enemy4.getY()+5);
        enemy1.setLocation(enemy1.getX(),enemy1.getY()+5);
        enemy3.setLocation(enemy3.getX()+10,enemy3.getY());
         if(player1.getBounds().intersects(enemy1.getBounds())){
             display(endPnl,game);
         } else if(player1.getBounds().intersects(enemy4.getBounds())){
             display(endPnl,game);
        }else if(player1.getBounds().intersects(enemy3.getBounds())){
             display(endPnl,game);
        }
         if(enemy4.getY()-enemy4.getHeight()==550||enemy1.getY()-enemy1.getHeight()==550||enemy3.getY()-enemy3.getWidth()==800){
              int r=(int)(Math.random()*3);
              if(r==0)
                 random();
              if(r==1)
                  random();
              if(r==2)  
                  random();
          }
    }
    void display(JPanel ni,AudioClip me){
        me.play();
        frame(ni);
        txtDisplay.setText(txtscore.getText());
        txtDisplayName.setText(txtName.getText());
    }
    void random(){
         enemy1.setLocation(570,0);
         enemy4.setLocation(235,0);
         enemy3.setLocation(0,230);
    }
    void eatFoods(){
         if(player1.getBounds().intersects(f1.getBounds())){
                setScore(50,d5,f1);
                JOptionPane.showMessageDialog(null,"Gate 2 open");
         }else if(player1.getBounds().intersects(f5.getBounds())){
                setScore(100,d2,f5 );
                JOptionPane.showMessageDialog(null,"Gate 3 open");
         }else if(player1.getBounds().intersects(f6.getBounds())){
                setScore(150,d4,f6);
                JOptionPane.showMessageDialog(null,"Gate 4 open");
         }else if(player1.getBounds().intersects(f7.getBounds())){
               setScore(200,d1,f7);
               JOptionPane.showMessageDialog(null,"Gate 5 open");
         }else if(player1.getBounds().intersects(f8.getBounds())){
              setScore(300,d6,f8); 
              frame(victoryPnl);
              txtDisplay.setText(txtscore.getText());
              txtDisplayName.setText(txtName.getText());
         }else if(player1.getBounds().intersects(f91.getBounds())){
              setScore(250,d3,f91);
              JOptionPane.showMessageDialog(null,"Gate 6 open");
         }
    }
    void setScore(int num,JLabel ni,JLabel size){
            size.setSize(0,0);  
            score+=num;
            txtscore.setText(""+score);
            ni.setSize(0,0);
    }
    void run(KeyEvent ni, AudioClip one){
        eatFoods();
        int x1 = player1.getX();
        int y1 = player1.getY();
        switch(ni.getKeyCode()){
            case KeyEvent.VK_DOWN:
                if(!(y1>500)){
                    player1.setLocation(x1,y1+20);
                    trial("down",one);
                     System.out.print(y1);
                        System.out.println(x1);
                 }
            break;
            case KeyEvent.VK_LEFT:
                if(!(x1<0)){
                        player1.setLocation(x1-20,y1);
                         trial("left",one);
                          System.out.print(y1);
                        System.out.println(x1);
                     }
               break;
               case KeyEvent.VK_RIGHT:
                    if(!(x1>=800)){
                        player1.setLocation(x1+20,y1);
                        trial("right",one);
                        System.out.print(y1);
                        System.out.println(x1);
                    }
               break;
               case KeyEvent.VK_UP:
                    if(!(y1<=0)){   
                        player1.setLocation(x1,y1-20);
                        trial("up",one);
                         System.out.print(y1);
                        System.out.println(x1);
                    }
               break;    
        }
    }
    void trial(String ni,AudioClip again){
        collision(ni);
        again.play();
    }
}