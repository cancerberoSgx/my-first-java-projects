package org.sgx.j2s.model.editor.selection;

import org.sgx.j2s.model.editor.selection.SelectionEvent;

public interface SelectionListener<T> {

	void notify(SelectionEvent<T> e);
}
