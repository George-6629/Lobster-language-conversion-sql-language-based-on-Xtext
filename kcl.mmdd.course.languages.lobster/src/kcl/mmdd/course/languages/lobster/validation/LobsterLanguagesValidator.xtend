/*
 * generated by Xtext 2.24.0
 */
package kcl.mmdd.course.languages.lobster.validation

import org.eclipse.xtext.validation.Check
import kcl.mmdd.course.languages.lobster.lobsterLanguages.VariableCharacter
import kcl.mmdd.course.languages.lobster.lobsterLanguages.LobsterLanguagesPackage
import kcl.mmdd.course.languages.lobster.lobsterLanguages.CreateTableColumn
import kcl.mmdd.course.languages.lobster.lobsterLanguages.DataType
import kcl.mmdd.course.languages.lobster.lobsterLanguages.SelectStatement
import kcl.mmdd.coursework.lobster.typing.validation.LobsterTypeSystemValidator

/** 
 * This class contains custom validation rules. 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class LobsterLanguagesValidator extends LobsterTypeSystemValidator {
	public static val INVALID_VARIABLE_NAME = 'kcl.mmdd.coursework.lobster.validation.INVALID_VARIABLE_NAME'
	public static val INVALID_SIZE = "kcl.mmdd.coursework.lobster.validation.INVALID_SIZE";
	public static val INVALID_ORDER = "kcl.mmdd.coursework.lobster.validation.INVALID_ORDER";
	public static val NULL_VALUE = "kcl.mmdd.coursework.lobster.validation.NULL_VALUE";

	@Check
	def CheckVariableCharacterStartWithLowercaseCharacter(VariableCharacter vach) {
		if (!Character.isLowerCase(vach.name.charAt(0))) {
			warning('Name should start with a lower-case character', vach,
				LobsterLanguagesPackage.Literals.VARIABLE_CHARACTER__NAME, INVALID_VARIABLE_NAME)
		}
	}

	@Check
	def checkColumn(CreateTableColumn column) {
		if (column.size !== null && column.datatype === DataType.INTEGER) {
			error('Integer Data Type Cannot Have Size', column,
				LobsterLanguagesPackage.Literals.CREATE_TABLE_COLUMN__SIZE, INVALID_SIZE)
		}
	}
	
	@Check
	def checkCalculation(SelectStatement select) {
		if (select.condition1.empty && select.order !== null ){
			error('You Must Order By A Value', select, LobsterLanguagesPackage.Literals.SELECT_STATEMENT__ORDER, INVALID_ORDER)
		}
	}
	


	@Check
	def CheckVariableCharacterNull(VariableCharacter var1) {
		if (var1.value.equals(null)) {
			warning('Variable Cannot be Null', var1, LobsterLanguagesPackage.Literals.VARIABLE_CHARACTER__VALUE,
				NULL_VALUE)
		}
	}
	
}
