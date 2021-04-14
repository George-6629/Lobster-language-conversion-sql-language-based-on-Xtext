package kcl.mmdd.coursework.lobster.typing.validation;

import com.google.inject.Inject;
import it.xsemantics.runtime.validation.XsemanticsValidatorErrorGenerator;
import kcl.mmdd.course.languages.lobster.lobsterLanguages.CreateDatabaseStatement;
import kcl.mmdd.course.languages.lobster.validation.AbstractLobsterLanguagesValidator;
import kcl.mmdd.coursework.lobster.typing.LobsterTypeSystem;
import org.eclipse.xtext.validation.Check;

@SuppressWarnings("all")
public class LobsterTypeSystemValidator extends AbstractLobsterLanguagesValidator {
  @Inject
  protected XsemanticsValidatorErrorGenerator errorGenerator;
  
  @Inject
  protected LobsterTypeSystem xsemanticsSystem;
  
  protected LobsterTypeSystem getXsemanticsSystem() {
    return this.xsemanticsSystem;
  }
  
  @Check
  public void checkCreateDatabaseStatement(final CreateDatabaseStatement stmt) {
    errorGenerator.generateErrors(this,
    	getXsemanticsSystem().checkCreateDatabaseStatement(stmt),
    		stmt);
  }
}
