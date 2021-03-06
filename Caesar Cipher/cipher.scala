//19001908
object CaesarCipher extends App {

  val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

  val encrypt = (c:Char, key:Int, a:String) => a((a.indexOf(c.toUpper) + key) % a.size)
  val decrypt = (c:Char, key:Int, a:String) => a((a.indexOf(c.toUpper) - key + a.size) % a.size)
  //in encrypt and decrypt functions changes happen only to one character at a time

  val cipher = (algo:(Char, Int, String) => Char, s:String, key:Int, a:String) => s.map(algo(_,key,a))
  //4 parameters of the cipher function are algo, s, key and a

  val cipherText = cipher(encrypt,"VKWidanagamage",1, alphabet)
  val plainText = cipher(decrypt,cipherText,1,alphabet)

  println("Cipher Text: " + cipherText)
  println("Plain Text: " + plainText)
}
