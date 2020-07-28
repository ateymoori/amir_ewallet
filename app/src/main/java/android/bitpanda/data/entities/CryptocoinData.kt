package android.bitpanda.data.entities

data class CryptocoinData(
    var precision: Int = 4,
    var name: String = "",
    var symbol: String = "",
    var id: String = "",
    var price: Int = 0
)