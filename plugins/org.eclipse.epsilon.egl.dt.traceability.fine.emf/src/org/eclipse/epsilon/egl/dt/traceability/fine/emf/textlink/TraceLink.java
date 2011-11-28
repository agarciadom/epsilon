/**
 * Copyright (c) 2011 The University of York.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *      Louis Rose - initial API and implementation
 */
package org.eclipse.epsilon.egl.dt.traceability.fine.emf.textlink;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trace Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.epsilon.egl.dt.traceability.fine.emf.textlink.TraceLink#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.epsilon.egl.dt.traceability.fine.emf.textlink.TraceLink#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.epsilon.egl.dt.traceability.fine.emf.textlink.TraceLink#getDestination <em>Destination</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.epsilon.egl.dt.traceability.fine.emf.textlink.TextlinkPackage#getTraceLink()
 * @model
 * @generated
 */
public interface TraceLink extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see org.eclipse.epsilon.egl.dt.traceability.fine.emf.textlink.TextlinkPackage#getTraceLink_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.eclipse.epsilon.egl.dt.traceability.fine.emf.textlink.TraceLink#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' containment reference.
	 * @see #setSource(ModelLocation)
	 * @see org.eclipse.epsilon.egl.dt.traceability.fine.emf.textlink.TextlinkPackage#getTraceLink_Source()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ModelLocation getSource();

	/**
	 * Sets the value of the '{@link org.eclipse.epsilon.egl.dt.traceability.fine.emf.textlink.TraceLink#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(ModelLocation value);

	/**
	 * Returns the value of the '<em><b>Destination</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destination</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination</em>' containment reference.
	 * @see #setDestination(TextLocation)
	 * @see org.eclipse.epsilon.egl.dt.traceability.fine.emf.textlink.TextlinkPackage#getTraceLink_Destination()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TextLocation getDestination();

	/**
	 * Sets the value of the '{@link org.eclipse.epsilon.egl.dt.traceability.fine.emf.textlink.TraceLink#getDestination <em>Destination</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination</em>' containment reference.
	 * @see #getDestination()
	 * @generated
	 */
	void setDestination(TextLocation value);

} // TraceLink
