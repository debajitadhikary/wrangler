// Generated from io\cdap\wrangler\parser\Directives.g4 by ANTLR 4.7
package io.cdap.wrangler.parser;

/*
 * Copyright © 2017-2019 Cask Data, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DirectivesLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, AGGREGATE_STATS=9, 
		OBrace=10, CBrace=11, SColon=12, Or=13, And=14, Equals=15, NEquals=16, 
		GTEquals=17, LTEquals=18, Match=19, NotMatch=20, QuestionColon=21, StartsWith=22, 
		NotStartsWith=23, EndsWith=24, NotEndsWith=25, PlusEqual=26, SubEqual=27, 
		MulEqual=28, DivEqual=29, PerEqual=30, AndEqual=31, OrEqual=32, XOREqual=33, 
		Pow=34, External=35, GT=36, LT=37, Add=38, Subtract=39, Multiply=40, Divide=41, 
		Modulus=42, OBracket=43, CBracket=44, OParen=45, CParen=46, Assign=47, 
		Comma=48, QMark=49, Colon=50, Dot=51, At=52, Pipe=53, BackSlash=54, Dollar=55, 
		Tilde=56, Bool=57, Number=58, Identifier=59, Macro=60, Column=61, String=62, 
		BYTE_SIZE=63, TIME_DURATION=64, EscapeSequence=65, Comment=66, Space=67;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "AGGREGATE_STATS", 
		"OBrace", "CBrace", "SColon", "Or", "And", "Equals", "NEquals", "GTEquals", 
		"LTEquals", "Match", "NotMatch", "QuestionColon", "StartsWith", "NotStartsWith", 
		"EndsWith", "NotEndsWith", "PlusEqual", "SubEqual", "MulEqual", "DivEqual", 
		"PerEqual", "AndEqual", "OrEqual", "XOREqual", "Pow", "External", "GT", 
		"LT", "Add", "Subtract", "Multiply", "Divide", "Modulus", "OBracket", 
		"CBracket", "OParen", "CParen", "Assign", "Comma", "QMark", "Colon", "Dot", 
		"At", "Pipe", "BackSlash", "Dollar", "Tilde", "Bool", "Number", "Identifier", 
		"Macro", "Column", "String", "BYTE_SIZE", "TIME_DURATION", "BYTE_UNIT", 
		"TIME_UNIT", "NUMBER", "EscapeSequence", "OctalEscape", "UnicodeEscape", 
		"HexDigit", "Comment", "Space", "Int", "Digit"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'if'", "'else'", "'for'", "'#pragma'", "'load-directives'", "'version'", 
		"'exp'", "'prop'", "'aggregate-stats'", "'{'", "'}'", "';'", "'||'", "'&&'", 
		"'=='", "'!='", "'>='", "'<='", "'=~'", "'!~'", "'?:'", "'=^'", "'!^'", 
		"'=$'", "'!$'", "'+='", "'-='", "'*='", "'/='", "'%='", "'&='", "'|='", 
		"'^='", "'^'", "'!'", "'>'", "'<'", "'+'", "'-'", "'*'", "'/'", "'%'", 
		"'['", "']'", "'('", "')'", "'='", "','", "'?'", "':'", "'.'", "'@'", 
		"'|'", "'\\'", "'$'", "'~'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, "AGGREGATE_STATS", 
		"OBrace", "CBrace", "SColon", "Or", "And", "Equals", "NEquals", "GTEquals", 
		"LTEquals", "Match", "NotMatch", "QuestionColon", "StartsWith", "NotStartsWith", 
		"EndsWith", "NotEndsWith", "PlusEqual", "SubEqual", "MulEqual", "DivEqual", 
		"PerEqual", "AndEqual", "OrEqual", "XOREqual", "Pow", "External", "GT", 
		"LT", "Add", "Subtract", "Multiply", "Divide", "Modulus", "OBracket", 
		"CBracket", "OParen", "CParen", "Assign", "Comma", "QMark", "Colon", "Dot", 
		"At", "Pipe", "BackSlash", "Dollar", "Tilde", "Bool", "Number", "Identifier", 
		"Macro", "Column", "String", "BYTE_SIZE", "TIME_DURATION", "EscapeSequence", 
		"Comment", "Space"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public DirectivesLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Directives.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2E\u021e\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35"+
		"\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3"+
		"#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3."+
		"\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66"+
		"\3\66\3\67\3\67\38\38\39\39\3:\3:\3:\3:\3:\3:\3:\3:\3:\5:\u015b\n:\3;"+
		"\3;\3;\7;\u0160\n;\f;\16;\u0163\13;\5;\u0165\n;\3<\3<\7<\u0169\n<\f<\16"+
		"<\u016c\13<\3=\3=\7=\u0170\n=\f=\16=\u0173\13=\3>\3>\3>\7>\u0178\n>\f"+
		">\16>\u017b\13>\3?\3?\3?\7?\u0180\n?\f?\16?\u0183\13?\3?\3?\3?\3?\7?\u0189"+
		"\n?\f?\16?\u018c\13?\3?\5?\u018f\n?\3@\3@\3@\3A\3A\3A\3B\3B\3B\3B\3B\3"+
		"B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\5B\u01b0\n"+
		"B\3C\3C\3C\3C\3C\3C\3C\5C\u01b9\nC\3D\6D\u01bc\nD\rD\16D\u01bd\3D\3D\6"+
		"D\u01c2\nD\rD\16D\u01c3\5D\u01c6\nD\3E\3E\3E\3E\5E\u01cc\nE\3F\3F\3F\3"+
		"F\3F\3F\3F\3F\3F\5F\u01d7\nF\3G\3G\3G\3G\3G\3G\3G\3H\3H\3I\3I\3I\3I\7"+
		"I\u01e6\nI\fI\16I\u01e9\13I\3I\3I\3I\3I\7I\u01ef\nI\fI\16I\u01f2\13I\3"+
		"I\3I\3I\3I\3I\3I\7I\u01fa\nI\fI\16I\u01fd\13I\5I\u01ff\nI\3I\3I\3J\6J"+
		"\u0204\nJ\rJ\16J\u0205\3J\3J\3K\5K\u020b\nK\3K\3K\7K\u020f\nK\fK\16K\u0212"+
		"\13K\3K\7K\u0215\nK\fK\16K\u0218\13K\3K\5K\u021b\nK\3L\3L\3\u01f0\2M\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
		"\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37="+
		" ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9"+
		"q:s;u<w=y>{?}@\177A\u0081B\u0083\2\u0085\2\u0087\2\u0089C\u008b\2\u008d"+
		"\2\u008f\2\u0091D\u0093E\u0095\2\u0097\2\3\2\32\6\2//C\\aac|\7\2//\62"+
		";C\\aac|\5\2C\\aac|\6\2\62;C\\aac|\7\2//\62<C\\aac|\3\2))\3\2$$\4\2MM"+
		"mm\4\2DDdd\4\2OOoo\4\2IIii\4\2VVvv\4\2RRrr\4\2KKkk\4\2UUuu\4\2PPpp\6\2"+
		"FFJJffjj\3\2\62;\n\2$$))^^ddhhppttvv\5\2\62;CHch\4\2\f\f\17\17\5\2\13"+
		"\f\16\17\"\"\3\2\63;\3\2NN\2\u023d\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2"+
		"\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2"+
		"\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2"+
		"\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2"+
		"O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3"+
		"\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2"+
		"\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2"+
		"u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2"+
		"\u0081\3\2\2\2\2\u0089\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\3\u0099"+
		"\3\2\2\2\5\u009c\3\2\2\2\7\u00a1\3\2\2\2\t\u00a5\3\2\2\2\13\u00ad\3\2"+
		"\2\2\r\u00bd\3\2\2\2\17\u00c5\3\2\2\2\21\u00c9\3\2\2\2\23\u00ce\3\2\2"+
		"\2\25\u00de\3\2\2\2\27\u00e0\3\2\2\2\31\u00e2\3\2\2\2\33\u00e4\3\2\2\2"+
		"\35\u00e7\3\2\2\2\37\u00ea\3\2\2\2!\u00ed\3\2\2\2#\u00f0\3\2\2\2%\u00f3"+
		"\3\2\2\2\'\u00f6\3\2\2\2)\u00f9\3\2\2\2+\u00fc\3\2\2\2-\u00ff\3\2\2\2"+
		"/\u0102\3\2\2\2\61\u0105\3\2\2\2\63\u0108\3\2\2\2\65\u010b\3\2\2\2\67"+
		"\u010e\3\2\2\29\u0111\3\2\2\2;\u0114\3\2\2\2=\u0117\3\2\2\2?\u011a\3\2"+
		"\2\2A\u011d\3\2\2\2C\u0120\3\2\2\2E\u0123\3\2\2\2G\u0125\3\2\2\2I\u0127"+
		"\3\2\2\2K\u0129\3\2\2\2M\u012b\3\2\2\2O\u012d\3\2\2\2Q\u012f\3\2\2\2S"+
		"\u0131\3\2\2\2U\u0133\3\2\2\2W\u0135\3\2\2\2Y\u0137\3\2\2\2[\u0139\3\2"+
		"\2\2]\u013b\3\2\2\2_\u013d\3\2\2\2a\u013f\3\2\2\2c\u0141\3\2\2\2e\u0143"+
		"\3\2\2\2g\u0145\3\2\2\2i\u0147\3\2\2\2k\u0149\3\2\2\2m\u014b\3\2\2\2o"+
		"\u014d\3\2\2\2q\u014f\3\2\2\2s\u015a\3\2\2\2u\u015c\3\2\2\2w\u0166\3\2"+
		"\2\2y\u016d\3\2\2\2{\u0174\3\2\2\2}\u018e\3\2\2\2\177\u0190\3\2\2\2\u0081"+
		"\u0193\3\2\2\2\u0083\u01af\3\2\2\2\u0085\u01b8\3\2\2\2\u0087\u01bb\3\2"+
		"\2\2\u0089\u01cb\3\2\2\2\u008b\u01d6\3\2\2\2\u008d\u01d8\3\2\2\2\u008f"+
		"\u01df\3\2\2\2\u0091\u01fe\3\2\2\2\u0093\u0203\3\2\2\2\u0095\u021a\3\2"+
		"\2\2\u0097\u021c\3\2\2\2\u0099\u009a\7k\2\2\u009a\u009b\7h\2\2\u009b\4"+
		"\3\2\2\2\u009c\u009d\7g\2\2\u009d\u009e\7n\2\2\u009e\u009f\7u\2\2\u009f"+
		"\u00a0\7g\2\2\u00a0\6\3\2\2\2\u00a1\u00a2\7h\2\2\u00a2\u00a3\7q\2\2\u00a3"+
		"\u00a4\7t\2\2\u00a4\b\3\2\2\2\u00a5\u00a6\7%\2\2\u00a6\u00a7\7r\2\2\u00a7"+
		"\u00a8\7t\2\2\u00a8\u00a9\7c\2\2\u00a9\u00aa\7i\2\2\u00aa\u00ab\7o\2\2"+
		"\u00ab\u00ac\7c\2\2\u00ac\n\3\2\2\2\u00ad\u00ae\7n\2\2\u00ae\u00af\7q"+
		"\2\2\u00af\u00b0\7c\2\2\u00b0\u00b1\7f\2\2\u00b1\u00b2\7/\2\2\u00b2\u00b3"+
		"\7f\2\2\u00b3\u00b4\7k\2\2\u00b4\u00b5\7t\2\2\u00b5\u00b6\7g\2\2\u00b6"+
		"\u00b7\7e\2\2\u00b7\u00b8\7v\2\2\u00b8\u00b9\7k\2\2\u00b9\u00ba\7x\2\2"+
		"\u00ba\u00bb\7g\2\2\u00bb\u00bc\7u\2\2\u00bc\f\3\2\2\2\u00bd\u00be\7x"+
		"\2\2\u00be\u00bf\7g\2\2\u00bf\u00c0\7t\2\2\u00c0\u00c1\7u\2\2\u00c1\u00c2"+
		"\7k\2\2\u00c2\u00c3\7q\2\2\u00c3\u00c4\7p\2\2\u00c4\16\3\2\2\2\u00c5\u00c6"+
		"\7g\2\2\u00c6\u00c7\7z\2\2\u00c7\u00c8\7r\2\2\u00c8\20\3\2\2\2\u00c9\u00ca"+
		"\7r\2\2\u00ca\u00cb\7t\2\2\u00cb\u00cc\7q\2\2\u00cc\u00cd\7r\2\2\u00cd"+
		"\22\3\2\2\2\u00ce\u00cf\7c\2\2\u00cf\u00d0\7i\2\2\u00d0\u00d1\7i\2\2\u00d1"+
		"\u00d2\7t\2\2\u00d2\u00d3\7g\2\2\u00d3\u00d4\7i\2\2\u00d4\u00d5\7c\2\2"+
		"\u00d5\u00d6\7v\2\2\u00d6\u00d7\7g\2\2\u00d7\u00d8\7/\2\2\u00d8\u00d9"+
		"\7u\2\2\u00d9\u00da\7v\2\2\u00da\u00db\7c\2\2\u00db\u00dc\7v\2\2\u00dc"+
		"\u00dd\7u\2\2\u00dd\24\3\2\2\2\u00de\u00df\7}\2\2\u00df\26\3\2\2\2\u00e0"+
		"\u00e1\7\177\2\2\u00e1\30\3\2\2\2\u00e2\u00e3\7=\2\2\u00e3\32\3\2\2\2"+
		"\u00e4\u00e5\7~\2\2\u00e5\u00e6\7~\2\2\u00e6\34\3\2\2\2\u00e7\u00e8\7"+
		"(\2\2\u00e8\u00e9\7(\2\2\u00e9\36\3\2\2\2\u00ea\u00eb\7?\2\2\u00eb\u00ec"+
		"\7?\2\2\u00ec \3\2\2\2\u00ed\u00ee\7#\2\2\u00ee\u00ef\7?\2\2\u00ef\"\3"+
		"\2\2\2\u00f0\u00f1\7@\2\2\u00f1\u00f2\7?\2\2\u00f2$\3\2\2\2\u00f3\u00f4"+
		"\7>\2\2\u00f4\u00f5\7?\2\2\u00f5&\3\2\2\2\u00f6\u00f7\7?\2\2\u00f7\u00f8"+
		"\7\u0080\2\2\u00f8(\3\2\2\2\u00f9\u00fa\7#\2\2\u00fa\u00fb\7\u0080\2\2"+
		"\u00fb*\3\2\2\2\u00fc\u00fd\7A\2\2\u00fd\u00fe\7<\2\2\u00fe,\3\2\2\2\u00ff"+
		"\u0100\7?\2\2\u0100\u0101\7`\2\2\u0101.\3\2\2\2\u0102\u0103\7#\2\2\u0103"+
		"\u0104\7`\2\2\u0104\60\3\2\2\2\u0105\u0106\7?\2\2\u0106\u0107\7&\2\2\u0107"+
		"\62\3\2\2\2\u0108\u0109\7#\2\2\u0109\u010a\7&\2\2\u010a\64\3\2\2\2\u010b"+
		"\u010c\7-\2\2\u010c\u010d\7?\2\2\u010d\66\3\2\2\2\u010e\u010f\7/\2\2\u010f"+
		"\u0110\7?\2\2\u01108\3\2\2\2\u0111\u0112\7,\2\2\u0112\u0113\7?\2\2\u0113"+
		":\3\2\2\2\u0114\u0115\7\61\2\2\u0115\u0116\7?\2\2\u0116<\3\2\2\2\u0117"+
		"\u0118\7\'\2\2\u0118\u0119\7?\2\2\u0119>\3\2\2\2\u011a\u011b\7(\2\2\u011b"+
		"\u011c\7?\2\2\u011c@\3\2\2\2\u011d\u011e\7~\2\2\u011e\u011f\7?\2\2\u011f"+
		"B\3\2\2\2\u0120\u0121\7`\2\2\u0121\u0122\7?\2\2\u0122D\3\2\2\2\u0123\u0124"+
		"\7`\2\2\u0124F\3\2\2\2\u0125\u0126\7#\2\2\u0126H\3\2\2\2\u0127\u0128\7"+
		"@\2\2\u0128J\3\2\2\2\u0129\u012a\7>\2\2\u012aL\3\2\2\2\u012b\u012c\7-"+
		"\2\2\u012cN\3\2\2\2\u012d\u012e\7/\2\2\u012eP\3\2\2\2\u012f\u0130\7,\2"+
		"\2\u0130R\3\2\2\2\u0131\u0132\7\61\2\2\u0132T\3\2\2\2\u0133\u0134\7\'"+
		"\2\2\u0134V\3\2\2\2\u0135\u0136\7]\2\2\u0136X\3\2\2\2\u0137\u0138\7_\2"+
		"\2\u0138Z\3\2\2\2\u0139\u013a\7*\2\2\u013a\\\3\2\2\2\u013b\u013c\7+\2"+
		"\2\u013c^\3\2\2\2\u013d\u013e\7?\2\2\u013e`\3\2\2\2\u013f\u0140\7.\2\2"+
		"\u0140b\3\2\2\2\u0141\u0142\7A\2\2\u0142d\3\2\2\2\u0143\u0144\7<\2\2\u0144"+
		"f\3\2\2\2\u0145\u0146\7\60\2\2\u0146h\3\2\2\2\u0147\u0148\7B\2\2\u0148"+
		"j\3\2\2\2\u0149\u014a\7~\2\2\u014al\3\2\2\2\u014b\u014c\7^\2\2\u014cn"+
		"\3\2\2\2\u014d\u014e\7&\2\2\u014ep\3\2\2\2\u014f\u0150\7\u0080\2\2\u0150"+
		"r\3\2\2\2\u0151\u0152\7v\2\2\u0152\u0153\7t\2\2\u0153\u0154\7w\2\2\u0154"+
		"\u015b\7g\2\2\u0155\u0156\7h\2\2\u0156\u0157\7c\2\2\u0157\u0158\7n\2\2"+
		"\u0158\u0159\7u\2\2\u0159\u015b\7g\2\2\u015a\u0151\3\2\2\2\u015a\u0155"+
		"\3\2\2\2\u015bt\3\2\2\2\u015c\u0164\5\u0095K\2\u015d\u0161\7\60\2\2\u015e"+
		"\u0160\5\u0097L\2\u015f\u015e\3\2\2\2\u0160\u0163\3\2\2\2\u0161\u015f"+
		"\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0165\3\2\2\2\u0163\u0161\3\2\2\2\u0164"+
		"\u015d\3\2\2\2\u0164\u0165\3\2\2\2\u0165v\3\2\2\2\u0166\u016a\t\2\2\2"+
		"\u0167\u0169\t\3\2\2\u0168\u0167\3\2\2\2\u0169\u016c\3\2\2\2\u016a\u0168"+
		"\3\2\2\2\u016a\u016b\3\2\2\2\u016bx\3\2\2\2\u016c\u016a\3\2\2\2\u016d"+
		"\u0171\t\4\2\2\u016e\u0170\t\5\2\2\u016f\u016e\3\2\2\2\u0170\u0173\3\2"+
		"\2\2\u0171\u016f\3\2\2\2\u0171\u0172\3\2\2\2\u0172z\3\2\2\2\u0173\u0171"+
		"\3\2\2\2\u0174\u0175\7<\2\2\u0175\u0179\t\2\2\2\u0176\u0178\t\6\2\2\u0177"+
		"\u0176\3\2\2\2\u0178\u017b\3\2\2\2\u0179\u0177\3\2\2\2\u0179\u017a\3\2"+
		"\2\2\u017a|\3\2\2\2\u017b\u0179\3\2\2\2\u017c\u0181\7)\2\2\u017d\u0180"+
		"\5\u0089E\2\u017e\u0180\n\7\2\2\u017f\u017d\3\2\2\2\u017f\u017e\3\2\2"+
		"\2\u0180\u0183\3\2\2\2\u0181\u017f\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0184"+
		"\3\2\2\2\u0183\u0181\3\2\2\2\u0184\u018f\7)\2\2\u0185\u018a\7$\2\2\u0186"+
		"\u0189\5\u0089E\2\u0187\u0189\n\b\2\2\u0188\u0186\3\2\2\2\u0188\u0187"+
		"\3\2\2\2\u0189\u018c\3\2\2\2\u018a\u0188\3\2\2\2\u018a\u018b\3\2\2\2\u018b"+
		"\u018d\3\2\2\2\u018c\u018a\3\2\2\2\u018d\u018f\7$\2\2\u018e\u017c\3\2"+
		"\2\2\u018e\u0185\3\2\2\2\u018f~\3\2\2\2\u0190\u0191\5\u0087D\2\u0191\u0192"+
		"\5\u0083B\2\u0192\u0080\3\2\2\2\u0193\u0194\5\u0087D\2\u0194\u0195\5\u0085"+
		"C\2\u0195\u0082\3\2\2\2\u0196\u0197\t\t\2\2\u0197\u01b0\t\n\2\2\u0198"+
		"\u0199\t\13\2\2\u0199\u01b0\t\n\2\2\u019a\u019b\t\f\2\2\u019b\u01b0\t"+
		"\n\2\2\u019c\u019d\t\r\2\2\u019d\u01b0\t\n\2\2\u019e\u019f\t\16\2\2\u019f"+
		"\u01b0\t\n\2\2\u01a0\u01a1\t\t\2\2\u01a1\u01a2\t\17\2\2\u01a2\u01b0\t"+
		"\n\2\2\u01a3\u01a4\t\13\2\2\u01a4\u01a5\t\17\2\2\u01a5\u01b0\t\n\2\2\u01a6"+
		"\u01a7\t\f\2\2\u01a7\u01a8\t\17\2\2\u01a8\u01b0\t\n\2\2\u01a9\u01aa\t"+
		"\r\2\2\u01aa\u01ab\t\17\2\2\u01ab\u01b0\t\n\2\2\u01ac\u01ad\t\16\2\2\u01ad"+
		"\u01ae\t\17\2\2\u01ae\u01b0\t\n\2\2\u01af\u0196\3\2\2\2\u01af\u0198\3"+
		"\2\2\2\u01af\u019a\3\2\2\2\u01af\u019c\3\2\2\2\u01af\u019e\3\2\2\2\u01af"+
		"\u01a0\3\2\2\2\u01af\u01a3\3\2\2\2\u01af\u01a6\3\2\2\2\u01af\u01a9\3\2"+
		"\2\2\u01af\u01ac\3\2\2\2\u01b0\u0084\3\2\2\2\u01b1\u01b2\t\13\2\2\u01b2"+
		"\u01b9\t\20\2\2\u01b3\u01b9\t\20\2\2\u01b4\u01b5\t\13\2\2\u01b5\u01b6"+
		"\t\17\2\2\u01b6\u01b9\t\21\2\2\u01b7\u01b9\t\22\2\2\u01b8\u01b1\3\2\2"+
		"\2\u01b8\u01b3\3\2\2\2\u01b8\u01b4\3\2\2\2\u01b8\u01b7\3\2\2\2\u01b9\u0086"+
		"\3\2\2\2\u01ba\u01bc\t\23\2\2\u01bb\u01ba\3\2\2\2\u01bc\u01bd\3\2\2\2"+
		"\u01bd\u01bb\3\2\2\2\u01bd\u01be\3\2\2\2\u01be\u01c5\3\2\2\2\u01bf\u01c1"+
		"\7\60\2\2\u01c0\u01c2\t\23\2\2\u01c1\u01c0\3\2\2\2\u01c2\u01c3\3\2\2\2"+
		"\u01c3\u01c1\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4\u01c6\3\2\2\2\u01c5\u01bf"+
		"\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\u0088\3\2\2\2\u01c7\u01c8\7^\2\2\u01c8"+
		"\u01cc\t\24\2\2\u01c9\u01cc\5\u008dG\2\u01ca\u01cc\5\u008bF\2\u01cb\u01c7"+
		"\3\2\2\2\u01cb\u01c9\3\2\2\2\u01cb\u01ca\3\2\2\2\u01cc\u008a\3\2\2\2\u01cd"+
		"\u01ce\7^\2\2\u01ce\u01cf\4\62\65\2\u01cf\u01d0\4\629\2\u01d0\u01d7\4"+
		"\629\2\u01d1\u01d2\7^\2\2\u01d2\u01d3\4\629\2\u01d3\u01d7\4\629\2\u01d4"+
		"\u01d5\7^\2\2\u01d5\u01d7\4\629\2\u01d6\u01cd\3\2\2\2\u01d6\u01d1\3\2"+
		"\2\2\u01d6\u01d4\3\2\2\2\u01d7\u008c\3\2\2\2\u01d8\u01d9\7^\2\2\u01d9"+
		"\u01da\7w\2\2\u01da\u01db\5\u008fH\2\u01db\u01dc\5\u008fH\2\u01dc\u01dd"+
		"\5\u008fH\2\u01dd\u01de\5\u008fH\2\u01de\u008e\3\2\2\2\u01df\u01e0\t\25"+
		"\2\2\u01e0\u0090\3\2\2\2\u01e1\u01e2\7\61\2\2\u01e2\u01e3\7\61\2\2\u01e3"+
		"\u01e7\3\2\2\2\u01e4\u01e6\n\26\2\2\u01e5\u01e4\3\2\2\2\u01e6\u01e9\3"+
		"\2\2\2\u01e7\u01e5\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8\u01ff\3\2\2\2\u01e9"+
		"\u01e7\3\2\2\2\u01ea\u01eb\7\61\2\2\u01eb\u01ec\7,\2\2\u01ec\u01f0\3\2"+
		"\2\2\u01ed\u01ef\13\2\2\2\u01ee\u01ed\3\2\2\2\u01ef\u01f2\3\2\2\2\u01f0"+
		"\u01f1\3\2\2\2\u01f0\u01ee\3\2\2\2\u01f1\u01f3\3\2\2\2\u01f2\u01f0\3\2"+
		"\2\2\u01f3\u01f4\7,\2\2\u01f4\u01ff\7\61\2\2\u01f5\u01f6\7/\2\2\u01f6"+
		"\u01f7\7/\2\2\u01f7\u01fb\3\2\2\2\u01f8\u01fa\n\26\2\2\u01f9\u01f8\3\2"+
		"\2\2\u01fa\u01fd\3\2\2\2\u01fb\u01f9\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fc"+
		"\u01ff\3\2\2\2\u01fd\u01fb\3\2\2\2\u01fe\u01e1\3\2\2\2\u01fe\u01ea\3\2"+
		"\2\2\u01fe\u01f5\3\2\2\2\u01ff\u0200\3\2\2\2\u0200\u0201\bI\2\2\u0201"+
		"\u0092\3\2\2\2\u0202\u0204\t\27\2\2\u0203\u0202\3\2\2\2\u0204\u0205\3"+
		"\2\2\2\u0205\u0203\3\2\2\2\u0205\u0206\3\2\2\2\u0206\u0207\3\2\2\2\u0207"+
		"\u0208\bJ\2\2\u0208\u0094\3\2\2\2\u0209\u020b\7/\2\2\u020a\u0209\3\2\2"+
		"\2\u020a\u020b\3\2\2\2\u020b\u020c\3\2\2\2\u020c\u0210\t\30\2\2\u020d"+
		"\u020f\5\u0097L\2\u020e\u020d\3\2\2\2\u020f\u0212\3\2\2\2\u0210\u020e"+
		"\3\2\2\2\u0210\u0211\3\2\2\2\u0211\u0216\3\2\2\2\u0212\u0210\3\2\2\2\u0213"+
		"\u0215\t\31\2\2\u0214\u0213\3\2\2\2\u0215\u0218\3\2\2\2\u0216\u0214\3"+
		"\2\2\2\u0216\u0217\3\2\2\2\u0217\u021b\3\2\2\2\u0218\u0216\3\2\2\2\u0219"+
		"\u021b\7\62\2\2\u021a\u020a\3\2\2\2\u021a\u0219\3\2\2\2\u021b\u0096\3"+
		"\2\2\2\u021c\u021d\t\23\2\2\u021d\u0098\3\2\2\2\36\2\u015a\u0161\u0164"+
		"\u016a\u0171\u0179\u017f\u0181\u0188\u018a\u018e\u01af\u01b8\u01bd\u01c3"+
		"\u01c5\u01cb\u01d6\u01e7\u01f0\u01fb\u01fe\u0205\u020a\u0210\u0216\u021a"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}