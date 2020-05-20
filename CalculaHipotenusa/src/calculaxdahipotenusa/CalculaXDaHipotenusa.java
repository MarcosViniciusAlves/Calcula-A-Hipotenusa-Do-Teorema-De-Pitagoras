package calculaxdahipotenusa;

public class CalculaXDaHipotenusa {
    private int valorDeA;
    private int valorDeB;

    public CalculaXDaHipotenusa () {}

    public CalculaXDaHipotenusa (int valorDeA , int valorDeB) {
        this.valorDeA = valorDeA;
        this.valorDeB = valorDeB;
    }

    public void calculaHipotenusa () {
        int hipotenusa = (int) Math.sqrt((this.valorDeA * this.valorDeA) + (this.valorDeB * this.valorDeB));
        System.out.println("Valor de A: "+this.valorDeA);
        System.out.println("Valor de B: "+this.valorDeB);
        System.out.println("Valor da hipotenusa: "+hipotenusa);
    }

    public int getValorDeA() {
        return valorDeA;
    }

    public void setValorDeA(int valorDeA) {
        this.valorDeA = valorDeA;
    }

    public int getValorDeB() {
        return valorDeB;
    }

    public void setValorDeB(int valorDeB) {
        this.valorDeB = valorDeB;
    }
}
