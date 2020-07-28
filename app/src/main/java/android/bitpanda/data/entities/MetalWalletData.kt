package android.bitpanda.data.entities

class MetalWalletData(
    var metals: List<MetalData> = emptyList(),
    var id: String = "",
    var metal_id: String = "",
    var is_default: Boolean = false,
    var balance: String = "",
    var deleted: Boolean = false,
    var name: String = ""
)