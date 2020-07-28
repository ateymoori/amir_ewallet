package android.bitpanda.data.mappers

import android.bitpanda.data.entities.FiatData
import android.bitpanda.domain.common.Mapper
import android.bitpanda.domain.entities.FiatEntity
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class FiatDataEntityMapper
@Inject constructor() : Mapper<FiatData, FiatEntity>() {

    override fun mapFrom(from: FiatData): FiatEntity {
        return FiatEntity(
            precision = from.precision,
            name = from.name,
            symbol = from.symbol,
            id = from.id
        )
    }
}



