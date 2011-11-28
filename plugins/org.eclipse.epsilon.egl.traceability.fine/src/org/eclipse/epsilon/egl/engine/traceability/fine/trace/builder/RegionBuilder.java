/*******************************************************************************
 * Copyright (c) 2011 The University of York.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Louis Rose - initial API and implementation
 ******************************************************************************/
package org.eclipse.epsilon.egl.engine.traceability.fine.trace.builder;

import org.eclipse.epsilon.egl.engine.traceability.fine.trace.Region;

public class RegionBuilder {

	private int startingOffset, endingOffset;
	
	public RegionBuilder aRegion() {
		startingOffset = 0;
		endingOffset   = 0;
		
		return this;
	}

	public RegionBuilder startingAt(int offset) {
		startingOffset = offset;
		return this;
	}
	
	public RegionBuilder endingAt(int offset) {
		endingOffset = offset;
		return this;
	}
	
	public Region build() {
		return new Region(startingOffset, endingOffset - startingOffset);
	}
}
