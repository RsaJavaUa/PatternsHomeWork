package objects;

import java.time.LocalDate;

public class ChangeblePrescription implements Prescription {

    private PrescriptionUnchanble previousPrescription;
    private LocalDate expiryDate;
    private String recomendation;

    public ChangeblePrescription(PrescriptionUnchanble previousPrescription) {
        this.previousPrescription = previousPrescription;
    }

    @Override
    public String getRecommendations() {
        return recomendation == null ? previousPrescription.getRecommendations() : recomendation;
    }

    @Override
    public LocalDate getExpiryDate() {
        return expiryDate == null ? previousPrescription.getExpiryDate() : expiryDate;
    }

    public void changeExpiryDate(LocalDate newExpiryDate) {
        if (newExpiryDate.isAfter(LocalDate.now())) {
            expiryDate = newExpiryDate;
            System.out.println("Date is changed on " + newExpiryDate.toString());
        } else {
            System.out.println("Date should be after now");
        }
    }

    public void changeRecomendation(String newRecommendations){
        recomendation = newRecommendations;
    }



    public PrescriptionUnchanble getPreviousPrescription() {
        return previousPrescription;
    }
}
