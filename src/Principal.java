public class Principal {
    public static void main(String args[]) {
        Trabalhador severino = new Trabalhador("sapato", 100);
        Trabalhador raimundo = new Trabalhador("bota", 500);
        Trabalhador tiburcio = new Trabalhador("chinelo", 420);
        severino.start();
        raimundo.start();
        tiburcio.start();
    }
}
