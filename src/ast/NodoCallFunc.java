package ast;

public class NodoCallFunc extends NodoBase {

    private String nombre;
    private NodoBase parametros;
    private String variable;

    public NodoCallFunc(String nombre, NodoBase parametros) {
        this.nombre = nombre;
        this.parametros = parametros;
    }

    public NodoCallFunc(String variable, String nombre, NodoBase parametros) {
        this.nombre = nombre;
        this.parametros = parametros;
        this.variable = variable;
    }

    
    public String getNombre() {
        return nombre;
    }

    public NodoBase getParametros() {
        return parametros;
    }

    public String getVariable() {
        return variable;
    }

  

}

