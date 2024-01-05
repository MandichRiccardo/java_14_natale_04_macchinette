public class Produttore{
    private String nome;
    private String sedeLegale;
    private boolean nazionale;          //nel caso di true opera in tutta italia altrimenti solo nella zona locale
    private String partitaIva;            //inserisco long perché altrimenti non basta la dimensione per inserire la partita iva

    public Produttore(String nome, String sedeLegale, boolean nazionale, String partitaIva) {
        this.nome = nome;
        this.sedeLegale = sedeLegale;
        this.nazionale = nazionale;
        this.partitaIva = partitaIva;
    }

    public String toString(){
        String info = "";
        info += "\t\tnome:\t" + nome + "\n";
        info += "\t\tsede legale:\t" + sedeLegale + "\n";
        if(nazionale) info += "\t\toperano in tutta italia\n";
        else info += "\t\toperano solo nella zona locale\n";
        info += "\t\tpartita iva:\t" + partitaIva + "\n";
        return info;
    }
}