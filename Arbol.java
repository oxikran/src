import java.io.File;

public class Arbol {
	
	public static void main (String[] args){
		File[] l;
		File f = new File ("C:/");
		
		
	}
	
		public static void listar(File dir){
			File[] l;
			System.out.println("(D ))");
			System.out.println(dir.getAbsolutePath());
			l=dir.listFiles();
			
			
			for (File file : l){
				if (file.isDirectory())
					System.out.print("(D) ");
				else if (file.isFile())
					System.out.print("(F) ");
				System.out.println(file);
			}
			
		
	}
	
}
