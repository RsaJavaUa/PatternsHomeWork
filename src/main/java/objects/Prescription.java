package objects;

import java.time.LocalDate;

public interface Prescription {
    String getRecommendations();
    LocalDate getExpiryDate();
    void changeExpiryDate(LocalDate newDate);
}
