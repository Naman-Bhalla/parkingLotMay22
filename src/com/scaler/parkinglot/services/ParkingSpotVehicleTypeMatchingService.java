package com.scaler.parkinglot.services;

import com.scaler.parkinglot.models.ParkingSpot;
import com.scaler.parkinglot.models.SpotType;
import com.scaler.parkinglot.models.VehicleType;
import com.scaler.parkinglot.strategies.spotfindingstrategy.ParkingSpotFindingStrategy;

public class ParkingSpotVehicleTypeMatchingService  {

    public boolean matches(SpotType spotType, VehicleType vehicleType) {
        return switch (spotType) {
            case LARGE -> vehicleType.equals(VehicleType.LARGE);
            case SMALL -> vehicleType.equals(VehicleType.SMALL);
            case ELECTRIC -> vehicleType.equals(VehicleType.ELECTRIC);
            case MEDIUM -> vehicleType.equals(VehicleType.MEDIUM);
        };
    }
}
