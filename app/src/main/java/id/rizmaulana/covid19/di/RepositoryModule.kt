package id.rizmaulana.covid19.di

import id.rizmaulana.covid19.data.repository.AppRepository
import id.rizmaulana.covid19.data.repository.Repository
import org.koin.dsl.module





val repositoryModule = module {
    factory<Repository> {
        AppRepository(get(), get(), get())
    }
}