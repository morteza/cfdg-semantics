import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import org.antlr.stringtemplate.*;

public class BibTeXTest {
  public static void main(String[] args) throws Exception {

    // parse the file 'test.bib'
    BibTexLexer lexer = new BibTexLexer(new ANTLRFileStream("test.bib"));
    BibTexParser parser = new BibTexParser(new CommonTokenStream(lexer));

    // you can use the following tree in your code
    // see: http://www.antlr.org/api/Java/classorg_1_1antlr_1_1runtime_1_1tree_1_1_common_tree.html
    CommonTree tree = (CommonTree)parser.parse().getTree();

    // print a DOT tree of our AST
    DOTTreeGenerator gen = new DOTTreeGenerator();
    StringTemplate st = gen.toDOT(tree);
    System.out.println(st);
  }
}