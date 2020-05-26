package com.droidrbi.animecollectibles.models

import android.os.Parcel
import android.os.Parcelable
import androidx.annotation.Keep

@Keep

data class Collectible(
    val thumbnail: Int,
    val character: String?,
    val collection: String?,
    val cost: String?
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString()
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(thumbnail)
        parcel.writeString(character)
        parcel.writeString(collection)
        parcel.writeString(cost)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Collectible> {
        override fun createFromParcel(parcel: Parcel): Collectible {
            return Collectible(parcel)
        }

        override fun newArray(size: Int): Array<Collectible?> {
            return arrayOfNulls(size)
        }
    }
}