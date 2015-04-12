package net.axelandre42.mct.server.architectures.assembler;

import java.util.HashMap;
import java.util.Map;

public class AssemblerVM {
	public static interface NativeAssemblerOp {
		void invoke(AssemblerMemory memory, int[] args) throws Exception;
	}
	
	public static class AssemblerMemory {
		private Object[] memory;
		
		public AssemblerMemory(int size) {
			memory = new Object[size]; 
		}
		
		public Object get(int index) {
			return memory[index];
		}
		
		public void set(int index, Object val) {
			
		}
	}
	
	private Map<String, NativeAssemblerOp> ops = new HashMap<String, AssemblerVM.NativeAssemblerOp>();
	
	public void init() {
		addNativeOp("ADD", new NativeAssemblerOp() {
			
			@Override
			public void invoke(AssemblerMemory memory, int[] args) {
				// TODO Auto-generated method stub
			}
		});
		addNativeOp("DEF", new NativeAssemblerOp() {
			

			@Override
			public void invoke(AssemblerMemory memory, int[] args) {
				// TODO Auto-generated method stub
			}
		});
	}
	
	public Object[] run(Object[] args) throws Exception {
		
		return null;
	}
	
	public void addNativeOp(String opcode, NativeAssemblerOp op) {
		ops.put(opcode, op);
	}
	
}
