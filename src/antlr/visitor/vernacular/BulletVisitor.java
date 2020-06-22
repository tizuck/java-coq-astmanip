package antlr.visitor.vernacular;

import antlr.coqParser;
import antlr.visitor.GenericVisitor;
import model.toplevel.BulletType;

public class BulletVisitor extends GenericVisitor<BulletType> {

    @Override
    public BulletType visitSub(coqParser.SubContext ctx) {
        return BulletType.SUB;
    }

    @Override
    public BulletType visitAdd(coqParser.AddContext ctx) {
        return BulletType.ADD;
    }

    @Override
    public BulletType visitMul(coqParser.MulContext ctx) {
        return BulletType.MUL;
    }

    @Override
    public BulletType visitSub2(coqParser.Sub2Context ctx) {
        return BulletType.SUB2;
    }

    @Override
    public BulletType visitAdd2(coqParser.Add2Context ctx) {
        return BulletType.ADD2;
    }

    @Override
    public BulletType visitMul2(coqParser.Mul2Context ctx) {
        return BulletType.MUL2;
    }

    @Override
    public BulletType visitSub3(coqParser.Sub3Context ctx) {
        return BulletType.SUB3;
    }

    @Override
    public BulletType visitAdd3(coqParser.Add3Context ctx) {
        return BulletType.ADD3;
    }

    @Override
    public BulletType visitMul3(coqParser.Mul3Context ctx) {
        return BulletType.MUL3;
    }

    @Override
    public BulletType visitDot(coqParser.DotContext ctx) {
        return BulletType.DOT;
    }
}
