
public class mainRes3 {

	public static void main(String[] args) {
		dimension dimRec1 = new dimension(5, 3, 7);
		rectangulo3D rectangulo1 = new rectangulo3D();
		rectangulo1.setID(1);
	    rectangulo1.setTamaño(dimRec1);
	    
	    System.out.println("El rectangulo " + rectangulo1.getID() + " tiene las siguientes dimensiones:");
	    System.out.println("Alto: " + rectangulo1.getTamaño().getAlto());
	    System.out.println("Ancho: " + rectangulo1.getTamaño().getAncho());
	    System.out.println("Largo: " + rectangulo1.getTamaño().getLargo());
	}
}
