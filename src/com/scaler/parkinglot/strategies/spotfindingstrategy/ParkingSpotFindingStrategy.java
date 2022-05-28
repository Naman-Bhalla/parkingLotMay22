package com.scaler.parkinglot.strategies.spotfindingstrategy;

import com.scaler.parkinglot.models.ParkingLot;
import com.scaler.parkinglot.models.ParkingSpot;
import com.scaler.parkinglot.models.VehicleType;

public interface ParkingSpotFindingStrategy {
    ParkingSpot getAvailableSpot(VehicleType vehicleType, ParkingLot parkingLot);
}
