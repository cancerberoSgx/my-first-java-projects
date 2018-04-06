package org.sgx.j2s.model.editor;

/**
 * una "objeto visual" que interactua con el usuario y al cual le podemos pregunar 
 * el valor seleccionado actualmenteactual
 * 
 * *) para que sirven los editores?
 * *.*) para no tener que dise�ar visualmente;) . 
 * 
 * @author nati
 *
 * @param <T>
 */
public interface Editor<T>{ 
	
	public T getCurrentValue() ;

	public abstract void setValue(T value);
}
