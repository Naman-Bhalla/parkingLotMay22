- Start by implementing the models
- Either take the values via a constructor or instantiate
- within the class



- TO make a feature completely working, we often need to build
- some helper classes (like Commands etc.). These classes are
- same for all the features so only need to be implemented once.

CLient -> Controller -> Service -> Repository

Use Case:
- Ability to create a ticket

Assignment:
1. Make GenerateTicketRequestDto only take entry_gate_id and vehicle_type and vehicle_number
   - Save the vehicle in the database (VehicleRepository)
   - Fetch the Gate with that Id (EntryGateRepository)
2. Implement GenerateBill
   - Implement FeesCalculatorStrategy
   - Store the bill in the database (BillRepository)
   - BillController
   - BillService