/*
 * Copyright © 2017-2025 Cask Data, Inc.
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
package io.cdap.wrangler.parser;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

import io.cdap.wrangler.TestingRig;
import io.cdap.wrangler.api.CompileException;
import io.cdap.wrangler.api.CompileStatus;
import io.cdap.wrangler.api.Compiler;
import io.cdap.wrangler.api.RecipePipeline;
import io.cdap.wrangler.api.RecipeSymbol;
import io.cdap.wrangler.api.TokenGroup;
import io.cdap.wrangler.api.parser.ColumnName;
import io.cdap.wrangler.api.parser.Text;
import io.cdap.wrangler.api.parser.Token;

import static org.junit.Assert.assertEquals;


/**
 * Tests {@link RecipeCompiler}
 */
public class RecipeCompilerTest {

  private static final Compiler compiler = new RecipeCompiler();

  @Test
  public void testSuccessCompilation() throws Exception {
    try {
      Compiler compiler = new RecipeCompiler();
      CompileStatus status = compiler.compile(
          "parse-as-csv :body ' ' true;\n"
          + "set-column :abc, :edf;\n"
          + "send-to-error exp:{ window < 10 } ;\n"
          + "parse-as-simple-date :col 'yyyy-mm-dd' :col 'test' :col2,:col4,:col9 10 exp:{test < 10};\n"
      );

      Assert.assertNotNull(status.getSymbols());
      Assert.assertEquals(4, status.getSymbols().size());
    } catch (CompileException e) {
      Assert.assertTrue(false);
    }
  }

  @Test
  public void testMacroSkippingDuringParsing() throws Exception {
    String[] recipe = new String[] {
      "parse-as-csv :body ',' true;",
      "${macro1}",
      "${macro${number}}",
      "parse-as-csv :body '${delimiter}' true;"
    };
    CompileStatus status = TestingRig.compile(recipe);
    Assert.assertEquals(true, status.isSuccess());
  }

  @Test
  public void testSingleMacroLikeWranglerPlugin() throws Exception {
    String[] recipe = new String[] {
      "${directives}"
    };
    CompileStatus status = TestingRig.compile(recipe);
    Assert.assertEquals(true, status.isSuccess());
  }

  @Test
  public void testSparedPragmaLoadDirectives() throws Exception {
    String[] recipe = new String[] {
      "#pragma load-directives test1,test2,test3,test4,test5;",
      "${directives}",
      "#pragma load-directives root1,root2,root3;"
    };
    TestingRig.compileSuccess(recipe);
  }

  @Test
  public void testNestedMacros() throws Exception {
    String[] recipe = new String[] {
      "#pragma load-directives test1,test2,test3,test4,test5;",
      "${directives_${number}}"
    };
    TestingRig.compileSuccess(recipe);
  }

  @Test
  public void testSemiColonMissing() throws Exception {
    String[] recipe = new String[] {
      "#pragma load-directives test1,test2,test3,test4,test5",
      "${directives_${number}}"
    };
    TestingRig.compileFailure(recipe);
  }

  @Test
  public void testMissingOpenBraceOnMacro() throws Exception {
    String[] recipe = new String[] {
      "#pragma load-directives test1,test2,test3,test4,test5;",
      "$directives}"
    };
    TestingRig.compileFailure(recipe);
  }

  @Test
  public void testMissingCloseBraceOnMacro() throws Exception {
    String[] recipe = new String[] {
      "#pragma load-directives test1,test2,test3,test4,test5;",
      "${directives"
    };
    TestingRig.compileFailure(recipe);
  }

  @Test
  public void testMissingBothBraceOnMacro() throws Exception {
    String[] recipe = new String[] {
      "#pragma load-directives test1,test2,test3,test4,test5;",
      "${directives"
    };
    TestingRig.compileFailure(recipe);
  }

  @Test
  public void testMissingPragmaHash() throws Exception {
    String[] recipe = new String[] {
      "pragma load-directives test1,test2,test3,test4,test5;",
    };
    TestingRig.compileFailure(recipe);
  }

  @Test
  public void testTypograhicalErrorPragmaLoadDirectives() throws Exception {
    String[] recipe = new String[] {
      "pragma test1,test2,test3,test4,test5;",
    };
    TestingRig.compileFailure(recipe);
  }

