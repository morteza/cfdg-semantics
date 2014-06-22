/*******************************************************************************
 *        File: MarkdownParser.java
 *      Author: Morteza Ansarinia <ansarinia@me.com>
 *  Created on: Jan 15, 2014
 *     Project: RatMark
 *   Copyright: See the file "LICENSE" for the full license governing this code.
 *******************************************************************************/
package com.anytime.anymark;

import org.parboiled.Action;
import org.parboiled.BaseParser;
import org.parboiled.Context;
import org.parboiled.Rule;
import org.parboiled.annotations.BuildParseTree;
import org.parboiled.support.StringVar;
import org.parboiled.support.Var;

/**
 * PEG parser for Markdown.
 */

@BuildParseTree 
class MarkdownParser extends BaseParser<String> {
    
	// 
    Rule Document() {
        return Sequence(
        	OneOrMore(Line()),
        	new Action<String>() {
				public boolean run(Context<String> ctx) {
					StringBuilder html = new StringBuilder();
					while (ctx.getValueStack().size()>0){
						String partial = ctx.getValueStack().pop();
						html.append(partial);
					}
					ctx.getValueStack().push(html.toString());
					return true;
				}
			}
        ).suppressNode();
    }
    
    Rule Block() {
    	return null;
    }
    
    Rule Paragraph() {
    	return null;
    }
    
    Rule LineBreak() {
    	return null;
    }
    
    Rule Header() {
    	StringVar html = new StringVar("");
    	Var<Integer> level = new Var<Integer>();
        return Sequence(
            OneOrMore('#'),
            level.set(matchLength()),
            OneOrMore(Whitespace()),
            Inline(),
            html.append("<h" + level.get().toString() + ">"),
            html.append(match()),
            html.append("</h" + level.get().toString() + ">"),
            push(html.getAndSet(""))
        );
    }
    
    Rule Blockquote() {
    	return null;
    }
    
    Rule List() {
    	return null;
    }
    
    Rule OrderedList() {
    	return OneOrMore(
    				Sequence(
    					Number(),
    					'.',
    					ZeroOrMore(Whitespace()),
    					Inline(), 
    					/*ACTION*/ push("<li>"+match()+"</li>")
    				)
    	);
    }
    
    Rule UnorderedList() {
    	return null;
    }
    
    Rule CodeBlock() {
    	return null;
    }
    
    Rule HorizontalRule() {
    	return null;
    }
    
    Rule SpanElement() {
    	return null;
    }
    
    Rule Link() {
    	return null;
    }
    
    Rule InlineLink() {
    	return null;
    }
    
    Rule ReferenceLink() {
    	return null;
    }
    
    Rule AutoLink() {
    	return null;
    }
    
    Rule Emphasis() {
    	return null;
    }
    
    Rule Strong() {
    	return null;
    }
    
    Rule CodeSpan() {
    	return null;
    }

    Rule Image() {
    	return null;
    }
    
    Rule InlineImage() {
    	return null;
    }
    
    Rule ReferenceImage() {
    	return null;
    }

    Rule BackslashEscape() {
    	return null;
    }
    
    Rule BOM() {
    	return String('\357','\273','\277');
    }
    
    Rule Line() {
        return Sequence(
        		FirstOf(
        			Header(),
        			Sequence(OrderedList(), push("<ol>"+pop()+"</ol>")),
        			Inline(),
        			Empty()
        		),
        		FirstOf(EndOfLine(), EOI)
        );
    }

    Rule Empty() {
    	return Sequence(
    			ZeroOrMore(Whitespace()),
    			EndOfLine()
    	);
    }

    Rule ListItem() {
    	StringVar html = new StringVar("");
    	return Sequence(
    			FirstOf(
    				'*',
    				'-',
    				'+'
    			),
    			OneOrMore(Whitespace()),
    			Inline(),
    			html.append("</li>"),
    			push(html.getAndSet(""))
    	);
    }
    
    Rule Inline() {
    	return OneOrMore(TestNot(EndOfLine()), ANY);
    }
    
    Rule Number() {
        return OneOrMore(
        		CharRange('0', '9')
        );
    }
    
    Rule Whitespace() {
    	return AnyOf(" \t");
    }

    Rule EndOfParagraph() {
    	return NTimes(2, EndOfLine());
    }
    
    Rule EndOfLine() {
    	return Sequence(
    				Optional('\r'),
    				'\n'
    	);
    }
}
