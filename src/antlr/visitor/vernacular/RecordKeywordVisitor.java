package antlr.visitor.vernacular;

import antlr.coqParser;
import antlr.visitor.GenericVisitor;
import model.vernacular.utilities.RecordKeywordType;

public class RecordKeywordVisitor extends GenericVisitor<RecordKeywordType> {

    @Override
    public RecordKeywordType visitRecordRecord(coqParser.RecordRecordContext ctx) {
        return RecordKeywordType.RECORD;
    }

    @Override
    public RecordKeywordType visitInductiveRecord(coqParser.InductiveRecordContext ctx) {
        return RecordKeywordType.INDUCTIVE;
    }

    @Override
    public RecordKeywordType visitCoinductiveRecord(coqParser.CoinductiveRecordContext ctx) {
        return RecordKeywordType.COINDUCTIVE;
    }
}
