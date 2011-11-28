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
package org.eclipse.epsilon.egl.output;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class OutputBufferOffsetTests {

	@Test
	public void zeroWhenEmpty() {
		final OutputBuffer buffer = new OutputBuffer();
		
		assertEquals(0, buffer.getOffset());
	}

	@Test
	public void offsetIsLengthOfContents() throws Exception {
		final OutputBuffer buffer = new OutputBuffer();
		buffer.print("foo");
		
		assertEquals("foo".length(), buffer.getOffset());
	}
	
	@Test
	public void offsetIgnoresLineBreaks() throws Exception {
		final OutputBuffer buffer = new OutputBuffer();
		buffer.println("foo");
		buffer.print("bar");
		
		assertEquals("foobar".length(), buffer.getOffset());
	}
}
