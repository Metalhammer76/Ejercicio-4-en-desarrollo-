public class SmartDevice
{
	public static void SmartDevice(String[] args) {
	    
		/*
		Crear una clase SmartDevice. Dentro crearéis las clases hijas: SmartPhone y SmartWatch.
	    Agregar atributos tal cual tendrían esos objetos en la realidad.
        Crear constructor vacío y con todos los parámetros para cada clase.
        Crear objetos de cada una e imprimir sus valores por consola.
         */

//1.Atributos

String fabricante = "fabricante";
String modelo = "modelo";
Float pantalla = "pantalla";
Integer peso = "peso";
Boolean camara = "camara";
Integer bateria = "bateria";
Integer almacenamiento = "almacenamiento";

//2.Constructor

public static class SmartPhonemartPhone("fabricante", "modelo", "pulgadaspantalla", "pesogramos", "camara", "capacidadbateria", "almacenamiento");
    String fabricante = "Samsung";
    String modelo = "Galaxy S21 Ultra 5G";
    Float pulgadaspantalla = "6,8";
    Integer pesogramos = "229";
    Boolean camara = "true";
    Integer capacidadbateria = "5000";
    Integer almacenamiento = "512";
    
public static class SmartWatch("fabricante", "modelo", "pulgadaspantalla", "pesogramos", "camara", "capacidadbateria", "almacenamiento");

    String fabricante = "Samsung";
    String modelo = "Galaxy Watch 4 Classic 4G";
    Float pantalla = "1,36";
    Integer peso = "52";
    Boolean camara = "false";
    Integer bateria = "361";
    Integer almacenamiento = "16";
	    
//3.Métodos

SmartDevice = new SmartPhone("Samsung","Galaxy S21 Ultra 5G", "6,8", "229", "true", "5000", "512");
SmartDevice = new SmartWatch("Samsung","Galaxy Watch 4 Classic 4G", "1,36", "52", "false", "361", "16");

System.out.println(SmartPhone tiene estas características : + "Samsung","Galaxy S21 Ultra 5G", "6,8", "229", "true", "5000", "512");
System.out.println(SmartWatch tiene estas características : + "Samsung","Galaxy Watch 4 Classic 4G", "1,36", "52", "false", "361", "16");
	}
}
