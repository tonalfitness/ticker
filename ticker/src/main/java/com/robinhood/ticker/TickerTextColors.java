package com.robinhood.ticker;

/**
 * This class contains colors that being used when change text color
 */
class TickerTextColors {
    private int textColor;
    private int inProgressTextColor;

    // color that used in cases when text animation in progress
    void setInProgressTextColor(int textColor) {
        inProgressTextColor = textColor;
    }

    // color that used by default for displaying text
    void setTextColor(int textColor) {
        this.textColor = textColor;
    }

    int getTextColor(boolean textChanging) {
        if (textChanging) {
            return inProgressTextColor;
        } else {
            return textColor;
        }
    }

    boolean isNewColor(int color) {
        return textColor != color;
    }

    boolean isNewInProgressTextColor(int color) {
        return inProgressTextColor != color;
    }
}
