package objects;

import builders.BacteriaCoreBuilder;
import enums.BacteriaCoreType;

import java.util.ArrayList;
import java.util.List;

public class Colony {
    private List<Bacteria> bacteriaColony = new ArrayList<>();
    private BacteriaCoreBuilder bacteriaBuilder = new BacteriaCoreBuilder();

    public Bacteria createBacteriaAndPutInColony(BacteriaCoreType type, boolean hasShell, String color, Integer size){
        BacteriaCore bacteriaCore = bacteriaBuilder.createBacteriaCore(type, hasShell);
        Bacteria bacteria = new Bacteria(bacteriaCore, color, size);
        bacteriaColony.add(bacteria);
        System.out.println(bacteria.toString() + "was added to colony");
        return bacteria;
    }

    public void consumeByEachBacteriaInColonty(){
        bacteriaColony.forEach(Bacteria::consume);
    }
}
