package kcl.mmdd.coursework.lobster.typing;

import com.google.inject.Provider;
import it.xsemantics.runtime.ErrorInformation;
import it.xsemantics.runtime.Result;
import it.xsemantics.runtime.RuleApplicationTrace;
import it.xsemantics.runtime.RuleEnvironment;
import it.xsemantics.runtime.RuleFailedException;
import it.xsemantics.runtime.XsemanticsProvider;
import it.xsemantics.runtime.XsemanticsRuntimeSystem;
import kcl.mmdd.course.languages.lobster.lobsterLanguages.CharLiteral;
import kcl.mmdd.course.languages.lobster.lobsterLanguages.CreateDatabaseStatement;
import kcl.mmdd.course.languages.lobster.lobsterLanguages.IntLiteral;
import kcl.mmdd.course.languages.lobster.lobsterLanguages.PrimaryExpression;
import kcl.mmdd.course.languages.lobster.lobsterLanguages.VariableReference;
import org.eclipse.xtext.util.PolymorphicDispatcher;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import typing.LobsterType;

@SuppressWarnings("all")
public class LobsterTypeSystem extends XsemanticsRuntimeSystem {
  public static final String TYPEEXPRESSIONS = "kcl.mmdd.coursework.lobster.typing.TypeExpressions";
  
  public static final String TINTLIT = "kcl.mmdd.coursework.lobster.typing.TIntLit";
  
  public static final String TSTRINGLIT = "kcl.mmdd.coursework.lobster.typing.TStringLit";
  
  public static final String TVARREF = "kcl.mmdd.coursework.lobster.typing.TVarRef";
  
  public static final String SUBTYPING = "kcl.mmdd.coursework.lobster.typing.SubTyping";
  
  private PolymorphicDispatcher<LobsterType> typeExpressionsDispatcher;
  
  private PolymorphicDispatcher<Result<LobsterType>> typeDispatcher;
  
  private PolymorphicDispatcher<Result<Boolean>> subTypeDispatcher;
  
  public LobsterTypeSystem() {
    init();
  }
  
  public void init() {
    typeDispatcher = buildPolymorphicDispatcher1(
    	"typeImpl", 3, "|-", ":");
    subTypeDispatcher = buildPolymorphicDispatcher1(
    	"subTypeImpl", 4, "|-", "<:");
    typeExpressionsDispatcher = buildPolymorphicDispatcher(
    	"typeExpressionsImpl", 2);
  }
  
  public LobsterType typeExpressions(final Iterable<PrimaryExpression> exps) throws RuleFailedException {
    return typeExpressions(null, exps);
  }
  
  public LobsterType typeExpressions(final RuleApplicationTrace _trace_, final Iterable<PrimaryExpression> exps) throws RuleFailedException {
    try {
    	return typeExpressionsInternal(_trace_, exps);
    } catch (Exception _e_typeExpressions) {
    	throw extractRuleFailedException(_e_typeExpressions);
    }
  }
  
  public Result<LobsterType> type(final PrimaryExpression exp) {
    return type(new RuleEnvironment(), null, exp);
  }
  
  public Result<LobsterType> type(final RuleEnvironment _environment_, final PrimaryExpression exp) {
    return type(_environment_, null, exp);
  }
  
  public Result<LobsterType> type(final RuleEnvironment _environment_, final RuleApplicationTrace _trace_, final PrimaryExpression exp) {
    return getFromCache("type", _environment_, _trace_,
    	new XsemanticsProvider<Result<LobsterType>>(_environment_, _trace_) {
    		public Result<LobsterType> doGet() {
    			try {
    				return typeInternal(_environment_, _trace_, exp);
    			} catch (Exception _e_type) {
    				return resultForFailure(_e_type);
    			}
    		}
    	}, exp);
  }
  
  public Result<Boolean> subType(final LobsterType left, final LobsterType right) {
    return subType(new RuleEnvironment(), null, left, right);
  }
  
  public Result<Boolean> subType(final RuleEnvironment _environment_, final LobsterType left, final LobsterType right) {
    return subType(_environment_, null, left, right);
  }
  
  public Result<Boolean> subType(final RuleEnvironment _environment_, final RuleApplicationTrace _trace_, final LobsterType left, final LobsterType right) {
    try {
    	return subTypeInternal(_environment_, _trace_, left, right);
    } catch (Exception _e_subType) {
    	return resultForFailure(_e_subType);
    }
  }
  
