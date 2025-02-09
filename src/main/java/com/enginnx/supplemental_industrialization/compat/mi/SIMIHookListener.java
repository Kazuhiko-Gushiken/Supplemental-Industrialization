package com.enginnx.supplemental_industrialization.compat.mi;


import net.swedz.tesseract.neoforge.compat.mi.hook.MIHookEntrypoint;
import net.swedz.tesseract.neoforge.compat.mi.hook.MIHookListener;
import net.swedz.tesseract.neoforge.compat.mi.hook.context.listener.MachineCasingsMIHookContext;
import net.swedz.tesseract.neoforge.compat.mi.hook.context.listener.MachineRecipeTypesMIHookContext;
import net.swedz.tesseract.neoforge.compat.mi.hook.context.listener.MultiblockMachinesMIHookContext;
import net.swedz.tesseract.neoforge.compat.mi.hook.context.listener.SingleBlockCraftingMachinesMIHookContext;

@MIHookEntrypoint
public final class SIMIHookListener implements MIHookListener {

    @Override void machineRecipeTypes(MachineRecipeTypesMIHookContext hook) {
        SIMachines.recipeTypes(hook);
    }
    @Override
    public void machineCasings(MachineCasingsMIHookContext hook) {
        SIMachines.casings(hook);
    }

    @Override
    public void multiblockMachines(MultiblockMachinesMIHookContext hook)
    {
        SIMachines.multiblocks(hook);
    }

    @Override
    public void singleBlockCraftingMachines(SingleBlockCraftingMachinesMIHookContext hook)
    {
        SIMachines.singleBlockCrafting(hook);
    }

    @Override
    public void tooltips()
    {
        SITooltips.init();
    }

}
