package net.axelandre42.mct.server.architectures.modlang.vm;

public interface INativeModlangMethod {
	Object[] call(IModlangContext context, Object[] args);
}
