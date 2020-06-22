package coqparser.prettyprint;

public class PrettyPrintContext {

    /**
     * Der Assoziationstyp des aktuellen Knotens kann festgelegt werden
     */
    public enum AssocType {
        RIGHT,
        LEFT,
        //Existiert, da z.B. a = b weder links noch rechtsassoziativ ist. Auf beiden seiten muss, wenn = nochmal als OpsTerm auftaucht sofort geklammert werden
        NONE,
        //Exisitiert für Forall Terme etc.
        ASSOCLESS
    }

    private IndentationLevel indentationLevel;

    private TREETYPE treetype;

    private int precedence;

    public PrettyPrintContext(int indentationLevel, int precedence, TREETYPE treetype){
        this.indentationLevel = new IndentationLevel(indentationLevel);
        this.treetype = treetype;
        this.precedence = precedence;
    }

    /**
     * Defines which branch was used in a previous step
     */
    public enum TREETYPE{
        RIGHT,
        LEFT,
        MULTI,
        NONE
    }

    public IndentationLevel getIndentationLevel() {
        return indentationLevel;
    }

    public TREETYPE getTreetype() {
        return treetype;
    }

    public int getPrecedence() {
        return precedence;
    }

    public String indentExpression(String expression,PrettyPrintConfiguration prettyPrintConfiguration,int offset){
        return prettyPrintConfiguration.getIndent(this.getIndentationLevel().getIndentation() + offset) + expression;
    }


    public String parenthesizeExpression(String expression, int shallPrec, AssocType assoctype){
        switch(assoctype){
            case RIGHT :  {
                switch (treetype) {
                    case LEFT: {
                        if(precedence > shallPrec){
                            return expression;
                        }
                        else {
                            return "(" + expression + ")";
                        }
                    }
                    case RIGHT : {
                        if(precedence >= shallPrec){
                            return expression;
                        }
                        else {
                            return "(" + expression + ")";
                        }
                    }
                    case MULTI : {
                        if(precedence >= shallPrec){
                            return expression;
                        }
                        else {
                            return "(" + expression + ")";
                        }
                    }
                }
            }
            case LEFT : {
                switch (treetype) {
                    case LEFT: {
                        if(precedence >= shallPrec){
                            return expression;
                        }
                        else {
                            return "(" + expression + ")";
                        }
                    }
                    case RIGHT : {
                        if(precedence > shallPrec){
                            return expression;
                        }
                        else {
                            return "(" + expression + ")";
                        }
                    }
                    case MULTI : {
                        if(precedence >= shallPrec){
                            return expression;
                        }
                        else {
                            return "(" + expression + ")";
                        }
                    }
                }
            }
            case NONE: {
                if(precedence > shallPrec){
                    return expression;
                }
                else {
                    return "(" + expression + ")";
                }
            }
            case ASSOCLESS : {
                if(precedence >= shallPrec){
                    return expression;
                }
                else {
                    return "(" + expression + ")";
                }
            }
            default : {
                if(precedence >= shallPrec){
                    return expression;
                }
                else {
                    return "(" + expression + ")";
                }
            }
        }
    }
}
