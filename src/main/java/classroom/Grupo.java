package classroom;

public class Grupo {

    Persona[] estudiantes;
    Persona profesor;
    Asignatura asignatura;
    int codigo = 0;
    String horario;
    int cantidadEstudiantes;

    Grupo(Persona[] estudiantes, Persona profesor, Asignatura asignatura,final int codigo, String horario) {
        this.estudiantes = estudiantes;
        this.profesor = profesor;
        this.asignatura = asignatura;
        this.codigo = codigo;
        this.horario = horario;
    }

    Grupo(int cantidadEstudiantes, Persona profesor, Asignatura asignatura,final int codigo, String horario) {
        this.cantidadEstudiantes=cantidadEstudiantes;
        this.codigo=codigo;
    	Persona[] personas = new Persona[cantidadEstudiantes];

    }

    Grupo(Persona[] estudiantes, Persona profesor, Asignatura asignatura) {
        this.estudiantes = estudiantes;
        this.profesor = profesor;
        this.asignatura = asignatura;
    }

    void cambiarEstudiante(Persona estudianteViejo, Persona estudianteNuevo) {
        for (int i = 0; i < estudiantes.length; i++) {
        	 if (estudiantes[i].equals(null)) {
        		 break;
        	 }
            if (estudiantes[i].getCedula() == estudianteViejo.getCedula()) {
                estudiantes[i] = estudianteNuevo;
                break;
            }
        }
    }
    
    /*void cambiarEstudiante(int indice, Persona estudiante) {
        /*if (estudiantes[indice].equals(null)) {
        	return;
        }
    	estudiantes[indice] = estudiante;*/
    	
    }

