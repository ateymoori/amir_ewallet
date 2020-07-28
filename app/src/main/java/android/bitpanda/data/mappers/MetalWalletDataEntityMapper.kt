package android.bitpanda.data.mappers

import android.bitpanda.data.entities.MetalWalletData
import android.bitpanda.domain.common.Mapper
import android.bitpanda.domain.entities.MetalWalletEntity
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class MetalWalletDataEntityMapper
@Inject constructor() : Mapper<MetalWalletData, MetalWalletEntity>() {

    private val metalDataToEntityMapper = MetalDataEntityMapper()

    override fun mapFrom(from: MetalWalletData): MetalWalletEntity {
        return MetalWalletEntity(
            metals = from.metals.map { metalDataToEntityMapper.mapFrom(it) },
            id = from.id,
            metal_id = from.metal_id,
            is_default = from.is_default,
            balance = from.balance,
            deleted = from.deleted,
            name = from.name
            )
    }
}



