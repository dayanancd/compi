package ast;

public class NodoFor extends NodoBase {

    private NodoBase inicializacion;
    private NodoBase comprobacion;
    private NodoBase paso;
    private NodoBase cuerpo;

    public NodoFor(NodoBase inicializacion, NodoBase comprobacion, NodoBase paso, NodoBase cuerpo) {
        this.inicializacion = inicializacion;
        this.comprobacion = comprobacion;
        this.paso = paso;
        this.cuerpo = cuerpo;
    }

    public NodoBase getComprobacion() {
        return comprobacion;
    }

    public NodoBase getCuerpo() {
        return cuerpo;
    }

    public NodoBase getInicializacion() {
        return inicializacion;
    }

    public NodoBase getPaso() {
        return paso;
    }



}

