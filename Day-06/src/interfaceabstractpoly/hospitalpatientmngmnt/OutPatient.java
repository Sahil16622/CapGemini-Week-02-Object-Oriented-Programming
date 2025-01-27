package interfaceabstractpoly.hospitalpatientmngmnt;

// OutPatient class
class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private String[] records = new String[5];
    private int recordCount = 0;

    public OutPatient(String patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
    }

    @Override
    public double calculateBill() {
        return consultationFee;
    }

    @Override
    public void addRecord(String record) {
        if (recordCount < records.length) {
            records[recordCount++] = record;
            System.out.println("Record added for Out-Patient: " + record);
        } else {
            System.out.println("No more records can be added.");
        }
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical Records for Out-Patient:");
        for (int i = 0; i < recordCount; i++) {
            System.out.println("- " + records[i]);
        }
    }
}


