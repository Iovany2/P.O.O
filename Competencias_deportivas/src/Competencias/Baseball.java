package Competencias;

public class Baseball extends De_Conjunto {

    private String campos;
    private String apellidosjugadores;
    private String nombresequipos;
    private String equi;

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

    String getArbitroPrincipal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String getArbitroAsistente1() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String getArbitroAsistente2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String getArbitroAsistente3() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String getNombreEquipos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String getEquiposParticipantes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String getDisciplina() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String getNumPartido() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String getApellidosJugadores() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String getNombresEquipos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String getNombreJugadores() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String getCantidadJugadores() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String getNombreEquipo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setNombreArbitro(String campos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setApellidosJugadores(String apellidos_jugadores) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setNombresEquipos(String nombres_equipos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setNombreJugadores(String nombre_jugadores) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setCantidadJugadores(String cantidad_jugadores) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setNombreEquipo(String nombre_equipo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setEquipog(String equipo_G) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setEquiposParticipantes(String equipos_participantes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setDisciplina(String disciplina) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 
    void setNumPartido(float f) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
