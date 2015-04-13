package net.axelandre42.mct.server.architectures.modlang.vm;

public interface IModlangContext {
	Object[] invoke(String name, Object[] args);
	
}
