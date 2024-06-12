package Competencias;

public class Voileball extends De_Conjunto {

    private String primerArbitro;
    private String segundoArbitro;
    private String anotador;
    private String juecesLinea;

    public Voileball() {
        // Constructor vacío por defecto
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

    // Getters y Setters para primerArbitro
    public String getPrimerArbitro() {
        return primerArbitro;
    }

    public void setPrimerArbitro(String primerArbitro) {
        this.primerArbitro = primerArbitro;
    }

    // Getters y Setters para segundoArbitro
    public String getSegundoArbitro() {
        return segundoArbitro;
    }

    public void setSegundoArbitro(String segundoArbitro) {
        this.segundoArbitro = segundoArbitro;
    }

    // Getters y Setters para anotador
    public String getAnotador() {
        return anotador;
    }

    public void setAnotador(String anotador) {
        this.anotador = anotador;
    }

    // Getters y Setters para juecesLinea
    public String getJuecesLinea() {
        return juecesLinea;
    }

    public void setJuecesLinea(String juecesLinea) {
        this.juecesLinea = juecesLinea;
    }

    // Getters y Setters heredados de De_Conjunt
    // Aquí puedes añadir más getters y setters según las necesidades de tu aplicación
}
