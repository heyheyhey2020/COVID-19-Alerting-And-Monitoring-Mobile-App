package id.rizmaulana.covid19.data.repository

import id.rizmaulana.covid19.data.model.CovidDaily
import id.rizmaulana.covid19.data.model.CovidDetail
import id.rizmaulana.covid19.data.model.CovidOverview
import id.rizmaulana.covid19.data.model.indonesia.IndonesiaDaily
import id.rizmaulana.covid19.data.model.indonesia.IndonesiaPerProvince
import id.rizmaulana.covid19.ui.adapter.viewholders.PerCountryItem
import io.reactivex.Completable
import io.reactivex.Observable

interface Repository {
    fun overview(): Observable<Result<CovidOverview>>
    fun daily(): Observable<Result<List<CovidDaily>>>
    fun confirmed(): Observable<List<CovidDetail>>
    fun deaths(): Observable<List<CovidDetail>>
    fun recovered(): Observable<List<CovidDetail>>
    fun country(id: String): Observable<CovidOverview>
    fun fullStats(): Observable<List<CovidDetail>>
    fun pinnedRegion(): Observable<Result<CovidDetail>>
    fun putPinnedRegion(data: CovidDetail): Completable
    fun removePinnedRegion(): Completable
    fun getCachePinnedRegion(): CovidDetail?
    fun getCacheOverview(): CovidOverview?
    fun getCacheDaily(): List<CovidDaily>?
    fun getCacheConfirmed(): List<CovidDetail>?
    fun getCacheDeath(): List<CovidDetail>?
    fun getCacheRecovered(): List<CovidDetail>?
    fun getCacheFull(): List<CovidDetail>?
    fun getCacheCountry(id: String): CovidOverview?
    fun getPerCountryItem(): List<PerCountryItem>
    fun getIndonesiaDaily(): Observable<List<IndonesiaDaily>>
    fun getIndonesiaPerProvince(): Observable<List<IndonesiaPerProvince>>

}