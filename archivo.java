package POO;
import java.util.Scanner;

public class personaEj8App {
    Scanner sc= new Scanner(System.in);
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("--------Menu Principal--------");
        System.out.println("1.-Cargar datos alumnos");
        System.out.println("2.-Procesar los Datos");
        System.out.println("3.-Mostrar datos  de los alumnos");
        System.out.println("4.- Mostrar dato de un alumno");
        System.out.println("0.-Fin");
        int eleccion=sc.nextInt();
        switch (eleccion) {
            case 1:
            System.out.println("¿Cuántos alumnos deseas introducir?");
            int cantalumno = sc.nextInt();
             String alumnos = datosalumno(cantalumno); // Cargar datos
            break;

        case 2:
            // Aquí puedes agregar la lógica para procesar los datos si es necesario
            System.out.println("Procesando datos...");
            personaEJ8[]persona.mediaEdad();
            personaEJ8[]persona.cantAlto();
            break;

        case 3:
            if (alumnos != null) {
                imprimir(alumnos); // Mostrar todos los datos de los alumnos
            } else {
                System.out.println("No hay alumnos cargados.");
            }
            break;

        case 4:
           
                
            break;

        case 0:
            break;

        default:
            System.out.println("Opción no válida. Por favor, elige otra opción.");
            break;
        }

    }

    public personaEJ8[]datosalumno(int cantalumno){
        personaEJ8 alumnos[]= new personaEJ8[cantalumno];
        personaEJ8[]persona=new personaEJ8[cantalumno];
        for(int i=0;i<alumnos.length;i++){
            persona[i]=new personaEJ8();
            System.out.println("Introduce el nombre del alumno");
            persona[i].setnombre(sc.nextLine());
            System.out.println("Dime el sexo del alumno");
            persona[i].setsexo(sc.next().charAt(0));
            if((persona[i].getsexo()!='M')||(persona[i].getsexo()!='H')){
                persona[i].setsexo('M');
            }
            System.out.println("Introduce la edad");
            int edadalumno=sc.nextInt();
            if(edadalumno<0){
                throw new ArithmeticException("Mentiroso compulsibo");
             
            }
            System.out.println("Introduce la altura del alumno");
            double alturaAlumno=sc.nextDouble();
            if(alturaAlumno<0){
                throw new ArithmeticException("Que eres un pitufo q ni mideo 0m");
            }else if(alturaAlumno>2.5){
                throw new ArithmeticException("Que eres basajaun mentiroso");
            }
            System.out.println("Introduce el peso del alumno");
            double peso=sc.nextDouble();
            if((peso<0)||(peso>150)){
                throw new ArithmeticException("Espabila payaso");
            }

            
        }
        return persona;
        }
    
    public static void imprimir(personaEJ8[]persona){
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("Lista de alumnos");
        System.out.println("_______________________");
        System.out.println("Nombre"+"        "+"Sexo"+"        "+"Edad"+"        "+"altura"+"        "+"Peso");
        System.out.println("--------------------------------------------------------------------------------");
        for(int i=0;i<persona.length;i++){
            System.out.println("");     
            System.out.println(persona[i].getnombre() + persona[i].getsexo() +persona[i].getedad() + persona[i].getaltura() + persona[i].getpeso());
        }

    }
}
    

