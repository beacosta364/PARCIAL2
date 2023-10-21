//Brayan Estein Acosta Achinte
// cc: 1107509939

public class planeta {
    String nombre;
    int cantidadSatelites;
    double masa;
    double volumen;
    double diametro;
    double distanciaSol;
    boolean observable;

    public planeta(int cantidadSatelites, double diametro, double distanciaSol, double masa, String nombre, boolean observable, double volumen) {
        this.cantidadSatelites = cantidadSatelites;
        this.diametro = diametro;
        this.distanciaSol = distanciaSol;
        this.masa = masa;
        this.nombre = nombre;
        this.observable = observable;
        this.volumen = volumen;
    }

    public void imprimirValores() {
        System.out.println("Nombre= " + nombre);
        System.out.println("Cantidad de satelites= " + cantidadSatelites);
        System.out.println("Masa= " + masa);
        System.out.println("Volumen= " + volumen);
        System.out.println("Diámetro= " + diametro);
        System.out.println("Distancia al Sol= " + distanciaSol);
        System.out.println("Es observable= " + observable);
        System.out.println("Densidad= " + calcularDensidad());
    }

    public double calcularDensidad() {
        return masa / volumen;
    }

    public static void main(String[] args) {

        planeta planeta1 = new planeta(1,12742,150000000,5.9736E24,"Tierra",true,1.08321E12);
        planeta planeta2 = new planeta(1,139820,750000000,1.899E27,"Jupiter",true,1.4313E15);


        System.out.println("--------------------primer objeto----------------");
        planeta1.imprimirValores();
        System.out.println("--------------------segundo objeto----------------");
        planeta2.imprimirValores();
    }
}



