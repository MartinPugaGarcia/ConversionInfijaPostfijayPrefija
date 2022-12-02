// DO NOT EDIT
// Generated by JFlex 1.8.2 http://jflex.de/
// source: src/LexerColor.flex


import compilerTools.TextColor;
import java.awt.Color;


// See https://github.com/jflex-de/jflex/issues/222
@SuppressWarnings("FallThrough")
class LexerColor {

  /** This character denotes the end of file. */
  public static final int YYEOF = -1;

  /** Initial size of the lookahead buffer. */
  private static final int ZZ_BUFFERSIZE = 16384;

  // Lexical states.
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
     0, 0
  };

  /**
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\37\u0100\1\u0200\267\u0100\10\u0300\u1020\u0100";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\12\0\1\1\1\2\1\0\1\3\22\0\1\4\2\0"+
    "\1\5\1\6\1\0\1\7\1\0\2\10\1\11\1\0"+
    "\1\10\2\0\1\12\1\13\11\14\1\0\1\10\1\0"+
    "\1\10\3\0\1\4\1\15\1\16\1\4\1\17\7\4"+
    "\1\20\1\21\1\22\1\23\12\4\4\0\1\4\1\0"+
    "\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33"+
    "\1\34\2\4\1\35\1\36\1\37\1\40\1\41\1\42"+
    "\1\43\1\44\1\45\1\46\1\4\1\47\2\4\1\50"+
    "\1\10\1\51\1\10\7\0\1\2\73\0\1\4\7\0"+
    "\1\4\3\0\1\4\3\0\1\4\1\0\1\4\6\0"+
    "\1\4\1\0\1\4\4\0\1\52\7\0\1\4\3\0"+
    "\1\4\3\0\1\4\1\0\1\4\6\0\1\53\1\0"+
    "\1\4\u012b\0\2\2\326\0\u0100\2";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[1024];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /**
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\5\1\1\2\1\3\1\1\2\4\15\1\2\0"+
    "\1\5\11\1\1\6\13\1\3\0\2\5\17\1\1\7"+
    "\2\1\2\0\1\5\16\1\1\0\1\1\1\10\2\1"+
    "\1\11\6\1\1\12\1\13\1\0\6\1\1\14\1\15"+
    "\1\7\35\1\1\16\6\1\1\17\1\20\1\1\1\21"+
    "\3\1";

  private static int [] zzUnpackAction() {
    int [] result = new int[155];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\54\0\130\0\204\0\260\0\334\0\54\0\54"+
    "\0\u0108\0\u0134\0\u0160\0\u018c\0\u01b8\0\u01e4\0\u0210\0\u023c"+
    "\0\u0268\0\u0294\0\u02c0\0\u02ec\0\u0318\0\u0344\0\u0370\0\u039c"+
    "\0\u03c8\0\u03f4\0\u0420\0\u044c\0\u0478\0\u04a4\0\u04d0\0\u04fc"+
    "\0\u0528\0\u0554\0\u0580\0\u05ac\0\204\0\u05d8\0\u0604\0\u0630"+
    "\0\u065c\0\u0688\0\u06b4\0\u06e0\0\u070c\0\u0738\0\u0764\0\u0790"+
    "\0\u07bc\0\u07e8\0\u0814\0\54\0\u0840\0\u086c\0\u0898\0\u08c4"+
    "\0\u08f0\0\u091c\0\u0948\0\u0974\0\u09a0\0\u09cc\0\u09f8\0\u0a24"+
    "\0\u0a50\0\u0a7c\0\u0aa8\0\u0ad4\0\204\0\u0b00\0\u0b2c\0\u0b58"+
    "\0\u0b84\0\u07e8\0\u0bb0\0\u0bdc\0\u0c08\0\u0c34\0\u0c60\0\u0c8c"+
    "\0\u0cb8\0\u0ce4\0\u0d10\0\u0d3c\0\u0d68\0\u0d94\0\u0dc0\0\u0dec"+
    "\0\u0e18\0\u0e44\0\204\0\u0e70\0\u0e9c\0\204\0\u0ec8\0\u0ef4"+
    "\0\u0f20\0\u0f4c\0\u0f78\0\u0fa4\0\204\0\204\0\u0fd0\0\u0ffc"+
    "\0\u1028\0\u1054\0\u1080\0\u10ac\0\u10d8\0\204\0\54\0\u1054"+
    "\0\u1104\0\u1130\0\u115c\0\u1188\0\u11b4\0\u11e0\0\u120c\0\u1238"+
    "\0\u1264\0\u1290\0\u12bc\0\u12e8\0\u1314\0\u1340\0\u136c\0\u1398"+
    "\0\u13c4\0\u13f0\0\u141c\0\u1448\0\u1474\0\u14a0\0\u14cc\0\u14f8"+
    "\0\u1524\0\u1550\0\u157c\0\u15a8\0\u15d4\0\204\0\u1600\0\u162c"+
    "\0\u1658\0\u1684\0\u16b0\0\u16dc\0\204\0\204\0\u1708\0\204"+
    "\0\u1734\0\u1760\0\u178c";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[155];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /**
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\2\2\1\0\1\3\1\4\1\5\1\6\1\7\1\10"+
    "\1\2\1\11\1\12\1\13\7\4\1\14\1\4\1\15"+
    "\1\16\1\17\1\20\2\4\1\21\1\22\1\4\1\23"+
    "\1\24\1\25\2\4\1\26\1\27\1\4\1\30\1\4"+
    "\1\7\2\4\55\0\1\2\56\0\1\4\6\0\36\4"+
    "\1\0\2\4\4\0\1\31\6\0\41\31\4\0\1\4"+
    "\10\0\34\4\1\0\2\4\11\0\1\32\1\33\54\0"+
    "\1\2\1\34\52\0\2\13\43\0\1\4\6\0\14\4"+
    "\1\35\15\4\1\36\3\4\1\0\2\4\4\0\1\4"+
    "\6\0\25\4\1\37\10\4\1\0\2\4\4\0\1\4"+
    "\6\0\15\4\1\40\20\4\1\0\2\4\4\0\1\4"+
    "\6\0\22\4\1\41\6\4\1\42\4\4\1\0\2\4"+
    "\4\0\1\4\6\0\21\4\1\43\6\4\1\44\5\4"+
    "\1\0\2\4\4\0\1\4\6\0\16\4\1\45\5\4"+
    "\1\46\10\4\1\47\1\0\2\4\4\0\1\4\6\0"+
    "\11\4\1\50\24\4\1\0\2\4\4\0\1\4\6\0"+
    "\25\4\1\51\10\4\1\0\1\4\1\52\4\0\1\4"+
    "\6\0\15\4\1\53\20\4\1\0\2\4\4\0\1\4"+
    "\6\0\21\4\1\54\3\4\1\55\10\4\1\0\2\4"+
    "\4\0\1\4\6\0\33\4\1\56\2\4\1\0\2\4"+
    "\4\0\1\4\6\0\25\4\1\57\10\4\1\0\2\4"+
    "\4\0\1\4\6\0\20\4\1\60\15\4\1\0\2\4"+
    "\4\0\1\61\6\0\41\61\11\62\1\63\42\62\1\33"+
    "\1\64\1\33\1\65\50\33\13\0\2\34\43\0\1\4"+
    "\6\0\15\4\1\66\20\4\1\0\2\4\4\0\1\4"+
    "\6\0\30\4\1\67\5\4\1\0\2\4\4\0\1\4"+
    "\6\0\22\4\1\70\13\4\1\0\2\4\4\0\1\4"+
    "\6\0\30\4\1\71\1\4\1\72\3\4\1\0\2\4"+
    "\4\0\1\4\6\0\31\4\1\73\4\4\1\0\2\4"+
    "\4\0\1\4\6\0\32\4\1\74\3\4\1\0\2\4"+
    "\4\0\1\4\6\0\24\4\1\75\11\4\1\0\2\4"+
    "\4\0\1\4\6\0\15\4\1\76\20\4\1\0\2\4"+
    "\4\0\1\4\6\0\32\4\1\77\3\4\1\0\2\4"+
    "\4\0\1\4\6\0\27\4\1\100\6\4\1\0\2\4"+
    "\4\0\1\4\6\0\24\4\1\101\11\4\1\0\2\4"+
    "\4\0\1\4\6\0\30\4\1\42\5\4\1\0\2\4"+
    "\4\0\1\4\6\0\23\4\1\102\12\4\1\0\2\4"+
    "\4\0\1\4\6\0\31\4\1\42\4\4\1\0\2\4"+
    "\4\0\1\4\6\0\24\4\1\103\11\4\1\0\2\4"+
    "\4\0\1\4\6\0\24\4\1\104\11\4\1\0\2\4"+
    "\4\0\1\4\6\0\30\4\1\105\5\4\1\0\2\4"+
    "\4\0\1\4\6\0\23\4\1\106\12\4\1\0\2\4"+
    "\4\0\1\4\6\0\21\4\1\107\14\4\1\0\2\4"+
    "\4\0\1\110\6\0\41\110\11\62\1\111\53\62\1\111"+
    "\1\112\41\62\1\0\1\64\56\0\1\4\6\0\22\4"+
    "\1\113\13\4\1\0\2\4\4\0\1\4\6\0\36\4"+
    "\1\0\1\114\1\4\4\0\1\4\6\0\25\4\1\115"+
    "\10\4\1\0\2\4\4\0\1\4\6\0\15\4\1\116"+
    "\20\4\1\0\2\4\4\0\1\4\6\0\15\4\1\117"+
    "\20\4\1\0\2\4\4\0\1\4\6\0\15\4\1\45"+
    "\20\4\1\0\2\4\4\0\1\4\6\0\15\4\1\105"+
    "\20\4\1\0\2\4\4\0\1\4\6\0\11\4\1\120"+
    "\24\4\1\0\2\4\4\0\1\4\6\0\24\4\1\121"+
    "\11\4\1\0\2\4\4\0\1\4\6\0\15\4\1\122"+
    "\20\4\1\0\2\4\4\0\1\4\6\0\33\4\1\123"+
    "\2\4\1\0\2\4\4\0\1\4\6\0\35\4\1\124"+
    "\1\0\2\4\4\0\1\4\6\0\15\4\1\125\20\4"+
    "\1\0\2\4\4\0\1\4\6\0\32\4\1\126\3\4"+
    "\1\0\2\4\4\0\1\4\6\0\15\4\1\127\20\4"+
    "\1\0\2\4\4\0\1\4\6\0\11\4\1\127\24\4"+
    "\1\0\2\4\4\0\1\4\6\0\22\4\1\130\13\4"+
    "\1\0\2\4\4\0\1\131\6\0\41\131\11\62\1\111"+
    "\1\64\41\62\4\0\1\4\6\0\11\4\1\132\24\4"+
    "\1\0\2\4\4\0\1\4\6\0\31\4\1\105\4\4"+
    "\1\0\2\4\4\0\1\4\6\0\30\4\1\133\5\4"+
    "\1\0\2\4\4\0\1\4\6\0\13\4\1\134\22\4"+
    "\1\0\2\4\4\0\1\4\6\0\24\4\1\135\11\4"+
    "\1\0\2\4\4\0\1\4\6\0\22\4\1\136\13\4"+
    "\1\0\2\4\4\0\1\4\6\0\32\4\1\137\3\4"+
    "\1\0\2\4\4\0\1\4\6\0\30\4\1\140\5\4"+
    "\1\0\2\4\4\0\1\4\6\0\21\4\1\141\14\4"+
    "\1\0\2\4\4\0\1\4\6\0\11\4\1\142\24\4"+
    "\1\0\2\4\4\0\1\4\6\0\30\4\1\143\5\4"+
    "\1\0\2\4\4\0\1\4\6\0\11\4\1\144\24\4"+
    "\1\0\2\4\4\0\1\4\6\0\30\4\1\145\5\4"+
    "\1\0\2\4\4\0\1\4\6\0\15\4\1\146\20\4"+
    "\1\0\2\4\4\0\1\147\6\0\41\147\4\0\1\4"+
    "\6\0\24\4\1\42\11\4\1\0\2\4\4\0\1\4"+
    "\6\0\20\4\1\150\15\4\1\0\2\4\4\0\1\4"+
    "\6\0\15\4\1\151\20\4\1\0\2\4\4\0\1\4"+
    "\6\0\15\4\1\152\20\4\1\0\2\4\4\0\1\4"+
    "\6\0\30\4\1\153\5\4\1\0\2\4\4\0\1\4"+
    "\6\0\15\4\1\154\20\4\1\0\2\4\4\0\1\4"+
    "\6\0\30\4\1\155\5\4\1\0\2\4\4\0\1\4"+
    "\6\0\25\4\1\133\10\4\1\0\2\4\4\0\1\4"+
    "\6\0\30\4\1\156\5\4\1\0\2\4\4\0\1\157"+
    "\6\0\41\157\4\0\1\4\6\0\11\4\1\160\24\4"+
    "\1\0\2\4\4\0\1\4\6\0\30\4\1\161\5\4"+
    "\1\0\2\4\4\0\1\4\6\0\4\4\1\162\31\4"+
    "\1\0\2\4\4\0\1\4\6\0\33\4\1\163\2\4"+
    "\1\0\2\4\4\0\1\4\6\0\30\4\1\164\5\4"+
    "\1\0\2\4\4\0\1\4\6\0\5\4\1\165\30\4"+
    "\1\0\2\4\4\0\1\4\6\0\10\4\1\166\25\4"+
    "\1\0\2\4\4\0\1\4\6\0\31\4\1\167\4\4"+
    "\1\0\2\4\4\0\1\4\6\0\23\4\1\170\12\4"+
    "\1\0\2\4\4\0\1\4\6\0\14\4\1\150\21\4"+
    "\1\0\2\4\4\0\1\4\6\0\25\4\1\171\10\4"+
    "\1\0\2\4\4\0\1\4\6\0\21\4\1\172\14\4"+
    "\1\0\2\4\4\0\1\4\6\0\2\4\1\173\1\174"+
    "\2\4\1\175\1\176\26\4\1\0\2\4\4\0\1\4"+
    "\6\0\26\4\1\177\7\4\1\0\2\4\4\0\1\4"+
    "\6\0\24\4\1\200\11\4\1\0\2\4\4\0\1\4"+
    "\6\0\24\4\1\201\11\4\1\0\2\4\4\0\1\4"+
    "\6\0\11\4\1\202\10\4\1\203\13\4\1\0\2\4"+
    "\4\0\1\4\6\0\22\4\1\204\13\4\1\0\2\4"+
    "\4\0\1\4\6\0\15\4\1\205\20\4\1\0\2\4"+
    "\4\0\1\4\6\0\12\4\1\206\23\4\1\0\2\4"+
    "\4\0\1\4\6\0\21\4\1\207\14\4\1\0\2\4"+
    "\4\0\1\4\6\0\15\4\1\210\20\4\1\0\2\4"+
    "\4\0\1\4\6\0\32\4\1\211\3\4\1\0\2\4"+
    "\4\0\1\4\6\0\22\4\1\212\13\4\1\0\2\4"+
    "\4\0\1\4\6\0\11\4\1\213\24\4\1\0\2\4"+
    "\4\0\1\4\6\0\11\4\1\214\24\4\1\0\2\4"+
    "\4\0\1\4\6\0\17\4\1\214\16\4\1\0\2\4"+
    "\4\0\1\4\6\0\31\4\1\215\4\4\1\0\2\4"+
    "\4\0\1\4\6\0\30\4\1\216\5\4\1\0\2\4"+
    "\4\0\1\4\6\0\14\4\1\217\21\4\1\0\2\4"+
    "\4\0\1\4\6\0\11\4\1\220\24\4\1\0\2\4"+
    "\4\0\1\4\6\0\21\4\1\221\14\4\1\0\2\4"+
    "\4\0\1\4\6\0\24\4\1\222\11\4\1\0\2\4"+
    "\4\0\1\4\6\0\30\4\1\223\5\4\1\0\2\4"+
    "\4\0\1\4\6\0\32\4\1\224\3\4\1\0\2\4"+
    "\4\0\1\4\6\0\11\4\1\225\24\4\1\0\2\4"+
    "\4\0\1\4\6\0\30\4\1\226\5\4\1\0\2\4"+
    "\4\0\1\4\6\0\35\4\1\227\1\0\2\4\4\0"+
    "\1\4\6\0\13\4\1\223\22\4\1\0\2\4\4\0"+
    "\1\4\6\0\25\4\1\230\10\4\1\0\2\4\4\0"+
    "\1\4\6\0\36\4\1\0\1\231\1\4\4\0\1\4"+
    "\6\0\11\4\1\230\24\4\1\0\2\4\4\0\1\4"+
    "\6\0\13\4\1\232\22\4\1\0\2\4\4\0\1\4"+
    "\6\0\33\4\1\233\2\4\1\0\2\4\4\0\1\4"+
    "\6\0\22\4\1\223\13\4\1\0\2\4";

  private static int [] zzUnpackTrans() {
    int [] result = new int[6072];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** Error code for "Unknown internal scanner error". */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  /** Error code for "could not match input". */
  private static final int ZZ_NO_MATCH = 1;
  /** Error code for "pushback value was too large". */
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /**
   * Error messages for {@link #ZZ_UNKNOWN_ERROR}, {@link #ZZ_NO_MATCH}, and
   * {@link #ZZ_PUSHBACK_2BIG} respectively.
   */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\4\1\2\11\20\1\2\0\26\1\3\0"+
    "\1\11\23\1\2\0\17\1\1\0\15\1\1\0\7\1"+
    "\1\11\54\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[155];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** Input device. */
  private java.io.Reader zzReader;

  /** Current state of the DFA. */
  private int zzState;

  /** Current lexical state. */
  private int zzLexicalState = YYINITIAL;

  /**
   * This buffer contains the current text to be matched and is the source of the {@link #yytext()}
   * string.
   */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** Text position at the last accepting state. */
  private int zzMarkedPos;

  /** Current text position in the buffer. */
  private int zzCurrentPos;

  /** Marks the beginning of the {@link #yytext()} string in the buffer. */
  private int zzStartRead;

  /** Marks the last character in the buffer, that has been read from input. */
  private int zzEndRead;

  /**
   * Whether the scanner is at the end of file.
   * @see #yyatEOF
   */
  private boolean zzAtEOF;

  /**
   * The number of occupied positions in {@link #zzBuffer} beyond {@link #zzEndRead}.
   *
   * <p>When a lead/high surrogate has been read from the input stream into the final
   * {@link #zzBuffer} position, this will have a value of 1; otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /** Number of newlines encountered up to the start of the matched text. */
  @SuppressWarnings("unused")
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  @SuppressWarnings("unused")
  private int yycolumn;

  /** Number of characters up to the start of the matched text. */
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  @SuppressWarnings("unused")
  private boolean zzEOFDone;

  /* user code: */
    private TextColor textColor(long start, int size, Color color) {
        return new TextColor((int)start, size, color);
    }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  LexerColor(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  /**
   * Refills the input buffer.
   *
   * @return {@code false} iff there was new input.
   * @exception java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead - zzStartRead);

      /* translate stored positions */
      zzEndRead -= zzStartRead;
      zzCurrentPos -= zzStartRead;
      zzMarkedPos -= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length * 2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException(
          "Reader returned 0 characters. See JFlex examples/zero-reader for a workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
        if (numRead == requested) { // We requested too few chars to encode a full Unicode character
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        } else {                    // There is room in the buffer for at least one more char
          int c = zzReader.read();  // Expecting to read a paired low surrogate char
          if (c == -1) {
            return true;
          } else {
            zzBuffer[zzEndRead++] = (char)c;
          }
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }


  /**
   * Closes the input reader.
   *
   * @throws java.io.IOException if the reader could not be closed.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true; // indicate end of file
    zzEndRead = zzStartRead; // invalidate buffer

    if (zzReader != null) {
      zzReader.close();
    }
  }


  /**
   * Resets the scanner to read from a new input stream.
   *
   * <p>Does not close the old reader.
   *
   * <p>All internal variables are reset, the old input stream <b>cannot</b> be reused (internal
   * buffer is discarded and lost). Lexical state is set to {@code ZZ_INITIAL}.
   *
   * <p>Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader The new input stream.
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzEOFDone = false;
    yyResetPosition();
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE) {
      zzBuffer = new char[ZZ_BUFFERSIZE];
    }
  }

  /**
   * Resets the input position.
   */
  private final void yyResetPosition() {
      zzAtBOL  = true;
      zzAtEOF  = false;
      zzCurrentPos = 0;
      zzMarkedPos = 0;
      zzStartRead = 0;
      zzEndRead = 0;
      zzFinalHighSurrogate = 0;
      yyline = 0;
      yycolumn = 0;
      yychar = 0L;
  }


  /**
   * Returns whether the scanner has reached the end of the reader it reads from.
   *
   * @return whether the scanner has reached EOF.
   */
  public final boolean yyatEOF() {
    return zzAtEOF;
  }


  /**
   * Returns the current lexical state.
   *
   * @return the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state.
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   *
   * @return the matched text.
   */
  public final String yytext() {
    return new String(zzBuffer, zzStartRead, zzMarkedPos-zzStartRead);
  }


  /**
   * Returns the character at the given position from the matched text.
   *
   * <p>It is equivalent to {@code yytext().charAt(pos)}, but faster.
   *
   * @param position the position of the character to fetch. A value from 0 to {@code yylength()-1}.
   *
   * @return the character at {@code position}.
   */
  public final char yycharat(int position) {
    return zzBuffer[zzStartRead + position];
  }


  /**
   * How many characters were matched.
   *
   * @return the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * <p>In a well-formed scanner (no or only correct usage of {@code yypushback(int)} and a
   * match-all fallback rule) this method will only be called with things that
   * "Can't Possibly Happen".
   *
   * <p>If this method is called, something is seriously wrong (e.g. a JFlex bug producing a faulty
   * scanner etc.).
   *
   * <p>Usual syntax/scanner level error handling should be done in error fallback rules.
   *
   * @param errorCode the code of the error message to display.
   */
  private static void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    } catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * <p>They will be read again by then next call of the scanning method.
   *
   * @param number the number of characters to be read again. This number must not be greater than
   *     {@link #yylength()}.
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }




  /**
   * Resumes scanning until the next regular expression is matched, the end of input is encountered
   * or an I/O-Error occurs.
   *
   * @return the next token.
   * @exception java.io.IOException if any I/O-Error occurs.
   */
  public TextColor yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char[] zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { /* Ignorar */
            }
            // fall through
          case 18: break;
          case 2:
            { return textColor(yychar, yylength(), new Color(48,63,159));
            }
            // fall through
          case 19: break;
          case 3:
            { return textColor(yychar, yylength(), new Color(169,155,179));
            }
            // fall through
          case 20: break;
          case 4:
            { return textColor(yychar, yylength(), new Color(35, 120, 147));
            }
            // fall through
          case 21: break;
          case 5:
            { return textColor(yychar, yylength(), new Color(146, 146, 146));
            }
            // fall through
          case 22: break;
          case 6:
            { return textColor(yychar, yylength(), new Color(48,63,129));
            }
            // fall through
          case 23: break;
          case 7:
            { return textColor(yychar, yylength(), new Color(17, 94, 153));
            }
            // fall through
          case 24: break;
          case 8:
            { return textColor(yychar, yylength(), new Color(148, 58, 173));
            }
            // fall through
          case 25: break;
          case 9:
            { return textColor(yychar, yylength(), new Color(198,40,40));
            }
            // fall through
          case 26: break;
          case 10:
            { return textColor(yychar, yylength(), new Color(102, 41, 120 ));
            }
            // fall through
          case 27: break;
          case 11:
            { return textColor(yychar, yylength(), new Color(121,107,255));
            }
            // fall through
          case 28: break;
          case 12:
            { return textColor(yychar, yylength(), new Color(212, 129, 6));
            }
            // fall through
          case 29: break;
          case 13:
            { return textColor(yychar, yylength(), new Color(224, 195, 12));
            }
            // fall through
          case 30: break;
          case 14:
            { return textColor(yychar, yylength(), new Color(255,64,129));
            }
            // fall through
          case 31: break;
          case 15:
            { return textColor(yychar, yylength(), new Color(239, 108, 0));
            }
            // fall through
          case 32: break;
          case 16:
            { return textColor(yychar, yylength(), new Color(255, 64, 129));
            }
            // fall through
          case 33: break;
          case 17:
            { return textColor(yychar, yylength(), new Color(150, 0, 80));
            }
            // fall through
          case 34: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}