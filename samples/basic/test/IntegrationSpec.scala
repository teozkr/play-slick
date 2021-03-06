package test

import org.specs2.mutable.Specification
import play.api.test.WithBrowser

/**
 * add your integration spec here.
 * An integration test will fire up a whole play application in a real (or headless) browser
 */
class IntegrationSpec extends Specification {
  "Application" should {
    "work from within a browser" in new WithBrowser {
      browser.goTo("http://localhost:" + port)

      browser.pageSource must contain("kitty cat")
    }
  }
}
