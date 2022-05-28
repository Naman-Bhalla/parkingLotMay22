package com.scaler.parkinglot.dto;

import com.scaler.parkinglot.models.EntryGate;
import com.scaler.parkinglot.models.Vehicle;
import com.scaler.parkinglot.models.VehicleType;

public class GenerateTicketRequestDto {
    private Vehicle vehicle;
    private EntryGate entryGate;

//    private Long entryGateId;
//    private String vehicleNumber;
//    private VehicleType vehicleType;

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public EntryGate getEntryGate() {
        return entryGate;
    }

    public void setEntryGate(EntryGate entryGate) {
        this.entryGate = entryGate;
    }
}
