package objects;

import java.time.LocalDate;

public class PrescriptionUnchanble implements Prescription {

    private String doctorsRecommendations;
    private LocalDate expiryDate;

    public PrescriptionUnchanble(String doctorsRecommendations, LocalDate expiryDate) {
        this.doctorsRecommendations = doctorsRecommendations;
        this.expiryDate = expiryDate;
    }

    @Override
    public String getRecommendations() {
        return doctorsRecommendations;
    }

    @Override
    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    @Override
    public void changeExpiryDate(LocalDate newDate) {
        System.out.println("Unsupported operation in this implementation");
    }
}
