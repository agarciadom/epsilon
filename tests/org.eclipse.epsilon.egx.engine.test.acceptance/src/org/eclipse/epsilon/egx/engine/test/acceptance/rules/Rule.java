/*******************************************************************************
 * Copyright (c) 2014 The University of York.
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * Contributors:
 *     Louis Rose - initial API and implementation
 ******************************************************************************/
package org.eclipse.epsilon.egx.engine.test.acceptance.rules;

import static org.junit.Assert.assertEquals;
import org.eclipse.epsilon.egx.engine.test.acceptance.util.EgxAcceptanceTest;
import org.junit.BeforeClass;
import org.junit.Test;

public class Rule extends EgxAcceptanceTest {

	private static final String egx = "rule Person2Greeting "       +
	                                  "  transform p : Person {"    +
	                                  "    template: \"hello.egl\"" +
	                                  "    target: \"out.txt\" "    + 
	                                  "}";
	
	private static final String model = "Families { "        +
	                                    "  Person { "        +
	                                    "    name: \"John\"" +
	                                    "  }"                + 
	                                    "}";
	
	@BeforeClass
	public static void setup() throws Exception {
		runEgx(egx, model, template("hello.egl", "Hello [%=p.name%]"));
	}
	
	@Test
	public void targetContainsGeneratedText() {
		assertEquals("Hello John", factory.getContentFor("out.txt"));
	}

}
