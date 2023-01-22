import java.awt.*;
import java.awt.event.*;
class button extends Frame implements ActionListener
{
Button b;
button()
{
setTitle("Button");
b=new Button("Click Here");
setLayout(null);
add(b);
b.addActionListener(this);
b.setBounds(20,50,150,40);
setVisible(true);
setSize(400,300);
}
public void actionPerformed(ActionEvent ae)
{
b.setLabel("It`s Clicked");
}
public static void main(String args[])
{
new button();
}
}
