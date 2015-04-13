package net.axelandre42.mct.server.architectures.modlang;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import li.cil.oc.api.machine.Architecture;
import li.cil.oc.api.machine.ExecutionResult;
import li.cil.oc.api.machine.Machine;

@Architecture.Name(value = "Modlang")
public class ModlangArchitecture implements Architecture {

	private boolean initialized = false;
	
	private Machine machine;
	
	@Override
	public boolean isInitialized() {
		// TODO Auto-generated method stub
		return initialized;
	}

	@Override
	public boolean recomputeMemory(Iterable<ItemStack> components) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean initialize() {
		// TODO Auto-generated method stub
		initialized = true;
		return true;
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void runSynchronized() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ExecutionResult runThreaded(boolean isSynchronizedReturn) {
		// TODO Auto-generated method stub
		
		return new ExecutionResult.Shutdown(false);
	}

	@Override
	public void onConnect() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void load(NBTTagCompound nbt) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void save(NBTTagCompound nbt) {
		// TODO Auto-generated method stub
		
	}

}
