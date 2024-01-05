public class Test{
    public static void main(String[] args) {
        Produttore p1 = new Produttore("Fanta", "roma", true, "0448060293");
        Snack s1 = new Snack(p1, "lattina di fanta", "bibita", 300, 200);
        Distributore d1 = new Distributore("Fermi, Venezia", 25, 2, true);
        d1.caricaDistributore(s1);
        System.out.println("p1:\n" + p1 + "\n");
        System.out.println("s1:\n" + s1 + "\n");
        System.out.println("d1:\n" + d1 + "\n");
    }
}