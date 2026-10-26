package decorator;

public class Beverage2 extends Order {
    protected boolean moka;
    protected boolean soja;
    protected boolean milk;
    protected boolean cream;
    protected boolean moka2;
    protected boolean soja2;
    protected boolean milk2;
    protected boolean cream2;



    public Beverage2(String name, double price) {
        super(name, price);
    }

    public void setCream(boolean cream) {
        this.cream = cream;
        this.price += 0.50;
    }

    public void setMoka(boolean moka) {
        this.moka = moka;
        this.price += 0.30;
    }

    public void setMilk(boolean milk) {
        this.milk = milk;
        this.price = 0.20;
    }

    public void setSoja(boolean soja) {
        this.soja = soja;
        price += 0.40;
    }
    public void setCream2(boolean cream) {
        this.cream2= cream;
        this.price += 0.50;
    }

    public void setMoka2(boolean moka) {
        this.moka2 = moka;
        price+=0.30;
    }

    public void setMilk2(boolean milk) {
        this.milk2 = milk;
        price+=0.20;
    }

    public void setSoja2(boolean soja) {
        this.soja2 = soja;
        price+=0.40;
    }

    public String toString() {
        if (moka) {
            if (moka2) {
                return this.name + ", moka, moka";
            } else if (soja2) {
                return this.name + ", moka, soja";
            } else if (milk2) {
                return this.name + ", moka, milk";
            } else if (cream2) {
                return this.name + ", moka, cream";
            } else {
                return this.name + "moka";
            }
        } else if (soja) {
            String res = this.name + ", soja";
            if (moka2) {
                res += ", moka";
            } else if (soja2) {
                res += ", soja";
            } else if (milk2) {
                res += ", milk";
            } else if (cream2) {
                res += ", cream";
            }
            return res;
        } else if (milk) {
            String res = this.name + ", milk";
            if (moka2) {
                res += ", moka";
            } else if (soja2) {
                res += ", soja";
            } else if (milk2) {
                res += ", milk";
            } else if (cream2) {
                res += ", cream";
            }
            return res;
        } else if (cream) {
            String res = this.name + ", cream";
            if (moka2) {
                res += ", moka";
            } else if (soja2) {
                res += ", soja";
            } else if (milk2) {
                res += ", milk";
            } else if (cream2) {
                res += ", cream";
            }
            return res;
        } else {
            return this.name;
        }
    }
}
