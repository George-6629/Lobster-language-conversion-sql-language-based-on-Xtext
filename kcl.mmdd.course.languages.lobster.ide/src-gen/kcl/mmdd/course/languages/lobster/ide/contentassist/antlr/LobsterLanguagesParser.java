/*
 * generated by Xtext 2.24.0
 */
package kcl.mmdd.course.languages.lobster.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import kcl.mmdd.course.languages.lobster.ide.contentassist.antlr.internal.InternalLobsterLanguagesParser;
import kcl.mmdd.course.languages.lobster.services.LobsterLanguagesGrammarAccess;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class LobsterLanguagesParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(LobsterLanguagesGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, LobsterLanguagesGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getStatementAccess().getAlternatives(), "rule__Statement__Alternatives");
			builder.put(grammarAccess.getPrimaryExpressionAccess().getAlternatives(), "rule__PrimaryExpression__Alternatives");
			builder.put(grammarAccess.getDataTypeAccess().getAlternatives(), "rule__DataType__Alternatives");
			builder.put(grammarAccess.getMoreConditionAccess().getAlternatives(), "rule__MoreCondition__Alternatives");
			builder.put(grammarAccess.getCaculateConditionAccess().getAlternatives(), "rule__CaculateCondition__Alternatives");
			builder.put(grammarAccess.getOrderAccess().getAlternatives(), "rule__Order__Alternatives");
			builder.put(grammarAccess.getVariableCharacterAccess().getGroup(), "rule__VariableCharacter__Group__0");
			builder.put(grammarAccess.getCreateDatabaseStatementAccess().getGroup(), "rule__CreateDatabaseStatement__Group__0");
			builder.put(grammarAccess.getCreateTableStatementAccess().getGroup(), "rule__CreateTableStatement__Group__0");
			builder.put(grammarAccess.getCreateTableColumnAccess().getGroup(), "rule__CreateTableColumn__Group__0");
			builder.put(grammarAccess.getCreateTableColumnAccess().getGroup_5(), "rule__CreateTableColumn__Group_5__0");
			builder.put(grammarAccess.getInsertStatementAccess().getGroup(), "rule__InsertStatement__Group__0");
			builder.put(grammarAccess.getInsertStatementAccess().getGroup_3(), "rule__InsertStatement__Group_3__0");
			builder.put(grammarAccess.getDeleteDataStatementAccess().getGroup(), "rule__DeleteDataStatement__Group__0");
			builder.put(grammarAccess.getMoreConditionStatementAccess().getGroup(), "rule__MoreConditionStatement__Group__0");
			builder.put(grammarAccess.getDeleteTableStatementAccess().getGroup(), "rule__DeleteTableStatement__Group__0");
			builder.put(grammarAccess.getUpdateStatementAccess().getGroup(), "rule__UpdateStatement__Group__0");
			builder.put(grammarAccess.getSelectStatementAccess().getGroup(), "rule__SelectStatement__Group__0");
			builder.put(grammarAccess.getSelectStatementAccess().getGroup_1(), "rule__SelectStatement__Group_1__0");
			builder.put(grammarAccess.getSelectStatementAccess().getGroup_11(), "rule__SelectStatement__Group_11__0");
			builder.put(grammarAccess.getSelectStatementAccess().getGroup_11_2(), "rule__SelectStatement__Group_11_2__0");
			builder.put(grammarAccess.getSelectStatementAccess().getGroup_12(), "rule__SelectStatement__Group_12__0");
			builder.put(grammarAccess.getConditionStatementAccess().getGroup(), "rule__ConditionStatement__Group__0");
			builder.put(grammarAccess.getLobsterProgramAccess().getStatementsAssignment(), "rule__LobsterProgram__StatementsAssignment");
			builder.put(grammarAccess.getVariableCharacterAccess().getNameAssignment_1(), "rule__VariableCharacter__NameAssignment_1");
			builder.put(grammarAccess.getVariableCharacterAccess().getValueAssignment_3(), "rule__VariableCharacter__ValueAssignment_3");
			builder.put(grammarAccess.getCreateDatabaseStatementAccess().getDbnameAssignment_4(), "rule__CreateDatabaseStatement__DbnameAssignment_4");
			builder.put(grammarAccess.getCreateTableStatementAccess().getTbnameAssignment_4(), "rule__CreateTableStatement__TbnameAssignment_4");
			builder.put(grammarAccess.getCreateTableStatementAccess().getDbnameAssignment_6(), "rule__CreateTableStatement__DbnameAssignment_6");
			builder.put(grammarAccess.getCreateTableStatementAccess().getColumnsAssignment_9(), "rule__CreateTableStatement__ColumnsAssignment_9");
			builder.put(grammarAccess.getCreateTableColumnAccess().getColumnNameAssignment_1(), "rule__CreateTableColumn__ColumnNameAssignment_1");
			builder.put(grammarAccess.getCreateTableColumnAccess().getDatatypeAssignment_3(), "rule__CreateTableColumn__DatatypeAssignment_3");
			builder.put(grammarAccess.getCreateTableColumnAccess().getSizeAssignment_5_2(), "rule__CreateTableColumn__SizeAssignment_5_2");
			builder.put(grammarAccess.getInsertStatementAccess().getColumnAssignment_3_1(), "rule__InsertStatement__ColumnAssignment_3_1");
			builder.put(grammarAccess.getInsertStatementAccess().getValueAssignment_3_3(), "rule__InsertStatement__ValueAssignment_3_3");
			builder.put(grammarAccess.getInsertStatementAccess().getTbnameAssignment_6(), "rule__InsertStatement__TbnameAssignment_6");
			builder.put(grammarAccess.getDeleteDataStatementAccess().getConditionAssignment_2(), "rule__DeleteDataStatement__ConditionAssignment_2");
			builder.put(grammarAccess.getDeleteDataStatementAccess().getTbnameAssignment_6(), "rule__DeleteDataStatement__TbnameAssignment_6");
			builder.put(grammarAccess.getMoreConditionStatementAccess().getColumnAssignment_1(), "rule__MoreConditionStatement__ColumnAssignment_1");
			builder.put(grammarAccess.getMoreConditionStatementAccess().getValueAssignment_3(), "rule__MoreConditionStatement__ValueAssignment_3");
			builder.put(grammarAccess.getMoreConditionStatementAccess().getMoreconditionAssignment_4(), "rule__MoreConditionStatement__MoreconditionAssignment_4");
			builder.put(grammarAccess.getDeleteTableStatementAccess().getTbnameAssignment_1(), "rule__DeleteTableStatement__TbnameAssignment_1");
			builder.put(grammarAccess.getUpdateStatementAccess().getTbnameAssignment_1(), "rule__UpdateStatement__TbnameAssignment_1");
			builder.put(grammarAccess.getUpdateStatementAccess().getSetvalueAssignment_5(), "rule__UpdateStatement__SetvalueAssignment_5");
			builder.put(grammarAccess.getUpdateStatementAccess().getConditionAssignment_9(), "rule__UpdateStatement__ConditionAssignment_9");
			builder.put(grammarAccess.getSelectStatementAccess().getCaculateConditionAssignment_1_0(), "rule__SelectStatement__CaculateConditionAssignment_1_0");
			builder.put(grammarAccess.getSelectStatementAccess().getColumnAssignment_3(), "rule__SelectStatement__ColumnAssignment_3");
			builder.put(grammarAccess.getSelectStatementAccess().getConditionAssignment_6(), "rule__SelectStatement__ConditionAssignment_6");
			builder.put(grammarAccess.getSelectStatementAccess().getTbnameAssignment_10(), "rule__SelectStatement__TbnameAssignment_10");
			builder.put(grammarAccess.getSelectStatementAccess().getCondition1Assignment_11_2_1(), "rule__SelectStatement__Condition1Assignment_11_2_1");
			builder.put(grammarAccess.getSelectStatementAccess().getOrderAssignment_12_1(), "rule__SelectStatement__OrderAssignment_12_1");
			builder.put(grammarAccess.getConditionStatementAccess().getColumnAssignment_1(), "rule__ConditionStatement__ColumnAssignment_1");
			builder.put(grammarAccess.getConditionStatementAccess().getValueAssignment_3(), "rule__ConditionStatement__ValueAssignment_3");
			builder.put(grammarAccess.getCharLiteralAccess().getVacAssignment(), "rule__CharLiteral__VacAssignment");
			builder.put(grammarAccess.getIntLiteralAccess().getValAssignment(), "rule__IntLiteral__ValAssignment");
			builder.put(grammarAccess.getVariableReferenceAccess().getVarAssignment(), "rule__VariableReference__VarAssignment");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private LobsterLanguagesGrammarAccess grammarAccess;

	@Override
	protected InternalLobsterLanguagesParser createParser() {
		InternalLobsterLanguagesParser result = new InternalLobsterLanguagesParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public LobsterLanguagesGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(LobsterLanguagesGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
