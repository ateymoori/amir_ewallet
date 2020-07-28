package android.bitpanda.data.mappers

import android.bitpanda.data.entities.FiatData
import android.bitpanda.data.entities.FiatWalletData
import android.bitpanda.domain.common.Mapper
import android.bitpanda.domain.entities.FiatEntity
import android.bitpanda.domain.entities.FiatWalletEntity
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class FiatWalletDataEntityMapper
@Inject constructor() : Mapper<FiatWalletData, FiatWalletEntity>() {

    private val fiatDataToEntityMapper = FiatDataEntityMapper()

    override fun mapFrom(from: FiatWalletData): FiatWalletEntity {
        return FiatWalletEntity(
            fiats = from.fiats.map { fiatDataToEntityMapper.mapFrom(it) },
            fiat_id = from.fiat_id ,
            is_default = from.is_default ,
            balance = from.balance ,
            deleted = from.deleted ,
            id = from.id ,
            name = from.name
        )
    }
}



