package ast;

public class NodoReturn extends NodoBase {
	private NodoBase nombre;

    public NodoBase getNombre() {
        return nombre;
    }

    public NodoReturn(NodoBase nombre) {
        this.nombre = nombre;
    }


}
