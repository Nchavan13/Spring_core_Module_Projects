package com.niltech.comp;

public final class DHL implements Courier {

	public DHL() {
		System.out.println("DHL.0-param constructor");
	}

	@Override
	public String deliver(int oid) {
		return oid + "Order is delivered by DHL";
	}

}
