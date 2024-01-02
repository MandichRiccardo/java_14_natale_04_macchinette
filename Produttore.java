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
        info += "nome:\t" + nome + "\n";
        info += "sede legale:\t" + sedeLegale + "\n";
        if(nazionale) info += "operano in tutta italia\n";
        else info += "operano solo nella zona locale\n";
        info += "partita iva:\t" + partitaIva + "\n";
        return info;
    }
}