package id.rizmaulana.covid19.di

import androidx.recyclerview.widget.LinearLayoutManager
import id.rizmaulana.covid19.R
import id.rizmaulana.covid19.util.rx.AppSchedulerProvider
import id.rizmaulana.covid19.util.rx.SchedulerProvider
import org.koin.dsl.module
import uk.co.chrisjenx.calligraphy.CalligraphyConfig


const val DEFAULT_FONT = "fonts/GoogleSans-Regular.ttf"

val appModule = module {

    single {
        CalligraphyConfig.Builder()
            .setDefaultFontPath(DEFAULT_FONT)
            .setFontAttrId(R.attr.fontPath)
            .build()
    }

    factory<SchedulerProvider> {
        AppSchedulerProvider()
    }


    factory {
        LinearLayoutManager(get())
    }

}