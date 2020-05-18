package com.robinhood.ticker;

import android.content.res.ColorStateList;
import android.graphics.Color;

/**
 * This class contains colors that being used when change text color
 */
class TickerTextColors {
    private static final int DEFAULT_TEXT_COLOR = Color.BLACK;

    private int currentTextColor;

    private ColorStateList textColor;

    private int inProgressTextColor;

    // color that used in cases when text animation in progress
    void setInProgressTextColor(int textColor) {
        inProgressTextColor = textColor;
    }

    void setTextColor(ColorStateList colors) {
        this.textColor = colors;
        updateCurrentTextColor(new int[] {});
    }

    // color that used by default for displaying text
    void setTextColor(int textColor) {
        this.textColor = ColorStateList.valueOf(textColor);
        updateCurrentTextColor(new int[] {});
    }

    int getTextColor(boolean textChanging, int[] state) {
        updateCurrentTextColor(state);
        if (textChanging) {
            return inProgressTextColor;
        } else {
            return currentTextColor;
        }
    }

    boolean isNewColor(int color) {
        return currentTextColor != color;
    }

    boolean isNewInProgressTextColor(int color) {
        return inProgressTextColor != color;
    }

    private void updateCurrentTextColor(int[] state) {
        int newTextColor = textColor.getColorForState(state, DEFAULT_TEXT_COLOR);
        if (newTextColor != currentTextColor) {
            currentTextColor = newTextColor;
        }
    }
}
