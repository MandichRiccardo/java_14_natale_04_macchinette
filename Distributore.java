public class Distributore{
    private String luogo;
    private int articoliTotali;
    private int articoliPresenti;
    private int piano;
    private boolean daResto;
    private Snack[] prodotti;
    private Snack[] prodottiMancanti;

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
            if(prodotti[i] == null) prodotti[i] = s;
        }
    }

    public void selezioneSnack(Snack s){
        int i=0;
        while(i<prodotti.length && !prodotti[i].equals(s)) i++;
        if(i< prodotti.length){
            prodotti[i] = null;
            int j=0;
            boolean finito = true;
            while(j<prodotti.length){
                if(prodotti[j].equals(s)) finito = false;
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
        for(Snack articolo:prodotti) info = info.concat(articolo.toString());
        for(Snack articolo:prodottiMancanti) info = info.concat(articolo.toString());
        return info;
    }
}