package objects;

import java.time.LocalDate;

public class PrescriptionManager {
    private Prescription prescription;

    public PrescriptionManager(Prescription prescription) {
        this.prescription = prescription;
    }

    public void printDoctorRecommendations(){
        System.out.println(prescription.getRecommendations());
    }

    public void printPrescription(){
        System.out.println("Recommendations are: " + prescription.getRecommendations());
        System.out.println("Expiry date is: "+ prescription.getExpiryDate());
    }

    public void changeExpiryDate(LocalDate newDate){
       prescription = new ChangeblePrescription((PrescriptionUnchanble) prescription);
       prescription.changeExpiryDate(newDate);
    }

    public void printFirstPrescriptionIfExist(){
        if (prescription.getClass().equals(ChangeblePrescription.class)){
            System.out.println("First recommendation was " +
                    ((ChangeblePrescription) prescription).getPreviousPrescription().getRecommendations());
            System.out.println("First date of expiry was " +
                    ((ChangeblePrescription) prescription).getPreviousPrescription().getExpiryDate().toString());

        } else {
            System.out.println("This prescriptions hasn't been changed");
        }

    }
}
