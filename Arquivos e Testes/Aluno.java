public class Aluno // superclasse
{
  String nome, RA, curso, endereco;
  int idade;

  public Aluno() // construtora 1
  {
    nome = "Vitor";
    RA = "8711970";
    curso = "PDD";
    endereco = "Rua Y";
    idade = 33;
  }

  public Aluno(String nome, String RA, String curso, String endereco) // construtora 2
  {
    this.nome = nome;
    this.RA = RA;
    this.curso = curso;
    this.endereco = endereco;
    idade = 20;
  }

  public void quemEVoce()
  {
    System.out.println("Nome: " + nome);
    System.out.println("RA: " + RA);
    System.out.println("Curso: " + curso);
    System.out.println("Endereco: " + endereco);
    System.out.println("Idade: " + idade);
  }

  public void fazerCursoFerias()
  {
    System.out.println("Nao percam o Curso de Ferias de Laboratorio VI");
    System.out.println("Brevemente em seu boletim !");
    System.out.println("Participem !!! :))");
  }

  public static void main (String[] args)
  {
    Aluno maria = new Aluno("maria", "123", "CCOMP", "Rua x");
    maria.quemEVoce();
    Mestrado vitor = new Mestrado();
    vitor.quemEVoce();
    Mestrado fabiane = new Mestrado("Fabiane", "456", "CCOMP", "Rua Z");
    fabiane.quemEVoce();
  }
}

class Mestrado extends Aluno //subclasse
{
  String dissertacao;

  Mestrado() // construtora 1
  {
    super();
    dissertacao = "Inteligencia Artificial";
  }

  Mestrado(String nome, String RA, String curso, String endereco) // construtora 1
  {
    super(nome, RA, curso, endereco);
    dissertacao = "Computacao Grafica";
  }

  public void quemEVoce()
  {
    System.out.println("Nome: " + nome);
    System.out.println("RA: " + RA);
    System.out.println("Curso: " + curso);
    System.out.println("Endereco: " + endereco);
    System.out.println("Idade: " + idade);
    System.out.println("Dissertacao: " + dissertacao);
  }
}