package android.bitpanda.data.mappers

import android.bitpanda.data.entities.CryptocoinWalletData
import android.bitpanda.domain.common.Mapper
import android.bitpanda.domain.entities.CryptocoinWalletEntity
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class CryptoCoinWalletDataEntityMapper
@Inject constructor() : Mapper<CryptocoinWalletData, CryptocoinWalletEntity>() {

    override fun mapFrom(from: CryptocoinWalletData): CryptocoinWalletEntity {
        return CryptocoinWalletEntity(
            id = from.id,
            cryptocoin_id = from.cryptocoin_id,
            is_default = from.is_default,
            balance = from.balance,
            deleted = from.deleted,
            name = from.name
        )
    }
}



