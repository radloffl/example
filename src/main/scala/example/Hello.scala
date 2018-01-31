package example

import eu.timepit.refined._
import eu.timepit.refined.api.Refined
import eu.timepit.refined.string._
import scalaz._

package object model {
  type TIN = String Refined TINREGEX
  type TINREGEX = MatchesRegex[W.`"[0-9]{9}"`.T]
  implicit val TINShow: Show[TIN] = Show.shows[TIN](_ => "MASKED_TIN")
}
