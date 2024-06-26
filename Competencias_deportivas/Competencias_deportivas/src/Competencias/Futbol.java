package Competencias;

public class Futbol extends De_Conjunto {

    public String arbitroprin, árbitroasis1, arbitroasis2, privaString, cuartoárbitro, mejorgoleadores, mdesempeño, numpartido;
    public String nombreEquipos;

    public Futbol() {
    }

    public Futbol(String arbitroprin, String árbitroasis1, String arbitroasis2, String cuartoárbitro,
            String mejorgoleadores, String mdesempeño, String numpartido, String equipos, String nomjugadores,
            String cantjugadores, String nomequipo, String equipoG, String equiposparticipantes, String diciplina,
            String rama, String categoria, String sede, String clasificacion, String resultados, float etapa,
            float fecha) {
        super(equipos, nomjugadores, cantjugadores, nomequipo, equipoG, equiposparticipantes, diciplina, rama,
                categoria, sede, clasificacion, resultados, etapa, fecha);
        this.arbitroprin = arbitroprin;
        this.árbitroasis1 = árbitroasis1;
        this.arbitroasis2 = arbitroasis2;
        this.cuartoárbitro = cuartoárbitro;
        this.mejorgoleadores = mejorgoleadores;
        this.mdesempeño = mdesempeño;
        this.numpartido = numpartido;
    }

    public String getArbitroprin() {
        return arbitroprin;
    }

    public void setArbitroprin(String arbitroprin) {
        this.arbitroprin = arbitroprin;
    }

    public String getÁrbitroasis1() {
        return árbitroasis1;
    }

    public void setÁrbitroasis1(String árbitroasis1) {
        this.árbitroasis1 = árbitroasis1;
    }

    public String getArbitroasis2() {
        return arbitroasis2;
    }

    public void setArbitroasis2(String arbitroasis2) {
        this.arbitroasis2 = arbitroasis2;
    }

    public String getCuartoárbitro() {
        return cuartoárbitro;
    }

    public void setCuartoárbitro(String cuartoárbitro) {
        this.cuartoárbitro = cuartoárbitro;
    }

    public String getMejorgoleadores() {
        return mejorgoleadores;
    }

    public void setMejorgoleadores(String mejorgoleadores) {
        this.mejorgoleadores = mejorgoleadores;
    }

    public String getMdesempeño() {
        return mdesempeño;
    }

    public void setMdesempeño(String mdesempeño) {
        this.mdesempeño = mdesempeño;
    }

    public String getNumpartido() {
        return numpartido;
    }

    public void setNumpartido(String numpartido) {
        this.numpartido = numpartido;
    }

}
