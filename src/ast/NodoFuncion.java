package ast;

public class NodoFuncion extends NodoBase {

    private String nombre;
    private NodoBase parametros;
    private NodoBase cuerpo;

    public NodoFuncion(String nombre, NodoBase parametros, NodoBase cuerpo) {
        this.cuerpo = cuerpo;
        this.nombre = nombre;
        this.parametros = parametros;
    }

    public NodoBase getParametros() {
        return parametros;
    }

    public String getNombre() {
        return this.nombre;
    }

    public NodoBase getCuerpo() {
        return this.cuerpo;
    }


}

