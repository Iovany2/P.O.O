package Competencias;

public class Gymnasia extends Individual {

    private String modalidades;
    private String juezP;

    private String juecesdifi;
    private String juecesejecución;
    private String juecesartística;
    private String jueceslíneas, compilador;

    public Gymnasia(String ganador, String primerLugar, String segLugar, String Terlugar, String observaciones, String entrenadores, float hora, float hits, float recordM, float recordP, float Tiempoganador, float TempoSegundo, float TemTercer, String equipos, String nomjugadores, String cantjugadores, String nomequipo, String equipoG, String equiposparticipantes, String diciplina, String rama, String categoria, String sede, String clasificacion, String resultados, float etapa, float fecha) {
        super(ganador, primerLugar, segLugar, Terlugar, observaciones, entrenadores, hora, hits, recordM, recordP, Tiempoganador, TempoSegundo, TemTercer, equipos, nomjugadores, cantjugadores, nomequipo, equipoG, equiposparticipantes, diciplina, rama, categoria, sede, clasificacion, resultados, etapa, fecha);
    }

    public Gymnasia() {
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

    public String getGanador() {
        return ganador;
    }

    public void setGanador(String ganador) {
        this.ganador = ganador;
    }

    public String getPrimerLugar() {
        return primerLugar;
    }

    public void setPrimerLugar(String primerLugar) {
        this.primerLugar = primerLugar;
    }

    public String getSegLugar() {
        return segLugar;
    }

    public void setSegLugar(String segLugar) {
        this.segLugar = segLugar;
    }

    public String getTerlugar() {
        return Terlugar;
    }

    public void setTerlugar(String Terlugar) {
        this.Terlugar = Terlugar;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getEntrenadores() {
        return entrenadores;
    }

    public void setEntrenadores(String entrenadores) {
        this.entrenadores = entrenadores;
    }

    public float getHora() {
        return hora;
    }

    public void setHora(float hora) {
        this.hora = hora;
    }

    public float getHits() {
        return hits;
    }

    public void setHits(float hits) {
        this.hits = hits;
    }

    public float getRecordM() {
        return recordM;
    }

    public void setRecordM(float recordM) {
        this.recordM = recordM;
    }

    public float getRecordP() {
        return recordP;
    }

    public void setRecordP(float recordP) {
        this.recordP = recordP;
    }

    public float getTiempoganador() {
        return Tiempoganador;
    }

    public void setTiempoganador(float Tiempoganador) {
        this.Tiempoganador = Tiempoganador;
    }

    public float getTempoSegundo() {
        return TempoSegundo;
    }

    public void setTempoSegundo(float TempoSegundo) {
        this.TempoSegundo = TempoSegundo;
    }

    public float getTemTercer() {
        return TemTercer;
    }

    public void setTemTercer(float TemTercer) {
        this.TemTercer = TemTercer;
    }

}