  public Boolean subTypeSucceeded(final LobsterType left, final LobsterType right) {
    return subTypeSucceeded(new RuleEnvironment(), null, left, right);
  }
  
  public Boolean subTypeSucceeded(final RuleEnvironment _environment_, final LobsterType left, final LobsterType right) {
    return subTypeSucceeded(_environment_, null, left, right);
  }
  
  public Boolean subTypeSucceeded(final RuleEnvironment _environment_, final RuleApplicationTrace _trace_, final LobsterType left, final LobsterType right) {
    try {
    	subTypeInternal(_environment_, _trace_, left, right);
    	return true;
    } catch (Exception _e_subType) {
    	return false;
    }
  }
  
  public Result<Boolean> checkCreateDatabaseStatement(final CreateDatabaseStatement stmt) {
    return checkCreateDatabaseStatement(null, stmt);
  }
  
  public Result<Boolean> checkCreateDatabaseStatement(final RuleApplicationTrace _trace_, final CreateDatabaseStatement stmt) {
    try {
    	return checkCreateDatabaseStatementInternal(_trace_, stmt);
    } catch (Exception _e_checkCreateDatabaseStatement) {
    	return resultForFailure(_e_checkCreateDatabaseStatement);
    }
  }
  
  protected Result<Boolean> checkCreateDatabaseStatementInternal(final RuleApplicationTrace _trace_, final CreateDatabaseStatement stmt) throws RuleFailedException {
    /* empty |- stmt.dbname : var LobsterType stepsType */
    PrimaryExpression _dbname = stmt.getDbname();
    LobsterType stepsType = null;
    Result<LobsterType> result = typeInternal(emptyEnvironment(), _trace_, _dbname);
    checkAssignableTo(result.getFirst(), LobsterType.class);
    stepsType = (LobsterType) result.getFirst();
    
    /* empty |- stepsType <: LobsterType.STRING */
    subTypeInternal(emptyEnvironment(), _trace_, stepsType, LobsterType.STRING);
    return new Result<Boolean>(true);
  }
  
  protected LobsterType typeExpressionsInternal(final RuleApplicationTrace _trace_, final Iterable<PrimaryExpression> exps) {
    return getFromCache("typeExpressionsInternal", (RuleEnvironment)null, _trace_,
    	new XsemanticsProvider<LobsterType>(null, _trace_) {
    		public LobsterType doGet() {
    			try {
    				checkParamsNotNull(exps);
    				return typeExpressionsDispatcher.invoke(_trace_, exps);
    			} catch (Exception _e_typeExpressions) {
    				sneakyThrowRuleFailedException(_e_typeExpressions);
    				return null;
    			}
    		}
    	}, exps);
  }
  
  protected void typeExpressionsThrowException(final String _error, final String _issue, final Exception _ex, final Iterable<PrimaryExpression> exps, final ErrorInformation[] _errorInformations) throws RuleFailedException {
    throwRuleFailedException(_error, _issue, _ex, _errorInformations);
  }
  
  protected Result<LobsterType> typeInternal(final RuleEnvironment _environment_, final RuleApplicationTrace _trace_, final PrimaryExpression exp) {
    return getFromCache("typeInternal", _environment_, _trace_,
    	new XsemanticsProvider<Result<LobsterType>>(_environment_, _trace_) {
    		public Result<LobsterType> doGet() {
    			try {
    				checkParamsNotNull(exp);
    				return typeDispatcher.invoke(_environment_, _trace_, exp);
    			} catch (Exception _e_type) {
    				sneakyThrowRuleFailedException(_e_type);
    				return null;
    			}
    		}
    	}, exp);
  }
  
  protected void typeThrowException(final String _error, final String _issue, final Exception _ex, final PrimaryExpression exp, final ErrorInformation[] _errorInformations) throws RuleFailedException {
    String _stringRep = this.stringRep(exp);
    String _plus = ("cannot type " + _stringRep);
    String error = _plus;
    throwRuleFailedException(error,
    	_issue, _ex, new ErrorInformation(null, null));
  }
  
  protected Result<Boolean> subTypeInternal(final RuleEnvironment _environment_, final RuleApplicationTrace _trace_, final LobsterType left, final LobsterType right) {
    try {
    	checkParamsNotNull(left, right);
    	return subTypeDispatcher.invoke(_environment_, _trace_, left, right);
    } catch (Exception _e_subType) {
    	sneakyThrowRuleFailedException(_e_subType);
    	return null;
    }
  }
  
