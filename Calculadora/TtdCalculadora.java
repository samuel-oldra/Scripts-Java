// import files.
import java.awt.event.*;

public class TtdCalculadora
extends WindowAdapter
implements ActionListener, MouseListener, MouseMotionListener {

    // WindowsAdapter -> chamado quando o usuário manda fechar janela.
    public void windowClosing(WindowEvent e) {
        System.out.println("Finalizando programa...");
        System.exit(0); // Esse comando faz terminar o programa
    }

    // ActionListener -> chamado quando o usuário clica em um componente.
    public void actionPerformed(ActionEvent ev) {
        String evento = ev.getActionCommand();
        System.out.println(" >>> Evento gerado: " + evento);
    }

    public void mouseClicked(MouseEvent ev) {
        System.out.println("Mouse clicado no painel");
    }

    public void mouseEntered(MouseEvent ev) {
        System.out.println("Mouse entrou no painel");
    }

    public void mouseExited(MouseEvent ev) {
        System.out.println("Mouse saiu do painel");
    }

    public void mousePressed(MouseEvent ev) {
        System.out.println("Mouse pressionado no painel");
    }

    public void mouseReleased(MouseEvent ev) {
        System.out.println("Mouse solto do painel");
    }

    public void mouseMoved(MouseEvent ev) {
        System.out.println("Mouse movido em " + ev.getSource() + " X: " + ev.getX() + " Y: " + ev.getY());
    }

    public void mouseDragged(MouseEvent ev) {}
}