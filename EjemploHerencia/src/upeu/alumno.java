package upeu;
public class alumno extends persona {

	private String curso;
	private int nivelAcademico;
        public double monto;

    public alumno() {
    }

    public alumno(String curso, int nivelAcademico, String nombre, int edad) {
        super(nombre, edad);
        this.curso = curso;
        this.nivelAcademico = nivelAcademico;
    }
    
    
        public String cambiarCurso() {
            return "Yo "+super.nombre+" Voy a cambiar por el curso de :"+curso;
		
	}
//            public String toString() {
//                    throw new UnsupportedOperationException();
            

	public String pagoMensual() {
            return "Yo "+super.nombre +" pago un monto de :"+monto;
	}
        
        public static void main(String [] a) {
            alumno Alumno = new alumno("Matematica", 2, "paul", 18);
            System.out.println(Alumno.toStringUno()+ " y tengo "+Alumno.cambiarEdad()+ " años");
            Alumno.nombre="ccosi";
            Alumno.edad=18;
            System.out.println();
            System.out.println(Alumno.toStringUno()+ " y tengo "+Alumno.cambiarEdad()+ " años");
        }

}