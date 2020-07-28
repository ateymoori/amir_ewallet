package android.bitpanda.domain.entities

data class FiatWalletEntity(
    var fiats: List<FiatEntity> = emptyList(),
    var id: String = "",
    var fiat_id: String = "",
    var is_default: Boolean = false,
    var balance: String = "",
    var deleted: Boolean = false,
    var name: String = ""
)