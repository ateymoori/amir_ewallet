package android.bitpanda.data.mappers

import android.bitpanda.data.entities.MetalData
import android.bitpanda.domain.common.Mapper
import android.bitpanda.domain.entities.MetalEntity
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class MetalDataEntityMapper
@Inject constructor() : Mapper<MetalData, MetalEntity>() {
    override fun mapFrom(from: MetalData): MetalEntity {
        return MetalEntity(
            precision = from.precision,
            name = from.name,
            symbol = from.symbol,
            id = from.id,
            price = from.price
        )
    }
}



