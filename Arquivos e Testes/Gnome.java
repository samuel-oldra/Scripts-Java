public class Gnome {
    // variaveis de instancia:
    protected String name;
    protected int age; // (age = idade)
    protected Gnome gnome_buddy;
    private boolean magical = false;
    public double height = 2.6; // em pés (height = comprimento)
    public static final int MAX_HEIGHT = 3; // comprimento máximo

    // Construtores:
    Gnome(String nm, int ag, Gnome bud, double hgt) { // completamente parametrizada
        name = nm;
        age = ag;
        gnome_buddy = bud;
        height = hgt;
    }

    Gnome() { // Construtor padrão
        name = "Rumple";
        age = 204;
        gnome_buddy = null;
        height = 2.1;
    }

    // Métodos:
    public static void makeKing(Gnome h) {
        h.name = "Rei " + h.getRealName();
        h.magical = true; // Somente a classe Gnome pode referenciar este campo (private)
    }

    public void makeMeKing() {
        name = "Rei " + getRealName();
        magical = true;
    }

    public boolean isMagical() {
        return magical;
    }

    public void setHeight(int newHeight) {
        height = newHeight;
    }

    public String getName() {
        return "Eu não vou dizer!";
    }

    public String getRealName() {
        return name;
    }

    public void renameGnome(String s) {
        name = s;
    }
}