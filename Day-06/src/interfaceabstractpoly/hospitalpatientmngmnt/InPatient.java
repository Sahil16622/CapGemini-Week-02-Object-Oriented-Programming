package interfaceabstractpoly.hospitalpatientmngmnt;

class InPatient extends Patient implements MedicalRecord {
    private double roomCharge;
    private double treatmentCost;
    private String[] records = new String[5];
    private int recordCount = 0;

    public InPatient(String patientId, String name, int age, double roomCharge, double treatmentCost) {
        super(patientId, name, age);
        this.roomCharge = roomCharge;
        this.treatmentCost = treatmentCost;
    }

    @Override
    public double calculateBill() {
        return roomCharge + treatmentCost;
    }

    @Override
    public void addRecord(String record) {
        if (recordCount < records.length) {
            records[recordCount++] = record;
            System.out.println("Record added for In-Patient: " + record);
        } else {
            System.out.println("No more records can be added.");
        }
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical Records for In-Patient:");
        for (int i = 0; i < recordCount; i++) {
            System.out.println("- " + records[i]);
        }
    }
}
