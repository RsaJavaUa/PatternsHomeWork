package objects;

import enums.BacteriaCoreType;

import java.util.Objects;

public class BacteriaCore {
    private BacteriaCoreType coreType;
    private boolean hasShell;

    public BacteriaCore(BacteriaCoreType coreType, boolean hasShell) {
        this.coreType = coreType;
        this.hasShell = hasShell;
    }

    public void consume(Integer size, String color) {
        System.out.println("Bacteria shaped as "+ coreType.name() + " " + hasShellToString() + " with size=" + size + "and color is " + color +
                " has consumed something just now");
    }

    private String hasShellToString() {
        return hasShell ? "with a shell" : "without a shell";
    }

    public boolean equalByFields(BacteriaCoreType bacteriaCoreTypeoreType, boolean hasShell) {
        return coreType.equals(bacteriaCoreTypeoreType) && this.hasShell == hasShell;
    }

    @Override
    public String toString() {
        return coreType.name();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BacteriaCore that = (BacteriaCore) o;
        return hasShell == that.hasShell &&
                coreType == that.coreType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(coreType, hasShell);
    }
}
