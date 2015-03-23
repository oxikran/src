package ListaEnteros;
import java.util.*;


@SuppressWarnings("serial")
public class ListaEnteros extends ArrayList<Integer> implements Suerte, Iterator<Integer> {
	
	
	
	
	
	
	@Override
	public boolean hasNext() {
		return false;
	}

	@Override
	public Integer next() {
		return null;
	}
	
	@Override
	public void remove(){
		throw new EmptyException()
	}
		
}