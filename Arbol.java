import java.io.File;

public class Arbol {

	public static void main(String[] args) {
		File f = new File("C:/users/narciso/desktop/games and videos");
		Listar(f, ">");

	}

	public static void Listar(File dir , String guion) {
		File[] listar;
		System.out.println("(D)");
		System.out.println(guion + dir.getAbsolutePath());
		listar=dir.listFiles();
		for (File file : listar) {
			if (file.isDirectory()) {
				Listar(file, "-" + guion);
			} else if (file.isFile()) {
				System.out.println("(F)");
					System.out.println(file);
			}
		
		}

	}

}
