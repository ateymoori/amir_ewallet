package android.bitpanda.data.entities

data class FiatWalletData(
    var fiats: List<FiatData> = emptyList(),
    var balanceid: String = "",
    var fiat_id: String = "",
    var is_default: Boolean = false,
    var balance: String = "",
    var deleted: Boolean = false,
    var id: String = "",
    var name: String = ""
)