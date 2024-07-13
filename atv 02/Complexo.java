class Complexo {
    double r;
    double i;

    Complexo(double r, double i) {
        this.r = r;
        this.i = i;
    }

    Complexo adiciona(Complexo c){
        Complexo sum = new Complexo(0, 0);
        sum.r = this.r + c.r;
        sum.i = this.i + c.i;

        return sum;
    }
    
    Complexo subtrai(Complexo c){
        Complexo sub = new Complexo(0, 0);
        sub.r = this.r - c.r;
        sub.i = this.i - c.i;

        return sub;
    }
    
    Complexo multiplica(Complexo c){
        Complexo mul = new Complexo(0.0,0.0);
        mul.r = ((this.r*c.r)-(this.i*c.i));
        mul.i = ((this.r*c.i) +(this.i)*c.r);

        return mul;
    }
    
    Complexo divide(Complexo c){
        Complexo div = new Complexo(0.0,0.0);
        div.r = ((this.r*c.r) + (this.i*c.i)) / ((c.r*c.r)+(c.i*c.i));
        div.i = ((this.i*c.r) - (this.r*c.i)) / ((c.r*c.r)+(c.i*c.i));

        return div;
    }
    
    String converteParaString(){
        String f;
        f = String.format("%.2f + %.2fi", this.r, this.i);
        return f;
    }
}

