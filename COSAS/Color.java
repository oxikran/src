public class Color implements Comparable<Color>{
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
	private static final int Color = 0;
	
	private Object color;
	
	protected Color(int color);{
		this.color= color;
	}

	@Override
	public boolean equals (object obj){
		if (obj instanceof Color){
		}
	}
	public Color getColor(){
		return this;
	}
	/*public int compareTo(Color arg0){
		return color-arg0.color:
		if (color<arg0.color){
			return -1;
		}else if(color==arg0.color){
			return 0;
		}else{
			return 1;
		}
			
	}*/
	@Override
	public int compareTo(Color arg0) {
		return Color-arg0.Color;
	}
}