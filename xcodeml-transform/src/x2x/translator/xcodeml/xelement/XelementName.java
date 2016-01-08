package x2x.translator.xcodeml.xelement;

/**
 *
 */

public class XelementName {

  // helpers
  public static final String TRUE = "true";
  public static final String FALSE = "false";
  public static final String SUPPORTED_VERSION = "1.0";
  public static final String SUPPORTED_LANGUAGE = "Fortran";

  // Base type (9.1)
  public static final String TYPE_F_INT = "Fint";
  public static final String TYPE_F_REAL = "Freal";
  public static final String TYPE_F_COMPLEX = "Fcomplex";
  public static final String TYPE_F_LOGICAL = "Flogical";
  public static final String TYPE_F_CHAR = "Fcharacter";
  public static final String TYPE_F_VOID = "Fvoid";

  // Scope
  public static final String SCOPE_LOCAL = "local";
  public static final String SCOPE_GLOBAL = "global";
  public static final String SCOPE_PARAM = "param";

  // Element attributes
  public static final String ATTR_COMPILER_INFO = "compiler-info";
  public static final String ATTR_CONSTRUCT_NAME = "construct_name";
  public static final String ATTR_FILE = "file";
  public static final String ATTR_INTENT = "intent";
  public static final String ATTR_IS_ASSUMED_SHAPE = "is_assumed_shape";
  public static final String ATTR_IS_ALLOCATABLE = "is_allocatable";
  public static final String ATTR_IS_EXTERNAL = "is_external";
  public static final String ATTR_IS_INTERNAL = "is_internal";
  public static final String ATTR_IS_INTRINSIC = "is_intrinsic";
  public static final String ATTR_IS_OPTIONAL = "is_optional";
  public static final String ATTR_IS_PARAMETER = "is_parameter";
  public static final String ATTR_IS_POINTER = "is_pointer";
  public static final String ATTR_IS_PRIVATE = "is_private";
  public static final String ATTR_IS_PROGRAM = "is_program";
  public static final String ATTR_IS_PUBLIC = "is_public";
  public static final String ATTR_IS_RECURSIVE = "is_recursive";
  public static final String ATTR_IS_SAVE = "is_save";
  public static final String ATTR_IS_TARGET = "is_target";
  public static final String ATTR_KIND = "kind";
  public static final String ATTR_LANGUAGE = "language";
  public static final String ATTR_LINENO = "lineno";
  public static final String ATTR_REF = "ref";
  public static final String ATTR_RESULT_NAME = "result_name";
  public static final String ATTR_RETURN_TYPE = "return_type";
  public static final String ATTR_SCLASS = "sclass";
  public static final String ATTR_SCOPE = "scope";
  public static final String ATTR_SOURCE = "source";
  public static final String ATTR_TIME = "time";
  public static final String ATTR_TYPE = "type";
  public static final String ATTR_VERSION = "version";

  // Element names
  public static final String ARGUMENTS = "arguments";
  public static final String ARRAY_INDEX = "arrayIndex";
  public static final String BASIC_TYPE = "FbasicType";
  public static final String BODY = "body";
  public static final String DECLARATIONS = "declarations";
  public static final String DO_STMT = "FdoStatement";
  public static final String ELSE = "else";
  public static final String EXPR_STMT = "exprStatement";
  public static final String FCT_CALL = "functionCall";
  public static final String FCT_DEFINITION = "FfunctionDefinition";
  public static final String FCT_TYPE = "FfunctionType";
  public static final String F_ARRAY_REF = "FarrayRef";
  public static final String F_IF_STMT = "FifStatement";
  public static final String F_INT_CONST = "FintConstant";
  public static final String F_REAL_CONST = "FrealConstant";
  public static final String F_COMPLEX_CONST = "FcomplexConstant";
  public static final String F_CHAR_CONST = "FcharacterConstant";
  public static final String F_LOGICAL_CONST = "FlogicalConstant";
  public static final String F_STRUCT_TYPE = "FstructType";
  public static final String GLOBAL_SYMBOLS = "globalSymbols";
  public static final String ID = "id";
  public static final String INDEX_RANGE = "indexRange";
  public static final String KIND = "kind";
  public static final String LENGTH = "len";
  public static final String LOWER_BOUND = "lowerBound";
  public static final String NAME = "name";
  public static final String PRAGMA_STMT = "FpragmaStatement";
  public static final String STEP = "step";
  public static final String SYMBOLS = "symbols";
  public static final String THEN = "then";
  public static final String TYPE_TABLE = "typeTable";
  public static final String UPPER_BOUND = "upperBound";
  public static final String VAR = "Var";
  public static final String VAR_DECL = "varDecl";
  public static final String VAR_REF = "varRef";
  public static final String VALUE = "value";
  public static final String X_CODE_PROGRAM = "XcodeProgram";

}
