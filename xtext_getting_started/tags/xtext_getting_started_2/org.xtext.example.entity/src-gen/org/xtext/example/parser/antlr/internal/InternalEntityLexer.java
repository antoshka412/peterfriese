package org.xtext.example.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalEntityLexer extends Lexer {
    public static final int RULE_ID=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=8;
    public static final int Tokens=19;
    public static final int RULE_ML_COMMENT=7;
    public static final int RULE_STRING=6;
    public static final int RULE_INT=5;
    public static final int T11=11;
    public static final int T12=12;
    public static final int T13=13;
    public static final int T14=14;
    public static final int RULE_WS=9;
    public static final int T15=15;
    public static final int T16=16;
    public static final int T17=17;
    public static final int T18=18;
    public InternalEntityLexer() {;} 
    public InternalEntityLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g"; }

    // $ANTLR start T11
    public final void mT11() throws RecognitionException {
        try {
            int _type = T11;
            // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:10:5: ( 'typedef' )
            // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:10:7: 'typedef'
            {
            match("typedef"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T11

    // $ANTLR start T12
    public final void mT12() throws RecognitionException {
        try {
            int _type = T12;
            // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:11:5: ( 'mapsto' )
            // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:11:7: 'mapsto'
            {
            match("mapsto"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T12

    // $ANTLR start T13
    public final void mT13() throws RecognitionException {
        try {
            int _type = T13;
            // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:12:5: ( '.' )
            // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:12:7: '.'
            {
            match('.'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T13

    // $ANTLR start T14
    public final void mT14() throws RecognitionException {
        try {
            int _type = T14;
            // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:13:5: ( 'entity' )
            // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:13:7: 'entity'
            {
            match("entity"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T14

    // $ANTLR start T15
    public final void mT15() throws RecognitionException {
        try {
            int _type = T15;
            // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:14:5: ( 'extends' )
            // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:14:7: 'extends'
            {
            match("extends"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T15

    // $ANTLR start T16
    public final void mT16() throws RecognitionException {
        try {
            int _type = T16;
            // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:15:5: ( '{' )
            // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:15:7: '{'
            {
            match('{'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T16

    // $ANTLR start T17
    public final void mT17() throws RecognitionException {
        try {
            int _type = T17;
            // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:16:5: ( '}' )
            // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:16:7: '}'
            {
            match('}'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T17

    // $ANTLR start T18
    public final void mT18() throws RecognitionException {
        try {
            int _type = T18;
            // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:17:5: ( '*' )
            // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:17:7: '*'
            {
            match('*'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T18

    // $ANTLR start RULE_ID
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:444:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:444:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:444:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:444:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:444:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ID

    // $ANTLR start RULE_INT
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:446:10: ( ( '0' .. '9' )+ )
            // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:446:12: ( '0' .. '9' )+
            {
            // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:446:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:446:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_INT

    // $ANTLR start RULE_STRING
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:448:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:448:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:448:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("448:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:448:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:448:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFE')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:448:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:448:62: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:448:82: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:448:87: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFE')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:448:88: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:448:129: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_STRING

    // $ANTLR start RULE_ML_COMMENT
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:450:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:450:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:450:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFE')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFE')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:450:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ML_COMMENT

    // $ANTLR start RULE_SL_COMMENT
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:452:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:452:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:452:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFE')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:452:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:452:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:452:41: ( '\\r' )? '\\n'
                    {
                    // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:452:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:452:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_SL_COMMENT

    // $ANTLR start RULE_WS
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:454:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:454:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:454:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_WS

    // $ANTLR start RULE_ANY_OTHER
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:456:16: ( . )
            // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:456:18: .
            {
            matchAny(); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ANY_OTHER

    public void mTokens() throws RecognitionException {
        // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:1:8: ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=15;
        int LA12_0 = input.LA(1);

        if ( (LA12_0=='t') ) {
            int LA12_1 = input.LA(2);

            if ( (LA12_1=='y') ) {
                int LA12_16 = input.LA(3);

                if ( (LA12_16=='p') ) {
                    int LA12_30 = input.LA(4);

                    if ( (LA12_30=='e') ) {
                        int LA12_34 = input.LA(5);

                        if ( (LA12_34=='d') ) {
                            int LA12_38 = input.LA(6);

                            if ( (LA12_38=='e') ) {
                                int LA12_42 = input.LA(7);

                                if ( (LA12_42=='f') ) {
                                    int LA12_46 = input.LA(8);

                                    if ( ((LA12_46>='0' && LA12_46<='9')||(LA12_46>='A' && LA12_46<='Z')||LA12_46=='_'||(LA12_46>='a' && LA12_46<='z')) ) {
                                        alt12=9;
                                    }
                                    else {
                                        alt12=1;}
                                }
                                else {
                                    alt12=9;}
                            }
                            else {
                                alt12=9;}
                        }
                        else {
                            alt12=9;}
                    }
                    else {
                        alt12=9;}
                }
                else {
                    alt12=9;}
            }
            else {
                alt12=9;}
        }
        else if ( (LA12_0=='m') ) {
            int LA12_2 = input.LA(2);

            if ( (LA12_2=='a') ) {
                int LA12_18 = input.LA(3);

                if ( (LA12_18=='p') ) {
                    int LA12_31 = input.LA(4);

                    if ( (LA12_31=='s') ) {
                        int LA12_35 = input.LA(5);

                        if ( (LA12_35=='t') ) {
                            int LA12_39 = input.LA(6);

                            if ( (LA12_39=='o') ) {
                                int LA12_43 = input.LA(7);

                                if ( ((LA12_43>='0' && LA12_43<='9')||(LA12_43>='A' && LA12_43<='Z')||LA12_43=='_'||(LA12_43>='a' && LA12_43<='z')) ) {
                                    alt12=9;
                                }
                                else {
                                    alt12=2;}
                            }
                            else {
                                alt12=9;}
                        }
                        else {
                            alt12=9;}
                    }
                    else {
                        alt12=9;}
                }
                else {
                    alt12=9;}
            }
            else {
                alt12=9;}
        }
        else if ( (LA12_0=='.') ) {
            alt12=3;
        }
        else if ( (LA12_0=='e') ) {
            switch ( input.LA(2) ) {
            case 'x':
                {
                int LA12_20 = input.LA(3);

                if ( (LA12_20=='t') ) {
                    int LA12_32 = input.LA(4);

                    if ( (LA12_32=='e') ) {
                        int LA12_36 = input.LA(5);

                        if ( (LA12_36=='n') ) {
                            int LA12_40 = input.LA(6);

                            if ( (LA12_40=='d') ) {
                                int LA12_44 = input.LA(7);

                                if ( (LA12_44=='s') ) {
                                    int LA12_48 = input.LA(8);

                                    if ( ((LA12_48>='0' && LA12_48<='9')||(LA12_48>='A' && LA12_48<='Z')||LA12_48=='_'||(LA12_48>='a' && LA12_48<='z')) ) {
                                        alt12=9;
                                    }
                                    else {
                                        alt12=5;}
                                }
                                else {
                                    alt12=9;}
                            }
                            else {
                                alt12=9;}
                        }
                        else {
                            alt12=9;}
                    }
                    else {
                        alt12=9;}
                }
                else {
                    alt12=9;}
                }
                break;
            case 'n':
                {
                int LA12_21 = input.LA(3);

                if ( (LA12_21=='t') ) {
                    int LA12_33 = input.LA(4);

                    if ( (LA12_33=='i') ) {
                        int LA12_37 = input.LA(5);

                        if ( (LA12_37=='t') ) {
                            int LA12_41 = input.LA(6);

                            if ( (LA12_41=='y') ) {
                                int LA12_45 = input.LA(7);

                                if ( ((LA12_45>='0' && LA12_45<='9')||(LA12_45>='A' && LA12_45<='Z')||LA12_45=='_'||(LA12_45>='a' && LA12_45<='z')) ) {
                                    alt12=9;
                                }
                                else {
                                    alt12=4;}
                            }
                            else {
                                alt12=9;}
                        }
                        else {
                            alt12=9;}
                    }
                    else {
                        alt12=9;}
                }
                else {
                    alt12=9;}
                }
                break;
            default:
                alt12=9;}

        }
        else if ( (LA12_0=='{') ) {
            alt12=6;
        }
        else if ( (LA12_0=='}') ) {
            alt12=7;
        }
        else if ( (LA12_0=='*') ) {
            alt12=8;
        }
        else if ( (LA12_0=='^') ) {
            int LA12_8 = input.LA(2);

            if ( ((LA12_8>='A' && LA12_8<='Z')||LA12_8=='_'||(LA12_8>='a' && LA12_8<='z')) ) {
                alt12=9;
            }
            else {
                alt12=15;}
        }
        else if ( ((LA12_0>='A' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='a' && LA12_0<='d')||(LA12_0>='f' && LA12_0<='l')||(LA12_0>='n' && LA12_0<='s')||(LA12_0>='u' && LA12_0<='z')) ) {
            alt12=9;
        }
        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {
            alt12=10;
        }
        else if ( (LA12_0=='\"') ) {
            int LA12_11 = input.LA(2);

            if ( ((LA12_11>='\u0000' && LA12_11<='\uFFFE')) ) {
                alt12=11;
            }
            else {
                alt12=15;}
        }
        else if ( (LA12_0=='\'') ) {
            int LA12_12 = input.LA(2);

            if ( ((LA12_12>='\u0000' && LA12_12<='\uFFFE')) ) {
                alt12=11;
            }
            else {
                alt12=15;}
        }
        else if ( (LA12_0=='/') ) {
            switch ( input.LA(2) ) {
            case '/':
                {
                alt12=13;
                }
                break;
            case '*':
                {
                alt12=12;
                }
                break;
            default:
                alt12=15;}

        }
        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
            alt12=14;
        }
        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='(' && LA12_0<=')')||(LA12_0>='+' && LA12_0<='-')||(LA12_0>=':' && LA12_0<='@')||(LA12_0>='[' && LA12_0<=']')||LA12_0=='`'||LA12_0=='|'||(LA12_0>='~' && LA12_0<='\uFFFE')) ) {
            alt12=15;
        }
        else {
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 12, 0, input);

            throw nvae;
        }
        switch (alt12) {
            case 1 :
                // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:1:10: T11
                {
                mT11(); 

                }
                break;
            case 2 :
                // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:1:14: T12
                {
                mT12(); 

                }
                break;
            case 3 :
                // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:1:18: T13
                {
                mT13(); 

                }
                break;
            case 4 :
                // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:1:22: T14
                {
                mT14(); 

                }
                break;
            case 5 :
                // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:1:26: T15
                {
                mT15(); 

                }
                break;
            case 6 :
                // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:1:30: T16
                {
                mT16(); 

                }
                break;
            case 7 :
                // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:1:34: T17
                {
                mT17(); 

                }
                break;
            case 8 :
                // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:1:38: T18
                {
                mT18(); 

                }
                break;
            case 9 :
                // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:1:42: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 10 :
                // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:1:50: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 11 :
                // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:1:59: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 12 :
                // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:1:71: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 13 :
                // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:1:87: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 14 :
                // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:1:103: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 15 :
                // ../org.xtext.example.entity/src-gen/org/xtext/example/parser/antlr/internal/InternalEntity.g:1:111: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


 

}