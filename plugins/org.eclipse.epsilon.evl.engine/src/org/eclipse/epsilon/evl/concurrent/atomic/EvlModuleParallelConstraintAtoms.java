/*********************************************************************
 * Copyright (c) 2019 The University of York.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
**********************************************************************/
package org.eclipse.epsilon.evl.concurrent.atomic;

import java.util.List;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.eclipse.epsilon.evl.execute.atoms.ConstraintAtom;

/**
 * 
 *
 * @author Sina Madani
 * @since 1.6
 */
public class EvlModuleParallelConstraintAtoms extends EvlModuleParallelAtomic<ConstraintAtom> {

	public EvlModuleParallelConstraintAtoms() {
		super();
	}

	public EvlModuleParallelConstraintAtoms(int parallelism) {
		super(parallelism);
	}

	@Override
	protected List<ConstraintAtom> getAllJobsImpl() throws EolRuntimeException {
		return ConstraintAtom.getConstraintJobs(this);
	}

}
