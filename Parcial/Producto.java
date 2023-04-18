package Parcial;

public enum Producto {

    LAPIZ("Lapiz", "Se usa para escribir, comúnmente cosas escritas o para dibujar."){
        @Override
        public String mostrarUso(){
            return "Se usa para escribir, comúnmente cosas escritas o para dibujar.";
        }
    },

    CUADERNO("cuaderno","En la cotidianidad se utiliza para almacenar información escrita."){
        @Override
        public String mostrarUso(){
            return "En la cotidianidad se utiliza para almacenar información escrita.";
        }
    },

    BORRADOR("Borrador","Se utiliza para borrar lo plasmado en el cuaderno."){
        @Override
        public String mostrarUso(){
            return "Se utiliza para borrar lo plasmado en el cuaderno.";
        }
    },

    SACAPUNTA("Sacapunta","Es creado para sacar una punta afilada a la base de grafito del lapiz."){
        @Override
        public String mostrarUso(){
            return "Es creado para sacar una punta afilada a la base de grafito del lapiz.";
        }
    },

    CARTUCHERA("Cartuchera","Sirve para almacenar todas las herramientas como; lapiz, cuaderno, borrador, sacapunta."){
        @Override
        public String mostrarUso(){
            return "Sirve para almacenar todas las herramientas como; lapiz, cuaderno, borrador, sacapunta.";
        }
    };

    private final String nombre;
    private final String descripcion;

    public abstract String mostrarUso();

    Producto(String Nombre, String Descripcion) {
        this.nombre = Nombre;
        this.descripcion = Descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
class Main {
    public static void main(String[] args) {
        Producto lapiz = Producto.LAPIZ;
        System.out.println(lapiz.getDescripcion());

        Producto cuaderno = Producto.CUADERNO;
        System.out.println(cuaderno.getDescripcion());

        Producto borrador = Producto.BORRADOR;
        System.out.println(borrador.getDescripcion());

        Producto sacapunta = Producto.SACAPUNTA;
        System.out.println(sacapunta.getDescripcion());

        Producto cartuchera = Producto.CARTUCHERA;
        System.out.println(cartuchera.getDescripcion());

    }
}