import java.awt.Graphics;
import java.awt.Font;
import java.awt.Color;
import java.applet.Applet;
public class TestaApplet extends Applet
{
  Font f = new Font("TimesRoman",Font.BOLD,36);
  String nome;
  public void init()
  {
    nome = getParameter("nome");
    if (nome == null)
      nome = "Mundo";
    nome = "Oi " + nome + "!";
  }
  public void paint(Graphics g)
  {
    g.setFont(f);
    g.setColor(Color.red);
    g.drawString(nome, 5, 50);
  }
}