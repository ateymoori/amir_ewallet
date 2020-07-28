package android.bitpanda.data.mappers

import android.bitpanda.data.entities.CryptocoinData
import android.bitpanda.domain.entities.CryptocoinEntity
import android.bitpanda.domain.common.Mapper
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class CryptoCoinDataEntityMapper
@Inject constructor() : Mapper<CryptocoinData, CryptocoinEntity>() {

    override fun mapFrom(from: CryptocoinData): CryptocoinEntity {
        return CryptocoinEntity(
            precision = from.precision,
            name = from.name,
            symbol = from.symbol,
            id = from.id,
            price = from.price
        )
    }
}



