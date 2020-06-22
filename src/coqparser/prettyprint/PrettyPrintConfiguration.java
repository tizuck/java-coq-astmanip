package coqparser.prettyprint;

public class PrettyPrintConfiguration {

    public enum IndentType {
        SPACES,
        TABS
    }

    public static final int FORALLPREC = 100;
    public static final int EXISTSPREC = 100;
    public static final int EXISTS2PREC = 100;
    public static final int EXISTSEXCLAMPREC = 100;
    public static final int FUNPREC = 100;
    public static final int FIXPREC = 100;
    public static final int COFIXPREC = 100;
    public static final int LETPREC = 100;
    public static final int IFPREC = 100;
    public static final int PROJECTIONPREC = 100;
    public static final int RECORDPREC = 100;
    //Precedence of At needs to be a little higher than application because otherwise
    //a term like f_equal (@ projT1  _ _) p
    //results in a parse tree where parenthesis can not be reproduced
    public static final int ATPREC = 41;
    public static final int IMPLIESPREC = 99;
    public static final int EQUIVPREC = 95;
    public static final int ORPREC = 85;
    public static final int ANDPREC = 80;
    public static final int TILDEPREC = 75;
    public static final int COLGPREC = 74;
    public static final int LCOLPREC = 73;
    public static final int COLONPREC = 72;
    public static final int COMPAREPREC = 70;
    public static final int LISTPREC = 60;
    public static final int ADDSUBMODPREC = 50;
    public static final int MULTDIVAPPPREC = 40;
    public static final int NEGPREC = 35;
    public static final int POWPREC = 30;
    public static final int HIGHESTPREC = 100;
    public static final int LOWESTPREC = 30;
    //If this precedence is set on 10 we get an error in file Logic.v
    //The solution to this is to set REWPREC on the same level as forall etc.
    //but the terms in a RewTerm to precedenc-level 10
    public static final int REWPREC = 45;



    private IndentType indentType = IndentType.SPACES;
    private String endOfLineCharacter = "\n";

    private PrettyPrintConfiguration(IndentType indentType){
        this.indentType = indentType;
    }

    public static PrettyPrintConfiguration fromIndentType(IndentType indentType){
        return new PrettyPrintConfiguration(indentType);
    }

    public IndentType getIndentType() {
        return indentType;
    }

    public String getEOL() {
        return endOfLineCharacter;
    }

    public String getIndent(int indentLevel){
        if(indentType == IndentType.SPACES){
            return repeat("    ",indentLevel);
        } else {
            return repeat("\t",indentLevel);
        }
    }

    private String repeat(String str,int times){
        return new String(new char[times]).replace("\0",str);
    }

}
