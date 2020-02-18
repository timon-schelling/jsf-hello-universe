import de.timokrates.jsf.hello.universe.user.TokenId

fun main() {
    val tokenId1 = TokenId("123456")
    val tokenId2 = TokenId("123456")
    print(tokenId1 == tokenId2)
}