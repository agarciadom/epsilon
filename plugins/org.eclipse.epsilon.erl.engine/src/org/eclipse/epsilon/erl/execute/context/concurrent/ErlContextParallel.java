package org.eclipse.epsilon.erl.execute.context.concurrent;

import org.eclipse.epsilon.eol.execute.context.IEolContext;
import org.eclipse.epsilon.eol.execute.context.concurrent.EolContextParallel;
import org.eclipse.epsilon.erl.IErlModule;
import org.eclipse.epsilon.erl.execute.RuleExecutorFactory;

public class ErlContextParallel extends EolContextParallel implements IErlContextParallel {

	public ErlContextParallel() {
		super();
	}

	public ErlContextParallel(IEolContext other, int parallelism, boolean persistThreadLocals) {
		super(other, parallelism, persistThreadLocals);
	}

	public ErlContextParallel(IEolContext other, int parallelism) {
		super(other, parallelism);
	}

	public ErlContextParallel(IEolContext other) {
		super(other);
	}

	public ErlContextParallel(int parallelism, boolean persistThreadLocals) {
		super(parallelism, persistThreadLocals);
	}

	public ErlContextParallel(int parallelism) {
		super(parallelism);
	}

	@Override
	public IErlModule getModule() {
		return (IErlModule) super.getModule();
	}
	
	@Override
	protected void initMainThreadStructures() {
		super.initMainThreadStructures();
		executorFactory = new RuleExecutorFactory(null, true);
	}
	
	@Override
	protected void initThreadLocals() {
		super.initThreadLocals();
		concurrentExecutors = initThreadLocal(() -> new RuleExecutorFactory(executorFactory, false));
	}
	
	@Override
	public RuleExecutorFactory getExecutorFactory() {
		return (RuleExecutorFactory) super.getExecutorFactory();
	}
}