/*
 * generated by Xtext 2.24.0
 */
package kcl.mmdd.course.languages.lobster.ui.quickfix

import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider
import org.eclipse.xtext.ui.editor.quickfix.Fix
import kcl.mmdd.course.languages.lobster.validation.LobsterLanguagesValidator
import org.eclipse.xtext.validation.Issue
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor

/** 
 * Custom quickfixes.
 * See https://www.eclipse.org/Xtext/documentation/310_eclipse_support.html#quick-fixes
 */
class LobsterLanguagesQuickfixProvider extends DefaultQuickfixProvider {

	@Fix(LobsterLanguagesValidator.INVALID_VARIABLE_NAME)
	def LowerCaseVarName(Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, 'Lower case Variable Name', 'Change the variable name to Lower case character', null) [ context |
			val xtextDocument = context.xtextDocument
			val firstLetter = xtextDocument.get(issue.offset, 1)
			xtextDocument.replace(issue.offset, 1, firstLetter.toLowerCase)
		]
	}
}
