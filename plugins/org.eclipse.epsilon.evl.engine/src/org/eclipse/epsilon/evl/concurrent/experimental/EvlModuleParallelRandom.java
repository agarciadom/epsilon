/*********************************************************************
 * Copyright (c) 2018 The University of York.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
**********************************************************************/
package org.eclipse.epsilon.evl.concurrent.experimental;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.eclipse.epsilon.eol.function.CheckedEolRunnable;
import org.eclipse.epsilon.evl.execute.atoms.*;
import org.eclipse.epsilon.evl.execute.context.concurrent.IEvlContextParallel;

/**
 * Shuffles the constraint-element pairs prior to execution.
 * 
 * @author Sina Madani
 * @since 1.6
 */
public final class EvlModuleParallelRandom extends ProfilableEvlModuleParallel {
	
	public EvlModuleParallelRandom() {
		super();
	}

	public EvlModuleParallelRandom(int parallelism) {
		super(parallelism);
	}
	
	@Override
	protected void checkConstraints() throws EolRuntimeException {
		IEvlContextParallel context = getContext();
		
		List<ConstraintAtom> originalJobs = profileExecutionStage("get initial jobs",
			() -> ConstraintAtom.getConstraintJobs(this)
		);

		profileExecutionStage("shuffle jobs", () -> Collections.shuffle(originalJobs));
		
		Collection<CheckedEolRunnable> executorJobs = new ArrayList<>(originalJobs.size());
		
		profileCreateJobs(() -> {
			for (ConstraintAtom job : originalJobs) {
				executorJobs.add(() -> job.unit.execute(job.element, context));
			}
		});
		
		profileExecuteJobs(executorJobs);
	}
	
}
