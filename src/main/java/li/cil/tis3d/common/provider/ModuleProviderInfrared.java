package li.cil.tis3d.common.provider;

import cpw.mods.fml.common.registry.GameRegistry;
import li.cil.tis3d.Constants;
import li.cil.tis3d.api.API;
import li.cil.tis3d.api.Casing;
import li.cil.tis3d.api.Face;
import li.cil.tis3d.api.module.Module;
import li.cil.tis3d.api.module.ModuleProvider;
import li.cil.tis3d.system.module.ModuleInfrared;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * The provider for the infrared module.
 */
public final class ModuleProviderInfrared implements ModuleProvider {
    private final Item ITEM_MODULE_INFRARED = GameRegistry.findItem(API.MOD_ID, Constants.NAME_ITEM_MODULE_INFRARED);

    @Override
    public boolean worksWith(final ItemStack stack, final Casing casing, final Face face) {
        return stack.getItem() == ITEM_MODULE_INFRARED;
    }

    @Override
    public Module createModule(final ItemStack stack, final Casing casing, final Face face) {
        return new ModuleInfrared(casing, face);
    }
}