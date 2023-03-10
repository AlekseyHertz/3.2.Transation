fun main() {
    val userTransfer = totalTransfer(100_000_000, "MasterCard")
    println("Сумма комиссии: $userTransfer")
}

fun totalTransfer(transfer: Int, userCard: String) {
    var userByCard = transfer
    when (userCard) {
        "MasterCard || Maestro" -> if (transfer < 75_000) { userByCard = 0 }
        else {(transfer * 0.006)+20}

        "Visa || Mir" -> if (transfer * 0.075 < 35) {userByCard = 35}
        else {transfer * 0.075}

        //else -> 0
    }
}
