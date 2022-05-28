package com.scaler.parkinglot.repositories;

import com.scaler.parkinglot.models.Gate;
import com.scaler.parkinglot.models.ParkingLot;

import java.util.HashMap;
import java.util.Map;

public class ParkingLotRepository {
    private Map<Long, ParkingLot> parkingLotMap = new HashMap<>();
    private Map<Gate, ParkingLot> gateParkingLotMap = new HashMap<>();

    public ParkingLot save(ParkingLot parkingLot) {
        parkingLotMap.put(parkingLot.getId(), parkingLot);
        for (Gate gate: parkingLot.getGates()) {
            gateParkingLotMap.put(gate, parkingLot);
        }

        return parkingLot;
    }

    public ParkingLot getParkingLotWhereGatesContain(Gate gate) {
//        for (ParkingLot parkingLot: parkingLotMap.values()) {
//            if (parkingLot.getGates().contains(gate)) {
//                return parkingLot;
//            }
//        }
//        return null;
        if (gateParkingLotMap.containsKey(gate)) {
            return gateParkingLotMap.get(gate);
        }

        return null;
    }

}
