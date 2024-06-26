package Competencias;

public class De_Conjunto {
    String equipos;
    String nomjugadores;
    String cantjugadores;
    String nomequipo;
    String equipoG;
    String equiposparticipantes;
    String diciplina;
    String rama;
    String categoria;
    String sede;
    String clasificacion;
    String resultados;
    float etapa;
    float fecha;

    public De_Conjunto() {
    }

    
    public De_Conjunto(String equipos, String nomjugadores, String cantjugadores, String nomequipo, String equipoG,
                       String equiposparticipantes, String diciplina, String rama, String categoria, String sede,
                       String clasificacion, String resultados, float etapa, float fecha) {
        this.equipos = equipos;
        this.nomjugadores = nomjugadores;
        this.cantjugadores = cantjugadores;
        this.nomequipo = nomequipo;
        this.equipoG = equipoG;
        this.equiposparticipantes = equiposparticipantes;
        this.diciplina = diciplina;
        this.rama = rama;
        this.categoria = categoria;
        this.sede = sede;
        this.clasificacion = clasificacion;
        this.resultados = resultados;
        this.etapa = etapa;
        this.fecha = fecha;
    }

    // Getters y setters para todos los atributos
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
