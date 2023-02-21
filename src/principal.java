import puntocinco.student;
import puntosiete.person;

public class principal {

	public static void main (String [] args) {
		//crear un objeto tipo student con la siguiente sintaxis
		//primero coloco el tipo de dato del objeto, despues el nombre del objeto 
		//luego el signo igual, despues la palabra new y por el ultimo el contructor de la clase 
		
		student st = new student(); 
		System.out.println(st.name + "\n" + st.Id + "\n" + st.status);
		
	
	person p1 = new person(37, "arial");
	person p2 = new person(15,"joseph");
	
	if(p1.getAge() == p2.getAge()) {
		System.out.println(p1.getName()+ "tiene el mismo nombre que" + p2.getName());
	}
	else {
		System.out.println(p1.getName()+ " no tiene el mismo nombre que "+ p2.getName());
	}
	
	
	
	}
	
	
	
}


