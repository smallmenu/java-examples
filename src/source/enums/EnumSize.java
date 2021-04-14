package source.enums;

public enum EnumSize {
    SOLO(2), DUET(3), TRIO(4), QUARTET(5);

    private final int value;

    EnumSize(int value) {
        this.value = value;
    }

    public int value() {
        return value;
    }
}
