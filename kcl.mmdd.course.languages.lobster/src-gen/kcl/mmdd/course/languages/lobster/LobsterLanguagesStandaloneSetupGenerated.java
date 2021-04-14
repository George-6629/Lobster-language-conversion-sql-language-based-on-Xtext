/*
 * generated by Xtext 2.24.0
 */
package kcl.mmdd.course.languages.lobster;

import com.google.inject.Guice;
import com.google.inject.Injector;
import kcl.mmdd.course.languages.lobster.lobsterLanguages.LobsterLanguagesPackage;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.ISetup;
import org.eclipse.xtext.common.TerminalsStandaloneSetup;
import org.eclipse.xtext.resource.IResourceFactory;
import org.eclipse.xtext.resource.IResourceServiceProvider;

@SuppressWarnings("all")
public class LobsterLanguagesStandaloneSetupGenerated implements ISetup {

	@Override
	public Injector createInjectorAndDoEMFRegistration() {
		TerminalsStandaloneSetup.doSetup();

		Injector injector = createInjector();
		register(injector);
		return injector;
	}
	
	public Injector createInjector() {
		return Guice.createInjector(new LobsterLanguagesRuntimeModule());
	}
	
	public void register(Injector injector) {
		if (!EPackage.Registry.INSTANCE.containsKey("http://www.mmdd.kcl/course/languages/lobster/LobsterLanguages")) {
			EPackage.Registry.INSTANCE.put("http://www.mmdd.kcl/course/languages/lobster/LobsterLanguages", LobsterLanguagesPackage.eINSTANCE);
		}
		IResourceFactory resourceFactory = injector.getInstance(IResourceFactory.class);
		IResourceServiceProvider serviceProvider = injector.getInstance(IResourceServiceProvider.class);
		
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("lobster", resourceFactory);
		IResourceServiceProvider.Registry.INSTANCE.getExtensionToFactoryMap().put("lobster", serviceProvider);
	}
}
