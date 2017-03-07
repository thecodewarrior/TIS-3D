package li.cil.tis3d.common.module.execution.instruction;

import li.cil.tis3d.common.module.execution.Machine;
import li.cil.tis3d.common.module.execution.MachineState;
import li.cil.tis3d.common.module.execution.target.Target;

public final class InstructionDynMode extends AbstractInstructionRead {

    public InstructionDynMode(Target source) {
        super(source);
    }

    @Override
    protected void doStep(Machine machine, int value) {
        final MachineState state = machine.getState();
        state.dynEnabled = value != 0;
        state.pc++;
    }

    @Override
    public String toString() {
        return "DYM " + source;
    }
}
