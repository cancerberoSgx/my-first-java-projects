package org.sgx.swing.gui.editors.file;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.DefaultListModel;
import javax.swing.JList;

public class ListReorderListener extends MouseAdapter {	 
	   private JList list;
	   private int pressIndex = 0;
	   private int releaseIndex = 0;	 
	   public ListReorderListener(JList list) {
	      if (!(list.getModel() instanceof DefaultListModel)) {
	         throw new IllegalArgumentException("List must have a DefaultListModel " +
	         		"but has "+list.getModel().getClass());
	      }
	      this.list = list;
	   }	 
	   @Override
	   public void mousePressed(MouseEvent e) {
	      pressIndex = list.locationToIndex(e.getPoint());
	   }	 
	   @Override
	   public void mouseReleased(MouseEvent e) {
	      releaseIndex = list.locationToIndex(e.getPoint());
	      if (releaseIndex != pressIndex && releaseIndex != -1) {
	         reorder();
	      }
	   }	 
	   @Override
	   public void mouseDragged(MouseEvent e) {
	      mouseReleased(e);
	      pressIndex = releaseIndex;      
	   }	 
	   private void reorder() {
	      DefaultListModel model = (DefaultListModel) list.getModel();
	      Object dragee = model.elementAt(pressIndex);
	      model.removeElementAt(pressIndex);
	      model.insertElementAt(dragee, releaseIndex);
	   }
	}