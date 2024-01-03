public class Produttore{
    private String nome;
    private String sedeLegale;
    private boolean nazionale;          //nel caso di true opera in tutta italia altrimenti solo nella zona locale
    private int partitaIva;

    public Produttore(String nome, String sedeLegale, boolean nazionale, int partitaIva) {
        this.nome = nome;
        this.sedeLegale = sedeLegale;
        this.nazionale = nazionale;
        this.partitaIva = partitaIva;
    }

    public String toString(){
        String info = "";
        info += "\tnome:\t" + nome + "\n";
        info += "\tsede legale:\t" + sedeLegale + "\n";
        if(nazionale) info += "\toperano in tutta italia\n";
        else info += "\toperano solo nella zona locale\n";
        info += "\tpartita iva:\t" + partitaIva + "\n";
        return info;
    }

    public boolean equals(Produttore p) {
        if(this.nome != p.nome) return false;
        if(this.sedeLegale != p.sedeLegale) return false;
        if(this.nazionale != p.nazionale) return false;
        if(this.partitaIva != p.partitaIva) return false;
        return true;
    }
}