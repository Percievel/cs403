package tdd
import org.scalatest.FunSpec
import org.scalatest.Matchers
class Password_Test extends FunSpec with Matchers {

   describe("A password checker") {
     describe("determines proper length") {
       it("rejects passwords that are less than 6 characters") {
         val tooShort = "abcde"
         val longEnough = "abcdef"
         val evenLonger = "abcdefghi"
         //val withNum = "abcdefg12"
         val withSymb = "abcdef12!@"
         
         Password.isValid(tooShort) shouldBe false
         Password.isValid(longEnough) shouldBe false //orig was true
         Password.isValid(evenLonger) shouldBe true //orig true
         //Password.isValid(withNum) shouldBe false
         Password.isValid(withSymb) shouldBe true

       }
     }
   }
}