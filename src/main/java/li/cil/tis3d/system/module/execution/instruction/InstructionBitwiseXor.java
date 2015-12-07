package li.cil.tis3d.system.module.execution.instruction;

import li.cil.tis3d.system.module.execution.Machine;
import li.cil.tis3d.system.module.execution.MachineState;
import li.cil.tis3d.system.module.execution.target.Target;

public final class InstructionBitwiseXor extends AbstractInstructionRead {
    public InstructionBitwiseXor(final Target source) {
        super(source);
    }

    @Override
    protected void doStep(final Machine machine, final int value) {
        final MachineState state = machine.getState();
        state.acc ^= value;
        state.pc++;
    }

    @Override
    public String toString() {
        return "XOR " + source;
    }
}