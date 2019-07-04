package org.eclipse.epsilon.flexmi.dt;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.eclipse.epsilon.egl.EglPersistentTemplate;
import org.eclipse.epsilon.egl.exceptions.EglRuntimeException;
import org.eclipse.epsilon.egl.execute.context.IEglContext;
import org.eclipse.epsilon.egl.output.Writer;
import org.eclipse.epsilon.egl.spec.EglTemplateSpecification;
import org.eclipse.epsilon.egl.traceability.Variable;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;

public class RenderingEglTemplate extends EglPersistentTemplate {
	
	protected ContentTree contentTree;
	protected IEglContext context;
	
	public RenderingEglTemplate(EglTemplateSpecification spec, IEglContext context, URI outputRoot, String outputRootPath)
			throws Exception {
		super(spec, context, outputRoot, outputRootPath);
		this.context = context;
	}
	
	@Override
	protected void doGenerate(File file, String targetName, boolean overwrite, boolean merge)
			throws EglRuntimeException {
		
		System.out.println(file.getAbsolutePath());
		
		String format = "html";
		String icon = "cccccc";
		Collection<String> path = new ArrayList<>(Arrays.asList(""));
		
		for (Variable variable : template.getVariables()) {
			switch (variable.getName()) {
			case "format": format = variable.getValue() + ""; break;
			case "path": path = (Collection<String>) variable.getValue(); break;
			case "icon": icon = variable.getValue() + ""; break;
			}
		}
		
		contentTree.addPath(new ArrayList<String>(path), getContents(), format, icon);
		
		if (file != null && !file.isDirectory()) {
			try {
				new Writer(file, getContents()).write();
			} catch (IOException e) {
				throw new EglRuntimeException(new EolRuntimeException(e));
			}
		}
		
	}
	
	public void setContentTree(ContentTree contentTree) {
		this.contentTree = contentTree;
	}
	
}
