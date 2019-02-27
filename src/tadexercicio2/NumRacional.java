package tadexercicio2;

public class NumRacional implements Interface{
    
    private int numerador;
    private int denominador;

    
    
    public NumRacional(int numerador, int denominador) {
        mdc(numerador,denominador);
        this.numerador = numerador;
        this.denominador = denominador;
    }

    
    
    
    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    
    
    
    
    
    
    @Override
    public void apresenta() {
        if(this.getDenominador()==1){
            System.out.println(this.getNumerador());
        }
        else{
            System.out.println(this.getNumerador() + "/" + this.getDenominador());
        }
    }

    
    
    
    
    @Override
    public int soma(int numerador, int denominador) {
            int sDenominador = mmc(this.getDenominador(), denominador);

            int sNumerador1 = (sDenominador/this.getDenominador()) * this.getNumerador();
            int sNumerador2 = (sDenominador/denominador) * numerador;
            int sNumerador = sNumerador1 + sNumerador2;
            mdc(sNumerador, sDenominador);
            int resultado = sNumerador / sDenominador;

            return resultado;
    }

    
    
    
    @Override
    public int multiplica(int numerador, int denominador) {

      int mNumerador = this.getNumerador() * numerador;
      int mDenominador = this.getDenominador() * denominador;
      mdc(mNumerador, mDenominador);
      int resultado = mNumerador / mDenominador;

       return resultado;
    }

    
    
    
    
    @Override
    public int compara(int numerador, int denominador) {
        
        int num2 = numerador / denominador;
        int num1 = this.getNumerador() / this.getDenominador();
        
        if(num1 < num2){
            return -1;
            
        }
        else if(num1 == num2){
            return 0;
        }
        else{
            return 1;
        }
    }
    
    
    
    
    
private int mdc(int x, int y) {
    if (y == 0){
        return x;
    }      
    return mdc(y, x % y);
}
    




private int mmc(int x, int y) {
        int n = 2;
        int resultado = 1;
        while (x != 1 || y != 1) {
            while (x % n != 0 && y % n != 0) {
                n++;
            }
            if (x % n == 0) {
                x = x / n;
            }
            if (y % n == 0) {
                y = y / n;
            }
            resultado *= n;
        }
        return resultado;
    }
    
    
    
}
