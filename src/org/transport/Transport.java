package org.transport;

import org.air.Air;
import org.road.Road;
import org.water.Water;

public class Transport {

	public void TransportForm() {
		System.out.println("TransportForm");

	}
	public static void main(String[] args) {
		Transport tr=new Transport();
		Air a=new Air();
		Road r=new Road();
		Water w=new Water();
		tr.TransportForm();
		a.aeroPlane();
		a.heliCopter();
		w.Boat();
		w.Ship();
		r.bike();
		r.bus();
		r.car();
		r.cycle();
	}

}
