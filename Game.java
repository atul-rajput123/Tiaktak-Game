import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class FDemo extends Frame implements ActionListener
{
    Button b[]=new Button[9];
    FDemo()
    {
        setLayout(null);
        setResizable(false);
        Font f=new Font(" ",Font.BOLD,25);
        setFont(f);
        int k=0;
        int x,y,w,h;
        x=y=w=h=100;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                b[j]=new Button();
                b[j].setSize(w,h);
                b[j].setLocation(x,y);
                b[j].addActionListener(this);
                add(b[j]);
                k++;
                x+=100;
            }
            x=100;
            y+=100;
        }
        Label l1=new Label("User 1 => 0");
        l1.setSize(150,50);
        l1.setLocation(50,450);
        l1.setBackground(Color.blue);
        add(l1);

        Label l2=new Label("User 2 => x");
        l2.setSize(150,50);
        l2.setLocation(300,450);
        l2.setBackground(Color.yellow);
        add(l2);
         Font f1=new Font("",Font.BOLD,35);
        Label l3=new Label("Atul Rajput");
        l3.setSize(200,50);
        l3.setLocation(150,40);
        l3.setBackground(Color.yellow);
        l3.setFont(f1);
        add(l3);
     

    }
    int c=0;
    public void actionPerformed(ActionEvent e)
    {
        Button b11=(Button)e.getSource();
        if(c==0)
        {
            b11.setLabel("0");
            b11.setBackground(Color.blue);
            c=1;
        }
        else
        {
            b11.setLabel("X");
            b11.setBackground(Color.yellow);
            c=0;
        }
        b11.removeActionListener(this);

    }

}
class Demo1
{
    public static void main(String ar[])
    {
        FDemo f=new FDemo();
        f.setVisible(true);
        f.setLocation(1000,200);
        f.setSize(500,600);
        f.setBackground(Color.red);

    }
}