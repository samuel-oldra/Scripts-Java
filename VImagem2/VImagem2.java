import java.awt.*;
import java.awt.event.*;

public class VImagem2 // Classe que define o programa principal (visualizador de imagem)
{
    public static void main(String args[]) {
        System.out.println("Iniciando programa...");

        Janela minhaJanela = new Janela(); // Cria a interface (janela) do programa

        System.out.println("Mostrando a janela...");

        minhaJanela.addWindowListener(new TratadorDeEventos()); // Adiciona um novo objeto que vai ser respons vel por tratar os eventos de Janela (Abrir, Fechar, Maximizar...)

        minhaJanela.show(); // mostra a interface (janela)
    }
}

class Janela // Classe que define a interface (janela) do programa
extends Frame // ela e' uma classe-filha de Frame -> da' para colocar tudo na mesma linha: class Janela extends Frame
{
    // Atributos publicos da janela:

    public Panel pn_Imagem; // Painel onde a imagem vai ser colocada
    public Button bt_Carregar; // Botao "carregar imagem"
    public TextField tf_URL; // Endereco (ou diretorio) onde o arquivo de imagem esta' 
    public TextField tf_NomeArquivo; // O nome do arquivo de imagem
    public Label lb_Mensagem; // Mensagens de aviso e de erro sao colocadas aqui

    public Janela() // metodo construtor da janela
    {
        super("Visualizador de imagens"); // Chama o construtor da classe-pai Frame, passando o título da janela

        System.out.println("Criando interface...");

        Panel painelNorte = new Panel();
        Panel pNorteSuperior = new Panel();
        Panel pNorteInferior = new Panel();

        pn_Imagem = new Panel();
        pn_Imagem.setBackground(Color.blue);

        bt_Carregar = new Button("Carregar");
        tf_URL = new TextField("", 28);
        tf_NomeArquivo = new TextField("", 25);
        lb_Mensagem = new Label("Informe o local (URL) e o nome da imagem e pressione o botao Carregar", Label.CENTER);

        TratadorDeEventos tratEventos = new TratadorDeEventos(); // Cria um novo objeto que vai tratar os eventos gerados pelos componentes da interface

        bt_Carregar.addActionListener(tratEventos); // Indica qual e' o objeto que vai escutar/tratar os eventos gerados por esse botÆo
        pn_Imagem.addMouseListener(tratEventos);
        pn_Imagem.addMouseMotionListener(tratEventos);

        pNorteSuperior.add(new Label("Endereço(URL):"));
        pNorteSuperior.add(tf_URL);

        pNorteInferior.add(new Label("Arquivo:"));
        pNorteInferior.add(tf_NomeArquivo);
        pNorteInferior.add(bt_Carregar);

        painelNorte.setLayout(new GridLayout(2, 1)); // Seleciona um layout de 2 linhas com 1 coluna cada para o painelNorte

        painelNorte.add(pNorteSuperior);
        painelNorte.add(pNorteInferior);

        this.setLayout(new BorderLayout());
        this.add("North", painelNorte); // Adiciona o painelNorte na região norte (superior) da janela
        this.add("South", lb_Mensagem); // Adiciona a mensagem na região sul (inferior) da janela
        this.add("Center", pn_Imagem); // Adiciona a imagem na região central da janela

        this.resize(450, 400); // Altera o tamanho inicial da janela para 450lx400c pixeis
    }

    public void start() {
        this.show();
    }
}

class TratadorDeEventos // Classe que define o tratador de eventos do programa
extends WindowAdapter // ela e' uma classe-filha de WindowAdapter (uma classe que trata eventos gerados por janelas/frames)
implements ActionListener, // al‚m disso, ela implementa metodos de uma ActionListener, que trata eventos gerados por componentes de uma janela (botoes, textfields...)
MouseListener,
MouseMotionListener {
    // ************************************************************
    // Eventos gerados por Janelas (Herdados de WindowAdapter)

    public void windowClosing(WindowEvent e) // WindowClosing ‚ um metodo chamado quando o usuario manda fechar a janela
    {
        System.out.println("Finalizando programa...");

        System.exit(0); // Esse comando faz terminar o programa
    }

    // ************************************************************
    // Eventos gerados por componentes (Herdados de ActionListener)

    public void actionPerformed(ActionEvent ev) // Metodo chamado quando um evento de um componente e' gerado
    {
        String evento = ev.getActionCommand();
        System.out.println(" >>> Evento gerado: " + evento);
    }

    // ************************************************************
    // Eventos gerados pelo mouse (Herdados de MouseListener e MouseMotionListener)
    // MouseListener:

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

    // MouseMotionListener:

    public void mouseMoved(MouseEvent ev) {
        System.out.println("Mouse movido em " + ev.getSource() + " X: " + ev.getX() + " Y: " + ev.getY());
    }

    public void mouseDragged(MouseEvent ev) {}

}