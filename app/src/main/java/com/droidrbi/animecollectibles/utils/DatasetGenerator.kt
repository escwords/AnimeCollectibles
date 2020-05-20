package com.droidrbi.animecollectibles.utils

import android.content.Context
import com.droidrbi.animecollectibles.R
import com.droidrbi.animecollectibles.models.Collectible

class DatasetGenerator {

    companion object Factory {
        fun generateData(): ArrayList<Collectible> {
            val result = ArrayList<Collectible>()
            result.add(
                Collectible(
                    R.drawable.mikasa,
                    "Mikasa Ackerman",
                    "Attack on Titan",
                    "SOLD OUT"
                )
            )
            result.add(
                Collectible(
                    R.drawable.alphonse,
                    "Alphonse Eric",
                    "Full Metal Alchemist Brotherhood",
                    "$16"
                )
            )
            result.add(
                Collectible(
                    R.drawable.gonfreeks,
                    "Gon Freecss",
                    "Hunter x Hunter",
                    "$20"
                )
            )
            result.add(
                Collectible(
                    R.drawable.jin,
                    "Jin",
                    "Samurai Champloo",
                    "12"
                )
            )
            result.add(
                Collectible(
                    R.drawable.kurosaki_ichigo,
                    "Kurosaki Ichigo",
                    "Bleach",
                    "$17"
                )
            )



            return result
        }
    }
}
