package Competencias;

public class Baseball extends De_Conjunto {

    public String campos,apellidosjugadores, nombresequipos, equi;

    public Baseball() {
    }

    public Baseball(String campos, String apellidosjugadores, String nombresequipos, String equi, String equipos,
            String nomjugadores, String cantjugadores, String nomequipo, String equipoG,
            String equiposparticipantes, String diciplina, String rama, String categoria, String sede,
            String clasificacion, String resultados, float etapa, float fecha) {
        super(equipos, nomjugadores, cantjugadores, nomequipo, equipoG, equiposparticipantes, diciplina, rama,
                categoria, sede, clasificacion, resultados, etapa, fecha);
        this.campos = campos;
        this.apellidosjugadores = apellidosjugadores;
        this.nombresequipos = nombresequipos;
        this.equi = equi;
    }

    // Getters y setters para todos los atributos específicos de Baseball
    public String getCampos() {
        return campos;
    }

    static String getEstadio() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setCampos(String campos) {
        this.campos = campos;
    }

    public String getApellidosjugadores() {
        return apellidosjugadores;
    }

    public void setApellidosjugadores(String apellidosjugadores) {
        this.apellidosjugadores = apellidosjugadores;
    }

    public String getNombresequipos() {
        return nombresequipos;
    }

    public void setNombresequipos(String nombresequipos) {
        this.nombresequipos = nombresequipos;
    }

    public String getEqui() {
        return equi;
    }

    public void setEqui(String equi) {
        this.equi = equi;
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
