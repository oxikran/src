//clase color con los colores get color  // color.rojo ................ to string equals constructor privado
public class ejercicio implements Comparable<ejercicio>{
	protected static final int ROJO=0;
	protected static final int NARANJA=1;
	protected static final int AMARILLO=2;
	protected static final int VERDE=3;
	protected static final int AZUL=4;
	protected static final int VIOLETA=5;
	protected static final int ROSA=6;
	
	public static final Color rojo= new Color(ROJO);
	public static final Color naranja= new Color(NARANJA);
	public static final Color amarillo= new Color(AMARILLO);
	public static final Color verde= new Color(VERDE);
	public static final Color azul= new Color(AZUL);
	public static final Color violeta= new Color(VIOLETA);
	public static final Color rosa= new Color(ROSA);
	
	protected Color(int color);{
		this.color= color;
	}
}
	@Override
	