package android.bitpanda.domain.entities

data class CryptocoinEntity(
    var precision: Int = 4,
    var name: String = "",
    var symbol: String = "",
    var id: String = "",
    var price: Int = 0
)