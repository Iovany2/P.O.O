package Competencias;

import java.util.*;

public class App {

    public static void main(String[] args) {
        Scanner ai = new Scanner(System.in);
        Random randomNumbers = new Random();

        int mainOption;
        int subOption;

        do {
            // Menú principal
            System.out.println("Competencia deportiva menu:");
            System.out.println("1. De conjunto");
            System.out.println("2. Individual");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");

            mainOption = ai.nextInt();

            switch (mainOption) {
                case 1:
                    do {
                        // Submenú de conjunto
                        System.out.println("1. Futbol");
                        System.out.println("2. Voleibol");
                        System.out.println("3. Beisbol");
                        System.out.println("4. Regresar al menú principal");
                        System.out.print("Seleccione una opción: ");

                        subOption = ai.nextInt();

                        switch (subOption) {
                            case 1:
                                Futbol competenciaFutbol = new Futbol();
                                competenciaFutbol.setArbitroprin("Juan Pérez");
                                competenciaFutbol.setÁrbitroasis1("Pedro Gómez");
                                competenciaFutbol.setArbitroasis2("Luis Ramírez");
                                competenciaFutbol.setCuartoárbitro("Carlos Sánchez");
                                competenciaFutbol.setMejorgoleadores("Messi, Ronaldo");
                                competenciaFutbol.setMdesempeño("Alto rendimiento");
                                competenciaFutbol.setNumpartido("123");
                                competenciaFutbol.setEquipos("Equipo A vs Equipo B");
                                competenciaFutbol.setNombreEquipos("Messi, Ronaldo");
                                competenciaFutbol.setEquiposParticipantes("11");
                                competenciaFutbol.setDisciplina("Fútbol");
                                competenciaFutbol.setRama("Varonil");
                                competenciaFutbol.setCategoria("Juvenil");
                                competenciaFutbol.setSede("Estadio X");
                                competenciaFutbol.setClasificacion("Primera");
                                competenciaFutbol.setResultados("2-1");
                                competenciaFutbol.setNumPartido(2.0f);
                                competenciaFutbol.setFecha(2024.05f);
                                imprimirDetallesCompetencia(competenciaFutbol);
                                System.out.println("Resultados equipo 1: " + randomNumbers.nextInt(5));
                                break;
                            case 2:
                                Voileball competenciaVoleibol = new Voileball();
                                competenciaVoleibol.setPrimerárbitro("Ana Pérez");
                                competenciaVoleibol.setSegundoárbitro("Sofía López");
                                competenciaVoleibol.setAnotador("Laura Ramírez");
                                competenciaVoleibol.setJueceslínea("Carlos Martínez");
                                competenciaVoleibol.setEquipov("Equipo V");
                                competenciaVoleibol.setJugadoresv("Jugadores vóley");
                                competenciaVoleibol.setNumeroj("12");
                                competenciaVoleibol.setClubv("Club V");
                                competenciaVoleibol.setEquipog("Equipo G");
                                competenciaVoleibol.setParticipacione("Participación equipos");
                                competenciaVoleibol.setDisciplinav("Disciplina V");
                                competenciaVoleibol.setRamav("Rama voleibol");
                                competenciaVoleibol.setCategoriaV("CategoríaV");
                                competenciaVoleibol.setSedeV("Sede V");
                                competenciaVoleibol.setClasificacionv("Clasificación V");
                                competenciaVoleibol.setResultados("Resultados");
                                competenciaVoleibol.setNumpartido(1.0f);
                                competenciaVoleibol.setFecha(2024.02f);
                                System.out.println(imprimirDetallesCompetencia(competenciaVoleibol));
                                break;
                            case 3:
                                Baseball competenciaBaseball = new Baseball();
                                competenciaBaseball.setNombreArbitro("Campos");
                                competenciaBaseball.setApellidosJugadores("Apellidos jugadores");
                                competenciaBaseball.setNombresEquipos("Nombres equipos");
                                competenciaBaseball.setEquipoG("Equipo G");
                                competenciaBaseball.setEquipos("Equipos");
                                competenciaBaseball.setNombreJugadores("Nombre jugadores");
                                competenciaBaseball.setCantidadJugadores("Cantidad jugadores");
                                competenciaBaseball.setNombreEquipo("Nombre equipo");
                                competenciaBaseball.setEquipog("Equipo G");
                                competenciaBaseball.setEquiposParticipantes("Equipos participantes");
                                competenciaBaseball.setDisciplina("Disciplina");
                                competenciaBaseball.setRama("Rama");
                                competenciaBaseball.setCategoria("Categoría");
                                competenciaBaseball.setSede("Sede");
                                competenciaBaseball.setClasificacion("Clasificación");
                                competenciaBaseball.setResultados("Resultados");
                                competenciaBaseball.setNumPartido(1.0f);
                                competenciaBaseball.setFecha(2024.02f);
                                System.out.println(imirDetallesCompetencia(competenciaBaseball));
                                break;
                            case 4:
                                System.out.println("Regresando al menú principal...");
                                break;
                            default:
                                System.out.println("Opción no válida. Por favor, seleccione una opción entre 1 y 4.");
                        }
                    } while (subOption != 4);
                    break;

                case 2:
                    do {
                        // Submenú individual
                        System.out.println("1. Natación");
                        System.out.println("2. Gimnasia");
                        System.out.println("3. Atletismo");
                        System.out.println("4. Regresar al menú principal");
                        System.out.print("Seleccione una opción: ");

                        subOption = ai.nextInt();

                        switch (subOption) {
                            case 1:
                                Natacion competenciaNatacion = new Natacion();
                                competenciaNatacion.setOficialM("Oficial M");
                                competenciaNatacion.setJuecesS("Jueces S");
                                competenciaNatacion.setJuecesN("Jueces N");
                                competenciaNatacion.setInspectoresVue("Inspectores Vue");
                                competenciaNatacion.setEstilo("Crol");
                                competenciaNatacion.setGanador("Michael Phelps");
                                competenciaNatacion.setPrimerLugar("Katie Ledecky");
                                competenciaNatacion.setSegLugar("Caeleb Dressel");
                                competenciaNatacion.setTerlugar("Sarah Sjöström");
                                competenciaNatacion.setMdesempeño("Buen desempeño");
                                competenciaNatacion.setEntrenadorX("Entrenador X");
                                competenciaNatacion.setOficialMesa("Equipos N");
                                competenciaNatacion.setJuecesS("Nombres");
                                competenciaNatacion.setJuecesN("Número");
                                competenciaNatacion.setInspectoresVue("Nombre");
                                competenciaNatacion.setEstilo("Equipo N");
                                competenciaNatacion.setGanador("Participantes");
                                competenciaNúmero("Jueces");
                                competenciaNatacion.setDisciplina("Disciplina");
                                competenciaNatacion.setRama("Rama");
                                competenciaNatacion.setCategoria("Categoría");
                                competenciaNatacion.setSede("Sede");
                                competenciaNatacion.setClasificación("Clasificación");
                                competenciaNatacion.setResultados("Resultados");
                                competenciaNatacion.setNumPartido(3.0f);
                                competenciaNatacion.setFecha(2024.03f);
                                System.out.println(imprimirDetallesCompetencia(competenciaNatacion));
                                break;
                            case 2:
                                Gymnasia competenciaGimnasia = new Gymnasia();
                                competenciaGimnasia.setModalidades("Gimnasia rítmica");
                                competenciaGimnasia.setJuezP("Ana López");
                                competenciaGimnasia.setJuecesdifi("María García");
                                competenciaGimnasia.setJuecesejecución("Laura Pérez");
                                competenciaGimnasia.setJuecesartística("Artística");
                                competenciaGimnasia.setJueceslíneas("María Fernández");
                                competenciaGimnasia.setCompilador("Datos de ganador");
                                competenciaGimnasia.setPrimerlugar("1er lugar");
                                competenciaGimnasia.setSegundolugar("2do lugar");
                                competenciaGimnasia.setTerclugar("3er lugar");
                                competenciaGimnasia.setObservaciones("Observaciones");
                                competenciaGimnasia.setEntrenadores("Entrenadores");
                                competenciaGimnasia.setTécnica(15.5f);
                                competenciaGimnasia.setPuntuacion(20.0f);
                                competenciaGimnasia.setTres(3.5f);

                                competenciaGimnasia.setModalidades("Gimnasia rítmica");
                                competenciaGimnasia.setJuezP("Ana López");
                                competenciaGimnasia.setJuecesdifi("María García");
                                competenciaGimnasia.setJuecesejecución("Laura Pérez");
                                competenciaGimnasia.setJuecesartística("Artística");
                                competenciaGimnasia.setJueceslíneas("María Fernández");
                                competenciaGimnasia.setCompilador("Datos de ganador");
                                competenciaGimnasia.setPrimerlugar("1er lugar");
                                competenciaGimnasia.setSegundolugar("2do lugar");
                                competenciaGimnasia.setTerclugar("3er lugar");
                                competenciaGimnasia.setObservaciones("Observaciones");
                                competenciaGimnasia.setEntrenadores("Entrenadores");
                                competenciaGimnasia.setTécnica(15.5f);
                                competenciaGimnasia.setPuntuacion(20.0f);
                                competenciaGimnasia.setTres(3.5f);
                                competenciaGimnasia.setClasifación("Posiciones");
                                competenciaGimnasia.setResultado("1er lugar");
                                competenciaGimnasia.setS("Especialista");
                                competenciaGimnasia.setMáximas("Posiciones de");
                                competenciaGimnasia.setNota("1er lugar");
                                competenciaGimnasia.setA("Carácter");
                                competenciaGimnasia.setMáximas("Posiciones de");
                                competenciaGimnasia.setPuntuación("Pruebas");
                                competenciaGimnasia.setCuerpo("Categoría");
                                competenciaGimnasia.setEjercicio("Gimnasia rítmica");
                                competenciaGimnasia.setCompetición("Gimnasia rítmica");
                                competenciaGimnasia.setEspacialista("Pruebas");
                                competenciaGimnasia.setClasificaciones("Equipos");
                                competenciaGimnasia.setPosiciones(1.0f);
                                competenciaGimnasia.setJuecesL("Jueces");
                                competenciaGimnasia.setCompetición("Pruebas");
                                competenciaGimnasia.setCalificación(10);
                                competenciaGimnasia.setNota("9");
                                competenciaGimnasia.setObservaciones("Equipos");

                                System.out.println("Posiciones: " + competenciaGimnasia.getResultados());
                                break;
                            case 3:
                                Atletismo competenciaAtletismo = new Atletismo();
                                competenciaAtletismo.setNomCompetencia("Juegos Olímpicos");
                                competenciaAtletismo.setTipoAtletismo("100 mts planos");
                                competenciaAtletismo.setPrimerLugar("Usain Bolt");
                                competenciaAtletismo.setSegundoLugar("Tyson Gay");
                                competenciaAtletismo.setTercerLugar("Asafa Powell");
                                competenciaAtletismo.setCuartoLugar("Yohan Blake");
                                competenciaAtletismo.setQuintoLugar("Justin Gatlin");
                                competenciaAtletismo.setTiempoPrimero(9.58f);
                                competenciaAtletismo.setTiempoSegundo(9.71f);
                                competenciaAtletismo.setTiempoTercero(9.72f);
                                competenciaAtletismo.setTiempoCuarto(9.75f);
                                competenciaAtletismo.setTiempoQuinto(9.79f);
                                competenciaAtletismo.setTiempoSexto(9.84f);
                                competenciaAtletismo.setTiempoSeptimo(9.89f);
                                competenciaAtletismo.setTiempoOctavo(9.91f);
                                competenciaAtletismo.setTiempoNoveno(9.95f);
                                competenciaAtletismo.setTiempoDecimo(9.98f);
                                competenciaAtletismo.setMejorAtleta("Jesse Owens");
                                competenciaAtletismo.setMejorAtleta("10.0f");
                                competenciaAtletismo.setLugarAtletismo(8.0f);
                                competenciaAtletismo.setCompetencia(7.5f);
                                competenciaAtletismo.setEntrenadores("Entrenadores");
                                competenciaAtletismo.setRelevos(4.0f);
                                competenciaAtletismo.setCategoría("Categoría");
                                competenciaAtletismo.setEdad(20.0f);
                                competenciaAtletismo.setSexo("Femenino");
                                competenciaAtletismo.setResul(10.0f);
                                competenciaAtletismo.setSituación("Posición de atleta");
                                competenciaAtletismo.setObservaciones("Previa prueba");
                                competenciaAtletismo.setComentarios("Otros resultados");
                                competenciaAtletismo.setTipoR("Pruebas");

                                System.out.println("100 mts planos: " + competenciaAtletismo.getNomCompetencia());
                                break;
                            case 4:
                                System.out.println("Regresando al menú principal...");
                                break;
                            default:
                                System.out.println("Opción no válida. Por favor, seleccione una opción entre 1 y 4.");
                        }
                    } while (subOption != 4);
                    break;

                case 3:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción entre 1 y 3.");
            }

        } while (mainOption != 3);

        ai.close();
    }

