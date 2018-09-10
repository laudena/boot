package com.das_boot.boot;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.boot.controller.ShipwreckController;
import com.boot.model.Shipwreck;

public class ShipwreckControllerTest {
	@Test
	public void testShipwreckGet() {
		ShipwreckController sc =new ShipwreckController();
		Shipwreck wreck = sc.get(1L);
		assertEquals(1L,  wreck.getId().longValue());
	}
}
