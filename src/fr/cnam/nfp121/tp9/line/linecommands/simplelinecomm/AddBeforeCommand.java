package fr.cnam.nfp121.tp9.line.linecommands.simplelinecomm;

import fr.cnam.nfp121.tp9.line.specification.Line;

public class AddBeforeCommand extends AddCommand {


    public AddBeforeCommand(Line a_Line) {
        super(a_Line);
    }

    public void executer() {
        LineComm.line.addBefore(this.getCarToInsert());
        LineComm.line.getPrinter().print();
    }

    @Override
    public final boolean isExecutable() {
        return LineComm.line.getCursorPos() > 0;
    }
}