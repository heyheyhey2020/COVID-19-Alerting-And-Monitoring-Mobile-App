package id.rizmaulana.covid19.data.source.generated

import id.rizmaulana.covid19.R
import id.rizmaulana.covid19.ui.adapter.viewholders.PerCountryItem


class AppGeneratedSource {

    fun getPerCountryItem() = listOf(
        PerCountryItem(
            PerCountryItem.ID,
            R.string.country_indonesia,
            "https://covid-19.mathdro.id/api",
            R.drawable.china_flag_round_medium
        )
    )
}