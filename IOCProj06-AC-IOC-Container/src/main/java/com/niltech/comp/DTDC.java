package com.niltech.comp;

public final class DTDC implements Courier {
	
	public DTDC() {
		System.out.println("DTDC.0-param constructor");
	}

	@Override
	public String deliver(int oid) {
		return oid+"Order is delivered by DTDC";
	}

}
