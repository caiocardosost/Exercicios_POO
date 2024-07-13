public class Racional {
    int numerador;
    int denominador;
    
    Racional (int numerador, int denominador){
        if(denominador < 0){
            this.numerador = - numerador;
            this.denominador = - denominador;
        } else {
            this.numerador = numerador;
            this.denominador = denominador;
        }
        simplifica();
    }

    Racional adiciona(Racional a){
        Racional sum = new Racional(1, 1);
        int mmc = minimoMultiplo(this.denominador, a.denominador);
        sum.denominador = mmc;
        sum.numerador = ((mmc/this.denominador)*(this.numerador)) + ((mmc/a.denominador)*a.numerador);
        

        return sum;
    }

    Racional subtrai(Racional a){
        Racional sub = new Racional(1, 1);
        int mmc = minimoMultiplo(this.denominador, a.denominador);
        sub.denominador = mmc;
        sub.numerador = ((mmc/this.denominador)*(this.numerador)) - ((mmc/a.denominador)*a.numerador);

        return sub;
    }

    Racional multiplica(Racional a){
        Racional mul = new Racional(1, 1);
        mul.numerador = this.numerador * a.numerador;
        mul.denominador = this.denominador * a.denominador;
        
        return mul;
    }

    Racional divide(Racional a){
        Racional div = new Racional(1, 1);
        div.numerador = this.numerador * a.denominador;
        div.denominador = this.denominador * a.numerador;
        
        return div;
    }

    boolean igual(Racional a){
        boolean res = ((this.numerador == a.numerador) && (this.denominador == a.denominador))? true:false;
        return res;
    }

    int absoluto(int a){
        return (a>0)? a:-a;
    }

    int max (int a, int b){
        int max;
        max = (a>=b)? a:b;
        
        return max;
    }

    int min (int a, int b){
        int min;
        min = (a<=b)? a:b;
        
        return min;
    }

    int minimoMultiplo(int a, int b){
        int mmc;
        int mfc = maxDivisor(a,b);
        mmc = (a*b)/mfc;
        
        return mmc;
    }

    int maxDivisor(int a, int b){
        if (a == 0){
            return b;
        }
        
        int dividendo = max(absoluto(a),absoluto(b));
        int divisor = min(absoluto(a),absoluto(b));
        int resto = dividendo%divisor;
        int res = divisor;
        
        while(resto !=0){
            dividendo = divisor;
            divisor = resto;
            resto = dividendo%divisor;
            res = divisor;   
        }
        
        return res;
    }

    void simplifica(){
        int mdc = maxDivisor(this.numerador,this.denominador);
        if (mdc > 1){
            this.numerador = this.numerador/mdc;
            this.denominador = this.denominador/mdc;
        }
    }

    String converteParaString(){
        simplifica();
        String f;
        if(this.denominador < 0){
            this.numerador = -this.numerador;
            this.denominador = -this.denominador;
        }        
        f = String.format("%d/%d", this.numerador, this.denominador);
        
        return f;
    }
}


