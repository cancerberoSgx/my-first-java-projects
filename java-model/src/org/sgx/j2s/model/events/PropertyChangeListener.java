package org.sgx.j2s.model.events;

import org.sgx.j2s.model.events.EventListener;
import org.sgx.j2s.model.events.PropertyChangeEvent;

public interface PropertyChangeListener extends EventListener {
void notifyPropertyChange(PropertyChangeEvent e);
}
