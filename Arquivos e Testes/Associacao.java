import java.io.*;

class Relogio {
    public String leString(String s) {
        String umaLinha = "";
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.print(s);
        try {
            umaLinha = input.readLine();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return umaLinha;
    }

    public String queHorasSao() {
        String hora = leString("Digite a hora: ");
        return hora;
    }
}

class Pessoa {
    Relogio relogio;
    String hora;

    Pessoa(Relogio r) {
        relogio = r;
        hora = relogio.queHorasSao();
        System.out.println("Segundo relogio, sao " + hora);
    }
}

public class Associacao {
    public void principal() {
        Relogio r = new Relogio();
        Pessoa p = new Pessoa(r);
    }

    public static void main(String args[]) {
        Associacao associacao = new Associacao();
        associacao.principal();
    }
}