package com.smp.masterswitchpreferencescreen

import android.graphics.Color
import android.os.Parcelable
import androidx.annotation.Keep
import kotlinx.android.parcel.Parcelize

internal const val ATTRS_KEY_NAME = "MasterSwitchAttrs"

@Keep
@Parcelize
class MasterSwitchPreferenceAttrs(
        val switchThumbColor: Int = Color.WHITE,
        val switchTrackColor: Int = (Color.WHITE - 0x90000000).toInt(),
        val switchOnBackgroundColor: Int = Color.RED,
        val switchOffBackgroundColor: Int = Color.LTGRAY,
        val switchTextColor: Int = Color.BLACK,
        val explanationText: String = "",
        val includedPrefScreenRes: Int? = null,
        val notIncludedPrefScreenRes: Int? = null,
        val switchTextOn: String = "On",
        val switchTextOff: String = "Off",
        val hideExplanation: Boolean = true,
        val key: String = "master_switch_key",
        val defaultValue: Boolean = false,
        val explanationIcon: Int? = null,
        val showStatus: Boolean = false
) : Parcelable
