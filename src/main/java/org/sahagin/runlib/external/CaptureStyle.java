package org.sahagin.runlib.external;

public enum CaptureStyle {

    // don't capture
    NONE("none"),

    // capture this line
    THIS_LINE("thisLine"),

    // capture this line and sub method lines
    STEP_IN("stepIn"),

    // don't capture this line but capture sub method line
    STEP_IN_ONLY("stepInOnly");

    private String value;

    private CaptureStyle(String value) {
        this.value = value;
    }

    public static CaptureStyle getDefault() {
        return CaptureStyle.THIS_LINE;
    }

    public String getValue() {
        return value;
    }

    public static CaptureStyle getEnum(String value) {
        for (CaptureStyle style : values()) {
            if (style.getValue().equals(value)) {
                return style;
            }
        }
        return null;
    }
}
