package Competencias;

import java.util.*;

public class App {

    public static void main(String[] args) {
        Scanner ai = new Scanner(System.in);
        int mainOption;
        int subOption;

        do {

            System.out.println("Competencia deportiva menu:");
            System.out.println("1. De conjunto");
            System.out.println("2. Individual");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");

            mainOption = ai.nextInt();

            switch (mainOption) {
                case 1:
                    do {
                        System.out.println("1. Futbol");
                        System.out.println("2. Voleibol");
                        System.out.println("3. Beisbol");
                        System.out.println("4. Regresar al menú principal");
                        System.out.print("Seleccione una opción: ");

                        subOption = ai.nextInt();

                        switch (subOption) {
                            case 1:
                                Futbol competenciaFutbol = new Futbol();
                                competenciaFutbol.setArbitroprin("Arbitro principal:Juan Pérez");
                                competenciaFutbol.setÁrbitroasis1("Arbitro Asistente:Pedro Gómez");
                                competenciaFutbol.setArbitroasis2("Arbitro Asistente:Luis Ramírez");
                                competenciaFutbol.setCuartoárbitro("Arbitro:Carlos Sánchez");
                                competenciaFutbol.setMejorgoleadores("Mejores Goleadores:Messi, Ronaldo");
                                competenciaFutbol.setMdesempeño("Mejor desempeño:Messi");
                                competenciaFutbol.setNumpartido("Numero de partido:12");
                                competenciaFutbol.setEquipos("Atlas vs Alacranes de durango");
                                competenciaFutbol.setSede("Estadio Aguilas");
                                competenciaFutbol.setClasificacion("Primera");
                                competenciaFutbol.setResultados("2-1");
                                competenciaFutbol.setNumpartido("dos");
                                competenciaFutbol.setFecha(2024.05f);

                                System.out.println(competenciaFutbol.getArbitroprin());
                                System.out.println(competenciaFutbol.getÁrbitroasis1());
                                System.out.println(competenciaFutbol.getArbitroasis2());
                                System.out.println(competenciaFutbol.getCuartoárbitro());
                                System.out.println(competenciaFutbol.getMejorgoleadores());
                                System.out.println(competenciaFutbol.getMdesempeño());
                                System.out.println(competenciaFutbol.getNumpartido());
                                System.out.println(competenciaFutbol.getEquipos());
                                System.out.println(competenciaFutbol.getSede());
                                System.out.println(competenciaFutbol.getClasificacion());
                                System.out.println(competenciaFutbol.getResultados());
                                System.out.println(competenciaFutbol.getNumpartido());
                                System.out.println(competenciaFutbol.getFecha());

                                break;
                            case 2:
                                Voileball competenciaVoleibol = new Voileball();
                                competenciaVoleibol.setPrimerArbitro("Primer arbitr:oAna Pérez");
                                competenciaVoleibol.setSegundoArbitro("Segundo Arbitro:Sofía López");
                                competenciaVoleibol.setAnotador("Mejor anotado:Laura Ramírez");
                                competenciaVoleibol.setJuecesLinea("Carlos Martínez");
                                competenciaVoleibol.setEquipos("Equipo A");
                                competenciaVoleibol.setNomjugadores("Jeongeong, Sana, Mina, Jihyo, Momo, Chuwi, Chae, Nayeon, Dahyun, Chaewon, Haewon, Hanni");
                                competenciaVoleibol.setCantjugadores("12");
                                competenciaVoleibol.setNomequipo("TwiceGod");
                                competenciaVoleibol.setEquipoG("Equipo G");
                                competenciaVoleibol.setEquiposparticipantes("Participación equipos");
                                competenciaVoleibol.setSede("Mi casa");
                                competenciaVoleibol.setClasificacion("Clasificación Mixta");
                                competenciaVoleibol.setResultados("Resultados");
                                competenciaVoleibol.setFecha(2024.02f);

                                System.out.println(competenciaVoleibol.getPrimerArbitro());
                                System.out.println(competenciaVoleibol.getSegundoArbitro());
                                System.out.println(competenciaVoleibol.getAnotador());
                                System.out.println(competenciaVoleibol.getJuecesLinea());
                                System.out.println(competenciaVoleibol.getEquipos());
                                System.out.println(competenciaVoleibol.getNomjugadores());
                                System.out.println(competenciaVoleibol.getCantjugadores());
                                System.out.println(competenciaVoleibol.getNomequipo());
                                System.out.println(competenciaVoleibol.getEquipoG());
                                System.out.println(competenciaVoleibol.getEquiposparticipantes());
                                System.out.println(competenciaVoleibol.getSede());
                                System.out.println(competenciaVoleibol.getClasificacion());
                                System.out.println(competenciaVoleibol.getResultados());
                                System.out.println(competenciaVoleibol.getFecha());

                                break;
                            case 3:
                                Baseball competenciaBaseball = new Baseball();

                                competenciaBaseball.setNombresequipos("Nombres equipos");
                                System.out.println(competenciaBaseball.getNombresequipos());
                                competenciaBaseball.setEquipoG("Equipo Ganador ");
                                System.out.println(competenciaBaseball.getEquipoG());
                                competenciaBaseball.setEquipos("Equipos");
                                System.out.println(competenciaBaseball.getEquipos());
                                competenciaBaseball.setNomjugadores("Diego Arevalo, Kazuya Mishima, Steve(Minecraft), Rey Azul, All Might, Bugs Bunny, Pato Donald");
                                System.out.println(competenciaBaseball.getNomjugadores());
                                competenciaBaseball.setCantjugadores("Cantidad jugadores");
                                System.out.println(competenciaBaseball.getCantjugadores());
                                competenciaBaseball.setNomequipo("Paputilines");
                                System.out.println(competenciaBaseball.getCantjugadores());
                                competenciaBaseball.setEquipoG("Paputilines");
                                System.out.println(competenciaBaseball.getEquipoG());
                                competenciaBaseball.setEquiposparticipantes("Equipos participantes");
                                System.out.println(competenciaBaseball.getEquiposparticipantes());
                                competenciaBaseball.setCategoria("Especial");
                                System.out.println(competenciaBaseball.getCategoria());
                                competenciaBaseball.setSede("Mexico");
                                System.out.println(competenciaBaseball.getSede());
                                competenciaBaseball.setClasificacion("Si");
                                System.out.println(competenciaBaseball.getClasificacion());
                                competenciaBaseball.setResultados("120-98");
                                System.out.println(competenciaBaseball.getResultados());
                                competenciaBaseball.setFecha(2024.02f);
                                System.out.println(competenciaBaseball.getFecha());

                                break;
                            case 4:
                                System.out.println("Regresando al menú principal...");
                                break;
                            default:
                                System.out.println("Opción no válida. Por favor, seleccione una opción entre 1 y 4.");
                        }

                    } while (4 != subOption);
                    break;

                case 2:

                    do {
                        System.out.println("1. Natación");
                        System.out.println("2. Gimnasia");
                        System.out.println("3. Atletismo");
                        System.out.println("4. Regresar al menú principal");
                        System.out.print("Seleccione una opción: ");

                        subOption = ai.nextInt();

                        switch (subOption) {
                            case 1:
                                /*Natacion competenciaNatacion = new Natacion();
                                
                                 competenciaNatacion.setOficialM("Oficial M");
                                 competenciaNatacion.setJuecesS("Jueces S");
                                 competenciaNatacion.setJuecesN("Jueces N");
                                 competenciaNatacion.setInspectoresVue("Inspectores Vue");
                                 competenciaNatacion.setEstilo("Crol");
                                 competenciaNatacion.setGanador("Michael Phelps");
                                 competenciaNatacion.setPrimerLugar("Katie Ledecky");
                                 competenciaNatacion.setSegLugar("Caeleb Dressel");
                                 competenciaNatacion.setTerlugar("Sarah Sjöström");
                                 competenciaNatacion.setEntrenadores("Entrenador X");
                                 competenciaNatacion.setOficialM("Amlo");
                                 competenciaNatacion.setJuecesS("Gold,Silver");
                                 competenciaNatacion.setJuecesN("Número");
                                 competenciaNatacion.setInspectoresVue("Oak");
                                 competenciaNatacion.setEstilo("Equipo Dinamita");
                                 competenciaNatacion.setGanador("Participantes");
                                 competenciaNatacion.setRama("Rama");
                                 competenciaNatacion.setCategoria("Categoría");
                                 competenciaNatacion.setSede("Sede");
                                 competenciaNatacion.setResultados("Resultados");
                                 competenciaNatacion.setFecha(2024.03f);

                                 System.out.println(competenciaNatacion.getOficialM());
                                 System.out.println(competenciaNatacion.getJuecesS());
                                 System.out.println(competenciaNatacion.getJuecesN());
                                 System.out.println(competenciaNatacion.getInspectoresVue());
                                 System.out.println(competenciaNatacion.getEstilo());
                                 System.out.println(competenciaNatacion.getGanador());
                                 System.out.println(competenciaNatacion.getPrimerLugar());
                                 System.out.println(competenciaNatacion.getSegLugar());
                                 System.out.println(competenciaNatacion.getTerlugar());
                                 System.out.println(competenciaNatacion.getEntrenadores());
                                 System.out.println(competenciaNatacion.getRama());
                                 System.out.println(competenciaNatacion.getCategoria());
                                 System.out.println(competenciaNatacion.getSede());
                                 System.out.println(competenciaNatacion.getResultados());
                                 System.out.println(competenciaNatacion.getFecha());*/

                                Natacion competenciaNatacion2 = new Natacion();
                                competenciaNatacion2.setOficialM("Oficial M: Juan");
                                competenciaNatacion2.setJuecesS("Pedro");
                                competenciaNatacion2.setJuecesN("Aron");
                                competenciaNatacion2.setInspectoresVue("Wallete");
                                competenciaNatacion2.setEstilo("Dorso");
                                competenciaNatacion2.setGanador("Ganador:Aquaman");

                                competenciaNatacion2.setPrimerLugar("1°.Aquaman");
                                competenciaNatacion2.setTiempoganador(0.01f);

                                competenciaNatacion2.setSegLugar("2°.Caeleb Dressel");
                                competenciaNatacion2.setTempoSegundo(4.46f);

                                competenciaNatacion2.setTerlugar("3°.Sarah Sjöström");
                                competenciaNatacion2.setTemTercer(4.56f);

                                competenciaNatacion2.setEntrenadores("Entrenador: El sukuna");
                                competenciaNatacion2.setOficialM("Oficial M: Amlo");
                                competenciaNatacion2.setJuecesS("Jueces: Gold,Silver");
                                competenciaNatacion2.setJuecesN("Número de jueces:2");
                                competenciaNatacion2.setInspectoresVue("Inspector:Oak");
                                competenciaNatacion2.setEstilo("Estilo: Dorso");
                                competenciaNatacion2.setGanador("Ganador: Aquaman");

                                competenciaNatacion2.setRecordM(4.05f);

                                competenciaNatacion2.setRecordRoto(0.01f);

                                if ((competenciaNatacion2.getRecordRoto()) < (competenciaNatacion2.getRecordM())) {
                                    System.out.println("Antiguo record Mundial-Profundo " + competenciaNatacion2.getRecordM());
                                    System.out.println("Nuevo record mundial Aquaman " + competenciaNatacion2.getRecordRoto());
                                }

                                competenciaNatacion2.setRama("Rama: Natacion");
                                competenciaNatacion2.setCategoria("Categoria: Varonil");
                                competenciaNatacion2.setSede("Sede:Marina de Marsella");
                                competenciaNatacion2.setResultados("1.Aquaman "
                                        + "2.Caeleb Dressel "
                                        + "3.Sarah Sjöström");

                                competenciaNatacion2.setFecha(2024.03f);

                                System.out.println(competenciaNatacion2.getOficialM());
                                System.out.println(competenciaNatacion2.getJuecesS());
                                System.out.println(competenciaNatacion2.getJuecesN());
                                System.out.println(competenciaNatacion2.getInspectoresVue());
                                System.out.println(competenciaNatacion2.getEstilo());
                                System.out.println(competenciaNatacion2.getGanador());
                                System.out.println(competenciaNatacion2.getPrimerLugar());
                                System.out.println(competenciaNatacion2.getTiempoganador());
                                System.out.println(competenciaNatacion2.getSegLugar());
                                System.out.println(competenciaNatacion2.getTempoSegundo());
                                System.out.println(competenciaNatacion2.getTerlugar());
                                System.out.println(competenciaNatacion2.getTemTercer());
                                System.out.println(competenciaNatacion2.getEntrenadores());
                                System.out.println(competenciaNatacion2.getRama());
                                System.out.println(competenciaNatacion2.getCategoria());
                                System.out.println(competenciaNatacion2.getSede());
                                System.out.println(competenciaNatacion2.getResultados());
                                System.out.println(competenciaNatacion2.getFecha());

                                break;

                            case 2:
                                Gymnasia competenciaGimnasia = new Gymnasia();
                                competenciaGimnasia.setModalidades("Gimnasia rítmica");
                                competenciaGimnasia.setJuezP("Ana López");
                                competenciaGimnasia.setJuecesdifi("María García");
                                competenciaGimnasia.setJuecesejecución("Mencho, CJNG");
                                competenciaGimnasia.setJuecesartística("Artística");
                                competenciaGimnasia.setJueceslíneas("María Fernández");
                                competenciaGimnasia.setCompilador("Datos de ganador");
                                competenciaGimnasia.setPrimerLugar("Sakura (Street Fighter)");
                                competenciaGimnasia.setSegLugar("Sakura (LeSeraffim)");
                                competenciaGimnasia.setTerlugar("Sakura (Naruto)");
                                competenciaGimnasia.setObservaciones("Observaciones:Mal ejecucion");
                                competenciaGimnasia.setEntrenadores("Entrenadores: Oscar Burgos, Perro Guarumo, Payaso Pilin");
                                competenciaGimnasia.setHora(15.5f);
                                competenciaGimnasia.setHits(20.0f);
                                competenciaGimnasia.setRecordM(3.5f);

                                System.out.println(competenciaGimnasia.getModalidades());
                                System.out.println(competenciaGimnasia.getJuezP());
                                System.out.println(competenciaGimnasia.getJuecesdifi());
                                System.out.println(competenciaGimnasia.getJuecesejecución());
                                System.out.println(competenciaGimnasia.getJuecesartística());
                                System.out.println(competenciaGimnasia.getJueceslíneas());
                                System.out.println(competenciaGimnasia.getCompilador());
                                System.out.println(competenciaGimnasia.getPrimerLugar());
                                System.out.println(competenciaGimnasia.getSegLugar());
                                System.out.println(competenciaGimnasia.getTerlugar());
                                System.out.println(competenciaGimnasia.getObservaciones());
                                System.out.println(competenciaGimnasia.getEntrenadores());
                                System.out.println(competenciaGimnasia.getHora());
                                System.out.println(competenciaGimnasia.getHits());
                                System.out.println(competenciaGimnasia.getRecordM());

                                break;
                            case 3:

                                Atletismo competenciaAtletismo = new Atletismo();

                                competenciaAtletismo.setJArbito("Peña Nieto");
                                competenciaAtletismo.setJArbitoSal("HomoPepe");
                                competenciaAtletismo.setJArbitoLl("Terry Bogard");
                                competenciaAtletismo.setHJAuxi("Andre Cuckquich ");
                                competenciaAtletismo.setCronometradores("Barry Allen");
                                competenciaAtletismo.setGanador("Wally West(The Flash)");
                                competenciaAtletismo.setPrimerLugar("Wally West");
                                competenciaAtletismo.setSegLugar("Tyson Gay");
                                competenciaAtletismo.setTerlugar("Asafa Powell");
                                competenciaAtletismo.setObservaciones("Previa prueba");
                                competenciaAtletismo.setEntrenadores("Red,Blue");
                                competenciaAtletismo.setHora(8.0f);
                                competenciaAtletismo.setHits(7.5f);
                                competenciaAtletismo.setRecordM(9.58f);
                                competenciaAtletismo.setRecordP(9.71f);
                                competenciaAtletismo.setTiempoganador(9.58f);
                                competenciaAtletismo.setTempoSegundo(9.71f);
                                competenciaAtletismo.setTemTercer(9.72f);

                                System.out.println(competenciaAtletismo.getJArbito());
                                System.out.println(competenciaAtletismo.getJArbitoSal());
                                System.out.println(competenciaAtletismo.getJArbitoLl());
                                System.out.println(competenciaAtletismo.getHJAuxi());
                                System.out.println(competenciaAtletismo.getCronometradores());
                                System.out.println(competenciaAtletismo.getGanador());
                                System.out.println(competenciaAtletismo.getPrimerLugar());
                                System.out.println(competenciaAtletismo.getSegLugar());
                                System.out.println(competenciaAtletismo.getTerlugar());
                                System.out.println(competenciaAtletismo.getObservaciones());
                                System.out.println(competenciaAtletismo.getEntrenadores());
                                System.out.println(competenciaAtletismo.getHora());
                                System.out.println(competenciaAtletismo.getHits());
                                System.out.println(competenciaAtletismo.getRecordM());
                                System.out.println(competenciaAtletismo.getRecordP());
                                System.out.println(competenciaAtletismo.getTiempoganador());
                                System.out.println(competenciaAtletismo.getTempoSegundo());
                                System.out.println(competenciaAtletismo.getTemTercer());

                                break;
                            case 4:
                                System.out.println("Regresando al menú principal...");
                                break;
                            default:
                                System.out.println("Opción no válida. Por favor, seleccione una opción entre 1 y 4.");
                        }

                    } while (subOption
                            != 4);
                    break;

                case 3:
                    System.out.println(
                            "Paseme maestra......porfavor");
                    System.out.println(
                            "Mencion honorifica al Maestro AKIRA TORIYAMA, y a HectorGOD, no hizo nada pero me cae bien y es mi inspiracion");
                    break;

                default:
                    System.out.println(
                            "Opción no válida. Por favor, seleccione una opción entre 1 y 3.");
                    System.out.println(
                            "Autor: Diego Arevalo Cabrales, Durango Dgo. ");
            }

        } while (3 != mainOption);

    }

}
