package Competencias;

public class Competencia {

    String diciplina, rama, categoria, sede,clasificacion,resultados;
    float etapa, fecha;

    public Competencia() {
    }

    public Competencia(String diciplina, String rama, String categoria, String sede, String clasificacion, String resultados, float etapa, float fecha) {
        this.diciplina = diciplina;
        this.rama = rama;
        this.categoria = categoria;
        this.sede = sede;
        this.clasificacion = clasificacion;
        this.resultados = resultados;
        this.etapa = etapa;
        this.fecha = fecha;
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

    String getTipoCompetencia() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    String getArbitroPrincipal() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    String getFechaCompetencia() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    String getNumeroParticipantes() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    String getDisciplina() {
        throw new UnsupportedOperationException("Not supported yet.");

 
}}
