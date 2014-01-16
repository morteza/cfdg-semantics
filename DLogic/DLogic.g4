// WORK IN PROGRESS

grammar DLogic;

/**
 * Put it in simple words, decriptive logic is a subset of first order logic,
 * which is decidible.
 **/

kb: tbox abox EOF;

axiom: terminological_axioms | assertional_axioms;

terminological_axioms: ; //TODO
assertional_axioms: ; //TODO

// ALC Concepts, smallest set
concept:
         TOP_CONCEPT
       | atomic_concept 
       | BOTTOM_CONCEPT
       | concept OR concept
       | concept AND concept
       | NOT concept
       | UNIVERSAL_RESTRICTION role concept
       | EXISTENTIAL_RESTRICTION role concept;

role: ;

individual: NAMED_INDIVIDUAL;

atomic_concept: NAMED_CONCEPT;

general_concept_inclusion: concept IS_A concept;

concept_equivalence: concept EQUALS concept;

concept_definition: concept EQUALS concept;

// ABOX is a finite set!
abox: (concept_assertion | role_assertion)*;

// TBOX is a finite set!
tbox: (general_concept_inclusion)*;

concept_assertion: individual IS_A concept;

role_assertion: individual role individual;

NAMED_VARIABLE: '?' (('a'..'z') | ('0'..'9')) CHARACTER*;
NAMED_INDIVIDUAL: (('a'..'z') | ('0'..'9')) CHARACTER*;
NAMED_CONCEPT: ('A'..'Z') CHARACTER*;

UNIVERSAL_RESTRICTION :  'forall' ;
EXISTENTIAL_RESTRICTION :  'exists' ;

INCLUSION: 'includes';
EQUALS: 'equals';
IS_A: ':';

TOP_CONCEPT: 'top';
BOTTOM_CONCEPT: 'bottom';

AND :  '&';
OR :  '|';
NOT :  '!';

LPARAN: '(';
RPARAN: ')';

fragment CHARACTER: ('0'..'9' | 'a'..'z' | 'A'..'Z' | '_');

WS : [ \t\r\n]+ -> skip;
