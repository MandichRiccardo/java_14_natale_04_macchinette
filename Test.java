public class Test{
    public static void main(String[] args) {
        Produttore p1 = new Produttore("Fanta", "roma", true, "0448060293");
        Produttore p2 = new Produttore("coca cola", "milano", true, "0440293585");
        Produttore p3 = new Produttore("sprite", "new york", true, "5468060293");
        Produttore p4 = new Produttore("chinotto", "palermo", true, "0448060351");
        Snack s1 = new Snack(p1, "lattina di fanta", "bibita", 300, 200);
        Snack s2 = new Snack(p2, "lattina di coca cola", "bibita", 300, 200);
        Snack s3 = new Snack(p3, "lattina di sprite", "bibita", 300, 200);
        Snack s4 = new Snack(p4, "lattina di chinotto", "bibita", 300, 200);
        Distributore d1 = new Distributore("Fermi, Venezia", 25, 2, true);
        d1.caricaDistributore(s1);
        System.out.println("p1:\n" + p1 + "\n");
        System.out.println("s1:\n" + s1 + "\n");
        System.out.println("d1:\n" + d1 + "\n");
        System.out.println("ora carico il seguente articolo:\n" + s1);
        d1.caricaDistributore(s1);
        System.out.println("ora carico il seguente articolo:\n" + s1);
        d1.caricaDistributore(s1);
        System.out.println("ora carico il seguente articolo:\n" + s1);
        d1.caricaDistributore(s1);
        System.out.println("ora carico il seguente articolo:\n" + s1);
        d1.caricaDistributore(s1);
        System.out.println("ora carico il seguente articolo:\n" + s1);
        d1.caricaDistributore(s1);
        System.out.println("ora carico il seguente articolo:\n" + s1);
        d1.caricaDistributore(s1);
        System.out.println("ora carico il seguente articolo:\n" + s1);
        d1.caricaDistributore(s1);

        System.out.println("ora carico il seguente articolo:\n" + s2);
        d1.caricaDistributore(s2);
        System.out.println("ora carico il seguente articolo:\n" + s2);
        d1.caricaDistributore(s2);
        System.out.println("ora carico il seguente articolo:\n" + s2);
        d1.caricaDistributore(s2);
        System.out.println("ora carico il seguente articolo:\n" + s2);
        d1.caricaDistributore(s2);
        System.out.println("ora carico il seguente articolo:\n" + s2);
        d1.caricaDistributore(s2);
        System.out.println("ora carico il seguente articolo:\n" + s2);
        d1.caricaDistributore(s2);
        System.out.println("ora carico il seguente articolo:\n" + s2);
        d1.caricaDistributore(s2);

        System.out.println("ora carico il seguente articolo:\n" + s3);
        d1.caricaDistributore(s3);
        System.out.println("ora carico il seguente articolo:\n" + s3);
        d1.caricaDistributore(s3);
        System.out.println("ora carico il seguente articolo:\n" + s3);
        d1.caricaDistributore(s3);
        System.out.println("ora carico il seguente articolo:\n" + s3);
        d1.caricaDistributore(s3);
        System.out.println("ora carico il seguente articolo:\n" + s3);
        d1.caricaDistributore(s3);
        System.out.println("ora carico il seguente articolo:\n" + s3);
        d1.caricaDistributore(s3);
        System.out.println("ora carico il seguente articolo:\n" + s3);
        d1.caricaDistributore(s3);

        System.out.println("ora carico il seguente articolo:\n" + s4);
        d1.caricaDistributore(s4);
        System.out.println("ora carico il seguente articolo:\n" + s4);
        d1.caricaDistributore(s4);
        System.out.println("ora carico il seguente articolo:\n" + s4);
        d1.caricaDistributore(s4);
        System.out.println("ora carico il seguente articolo:\n" + s4);
        d1.caricaDistributore(s4);
        System.out.println("ora carico il seguente articolo:\n" + s4);
        d1.caricaDistributore(s4);
        System.out.println("ora carico il seguente articolo:\n" + s4);
        d1.caricaDistributore(s4);
        System.out.println("ora carico il seguente articolo:\n" + s4);
        d1.caricaDistributore(s4);
        System.out.println("d1:\n" + d1 + "\n");


    }
}