  protected void subTypeThrowException(final String _error, final String _issue, final Exception _ex, final LobsterType left, final LobsterType right, final ErrorInformation[] _errorInformations) throws RuleFailedException {
    String _stringRep = this.stringRep(left);
    String _plus = (_stringRep + " is not a subtype of");
    String _stringRep_1 = this.stringRep(right);
    String _plus_1 = (_plus + _stringRep_1);
    String _plus_2 = (_plus_1 + " Please include a string in a pair of quotation marks ");
    String error = _plus_2;
    throwRuleFailedException(error,
    	_issue, _ex, new ErrorInformation(null, null));
  }
  
  protected LobsterType typeExpressionsImpl(final RuleApplicationTrace _trace_, final Iterable<PrimaryExpression> exps) throws RuleFailedException {
    try {
    	final RuleApplicationTrace _subtrace_ = newTrace(_trace_);
    	final LobsterType _result_ = applyAuxFunTypeExpressions(_subtrace_, exps);
    	addToTrace(_trace_, new Provider<Object>() {
    		public Object get() {
    			return auxFunName("typeExpressions") + "(" + stringRep(exps)+ ")" + " = " + stringRep(_result_);
    		}
    	});
    	addAsSubtrace(_trace_, _subtrace_);
    	return _result_;
    } catch (Exception e_applyAuxFunTypeExpressions) {
    	typeExpressionsThrowException(auxFunName("typeExpressions") + "(" + stringRep(exps)+ ")",
    		TYPEEXPRESSIONS,
    		e_applyAuxFunTypeExpressions, exps, new ErrorInformation[] {});
    	return null;
    }
  }
  
  protected LobsterType applyAuxFunTypeExpressions(final RuleApplicationTrace _trace_, final Iterable<PrimaryExpression> exps) throws RuleFailedException {
    final Function1<PrimaryExpression, Boolean> _function = (PrimaryExpression exp) -> {
      boolean _xblockexpression = false;
      {
        /* empty |- exp : var LobsterType exp2Type */
        LobsterType exp2Type = null;
        Result<LobsterType> result = typeInternal(emptyEnvironment(), _trace_, exp);
        checkAssignableTo(result.getFirst(), LobsterType.class);
        exp2Type = (LobsterType) result.getFirst();
        
        _xblockexpression = (exp2Type == LobsterType.INT);
      }
      return Boolean.valueOf(_xblockexpression);
    };
    boolean _forall = IterableExtensions.<PrimaryExpression>forall(exps, _function);
    if (_forall) {
      return LobsterType.INT;
    } else {
      return LobsterType.STRING;
    }
  }
  
  protected Result<LobsterType> typeImpl(final RuleEnvironment G, final RuleApplicationTrace _trace_, final IntLiteral exp) throws RuleFailedException {
    try {
    	final RuleApplicationTrace _subtrace_ = newTrace(_trace_);
    	final Result<LobsterType> _result_ = applyRuleTIntLit(G, _subtrace_, exp);
    	addToTrace(_trace_, new Provider<Object>() {
    		public Object get() {
    			return ruleName("TIntLit") + stringRepForEnv(G) + " |- " + stringRep(exp) + " : " + stringRep(_result_.getFirst());
    		}
    	});
    	addAsSubtrace(_trace_, _subtrace_);
    	return _result_;
    } catch (Exception e_applyRuleTIntLit) {
    	typeThrowException(ruleName("TIntLit") + stringRepForEnv(G) + " |- " + stringRep(exp) + " : " + "LobsterType",
    		TINTLIT,
    		e_applyRuleTIntLit, exp, new ErrorInformation[] {new ErrorInformation(exp)});
    	return null;
    }
  }
  
  protected Result<LobsterType> applyRuleTIntLit(final RuleEnvironment G, final RuleApplicationTrace _trace_, final IntLiteral exp) throws RuleFailedException {
    
    return new Result<LobsterType>(_applyRuleTIntLit_1(G, exp));
  }
  
  private LobsterType _applyRuleTIntLit_1(final RuleEnvironment G, final IntLiteral exp) throws RuleFailedException {
    return LobsterType.INT;
  }
  
