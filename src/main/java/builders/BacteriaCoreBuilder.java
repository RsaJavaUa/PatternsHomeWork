package builders;

import objects.BacteriaCore;
import enums.BacteriaCoreType;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BacteriaCoreBuilder {
    private static List<BacteriaCore> uniqueBacteriasCashe = new ArrayList<>();

    public BacteriaCore createBacteriaCore(BacteriaCoreType coreType, boolean hasShell) {
        List<BacteriaCore> typeFromCashe = uniqueBacteriasCashe.stream()
                .filter(core -> core.equalByFields(coreType, hasShell)).collect(Collectors.toList());
        return typeFromCashe.size() > 0 ? typeFromCashe.get(0) : createTypeAndPutInCashe(coreType, hasShell);
    }

    private BacteriaCore createTypeAndPutInCashe(BacteriaCoreType coreType, boolean hasShell) {
        BacteriaCore bacteriaCore = new BacteriaCore(coreType, hasShell);
        uniqueBacteriasCashe.add(bacteriaCore);
        return bacteriaCore;
    }
}
