/*******************************************************************************
 * Copyright (c) 2008 The University of York.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Dimitrios Kolovos - initial API and implementation
 ******************************************************************************/
package org.eclipse.epsilon.eol.exceptions;

import org.eclipse.epsilon.commons.parse.AST;
import org.eclipse.epsilon.eol.execute.prettyprinting.PrettyPrinterManager;
import org.eclipse.epsilon.eol.types.EolNoType;

public class EolIllegalOperationException extends EolRuntimeException {
	
	// Generated by Eclipse
	private static final long serialVersionUID = 1418757189757495698L;
	
	protected String methodName = "";
	protected Object object = null;
	protected PrettyPrinterManager prettyPrintManager;
	
	public EolIllegalOperationException(Object object, String methodName, AST ast, PrettyPrinterManager prettyPrintManger) {
		super();
		this.ast = ast;
		this.methodName = methodName;
		this.object = object;
		this.prettyPrintManager = prettyPrintManger;
	}
	
	public String getMethodName() {
		return methodName;
	}
	
	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}
	
	public Object getObject() {
		return object;
	}
	
	public void setObject(Object object) {
		this.object = object;
	}
	
	@Override
	public String getReason(){
		if (object == null || object.equals(EolNoType.NoInstance)) {
			return "Method '" + methodName + "' not found";
		} else {		
			return "Method '" + methodName + "' not found for: " + prettyPrintManager.print(object);
		}
	}
}
