package Competencias;
// natacion Gymnasia,atletimo

public class Individual extends De_Conjunto {

    String ganador,primerLugar, segLugar, Terlugar, observaciones,entrenadores;
    float    hora, hits, recordM, recordP, Tiempoganador, TempoSegundo, TemTercer;

    public Individual() {
    }

   
    
    public Individual(String ganador, String primerLugar, String segLugar, String Terlugar, String observaciones, String entrenadores, float hora, float hits, float recordM, float recordP, float Tiempoganador, float TempoSegundo, float TemTercer, String equipos, String nomjugadores, String cantjugadores, String nomequipo, String equipoG, String equiposparticipantes, String diciplina, String rama, String categoria, String sede, String clasificacion, String resultados, float etapa, float fecha) {
        super(equipos, nomjugadores, cantjugadores, nomequipo, equipoG, equiposparticipantes, diciplina, rama, categoria, sede, clasificacion, resultados, etapa, fecha);
        this.ganador = ganador;
        this.primerLugar = primerLugar;
        this.segLugar = segLugar;
        this.Terlugar = Terlugar;
        this.observaciones = observaciones;
        this.entrenadores = entrenadores;
        this.hora = hora;
        this.hits = hits;
        this.recordM = recordM;
        this.recordP = recordP;
        this.Tiempoganador = Tiempoganador;
        this.TempoSegundo = TempoSegundo;
        this.TemTercer = TemTercer;
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

    public void setRecordM(float recorM) {
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
