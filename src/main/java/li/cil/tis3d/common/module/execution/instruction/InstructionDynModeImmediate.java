package li.cil.tis3d.common.module.execution.instruction;

import li.cil.tis3d.common.module.execution.Machine;
import li.cil.tis3d.common.module.execution.MachineState;

public final class InstructionDynModeImmediate implements Instruction {
    public final short value;

    public InstructionDynModeImmediate(final short value) {
        this.value = value;
    }

    @Override
    public void step(final Machine machine) {
        final MachineState state = machine.getState();
        state.dynEnabled = value != 0;
        state.pc++;
    }

    @Override
    public String toString() {
        return "DYN " + value;
    }
}