  @Test
  public void testWithIfStatement() throws Exception {
    String[] recipe = new String[] {
      "#pragma load-directives test1,test2;",
      "${macro_1}",
      "if ((test > 10) && (window < 20)) {  parse-as-csv :body ',' true; if (window > 10) " +
        "{ send-to-error exp:{test > 10}; } }"
    };
    TestingRig.compileSuccess(recipe);
  }

  @Test
  public void testComplexExpression() throws Exception {
    String[] recipe = new String[] {
      "parse-as-csv body , true",
      "drop body",
      "merge body_1 body_2 Full_Name ' '",
      "drop body_1,body_2",
      "find-and-replace body_4 s/Washington//g",
      "send-to-error empty(body_4)",
      "send-to-error body_5 =~ \"DC.*\"",
      "filter-rows-on regex-match body_5 *as*"
    };
    CompileStatus compile = TestingRig.compile(recipe);
    Assert.assertTrue(true);
  }

  @Test
  public void test() throws Exception {
    String[] recipe = new String[] {
      "parse-as-csv body , true",
      "drop body",
      "merge body_1 body_2 Full_Name ' '",
      "drop body_1,body_2",
      "find-and-replace body_4 s/Washington//g",
      "send-to-error empty(body_4)",
      "send-to-error body_5 =~ \"DC.*\"",
      "filter-rows-on regex-match body_5 *as*"
    };
    CompileStatus compile = TestingRig.compile(recipe);
    Assert.assertTrue(true);
  }

  @Test
  public void testSingleLineDirectives() throws Exception {
    String[] recipe = new String[] {
      "parse-as-csv :body '\t' true; drop :body;"
    };
    CompileStatus compile = TestingRig.compile(recipe);
    Assert.assertTrue(true);
  }

  @Test
  public void testError() throws Exception {
    String[] recipe = new String[] {
      "parse-as-abababa-csv :body '\t' true; drop :body;"
    };
    CompileStatus compile = TestingRig.compile(recipe);
    Assert.assertTrue(true);
  }

  @Test
  public void testRecipePragmaWithCompiler() throws Exception {
    String[] recipe = new String[] {
      "#pragma load-directives test1,test2,test3,test4;",
      "${directives}"
    };
    CompileStatus compile = TestingRig.compile(recipe);
    Set<String> loadableDirectives = compile.getSymbols().getLoadableDirectives();
    Assert.assertEquals(4, loadableDirectives.size());
  }

  // testByteSizeParse
  @Test
  public void testByteSizeParse() throws Exception {
    String[] directives = new String[] { "parse-byte-size size" };
    CompileStatus status = compiler.compile(directives);
    RecipeSymbol symbol = status.getCompiledUnit();
    Iterator<TokenGroup> iterator = symbol.iterator();
    TokenGroup group = iterator.next();
    Iterator<Token> tokens = group.iterator();
    Assert.assertEquals("parse-byte-size", tokens.next().value());
    Assert.assertEquals("size", tokens.next().value());
    Assert.assertEquals(2, group.getTokens().size());
  }

  @Test
  public void testTimeDurationParse() throws Exception {
    String[] directives = new String[] { "parse-time-duration time" };
    CompileStatus status = compiler.compile(directives);
    RecipeSymbol symbol = status.getCompiledUnit();
    Iterator<TokenGroup> iterator = symbol.iterator();
    TokenGroup group = iterator.next();
    Iterator<Token> tokens = group.iterator();
    Assert.assertEquals("parse-time-duration", tokens.next().value());
    Assert.assertEquals("time", tokens.next().value());
    Assert.assertEquals(2, group.getTokens().size());
  }

  @Test
  public void testAggregateStatsParse() throws Exception {
    String[] directives = new String[] { "aggregate-stats :data_transfer_size :response_time total_size_mb total_time_sec MB s" };
    CompileStatus status = compiler.compile(directives);
    RecipeSymbol symbol = status.getCompiledUnit();
    Iterator<TokenGroup> iterator = symbol.iterator();
    TokenGroup group = iterator.next();
    List<Token> tokens = group.getTokens();
    Assert.assertEquals("aggregate-stats", tokens.get(0).value());
    Assert.assertEquals(":data_transfer_size", tokens.get(1).value());
    Assert.assertEquals(":response_time", tokens.get(2).value());
    Assert.assertEquals("total_size_mb", tokens.get(3).value());
    Assert.assertEquals("total_time_sec", tokens.get(4).value());
    Assert.assertEquals("MB", tokens.get(5).value());
    Assert.assertEquals("s", tokens.get(6).value());
    Assert.assertEquals(7, tokens.size());
  }
}
