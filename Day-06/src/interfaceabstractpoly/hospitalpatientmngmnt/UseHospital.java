package interfaceabstractpoly.hospitalpatientmngmnt;

public class UseHospital {
    public static void main(String[] args) {
        // Create patients
        Patient inPatient = new InPatient("P001", "John Doe", 45, 5000, 15000);
        Patient outPatient = new OutPatient("P002", "Jane Smith", 30, 200);

        // Add medical records
        if (inPatient instanceof MedicalRecord) {
            MedicalRecord inPatientRecord = (MedicalRecord) inPatient;
            inPatientRecord.addRecord("Admitted for surgery.");
            inPatientRecord.addRecord("Discharged after 5 days.");
            inPatientRecord.viewRecords();
        }

        System.out.println("-------------------------------");

        if (outPatient instanceof MedicalRecord) {
            MedicalRecord outPatientRecord = (MedicalRecord) outPatient;
            outPatientRecord.addRecord("Consultation for flu.");
            outPatientRecord.viewRecords();
        }

        System.out.println("-------------------------------");

        // Display billing details dynamically
        displayBill(inPatient);
        System.out.println("-------------------------------");
        displayBill(outPatient);
    }

    // Method to display bill details
    public static void displayBill(Patient patient) {
        patient.getPatientDetails();
        System.out.println("Total Bill: " + patient.calculateBill());
    }
}