    private static void imprimirDetallesCompetencia(Competencia competencia) {
        System.out.println("Detalles de la competencia:");
        System.out.println("Tipo de competencia: " + competencia.getTipoCompetencia());
        System.out.println("Árbitro principal: " + competencia.getArbitroPrincipal());
        System.out.println("Fecha de la competencia: " + competencia.getFechaCompetencia());
        System.out.println("Número de participantes: " + competencia.getNumeroParticipantes());
        System.out.println("Sede: " + competencia.getSede());
        System.out.println("Disciplina: " + competencia.getDisciplina());
        System.out.println("Rama: " + competencia.getRama());
        System.out.println("Categoría: " + competencia.getCategoria());
        System.out.println("Clasificación: " + competencia.getClasificacion());
        System.out.println("Resultados: " + competencia.getResultados());
        System.out.println("-------------------------------------");
    }

    private static void imprimirDetallesCompetencia(Futbol competenciaFutbol) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static boolean imirDetallesCompetencia(Voileball competenciaVoleibol) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static boolean imirDetallesCompetencia(Baseball competenciaBaseball) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void competenciaNúmero(String jueces) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}/*
public class App {

    public static void main(String[] args) {
        Scanner ai = new Scanner(System.in);
        Random randomNumbers = new Random();

        int mainOption;
        int subOption;

        do {
            // Menú principal
            System.out.println("Competencia deportiva menu:");
            System.out.println("1. De conjunto");
            System.out.println("2. Individual");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");

            mainOption = ai.nextInt();

            switch (mainOption) {
                case 1:
                    do {
                        // Submenú de conjunto
                        System.out.println("1. Futbol");
                        System.out.println("2. Voleibol");
                        System.out.println("3. Beisbol");
                        System.out.println("4. Regresar al menú principal");
                        System.out.print("Seleccione una opción: ");

                        subOption = ai.nextInt();

                        switch (subOption) {
                            case 1:
                                Futbol si = new Futbol();
                                System.out.println("Has seleccionado Futbol.");
                                System.out.println("Resultados equipo 1 " + randomNumbers.nextInt(5));

                                break;
                            case 2:
                                System.out.println("Has seleccionado Voleibol.");
                                break;
                            case 3:
                                System.out.println("Has seleccionado Beisbol.");
                                break;
                            case 4:
                                System.out.println("Regresando al menú principal...");
                                break;
                            default:
                                System.out.println("Opción no válida. Por favor, seleccione una opción entre 1 y 4.");
                        }
                    } while (subOption != 4);
                    break;

                case 2:
                    do {
                        // Submenú individual
                        System.out.println("1. Natación");
                        System.out.println("2. Gimnasia");
                        System.out.println("3. Atletismo");
                        System.out.println("4. Regresar al menú principal");
                        System.out.print("Seleccione una opción: ");

                        subOption = ai.nextInt();

                        switch (subOption) {
                            case 1:
                                System.out.println("Has seleccionado Natación.");
                                break;
                            case 2:
                                System.out.println("Has seleccionado Gimnasia.");
                                break;
                            case 3:
                                System.out.println("Has seleccionado Atletismo.");
                                break;
                            case 4:
                                System.out.println("Regresando al menú principal...");
                                break;
                            default:
                                System.out.println("Opción no válida. Por favor, seleccione una opción entre 1 y 4.");
                        }
                    } while (subOption != 4);
                    break;

                case 3:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción entre 1 y 3.");
            }
        } while (mainOption != 3);

        ai.close();
    }
}
