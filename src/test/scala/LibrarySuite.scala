/*
 * This Scala Testsuite was auto generated by running 'gradle init --type scala-library'
 * by 'toan' at '5/17/16 11:11 PM' with Gradle 2.13
 *
 * @author toan, @date 5/17/16 11:11 PM
 */

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class LibrarySuite extends FunSuite {
  test("someLibraryMethod is always true") {
    def library = new Library()
    assert(library.someLibraryMethod)
  }
}
