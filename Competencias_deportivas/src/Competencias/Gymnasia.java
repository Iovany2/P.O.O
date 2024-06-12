package Competencias;

public class Gymnasia extends De_Conjunto {

    private String modalidades;
    private String juezP;

    private String juecesdifi;
    private String juecesejecución;
    private String juecesartística;
    private String jueceslíneas, compilador;

    public Gymnasia() {
    }

    public Gymnasia(String modalidades, String juezP, String juecesdifi, String juecesejecución, String juecesartística,
            String jueceslíneas, String compilador, String equipos, String nomjugadores, String cantjugadores,
            String nomequipo, String equipoG, String equiposparticipantes, String diciplina, String rama,
            String categoria, String sede, String clasificacion, String resultados, float etapa, float fecha) {
        super(equipos, nomjugadores, cantjugadores, nomequipo, equipoG, equiposparticipantes, diciplina, rama,
                categoria, sede, clasificacion, resultados, etapa, fecha);
        this.modalidades = modalidades;
        this.juezP = juezP;
        this.juecesdifi = juecesdifi;
        this.juecesejecución = juecesejecución;
        this.juecesartística = juecesartística;
        this.jueceslíneas = jueceslíneas;
        this.compilador = compilador;
    }

    public String getModalidades() {
        return modalidades;
    }

    public void setModalidades(String modalidades) {
        this.modalidades = modalidades;
    }

    public String getJuezP() {
        return juezP;
    }

    public void setJuezP(String juezP) {
        this.juezP = juezP;
    }

    public String getJuecesdifi() {
        return juecesdifi;
    }

    public void setJuecesdifi(String juecesdifi) {
        this.juecesdifi = juecesdifi;
    }

    public String getJuecesejecución() {
        return juecesejecución;
    }

    public void setJuecesejecución(String juecesejecución) {
        this.juecesejecución = juecesejecución;
    }

    public String getJuecesartística() {
        return juecesartística;
    }

    public void setJuecesartística(String juecesartística) {
        this.juecesartística = juecesartística;
    }

    public String getJueceslíneas() {
        return jueceslíneas;
    }

    public void setJueceslíneas(String jueceslíneas) {
        this.jueceslíneas = jueceslíneas;
    }

    public String getCompilador() {
        return compilador;
    }

    public void setCompilador(String compilador) {
        this.compilador = compilador;
    }

    String getDatosganador() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String getPrimerlugar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String getSegundolugar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String getTercerlugar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String getObservaciones() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String getEquipog() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String getEntrenadores() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String getNombrejugadores() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String getNumerojugadores() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String getNombreequipo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String getDisciplina() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String getFemenil() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String getAdultos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String getSedey() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String getSegunda() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String getUno() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setPrimerlugar(String er_lugar) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setSegundolugar(String do_lugar) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setTerclugar(String er_lugar) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setObservaciones(String observaciones) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setEntrenadores(String entrenadores) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setTres(float f) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setPuntuacion(float f) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setTécnica(float f) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setClasifación(String posiciones) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setResultado(String er_lugar) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setMáximas(String posiciones_de) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setNota(String er_lugar) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setA(String carácter) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setPuntuación(String pruebas) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setCuerpo(String categoría) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setEjercicio(String gimnasia_rítmica) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setCompetición(String gimnasia_rítmica) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setEspacialista(String pruebas) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setS(String especialista) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setClasificaciones(String equipos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setPosiciones(float f) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setJuecesL(String jueces) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setCalificación(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
