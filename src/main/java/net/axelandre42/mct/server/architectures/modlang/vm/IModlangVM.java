package net.axelandre42.mct.server.architectures.modlang.vm;

public interface IModlangVM {
	Object[] run(Object[] args);
	void addNativeMethod(String name, INativeModlangMethod method);
}
