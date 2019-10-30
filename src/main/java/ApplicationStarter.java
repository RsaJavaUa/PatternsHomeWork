import objects.PrescriptionManager;
import objects.PrescriptionUnchanble;

import java.time.LocalDate;

public class ApplicationStarter {
    public static void main(String[] args) {
        PrescriptionUnchanble unchanble = new PrescriptionUnchanble("Eat twice a day"
                , LocalDate.now().plusYears(1));
        PrescriptionManager manager = new PrescriptionManager(unchanble);
        manager.printPrescription();
        System.out.println("********");
        manager.changeExpiryDate(LocalDate.now().plusYears(2));
        manager.printPrescription();
        System.out.println("********");
        manager.printFirstPrescriptionIfExist();



    }
}
