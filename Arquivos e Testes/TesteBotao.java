import java.awt.*;
import java.awt.event.*;

public class TesteBotao extends Frame implements ActionListener {
    public TesteBotao() {
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        setSize(300, 200);
        setLayout(new FlowLayout());
        Button botaoAmarelo = new Button("Amarelo");
        add(botaoAmarelo);
        botaoAmarelo.addActionListener(this);
        Button botaoAzul = new Button("Azul");
        add(botaoAzul);
        botaoAzul.addActionListener(this);
        Button botaoVermelho = new Button("Vermelho");
        add(botaoVermelho);
        botaoVermelho.addActionListener(this);
    }

    public void actionPerformed(ActionEvent evt) {
        String arg = evt.getActionCommand();
        Color cor = Color.black;
        if (arg.equals("Amarelo"))
            cor = Color.yellow;
        else
        if (arg.equals("Azul"))
            cor = Color.blue;
        else
        if (arg.equals("Vermelho"))
            cor = Color.red;
        setBackground(cor);
        repaint();
    }

    public static void main(String[] args) {
        Frame f = new TesteBotao();
        f.show();
    }
}