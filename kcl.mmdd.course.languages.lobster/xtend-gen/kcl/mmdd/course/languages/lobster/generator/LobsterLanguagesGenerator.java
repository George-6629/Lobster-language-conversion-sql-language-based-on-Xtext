/**
 * generated by Xtext 2.24.0
 */
package kcl.mmdd.course.languages.lobster.generator;

import java.util.Arrays;
import kcl.mmdd.course.languages.lobster.lobsterLanguages.CaculateCondition;
import kcl.mmdd.course.languages.lobster.lobsterLanguages.CharLiteral;
import kcl.mmdd.course.languages.lobster.lobsterLanguages.ConditionStatement;
import kcl.mmdd.course.languages.lobster.lobsterLanguages.CreateDatabaseStatement;
import kcl.mmdd.course.languages.lobster.lobsterLanguages.CreateTableColumn;
import kcl.mmdd.course.languages.lobster.lobsterLanguages.CreateTableStatement;
import kcl.mmdd.course.languages.lobster.lobsterLanguages.DataType;
import kcl.mmdd.course.languages.lobster.lobsterLanguages.DeleteDataStatement;
import kcl.mmdd.course.languages.lobster.lobsterLanguages.DeleteTableStatement;
import kcl.mmdd.course.languages.lobster.lobsterLanguages.InsertStatement;
import kcl.mmdd.course.languages.lobster.lobsterLanguages.IntLiteral;
import kcl.mmdd.course.languages.lobster.lobsterLanguages.LobsterProgram;
import kcl.mmdd.course.languages.lobster.lobsterLanguages.MoreCondition;
import kcl.mmdd.course.languages.lobster.lobsterLanguages.MoreConditionStatement;
import kcl.mmdd.course.languages.lobster.lobsterLanguages.Order;
import kcl.mmdd.course.languages.lobster.lobsterLanguages.PrimaryExpression;
import kcl.mmdd.course.languages.lobster.lobsterLanguages.SelectStatement;
import kcl.mmdd.course.languages.lobster.lobsterLanguages.Statement;
import kcl.mmdd.course.languages.lobster.lobsterLanguages.UpdateStatement;
import kcl.mmdd.course.languages.lobster.lobsterLanguages.VariableReference;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IntegerRange;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class LobsterLanguagesGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    EObject _head = IterableExtensions.<EObject>head(resource.getContents());
    final LobsterProgram model = ((LobsterProgram) _head);
    fsa.generateFile(this.deriveTargetFileNameFor(model, resource), this.generate(model));
    final String sqlName = this.deriveName(resource);
    fsa.generateFile((sqlName + ".sql"), this.doGenerateSql(model, sqlName));
  }
  
  public String deriveName(final Resource resource) {
    String _xblockexpression = null;
    {
      final String origFilename = resource.getURI().lastSegment();
      String _firstUpper = StringExtensions.toFirstUpper(origFilename.substring(0, origFilename.indexOf(".")));
      _xblockexpression = (_firstUpper + "Lobster");
    }
    return _xblockexpression;
  }
  
  public String deriveTargetFileNameFor(final LobsterProgram program, final Resource resource) {
    return resource.getURI().appendFileExtension("txt").lastSegment();
  }
  
  public CharSequence generate(final LobsterProgram program) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Program status:");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("Generate success");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence doGenerateSql(final LobsterProgram program, final String sqlName) {
    StringConcatenation _builder = new StringConcatenation();
    final Function1<Statement, String> _function = (Statement it) -> {
      return this.generateSqlStatement(it);
    };
    String _join = IterableExtensions.join(ListExtensions.<Statement, String>map(program.getStatements(), _function), "\n");
    _builder.append(_join);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected String _generateSqlStatement(final Statement stmt) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder.toString();
  }
  
  protected String _generateSqlStatement(final CreateDatabaseStatement stmt) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("CREATE DATABASE ");
    String _generateExpression = this.generateExpression(stmt.getDbname());
    _builder.append(_generateExpression);
    _builder.append(";");
    return _builder.toString();
  }
  
  protected String _generateSqlStatement(final CreateTableStatement stmt) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("use ");
    String _generateExpression = this.generateExpression(stmt.getDbname());
    _builder.append(_generateExpression);
    _builder.append("; ");
    _builder.newLineIfNotEmpty();
    _builder.append("CREATE TABLE ");
    String _generateExpression_1 = this.generateExpression(stmt.getTbname());
    _builder.append(_generateExpression_1);
    _builder.append("(");
    _builder.newLineIfNotEmpty();
    {
      int _size = stmt.getColumns().size();
      int _minus = (_size - 1);
      IntegerRange _upTo = new IntegerRange(0, _minus);
      for(final Integer index : _upTo) {
        String _generateSqlStatement = this.generateSqlStatement(stmt.getColumns().get((index).intValue()));
        _builder.append(_generateSqlStatement);
        {
          int _size_1 = stmt.getColumns().size();
          int _minus_1 = (_size_1 - 1);
          boolean _lessThan = ((index).intValue() < _minus_1);
          if (_lessThan) {
            _builder.append(",");
          }
        }
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  protected String _generateSqlStatement(final InsertStatement stmt) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("INSERT INTO ");
    String _generateExpression = this.generateExpression(stmt.getTbname());
    _builder.append(_generateExpression);
    _builder.append(" (");
    {
      int _size = stmt.getColumn().size();
      int _minus = (_size - 1);
      IntegerRange _upTo = new IntegerRange(0, _minus);
      for(final Integer index : _upTo) {
        String _generateExpression_1 = this.generateExpression(stmt.getColumn().get((index).intValue()));
        _builder.append(_generateExpression_1);
        {
          int _size_1 = stmt.getColumn().size();
          int _minus_1 = (_size_1 - 1);
          boolean _lessThan = ((index).intValue() < _minus_1);
          if (_lessThan) {
            _builder.append(", ");
          }
        }
      }
    }
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    _builder.append("VALUES(");
    {
      int _size_2 = stmt.getValue().size();
      int _minus_2 = (_size_2 - 1);
      IntegerRange _upTo_1 = new IntegerRange(0, _minus_2);
      for(final Integer index_1 : _upTo_1) {
        _builder.append(" ");
        String _generateExpression_2 = this.generateExpression(stmt.getValue().get((index_1).intValue()));
        _builder.append(_generateExpression_2);
        {
          int _size_3 = stmt.getColumn().size();
          int _minus_3 = (_size_3 - 1);
          boolean _lessThan_1 = ((index_1).intValue() < _minus_3);
          if (_lessThan_1) {
            _builder.append(", ");
          }
        }
      }
    }
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  protected String _generateSqlStatement(final DeleteDataStatement stmt) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("DELETE FROM ");
    String _generateExpression = this.generateExpression(stmt.getTbname());
    _builder.append(_generateExpression);
    _builder.newLineIfNotEmpty();
    _builder.append("WHERE ");
    {
      int _size = stmt.getCondition().size();
      int _minus = (_size - 1);
      IntegerRange _upTo = new IntegerRange(0, _minus);
      for(final Integer index : _upTo) {
        _builder.append(" ");
        String _generateSqlStatement = this.generateSqlStatement(stmt.getCondition().get((index).intValue()));
        _builder.append(_generateSqlStatement);
        {
          int _size_1 = stmt.getCondition().size();
          int _minus_1 = (_size_1 - 1);
          boolean _tripleEquals = ((index).intValue() == _minus_1);
          if (_tripleEquals) {
            _builder.append(";");
          }
        }
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  protected String _generateSqlStatement(final MoreConditionStatement stmt) {
    StringConcatenation _builder = new StringConcatenation();
    String _generateExpression = this.generateExpression(stmt.getColumn());
    _builder.append(_generateExpression);
    _builder.append(" = ");
    String _generateExpression_1 = this.generateExpression(stmt.getValue());
    _builder.append(_generateExpression_1);
    _builder.append(" ");
    String _generateSqlMoreCondition = this.generateSqlMoreCondition(stmt.getMorecondition());
    _builder.append(_generateSqlMoreCondition);
    return _builder.toString();
  }
  
  protected String _generateSqlStatement(final DeleteTableStatement stmt) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("DELETE FROM ");
    String _generateExpression = this.generateExpression(stmt.getTbname());
    _builder.append(_generateExpression);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  protected String _generateSqlStatement(final CreateTableColumn ct) {
    StringConcatenation _builder = new StringConcatenation();
    String _generateExpression = this.generateExpression(ct.getColumnName());
    _builder.append(_generateExpression);
    _builder.append(" ");
    String _generateSqlType = this.generateSqlType(ct.getDatatype());
    _builder.append(_generateSqlType);
    {
      IntLiteral _size = ct.getSize();
      boolean _tripleNotEquals = (_size != null);
      if (_tripleNotEquals) {
        _builder.append("(");
        String _generateExpression_1 = this.generateExpression(ct.getSize());
        _builder.append(_generateExpression_1);
        _builder.append(")");
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  protected String _generateSqlStatement(final UpdateStatement stmt) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("UPDATE ");
    String _generateExpression = this.generateExpression(stmt.getTbname());
    _builder.append(_generateExpression);
    _builder.newLineIfNotEmpty();
    _builder.append("SET ");
    {
      int _size = stmt.getSetvalue().size();
      int _minus = (_size - 1);
      IntegerRange _upTo = new IntegerRange(0, _minus);
      for(final Integer index : _upTo) {
        String _generateSqlStatement = this.generateSqlStatement(stmt.getSetvalue().get((index).intValue()));
        _builder.append(_generateSqlStatement);
        {
          int _size_1 = stmt.getSetvalue().size();
          int _minus_1 = (_size_1 - 1);
          boolean _lessThan = ((index).intValue() < _minus_1);
          if (_lessThan) {
            _builder.append(",");
          }
        }
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("WHERE");
    {
      int _size_2 = stmt.getCondition().size();
      int _minus_2 = (_size_2 - 1);
      IntegerRange _upTo_1 = new IntegerRange(0, _minus_2);
      for(final Integer index_1 : _upTo_1) {
        _builder.append(" ");
        String _generateSqlStatement_1 = this.generateSqlStatement(stmt.getCondition().get((index_1).intValue()));
        _builder.append(_generateSqlStatement_1);
        {
          int _size_3 = stmt.getCondition().size();
          int _minus_3 = (_size_3 - 1);
          boolean _lessThan_1 = ((index_1).intValue() < _minus_3);
          if (_lessThan_1) {
            _builder.append(",");
          }
        }
        _builder.append(" ");
        {
          int _size_4 = stmt.getCondition().size();
          int _minus_4 = (_size_4 - 1);
          boolean _tripleEquals = ((index_1).intValue() == _minus_4);
          if (_tripleEquals) {
            _builder.append(";");
          }
        }
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder.toString();
  }
  
  protected String _generateSqlStatement(final SelectStatement stmt) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("SELECT ");
    String _generateSqlCaculate = this.generateSqlCaculate(stmt.getCaculateCondition());
    _builder.append(_generateSqlCaculate);
    _builder.append("(");
    String _generateExpression = this.generateExpression(stmt.getColumn());
    _builder.append(_generateExpression);
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    _builder.append("FROM ");
    String _generateExpression_1 = this.generateExpression(stmt.getTbname());
    _builder.append(_generateExpression_1);
    _builder.newLineIfNotEmpty();
    _builder.append("WHERE ");
    {
      int _size = stmt.getCondition().size();
      int _minus = (_size - 1);
      IntegerRange _upTo = new IntegerRange(0, _minus);
      for(final Integer index : _upTo) {
        String _generateSqlStatement = this.generateSqlStatement(stmt.getCondition().get((index).intValue()));
        _builder.append(_generateSqlStatement);
        {
          int _size_1 = stmt.getCondition().size();
          int _minus_1 = (_size_1 - 1);
          boolean _lessThan = ((index).intValue() < _minus_1);
          if (_lessThan) {
            _builder.append(",");
          }
        }
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("ORDER BY ");
    {
      int _size_2 = stmt.getCondition1().size();
      int _minus_2 = (_size_2 - 1);
      IntegerRange _upTo_1 = new IntegerRange(0, _minus_2);
      for(final Integer index_1 : _upTo_1) {
        String _generateExpression_2 = this.generateExpression(stmt.getCondition1().get((index_1).intValue()));
        _builder.append(_generateExpression_2);
        {
          int _size_3 = stmt.getCondition1().size();
          int _minus_3 = (_size_3 - 1);
          boolean _lessThan_1 = ((index_1).intValue() < _minus_3);
          if (_lessThan_1) {
            _builder.append(",");
          }
        }
      }
    }
    _builder.append(" ");
    String _generateSqlOrder = this.generateSqlOrder(stmt.getOrder());
    _builder.append(_generateSqlOrder);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  protected String _generateSqlStatement(final ConditionStatement cs) {
    StringConcatenation _builder = new StringConcatenation();
    String _generateExpression = this.generateExpression(cs.getColumn());
    _builder.append(_generateExpression);
    _builder.append(" = ");
    String _generateExpression_1 = this.generateExpression(cs.getValue());
    _builder.append(_generateExpression_1);
    return _builder.toString();
  }
  
  protected String _generateExpression(final PrimaryExpression exp) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder.toString();
  }
  
  protected String _generateExpression(final IntLiteral exp) {
    StringConcatenation _builder = new StringConcatenation();
    int _val = exp.getVal();
    _builder.append(_val);
    return _builder.toString();
  }
  
  protected String _generateExpression(final CharLiteral exp) {
    StringConcatenation _builder = new StringConcatenation();
    String _vac = exp.getVac();
    _builder.append(_vac);
    return _builder.toString();
  }
  
  protected String _generateExpression(final VariableReference exp) {
    StringConcatenation _builder = new StringConcatenation();
    int _value = exp.getVar().getValue();
    _builder.append(_value);
    return _builder.toString();
  }
  
  public String generateSqlType(final DataType dataType) {
    String _xifexpression = null;
    if ((dataType == DataType.INTEGER)) {
      return "int";
    } else {
      String _xifexpression_1 = null;
      if ((dataType == DataType.CHARACTER)) {
        _xifexpression_1 = "varchar";
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  public String generateSqlCaculate(final CaculateCondition cacu) {
    if ((cacu == CaculateCondition.MAXIMUM)) {
      return "MAX";
    } else {
      if ((cacu == CaculateCondition.MINIMUM)) {
        return "MIN";
      } else {
        if ((cacu == CaculateCondition.AVERAGE)) {
          return "AVG";
        } else {
          if ((cacu == CaculateCondition.COUNT)) {
            return "COUNT";
          } else {
            if ((cacu == CaculateCondition.SUM)) {
              return "SUM";
            }
          }
        }
      }
    }
    return null;
  }
  
  public String generateSqlOrder(final Order ord) {
    if ((ord == Order.ASCENDING)) {
      return "ASC";
    } else {
      if ((ord == Order.DESCENDING)) {
        return "DESC";
      }
    }
    return null;
  }
  
  public String generateSqlMoreCondition(final MoreCondition moco) {
    if ((moco == MoreCondition.AND)) {
      return "and";
    } else {
      if ((moco == MoreCondition.OR)) {
        return "or";
      } else {
        if ((moco == MoreCondition.FINISH)) {
          return " ";
        }
      }
    }
    return null;
  }
  
  public String generateSqlStatement(final EObject stmt) {
    if (stmt instanceof CreateDatabaseStatement) {
      return _generateSqlStatement((CreateDatabaseStatement)stmt);
    } else if (stmt instanceof CreateTableStatement) {
      return _generateSqlStatement((CreateTableStatement)stmt);
    } else if (stmt instanceof DeleteDataStatement) {
      return _generateSqlStatement((DeleteDataStatement)stmt);
    } else if (stmt instanceof DeleteTableStatement) {
      return _generateSqlStatement((DeleteTableStatement)stmt);
    } else if (stmt instanceof InsertStatement) {
      return _generateSqlStatement((InsertStatement)stmt);
    } else if (stmt instanceof SelectStatement) {
      return _generateSqlStatement((SelectStatement)stmt);
    } else if (stmt instanceof UpdateStatement) {
      return _generateSqlStatement((UpdateStatement)stmt);
    } else if (stmt instanceof ConditionStatement) {
      return _generateSqlStatement((ConditionStatement)stmt);
    } else if (stmt instanceof CreateTableColumn) {
      return _generateSqlStatement((CreateTableColumn)stmt);
    } else if (stmt instanceof MoreConditionStatement) {
      return _generateSqlStatement((MoreConditionStatement)stmt);
    } else if (stmt instanceof Statement) {
      return _generateSqlStatement((Statement)stmt);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(stmt).toString());
    }
  }
  
  public String generateExpression(final PrimaryExpression exp) {
    if (exp instanceof CharLiteral) {
      return _generateExpression((CharLiteral)exp);
    } else if (exp instanceof IntLiteral) {
      return _generateExpression((IntLiteral)exp);
    } else if (exp instanceof VariableReference) {
      return _generateExpression((VariableReference)exp);
    } else if (exp != null) {
      return _generateExpression(exp);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(exp).toString());
    }
  }
}
