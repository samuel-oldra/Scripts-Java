// import files.
import java.awt.*;

public class WinCalculadora extends Frame {

    /*
    TextField = caixa de texto
    Label	  = escritas na janela
    Button	  = botões
    Panel	  = painel
    */

    // variáveis e/ou objetos.
    public TextField tfVisualizadorX; // vizuador da calculadora.
    public TextField tfVisualizadorY; // vizuador da calculadora.

    public Button btClear; // limpa a tela.
    public Button btClearAll; // limpa a tudo.

    public Button btMemoClear; // limpa a memória.
    public Button btMemoMostra; // mostra a memória.
    public Button btMemoMais; // incrementa a memória.
    public Button btMemoMenos; // decrementa a memória.

    public Button btUm; // tecla 1.
    public Button btDois; // tecla 2.
    public Button btTres; // tecla 3.
    public Button btQuatro; // tecla 4.
    public Button btCinco; // tecla 5.
    public Button btSeis; // tecla 6.
    public Button btSete; // tecla 7.
    public Button btOito; // tecla 8.
    public Button btNove; // tecla 9.
    public Button btZero; // tecla 0.
    public Button brPonto; // tecla ponto.
    public Button brIgual; // tecla igual.

    public Button btMais; // tecla mais.
    public Button btMenos; // tecla menos.
    public Button btVezes; // tecla vezes.
    public Button btDivide; // tecla divide.
    public Button btMod; // tecla Mod.
    public Button btDiv; // tecla Div.
    public Button btRaiz; // tecla Raiz.
    public Button btPorCento; // tecla Por Cento.

    public Label lbStatus; // status dos botões.


    public WinCalculadora() {

        // chama o método pai para dar o nome da janela.
        super("Calculadora");

        // inicializando os objetos.
        tfVisualizadorX = new TextField("", 100);
        tfVisualizadorY = new TextField("", 100);

        btClear = new Button("Clear");
        btClearAll = new Button("Clear All");

        btMemoClear = new Button("MC");
        btMemoMostra = new Button("MR");
        btMemoMais = new Button("M+");
        btMemoMenos = new Button("M-");

        btUm = new Button("1");
        btDois = new Button("2");
        btTres = new Button("3");
        btQuatro = new Button("4");
        btCinco = new Button("5");
        btSeis = new Button("6");
        btSete = new Button("7");
        btOito = new Button("8");
        btNove = new Button("9");
        btZero = new Button("0");
        brPonto = new Button(".");
        brIgual = new Button("=");

        btMais = new Button("+");
        btMenos = new Button("-");
        btVezes = new Button("*");
        btDivide = new Button("/");

        btMod = new Button("Mod");
        btDiv = new Button("Div");
        btRaiz = new Button("sqrt");
        btPorCento = new Button("%");

        lbStatus = new Label("O que é isto?");

        // colorindo os botões.
        tfVisualizadorX.setForeground(Color.black);
        tfVisualizadorY.setForeground(Color.red);

        btClear.setForeground(Color.black);
        btClearAll.setForeground(Color.black);

        btMemoClear.setForeground(Color.red);
        btMemoMostra.setForeground(Color.red);
        btMemoMais.setForeground(Color.red);
        btMemoMenos.setForeground(Color.red);

        btUm.setForeground(Color.black);
        btDois.setForeground(Color.black);
        btTres.setForeground(Color.black);
        btQuatro.setForeground(Color.black);
        btCinco.setForeground(Color.black);
        btSeis.setForeground(Color.black);
        btSete.setForeground(Color.black);
        btOito.setForeground(Color.black);
        btNove.setForeground(Color.black);
        btZero.setForeground(Color.black);
        brPonto.setForeground(Color.black);
        brIgual.setForeground(Color.red);

        btMais.setForeground(Color.blue);
        btMenos.setForeground(Color.blue);
        btVezes.setForeground(Color.blue);
        btDivide.setForeground(Color.blue);

        btMod.setForeground(Color.green);
        btDiv.setForeground(Color.green);
        btRaiz.setForeground(Color.green);
        btPorCento.setForeground(Color.green);

        lbStatus.setBackground(Color.white);
        lbStatus.setForeground(Color.black);

        // instanciando o tratador da janela.
        TtdCalculadora ttdEventos = new TtdCalculadora();

        // especificando o tratador dos botões.
        btClear.addActionListener(ttdEventos); // indica o objeto que irá
        btClearAll.addActionListener(ttdEventos); // tratar o evento.

        btMemoClear.addActionListener(ttdEventos);
        btMemoMostra.addActionListener(ttdEventos);
        btMemoMais.addActionListener(ttdEventos);
        btMemoMenos.addActionListener(ttdEventos);

        btUm.addActionListener(ttdEventos);
        btDois.addActionListener(ttdEventos);
        btTres.addActionListener(ttdEventos);
        btQuatro.addActionListener(ttdEventos);
        btCinco.addActionListener(ttdEventos);
        btSeis.addActionListener(ttdEventos);
        btSete.addActionListener(ttdEventos);
        btOito.addActionListener(ttdEventos);
        btNove.addActionListener(ttdEventos);
        btZero.addActionListener(ttdEventos);
        brPonto.addActionListener(ttdEventos);
        brIgual.addActionListener(ttdEventos);

        btMais.addActionListener(ttdEventos);
        btMenos.addActionListener(ttdEventos);
        btVezes.addActionListener(ttdEventos);
        btDivide.addActionListener(ttdEventos);

        btMod.addActionListener(ttdEventos);
        btDiv.addActionListener(ttdEventos);
        btRaiz.addActionListener(ttdEventos);
        btPorCento.addActionListener(ttdEventos);

        // criando paineis.
        Panel pnNorthI = new Panel();
        pnNorthI.setLayout(new GridLayout(1, 3));
        pnNorthI.add(tfVisualizadorY);
        pnNorthI.add(btClear);
        pnNorthI.add(btClearAll);

        Panel pnNorth = new Panel();
        pnNorth.setLayout(new GridLayout(2, 1));
        pnNorth.add(tfVisualizadorX);
        pnNorth.add(pnNorthI);

        Panel pnCenter = new Panel();
        pnCenter.setLayout(new GridLayout(4, 6));

        pnCenter.add(btMemoClear);
        pnCenter.add(btUm);
        pnCenter.add(btDois);
        pnCenter.add(btTres);
        pnCenter.add(btMais);
        pnCenter.add(btMod);

        pnCenter.add(btMemoMostra);
        pnCenter.add(btQuatro);
        pnCenter.add(btCinco);
        pnCenter.add(btSeis);
        pnCenter.add(btMenos);
        pnCenter.add(btDiv);

        pnCenter.add(btMemoMais);
        pnCenter.add(btSete);
        pnCenter.add(btOito);
        pnCenter.add(btNove);
        pnCenter.add(btVezes);
        pnCenter.add(btRaiz);

        pnCenter.add(btMemoMenos);
        pnCenter.add(btZero);
        pnCenter.add(brPonto);
        pnCenter.add(brIgual);
        pnCenter.add(btDivide);
        pnCenter.add(btPorCento);

        // adicionando a janela.
        this.setLayout(new BorderLayout());
        this.add("North", pnNorth);
        this.add("Center", pnCenter);
        this.add("South", lbStatus);

        // altera o tamanho inicial da janela
        this.resize(320, 220);
    }
}