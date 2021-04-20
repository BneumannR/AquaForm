package cl.douc.aquaform;

public class Pez {


    private double pesoInicial;          //en kilogramos
    private double pesoFinal;
    private double peso;
    private double longitud;             //en centimetros
    private int cantidadAlimento;        //en kilos por dia
    private int cantidadMortalidad;      //en numero de peces
    private double temperatura;          //temperatura en grados celcius
    private double Sfr;                  // tasa específica de alimentación (SFR, specific food rate)
    private double Sgr;                  // Specific Growth Rate tasa especifica de creciemiento
    private double FcrBio;               // Factor de conversion a racion  incluye los peces muertos
    private double FcrEco;               // Factor de conversion a racion NO incluye mortalidad
    private double Gf3;                  //Factor de Crecimiento 3 (Growth Factor 3), Porcentaje de crecimiento diario que incorpora la temperatura
    private int Uta;                     // Unidad termica acumulada
    private double biomasa;              //es el numero de peces multiplicado por el peso
    private int numeroJaula;
    private int alimentoAcumulado;
    private int dias;

    public Pez(double pesoInicial, double pesoFinal, double peso, double longitud, int cantidadAlimento, int cantidadMortalidad, double temperatura, double sfr,
               double sgr, double fcrBio, double fcrEco, double gf3, int uta, double biomasa, int numeroJaula, int alimentoAcumulado, int dias) {


        this.pesoInicial = pesoInicial;
        this.pesoFinal = pesoFinal;
        this.peso = peso;
        this.longitud = longitud;
        this.cantidadAlimento = cantidadAlimento;
        this.cantidadMortalidad = cantidadMortalidad;
        this.temperatura = temperatura;
        Sfr = sfr;
        Sgr = sgr;
        FcrBio = fcrBio;
        FcrEco = fcrEco;
        Gf3 = gf3;
        Uta = uta;
        this.biomasa = biomasa;
        this.numeroJaula = numeroJaula;
        this.alimentoAcumulado = alimentoAcumulado;
        this.dias = dias;
    }

    public double getPesoInicial() {
        return pesoInicial;
    }

    public void setPesoInicial(double pesoInicial) {
        this.pesoInicial = pesoInicial;
    }

    public double getPesoFinal() {
        return pesoFinal;
    }

    public void setPesoFinal(double pesoFinal) {
        this.pesoFinal = pesoFinal;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public int getCantidadAlimento() {
        return cantidadAlimento;
    }

    public void setCantidadAlimento(int cantidadAlimento) {
        this.cantidadAlimento = cantidadAlimento;
    }

    public int getCantidadMortalidad() {
        return cantidadMortalidad;
    }

    public void setCantidadMortalidad(int cantidadMortalidad) {
        this.cantidadMortalidad = cantidadMortalidad;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public double getSfr() {
        return Sfr;
    }

    public void setSfr(double sfr) {
        Sfr = sfr;
    }

    public double getSgr() {
        return Sgr;
    }

    public void setSgr(double sgr) {
        Sgr = sgr;
    }

    public double getFcrBio() {
        return FcrBio;
    }

    public void setFcrBio(double fcrBio) {
        FcrBio = fcrBio;
    }

    public double getFcrEco() {
        return FcrEco;
    }

    public void setFcrEco(double fcrEco) {
        FcrEco = fcrEco;
    }

    public double getGf3() {
        return Gf3;
    }

    public void setGf3(double gf3) {
        Gf3 = gf3;
    }

    public int getUta() {
        return Uta;
    }

    public void setUta(int uta) {
        Uta = uta;
    }

    public double getBiomasa() {
        return biomasa;
    }

    public void setBiomasa(double biomasa) {
        this.biomasa = biomasa;
    }

    public int getNumeroJaula() {
        return numeroJaula;
    }

    public void setNumeroJaula(int numeroJaula) {
        this.numeroJaula = numeroJaula;
    }

    public int getAlimentoAcumulado() {
        return alimentoAcumulado;
    }

    public void setAlimentoAcumulado(int alimentoAcumulado) {
        this.alimentoAcumulado = alimentoAcumulado;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }


    public double gf3PesoFinal()
    {

//        pesoFinal = ((getGf3() *getDias() * getTemperatura() / 1000) + getPesoInicial() )
        // peso final = ((GF3 x dias x To /1000) + Wi 1/3)3

        double pesoFinal = Math.round(Math.pow(((getGf3() * getDias() * getTemperatura()) /1000) + (Math.pow(getPesoInicial(),(0.3333))),3)) ;

        return pesoFinal;
    }


    @Override
    public String toString() {
        return "Pez{" +
                "pesoInicial=" + pesoInicial +
                ", pesoFinal=" + pesoFinal +
                ", peso=" + peso +
                ", longitud=" + longitud +
                ", cantidadAlimento=" + cantidadAlimento +
                ", cantidadMortalidad=" + cantidadMortalidad +
                ", temperatura=" + temperatura +
                ", Sfr=" + Sfr +
                ", Sgr=" + Sgr +
                ", FcrBio=" + FcrBio +
                ", FcrEco=" + FcrEco +
                ", Gf3=" + Gf3 +
                ", Uta=" + Uta +
                ", biomasa=" + biomasa +
                ", numeroJaula=" + numeroJaula +
                ", alimentoAcumulado=" + alimentoAcumulado +
                ", dias=" + dias +
                '}';
    }
}


