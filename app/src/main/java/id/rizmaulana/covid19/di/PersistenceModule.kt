package id.rizmaulana.covid19.di

import id.rizmaulana.covid19.data.source.generated.AppGeneratedSource
import id.rizmaulana.covid19.data.source.pref.AppPrefSource
import org.koin.dsl.module












val persistenceModule = module {
    single {
        AppPrefSource()
    }

    single {
        AppGeneratedSource()
    }
}


