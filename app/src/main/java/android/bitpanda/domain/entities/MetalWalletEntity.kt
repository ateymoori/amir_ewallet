package android.bitpanda.domain.entities

class MetalWalletEntity(
    var metals: List<MetalEntity> = emptyList(),
    var id: String = "",
    var metal_id: String = "",
    var is_default: Boolean = false,
    var balance: String = "",
    var deleted: Boolean = false,
    var name: String = ""
)