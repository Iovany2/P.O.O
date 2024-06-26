package Competencias;

public class Voileball extends De_Conjunto {

    public String primerArbitro,segundoArbitro,anotador, juecesLinea;

    public Voileball() {
    }

    public Voileball(String primerArbitro, String segundoArbitro, String anotador, String juecesLinea,
            String equipos, String nomjugadores, String cantjugadores, String nomequipo, String equipoG,
            String equiposparticipantes, String disciplina, String rama, String categoria, String sede,
            String clasificacion, String resultados, float etapa, float fecha) {
        super(equipos, nomjugadores, cantjugadores, nomequipo, equipoG, equiposparticipantes, disciplina,
              rama, categoria, sede, clasificacion, resultados, etapa, fecha);
        this.primerArbitro = primerArbitro;
        this.segundoArbitro = segundoArbitro;
        this.anotador = anotador;
        this.juecesLinea = juecesLinea;
    }

    public String getPrimerArbitro() {
        return primerArbitro;
    }

    public void setPrimerArbitro(String primerArbitro) {
        this.primerArbitro = primerArbitro;
    }

    public String getSegundoArbitro() {
        return segundoArbitro;
    }

    public void setSegundoArbitro(String segundoArbitro) {
        this.segundoArbitro = segundoArbitro;
    }

    public String getAnotador() {
        return anotador;
    }

    public void setAnotador(String anotador) {
        this.anotador = anotador;
    }

    public String getJuecesLinea() {
        return juecesLinea;
    }

    public void setJuecesLinea(String juecesLinea) {
        this.juecesLinea = juecesLinea;
    }
        public String getEquipos() {
        return equipos;
    }

    public void setEquipos(String equipos) {
        this.equipos = equipos;
    }

    public String getNomjugadores() {
        return nomjugadores;
    }

    public void setNomjugadores(String nomjugadores) {
        this.nomjugadores = nomjugadores;
    }

    public String getCantjugadores() {
        return cantjugadores;
    }

    public void setCantjugadores(String cantjugadores) {
        this.cantjugadores = cantjugadores;
    }

    public String getNomequipo() {
        return nomequipo;
    }

    public void setNomequipo(String nomequipo) {
        this.nomequipo = nomequipo;
    }

    public String getEquipoG() {
        return equipoG;
    }

    public void setEquipoG(String equipoG) {
        this.equipoG = equipoG;
    }

    public String getEquiposparticipantes() {
        return equiposparticipantes;
    }

    public void setEquiposparticipantes(String equiposparticipantes) {
        this.equiposparticipantes = equiposparticipantes;
    }

    public String getDiciplina() {
        return diciplina;
    }

    public void setDiciplina(String diciplina) {
        this.diciplina = diciplina;
    }

    public String getRama() {

        return rama;
    }

    public void setRama(String rama) {
        this.rama = rama;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getResultados() {
        return resultados;
    }

    public void setResultados(String resultados) {
        this.resultados = resultados;
    }

    public float getEtapa() {
        return etapa;
    }

    public void setEtapa(float etapa) {
        this.etapa = etapa;
    }

    public float getFecha() {
        return fecha;
    }

    public void setFecha(float fecha) {
        this.fecha = fecha;
    }
}
