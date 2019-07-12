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
import org.eclipse.epsilon.evl.execute.atoms.ConstraintContextAtom;

/**
 * 
 *
 * @author Sina Madani
 * @since 1.6
 */
public class EvlModuleParallelContextAtoms extends EvlModuleParallelAtomic<ConstraintContextAtom> {

	public EvlModuleParallelContextAtoms() {
		super();
	}

	public EvlModuleParallelContextAtoms(int parallelism) {
		super(parallelism);
	}

	@Override
	protected List<ConstraintContextAtom> getAllJobsImpl() throws EolRuntimeException {
		return ConstraintContextAtom.getContextJobs(this);
	}

}
