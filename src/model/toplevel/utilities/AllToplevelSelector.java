package model.toplevel.utilities;

public class AllToplevelSelector implements ToplevelSelector {

    @Override
    public boolean equals(Object obj) {
        return obj instanceof AllToplevelSelector;
    }

    public AllToplevelSelector() {
    }
}
