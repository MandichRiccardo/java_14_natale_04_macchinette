public class Snack{
    private Produttore produttore;
    private String nome;
    private String tipologia;
    private double peso;            //espresso in grammi
    private double kcalTot;

    public Snack(Produttore produttore, String nome, String tipologia, double peso, double kcalTot){
        this.produttore = produttore;
        this.nome = nome;
        this.tipologia = tipologia;
        this.peso = peso;
        this.kcalTot = kcalTot;
    }
    public String toString(){
        String info = "";
        info += "\tproduttore:\n" + produttore;
        info += "\tnome:\t" + nome + "\n";
        info += "\ttipologia:\t" + tipologia + "\n";
        info += "\tpeso in gr:\t" + peso + "\n";
        info += "\tkcal totali:\t" + kcalTot + "\n";
        return info;
    }

    public boolean equals(Snack s) {
        if(!this.produttore.equals(s.produttore)) return false;
        if(this.nome != s.nome) return false;
        if(this.tipologia != s.tipologia) return false;
        if(this.peso != s.peso) return false;
        if(this.kcalTot != s.kcalTot) return false;
        return true;
    }
}