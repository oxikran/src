public class Dado {
	protected static int lados;
	public Object[] historia;
	
	public Dado(int lados) {
		if (lados < 2)
			throw new RuntimeException("Al menos dos... ");
		this.lados = lados;
	}

	public int lanzarDado() {
		int cara;
		int i=0;
		cara = ((int) (Math.random() * lados)) + 1;
		historia[i]=cara;
		i++;
		return cara;
	}
}
