import java.awt.*;
import java.awt.event.*;
public class Ex3 extends Frame implements ActionListener
{
  Button b; Label l;
  public Ex3() // construtora
  {
    setSize(600, 400);
    addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent e){System.exit(0);}});
    setTitle("Exemplo de Aplicação Simples com Interface");
    l = new Label("", l.CENTER);
    add("Center", l);
    b = new Button("Pressione-me");
    add("South", b);
    b.addActionListener(this);
  }
  public void actionPerformed(ActionEvent e)
  {
    String arg = e.getActionCommand();
    if (arg.equals("Pressione-me"))
      l.setText("Oi Mundo !");
  }
  public static void main(String[] args)
  {
    Frame f = new Ex3();
    f.setVisible(true);
  }
}