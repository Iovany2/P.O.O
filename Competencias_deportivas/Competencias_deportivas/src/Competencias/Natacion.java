package Competencias;

public class Natacion extends Individual {
    public String oficialM,juecesS, juecesN, inspectoresVue, estilo,ganador, primerLugar, segLugar, terlugar;
public float RecordRoto;
    public Natacion() {
    }

    public float getRecordRoto() {
        return RecordRoto;
    }

    public void setRecordRoto(float RecordRoto) {
        this.RecordRoto = RecordRoto;
    }

    public Natacion(String ganador, String primerLugar, String segLugar, String Terlugar, String observaciones, String entrenadores, float hora, float hits, float recordM, float recordP, float Tiempoganador, float TempoSegundo, float TemTercer, String equipos, String nomjugadores, String cantjugadores, String nomequipo, String equipoG, String equiposparticipantes, String diciplina, String rama, String categoria, String sede, String clasificacion, String resultados, float etapa, float fecha) {
        super(ganador, primerLugar, segLugar, Terlugar, observaciones, entrenadores, hora, hits, recordM, recordP, Tiempoganador, TempoSegundo, TemTercer, equipos, nomjugadores, cantjugadores, nomequipo, equipoG, equiposparticipantes, diciplina, rama, categoria, sede, clasificacion, resultados, etapa, fecha);
    }

    public String getOficialM() {
        return oficialM;
    }

    public void setOficialM(String oficialM) {
        this.oficialM = oficialM;
    }

    public String getJuecesS() {
        return juecesS;
    }

    public void setJuecesS(String juecesS) {
        this.juecesS = juecesS;
    }

    public String getJuecesN() {
        return juecesN;
    }

    public void setJuecesN(String juecesN) {
        this.juecesN = juecesN;
    }

    public String getInspectoresVue() {
        return inspectoresVue;
    }

    public void setInspectoresVue(String inspectoresVue) {
        this.inspectoresVue = inspectoresVue;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
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
        return terlugar;
    }

    public void setTerlugar(String terlugar) {
        this.terlugar = terlugar;
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
