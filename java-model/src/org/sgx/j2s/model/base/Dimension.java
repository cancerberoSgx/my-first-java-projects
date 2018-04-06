package org.sgx.j2s.model.base;

import org.sgx.j2s.model.base.Dimension;
import org.sgx.j2s.model.base.Magnitude;

/**
 * 
 * @author sgurin
 *
 */
public class Dimension extends Magnitude {
	public Dimension(String unit, int width, int height) {
		super(unit);
		this.width = width;
		this.height = height;
	}

	public int width, height;
	
	public Dimension(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
	public Dimension plus(Dimension p) {
		return new Dimension(width+p.width, height+p.height);
	}
	public boolean equals(Dimension p) {
		return width==p.width && height==p.height;
	}
	
	public Dimension clone() {
		return new Dimension(width, height);
	}
}
