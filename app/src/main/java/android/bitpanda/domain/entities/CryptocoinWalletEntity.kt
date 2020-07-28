package android.bitpanda.domain.entities

data class CryptocoinWalletEntity (
    var id: String = "" ,
    var cryptocoin_id: String = "",
    var is_default: Boolean = false,
    var balance: String = "",
    var deleted: Boolean = false,
    var name: String = ""
)