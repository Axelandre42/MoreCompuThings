package net.axelandre42.mct.server.architectures.assembler;

import net.axelandre42.mct.server.architectures.assembler.AssemblerVM.AssemblerMemory;
import net.axelandre42.mct.server.architectures.assembler.AssemblerVM.NativeAssemblerOp;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import li.cil.oc.api.machine.Machine;
import li.cil.oc.api.machine.Architecture;
import li.cil.oc.api.machine.ExecutionResult;

@Architecture.Name(value = "Assembler")
public class AssemblerArchitecture implements Architecture {

	private boolean initialized = false;
	
	private Machine machine;
	
	private AssemblerVM vm;
	
	public AssemblerArchitecture(Machine machine) {
		// TODO Auto-generated constructor stub
		this.machine = machine;
	}
	
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
		vm = new AssemblerVM();
		vm.init();
		
		vm.addNativeOp("CALL", new NativeAssemblerOp() {
			
			@Override
			public void invoke(AssemblerMemory memory, int[] args) throws Exception {
				// TODO Auto-generated method stub
				String address = (String) memory.get(args[0]);
				String method = (String) memory.get(args[1]);
				
				Object[] objArgs = new Object[args.length - 2];
				for (int i = 2; i < args.length; i++) {
					
				}
			}
		});
		
		initialized = true;
		return true;
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
		initialized = false;
	}

	@Override
	public void runSynchronized() {
		// TODO Auto-generated method stub

	}

	@Override
	public ExecutionResult runThreaded(boolean isSynchronizedReturn) {
		// TODO Auto-generated method stub
		return null;
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
