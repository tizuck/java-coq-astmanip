package coqparser.prettyprint;

public class IndentationLevel {

    private int indentation;

    public IndentationLevel(){
        indentation = 0;
    }

    public IndentationLevel(int indentation){
        this.indentation = indentation;
    }

    public void increment(){
        indentation++;
    }

    public void decrement(){
        if (indentation > 0){
            indentation--;
        }
        else {
            throw new IllegalStateException("Cannot decrement as indentationlevel is allready 0");
        }
    }

    public int getIndentation() {
        return indentation;
    }
}
