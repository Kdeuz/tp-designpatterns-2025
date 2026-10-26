package composite;

public abstract class Boisson extends Produit {
    private boolean lait1;
    private boolean lait2;
    private boolean moka1;
    private boolean moka2;
    private boolean soja1;
    private boolean soja2;
    private boolean creme1;
    private boolean creme2;



    public Boisson() {
        super();
        this.moka1 = false;
        this.moka2=false;
        this.soja1=false;
        this.soja2=false;
        this.lait1 = false;
        this.lait2=false;
        this.creme1=false;
        this.creme2=false;
    }

    public Boisson(double prix, String nom) {
        super(prix, nom);
        this.moka1 = false;
        this.moka2 = false;
        this.soja1 = false;
        this.soja2 = false;
        this.lait1 = false;
        this.lait2 = false;
        this.creme1 = false;
        this.creme2 = false;
    }

    public void setTrueLait1() {
        lait1=true;
    }
    public void setTrueLait2() {
        lait2=true;
    }
    public void setTrueMoka1() {
        moka1=true;
    }
    public void setTrueMoka2() {
        moka2=true;
    }
    public void setTrueSoja1() {
        soja1=true;
    }
    public void setTrueSoja2() {
        soja2=true;
    }
    public void setTrueCreme1() {
        creme1=true;
    }
    public void setTrueCreme2() {
        creme2=true;
    }

    public void resetLait1() {
        lait1 = false;
    }
    public void resetLait2() {
        lait2 = false;
    }

    public void resetMoka1() {
        moka1 = false;
    }
    public void resetMoka2() {
        moka2 = false;
    }
    public void resetSoja1() {
        soja1 = false;
    }
    public void resetSoja2() {
        soja2 = false;
    }
    public void resetCreme1() {
        creme1 = false;
    }
    public void resetCreme2() {
        creme2 = false;
    }

    public String getNom() {
        String nom = super.getNom();
        if(moka1) {
            nom += ", moka";
        }
        if(moka2) {
            nom += ", moka";
        }
        if(soja1) {
            nom += ", soja";
        }
        if(soja2) {
            nom += ", soja";
        }
        if(lait1) {
            nom += ", lait";
        }
        if(lait2) {
            nom += ", lait";
        }
        if(creme1) {
            nom += ", crème";
        }
        if(creme2) {
            nom += ", crème";
        }
        return nom;
    }

    public double prix() {
        double prix = super.prix();
        if(moka1) {
            prix += 0.30;
        }
        if(moka2) {
            prix += 0.30;
        }
        if(soja1) {
            prix += 0.40;
        }
        if(soja2) {
            prix += 0.40;
        }
        if(lait1) {
            prix += 0.20;
        }
        if(lait2) {
            prix += 0.20;
        }
        if(creme1) {
            prix += 0.50;
        }
        if(creme2) {
            prix += 0.50;
        }
        return prix;
    }

    //Les inconvénients de cette modélisation sont :
    // - On ne peut pas ajouter de nouveaux types de suppléments sans modifier la classe Boisson.
    // - Le code devient plus complexe et moins lisible avec l'ajout de nombreux attributs et méthodes.
    // - La gestion des suppléments est rigide, ce qui peut limiter la flexibilité pour les utilisateurs.

}
