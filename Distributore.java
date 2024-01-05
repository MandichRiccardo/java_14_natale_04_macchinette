public class Distributore{
    private String luogo;
    private int articoliTotali;
    private int articoliPresenti;
    private int piano;
    private boolean daResto;
    private Snack[] prodotti;
    private Snack[] prodottiMancanti;

    public Distributore(String luogo, int articoliTotali, int piano, boolean daResto) {
        this.luogo = luogo;
        if(articoliTotali%5==0){
            this.articoliTotali = articoliTotali;
            this.prodotti = new Snack[articoliTotali];
            this.prodottiMancanti = new Snack[articoliTotali/5];
        }else System.out.println("questo valore non è accettabile per il numero di articoli totali, di conseguenza non lo ho inserito e quindi non ho potuto creare i due array");
        articoliPresenti = 0;
        this.piano = piano;
        this.daResto = daResto;
    }

    public void setArticoliTotali(int articoliTotali) {
        if(prodotti == null){
            this.articoliTotali = articoliTotali;
            this.prodotti = new Snack[articoliTotali];
            this.prodottiMancanti = new Snack[articoliTotali/5];
        }
    }

    public void caricaDistributore(Snack s){
        int i=0;
        int presenti=0;
        while(i< prodotti.length && presenti<5){
            if(prodotti[i]!=null){
                if(prodotti[i].equals(s)) presenti++;
            }
            i++;
        }
        if(presenti<5){
            i=0;
            while (i<prodotti.length && prodotti[i]!=null) i++;
            if(prodotti[i] == null){
                prodotti[i] = s;
                articoliPresenti++;
            }
        }else{
            System.out.println("erano già presenti cinque articoli di questo snack");
        }
    }

    public void selezioneSnack(Snack s){
        int i=0;
        while(i<prodotti.length && (prodotti[i] == null || !prodotti[i].equals(s))) i++;
        if(i< prodotti.length){
            prodotti[i] = null;
            articoliPresenti--;
            int j=0;
            boolean finito = true;
            while(j<prodotti.length){
                if(prodotti[j]!=null) {
                    if (prodotti[j].equals(s)) finito = false;
                }
                j++;
            }
            if(finito){
                j=0;
                while(j<prodottiMancanti.length && prodottiMancanti[j] != null) j++;
                prodottiMancanti[j] = s;
            }
        }
    }

    public String toString(){
        String info = "";
        info += "luogo:\t" + luogo + "\n";
        info += "articoli totali:\t" + articoliTotali + "\n";
        info += "articoli presenti:\t" + articoliPresenti + "\n";
        info += "piano:\t" + piano + "\n";
        if(!daResto) info += "non ";
        info += "da resto\n";
        info += "prodotti:\n";
        for(Snack articolo:prodotti){
            if(articolo!=null) info = info.concat(articolo.toString());
            else info = info.concat("\tquesto snack deve ancora essere inserito\n");
        }
        info += "prodotti mancanti:\n";
        for(Snack articolo:prodottiMancanti){
            if(articolo!=null) info = info.concat(articolo.toString());
            else info = info.concat("\tquesto snack deve ancora essere inserito\n");
        }
        return info;
    }
}