  protected Result<LobsterType> typeImpl(final RuleEnvironment G, final RuleApplicationTrace _trace_, final CharLiteral exp) throws RuleFailedException {
    try {
    	final RuleApplicationTrace _subtrace_ = newTrace(_trace_);
    	final Result<LobsterType> _result_ = applyRuleTStringLit(G, _subtrace_, exp);
    	addToTrace(_trace_, new Provider<Object>() {
    		public Object get() {
    			return ruleName("TStringLit") + stringRepForEnv(G) + " |- " + stringRep(exp) + " : " + stringRep(_result_.getFirst());
    		}
    	});
    	addAsSubtrace(_trace_, _subtrace_);
    	return _result_;
    } catch (Exception e_applyRuleTStringLit) {
    	typeThrowException(ruleName("TStringLit") + stringRepForEnv(G) + " |- " + stringRep(exp) + " : " + "LobsterType",
    		TSTRINGLIT,
    		e_applyRuleTStringLit, exp, new ErrorInformation[] {new ErrorInformation(exp)});
    	return null;
    }
  }
  
  protected Result<LobsterType> applyRuleTStringLit(final RuleEnvironment G, final RuleApplicationTrace _trace_, final CharLiteral exp) throws RuleFailedException {
    
    return new Result<LobsterType>(_applyRuleTStringLit_1(G, exp));
  }
  
  private LobsterType _applyRuleTStringLit_1(final RuleEnvironment G, final CharLiteral exp) throws RuleFailedException {
    return LobsterType.STRING;
  }
  
  protected Result<LobsterType> typeImpl(final RuleEnvironment G, final RuleApplicationTrace _trace_, final VariableReference exp) throws RuleFailedException {
    try {
    	final RuleApplicationTrace _subtrace_ = newTrace(_trace_);
    	final Result<LobsterType> _result_ = applyRuleTVarRef(G, _subtrace_, exp);
    	addToTrace(_trace_, new Provider<Object>() {
    		public Object get() {
    			return ruleName("TVarRef") + stringRepForEnv(G) + " |- " + stringRep(exp) + " : " + stringRep(_result_.getFirst());
    		}
    	});
    	addAsSubtrace(_trace_, _subtrace_);
    	return _result_;
    } catch (Exception e_applyRuleTVarRef) {
    	typeThrowException(ruleName("TVarRef") + stringRepForEnv(G) + " |- " + stringRep(exp) + " : " + "LobsterType",
    		TVARREF,
    		e_applyRuleTVarRef, exp, new ErrorInformation[] {new ErrorInformation(exp)});
    	return null;
    }
  }
  
  protected Result<LobsterType> applyRuleTVarRef(final RuleEnvironment G, final RuleApplicationTrace _trace_, final VariableReference exp) throws RuleFailedException {
    
    return new Result<LobsterType>(_applyRuleTVarRef_1(G, exp));
  }
  
  private LobsterType _applyRuleTVarRef_1(final RuleEnvironment G, final VariableReference exp) throws RuleFailedException {
    return LobsterType.INT;
  }
  
  protected Result<Boolean> subTypeImpl(final RuleEnvironment G, final RuleApplicationTrace _trace_, final LobsterType left, final LobsterType right) throws RuleFailedException {
    try {
    	final RuleApplicationTrace _subtrace_ = newTrace(_trace_);
    	final Result<Boolean> _result_ = applyRuleSubTyping(G, _subtrace_, left, right);
    	addToTrace(_trace_, new Provider<Object>() {
    		public Object get() {
    			return ruleName("SubTyping") + stringRepForEnv(G) + " |- " + stringRep(left) + " <: " + stringRep(right);
    		}
    	});
    	addAsSubtrace(_trace_, _subtrace_);
    	return _result_;
    } catch (Exception e_applyRuleSubTyping) {
    	subTypeThrowException(ruleName("SubTyping") + stringRepForEnv(G) + " |- " + stringRep(left) + " <: " + stringRep(right),
    		SUBTYPING,
    		e_applyRuleSubTyping, left, right, new ErrorInformation[] {});
    	return null;
    }
  }
  
  protected Result<Boolean> applyRuleSubTyping(final RuleEnvironment G, final RuleApplicationTrace _trace_, final LobsterType left, final LobsterType right) throws RuleFailedException {
    /* right === LobsterType.INT or left === right */
    {
      RuleFailedException previousFailure = null;
      try {
        /* right === LobsterType.INT */
        if (!(right == LobsterType.INT)) {
          sneakyThrowRuleFailedException("right === LobsterType.INT");
        }
      } catch (Exception e) {
        previousFailure = extractRuleFailedException(e);
        /* left === right */
        if (!(left == right)) {
          sneakyThrowRuleFailedException("left === right");
        }
      }
    }
    return new Result<Boolean>(true);
  }
}
